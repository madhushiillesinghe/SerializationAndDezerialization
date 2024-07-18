package lk.ijse.gdse.aad68;


import java.io.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Madhushi", 22);

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            oos.writeObject(person);
            System.out.println("Serialization successful: " + person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Deserialization successful: " + deserializedPerson);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}