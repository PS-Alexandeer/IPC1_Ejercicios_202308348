package ejercicio1;

import java.io.*;
import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList<>();
        libros.add(new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967));
        libros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605));
        libros.add(new Libro("La sombra del viento", "Carlos Ruiz Zafón", 2001));

        // Serializar
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("libros.ser"))) {
            oos.writeObject(libros);
            System.out.println("Lista de libros serializada en 'libros.ser'.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserializar
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("libros.ser"))) {
            ArrayList<Libro> librosDeserializados = (ArrayList<Libro>) ois.readObject();
            System.out.println("Libros deserializados:");
            for (Libro libro : librosDeserializados) {
                System.out.println(libro);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
