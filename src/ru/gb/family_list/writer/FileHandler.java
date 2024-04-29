package ru.gb.family_list.writer;

import java.io.*;

public class FileHandler implements Writable {

    @Override
    public void write(Serializable o, String path) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(path));
        objectOutputStream.writeObject(o);
        objectOutputStream.close();
    }

    @Override
    public Serializable read(String path) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream(path));
        Serializable dateRestored = (Serializable) objectInputStream.readObject();
        objectInputStream.close();
        return dateRestored;
    }
}
