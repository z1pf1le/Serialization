package SaburovAnton;

import java.io.*;

public class Second extends First implements Externalizable{


    private String secondCode;
    private String secondName;



    public String getSecondCode() {
        return secondCode;
    }

    public void setSecondCode(String secondCode) {
        this.secondCode = secondCode;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(getFirsCode());
        out.writeUTF(getFirsName());
        out.writeUTF(getSecondCode());
        out.writeUTF(getSecondName());

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        setFirsCode(in.readUTF());
        setFirsName(in.readUTF());
        setSecondCode(in.readUTF());
        setSecondName(in.readUTF());


    }
}
