/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfinal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author OSCAR
 */
public class Grafo implements Serializable{

    private HashMap<String, ArrayList<Nodo>> grafo;
    private boolean dirigido;

    public Grafo(boolean dir) {
        grafo = new HashMap<>();
        dirigido = dir;
    }

    public HashMap<String, ArrayList<Nodo>> getGrafo() {
        return grafo;
    }

    public void agregarArista(String orig, String dest, int costo) {
        crearArista(orig, dest, costo);
        if (!dirigido) {
            crearArista(dest, orig, costo);
        }
    }

    private void crearArista(String ori, String dest, int costo) {
        if (!grafo.containsKey(ori)) {
            grafo.put(ori, new ArrayList<>());
        }
        grafo.get(ori).add(new Nodo(dest, costo));
    }

    public void eliminarArista(String ori, String dest) {
        elimArista(ori, dest);
        if (!dirigido) {
            elimArista(dest, ori);
        }
    }

    private void elimArista(String ori, String dest) {
        ArrayList<Nodo> lista = grafo.get(ori);
        boolean bb = false;
        if (lista != null) {
            for (int i = 0; i < lista.size(); i++) {
                Nodo ac = lista.get(i);
                if (ac.getVertice().equals(dest)) {
                    lista.remove(i);
                    bb = true;
                }
            }
        }
    }

    public void eliminarVertice(String v) {
        ArrayList<Nodo> lista = grafo.get(v);
        ArrayList<String> destinos = new ArrayList<>();
        for (Nodo n : lista) {
            destinos.add(n.getVertice());
        }
        grafo.remove(v);
        for (String s : destinos) {
            eliminarArista(s, v);
        }
    }

    public void agregarVertice(String v) {
        grafo.put(v, new ArrayList<>());
    }

    public ArrayList<ArrayList<String>> caminos(String vo, String vd) {
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        ArrayList<String> camino = new ArrayList<>();
        camino.add(vo);
        ArrayList<Nodo> vecinos = grafo.get(vo);

        for (Nodo n : vecinos) {
            String act = n.getVertice();
            ArrayList<String> copia = (ArrayList<String>) camino.clone();
            copia.add(act);
            caminos(act, vd, copia, res);
        }
        return res;
    }

    private void caminos(String vo, String vd, ArrayList<String> camino, ArrayList<ArrayList<String>> res) {
        if (vo.equals(vd)) {
            res.add(camino);
        } else {
            ArrayList<Nodo> vecinos = grafo.get(vo);
            if (vecinos != null) {
                for (Nodo n : vecinos) {
                    String act = n.getVertice();
                    n.getCosto();
                    ArrayList<String> copia = (ArrayList<String>) camino.clone();
                    if (!copia.contains(act)) {
                        copia.add(act);
                        caminos(act, vd, copia, res);
                    }
                }
            }
        }
    }

    


    public class Nodo implements Serializable{

        private String vertice;
        private int costo;

        public Nodo(String vertice, int costo) {
            this.vertice = vertice;
            this.costo = costo;
        }

        public String getVertice() {
            return vertice;
        }

        public int getCosto() {
            return costo;
        }

    }

}
