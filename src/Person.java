import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable{
    @Serial
    private static final long serialVersionUID = -3982538843988778425L;
    private int id;
    private String name; //transient

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String toString() { //попробовать использовать не переопределенный
        return id + " : " + name;
    }
}
