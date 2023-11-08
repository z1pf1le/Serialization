package SaburovAnton;

import java.io.*;

public class Writer{

    public static void main(String[] args) {
        testWrite();
    }

    public static void testWrite() {
        Second first = new Second();
        first.setFirsCode("FirstCode");
        first.setFirsName("FirstName");
        first.setSecondCode("SecondCode");
        first.setSecondName("SecondName");

        try (FileOutputStream fs = new FileOutputStream("out.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fs)){

            oos.writeObject(first);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);}
        }
}
