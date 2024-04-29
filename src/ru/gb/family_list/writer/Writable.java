package ru.gb.family_list.writer;

import java.io.IOException;
import java.io.Serializable;

public interface Writable {
    public void write(Serializable o, String path) throws IOException;
    public Serializable read(String path) throws IOException, ClassNotFoundException;
}
