package foxminded_example;

import java.io.*;

public class DeserializationExample {

    public static void main(String[] args) {

        // Восстановление объекта из сериализованного состояния

        Person obj = null;

        try {

            // Чтение сериализованного объекта из файла

            FileInputStream fileIn = new FileInputStream("person.ser");

            ObjectInputStream in = new ObjectInputStream(fileIn);

            // Десериализация объекта

            obj = (Person) in.readObject();

            // Закрытие потоков

            in.close();

            fileIn.close();

            System.out.println("Объект успешно десериализован");

        } catch (IOException | ClassNotFoundException e) {

            e.printStackTrace();

        }

        // Использование восстановленного объекта
        System.out.println(obj.age);

//        if (obj != null) {
//
//            System.out.println("Полученное сообщение: " + obj.age);
//
//            System.out.println("Полученное число: " + obj.name);
//
//        }

    }

}