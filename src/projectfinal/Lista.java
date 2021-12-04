/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfinal;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Lista implements Serializable {

    private Nodo primero, recorre;
    private String identificador;

    public Nodo getRecorre() {
        return recorre;
    }

    public void setRecorre(Nodo recorre) {
        this.recorre = recorre;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Lista(String nombre) {
        primero = null;
        this.identificador = nombre;
    }

    public void visualizar() {
        //Esto que estamos agregando es basicamente que recorre la lista, desde la cabeza hasta el final de la lista
        Nodo n;
        n = primero;

        while (n != null) {
            System.out.println("Nombre: " + n.nombre + "\t Edad:" + n.edad + "\t Pasaporte:" + n.pasaporte + "\t Asiento: " + n.asiento
                    + "\t Genero: " + n.genero + "\t Nacionalidad: " + n.nacionalidad);
            n = n.enlace;
        }

        System.out.println();

    }

    public void inicializaRecorrido() {
        if (this.primero != null) {
            this.recorre = this.primero;
        }
    }

    public Lista insertarAlFrente(String entrada, int ed, String bole, String costo, String genero, String nacionalidad) {
        Nodo nuevo;
        nuevo = new Nodo(entrada, ed, bole, costo, genero, nacionalidad);
        nuevo.enlace = primero;  //enlaza nuevo nodo al frente de la lista.
        primero = nuevo;         //mueve primero y apunta al nuevo nodo
        return this;
    }

//////////////////////////////////////////////////////////////////////////////////////////   
    /**
     * Clase Nodo
     */
    public class Nodo implements Serializable {

        private Object nombre;
        private Object edad;
        private Object pasaporte;
        private Object asiento;
        private Object genero;
        private Object nacionalidad;
        private Nodo enlace;

        public Nodo(Object x, Object eda, Object bol, Object cost, Object gene, Object naci) {
            nombre = x;
            edad = eda;
            pasaporte = bol;
            asiento = cost;
            genero = gene;
            nacionalidad = naci;
            enlace = null;
        }

        public Nodo getEnlace() {
            return enlace;
        }

        public void setEnlace(Nodo enlace) {
            this.enlace = enlace;
        }

        public Object getNombre() {
            return nombre;
        }

        public Object getEdad() {
            return edad;
        }

        public Object getPasaporte() {
            return pasaporte;
        }

        public Object getAsiento() {
            return asiento;
        }

        public Object getGenero() {
            return genero;
        }

        public Object getNacionalidad() {
            return nacionalidad;
        }
        

    }
}
