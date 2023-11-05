package catExample;

public class Main{
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.setName("Stepa");

        Serializator serializator = new Serializator();
        serializator.serialization(cat);

    }
}

//https://www.youtube.com/watch?v=Kta6v6AqAWk