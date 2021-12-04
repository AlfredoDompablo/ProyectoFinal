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
public class Lista implements Serializable{

    private Nodo primero;
    private String identificador;

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
        this.identificador= nombre;
    }

    public void visualizar() {
        //Esto que estamos agregando es basicamente que recorre la lista, desde la cabeza hasta el final de la lista
        Nodo n;
        n = primero;

        while (n != null) {
            System.out.println("Nombre: " + n.dato + "\t Edad:" + n.ed + "\t Pasaporte:" + n.bo + "\t Asiento: " + n.cos +  "\t Genero: " + n.gen + "\t Nacionalidad: " + n.nac   );
            n = n.enlace;
        }

        System.out.println();

    }

    public Lista insertarAlFrente(String entrada, int ed, String bole, String costo, String genero, String nacionalidad ) {
        Nodo nuevo;
        nuevo = new Nodo(entrada, ed, bole, costo,genero, nacionalidad);
        nuevo.enlace = primero;  //enlaza nuevo nodo al frente de la lista.
        primero = nuevo;         //mueve primero y apunta al nuevo nodo
        return this;
    }
    
    
//////////////////////////////////////////////////////////////////////////////////////////   
/**
 * Clase Nodo
 */
    public class Nodo implements Serializable{

        Object dato;
        Object bo;
        Object cos;
        Object ed;
        Object gen;
        Object nac;
        Nodo enlace;

        public Nodo(Object x, Object eda, Object bol, Object cost, Object gene, Object naci) {
            dato = x;
            ed = eda;
            bo = bol;
            cos = cost;
            gen= gene;
            nac=naci;
            enlace = null;
        }

        public int getDato() {
            return (int) dato;
        }

        public void setDato(int dato) {
            this.dato = dato;
        }

        public Nodo getEnlace() {
            return enlace;
        }

        public void setEnlace(Nodo enlace) {
            this.enlace = enlace;
        }

    }
}
