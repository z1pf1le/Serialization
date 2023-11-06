package userExample;

import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        User user = new User();
        user.lifeLevel = 54;

        FileOutputStream fileOutputStream = new FileOutputStream("/home/andrei/tempFile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("/home/andrei/tempFile");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User newUser = (User) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(newUser.lifeLevel);
    }
}

class User implements Serializable{
    int lifeLevel;
}

