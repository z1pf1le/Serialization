package SaburovAnton;

import java.io.*;
public class Reader{
    public static void main(String[] args) {
        testRead();
    }

    public static void testRead() {
        try(FileInputStream fs = new FileInputStream("out.dat");
            ObjectInputStream ois = new ObjectInputStream(fs))
        {


            Second first = (Second)ois.readObject();
            System.out.println(first.getFirsCode());
            System.out.println(first.getFirsName());
            System.out.println(first.getSecondCode());
            System.out.println(first.getSecondName());


        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
}



