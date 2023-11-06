package foxminded_example;

import java.io.FileOutputStream;

import java.io.IOException;

import java.io.ObjectOutputStream;

import java.io.Serializable;

class SerializationExample {

    public static void main(String[] args) {

        // Создание объекта для сериализации

        Person person = new Person("John", 30);

        try {

            // Создание потока вывода для записи в файл

            FileOutputStream fileOut = new FileOutputStream("person.ser");

            // Создание объектного потока вывода для сериализации объекта

            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            // Сериализация объекта

            objectOut.writeObject(person);

            // Закрытие потоков

            objectOut.close();

            fileOut.close();

            System.out.println("Объект успешно сериализован");

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}

class Person implements Serializable {

    String name;

    int age;

    public Person(String name, int age) {

        this.name = name;

        this.age = age;

    }

}
