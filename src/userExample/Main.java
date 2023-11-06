//https://www.youtube.com/watch?v=vz6nyRXCUs0
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

        Pupil pupil = new Pupil();
        pupil.lifeLevel = 90;
        pupil.grade = 4;
        FileOutputStream fileOutputStream2 = new FileOutputStream("/home/andrei/tempFile");
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStream2);
        objectOutputStream2.writeObject(pupil);
        objectOutputStream2.close();
        FileInputStream fileInputStream2 = new FileInputStream("/home/andrei/tempFile");
        ObjectInputStream objectInputStream2 = new ObjectInputStream(fileInputStream2);
        Pupil newPupil = (Pupil) objectInputStream2.readObject();
        objectInputStream2.close();
        System.out.println(newPupil.grade);
        System.out.println(newPupil.lifeLevel);
    }
}
class User implements Serializable{
    int lifeLevel;
}
class Pupil extends User {
    int grade;
}

