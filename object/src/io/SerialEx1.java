package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialEx1 {
    public static void main(String[] args) {
        Person p1 = new Person("Hong", "engineer", "hong@eng.com");
        Person p2 = new Person("Kim", "teacher", "kim@tech.com");

        try (FileOutputStream fos = new FileOutputStream("c:\\temp\\person.dat");
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                ObjectOutputStream oos = new ObjectOutputStream(bos)) {

            // java.io.NotSerializableException: io.Person
            oos.writeObject(p1);
            oos.writeObject(p2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
