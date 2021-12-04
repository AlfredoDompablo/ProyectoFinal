/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfinal;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author OSCAR
 */
public class IO {

//    Grafo grafo;
    public void imprimirEnArchivo(Grafo grafo) {
        File x = new File("Grafo.obj");
        x.delete();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Grafo.obj", true))) {
            oos.writeObject(grafo);
            System.out.println("Escrito");
            oos.close();
        } catch (IOException ex) {
        }
    }

    public Grafo leerDeArchivo() {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Grafo.obj"))) {
            while (true) {
                Grafo grafo = (Grafo) ois.readObject();
                System.out.println("Leido");
                return grafo;
            }
        } catch (EOFException e) {
            System.out.println("Fin del documento");
        } catch (FileNotFoundException e) {
            System.out.println("No existe el documento");
        } catch (Exception ex) {
            System.err.println(ex);
        }
        return null;
    }

    public void imprimirEnArchivoPin(Map claseUsuaria) {
        File x = new File("Pin.obj");
        x.delete();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Pin.obj", true))) {
            oos.writeObject(claseUsuaria);
            System.out.println("Escrito");
            oos.close();
        } catch (IOException ex) {
        }
    }

    public Map leerDeArchivoPin() {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Pin.obj"))) {
            while (true) {
                Map clase = (Map) ois.readObject();
                System.out.println("Leido");
                return clase;
            }
        } catch (EOFException e) {
            System.out.println("Fin del documento");
        } catch (FileNotFoundException e) {
            System.out.println("No existe el documento");
        } catch (Exception ex) {
            System.err.println(ex);
        }
        return null;
    }

    public void imprimirEnArchivoPasajeros(ArrayList<Lista> list) {
        File x = new File("ListaPasajeros.obj");
        x.delete();
        if (x.length() == 0) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ListaPasajeros.obj", true))) {
                oos.writeObject(list);
                System.out.println("1");
                oos.close();
            } catch (IOException ex) {
            }
        }
    }

    public ArrayList<Lista> leerDeArchivoPasajeros() {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ListaPasajeros.obj"))) {
            while (true) {
                ArrayList<Lista> lista = (ArrayList<Lista>) ois.readObject();
                return lista;
//            System.out.println("Leido");
            }
        } catch (EOFException e) {
            System.out.println("Fin del documento");
        } catch (FileNotFoundException e) {
            System.out.println("No existe el documento");
        } catch (Exception ex) {
            System.err.println(ex);
        }
        return null;
    }
}
