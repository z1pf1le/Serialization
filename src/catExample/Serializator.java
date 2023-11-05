package catExample;

import java.io.*;

public class Serializator{
    public  boolean serialization(Cat cat){

        boolean flag = false;

        File file = new File("cat.data");
        ObjectOutputStream oos = null;

        try {
            FileOutputStream fos = new FileOutputStream(file);
            if(fos!=null) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(cat);
                flag = true;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        return flag;
    }
}
