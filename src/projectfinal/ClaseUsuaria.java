/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfinal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author OSCAR
 */
public class ClaseUsuaria implements Serializable {

    /**
     * COntador interno de objetos
     */
//    private int contador_de_objetos = 0;
    /**
     * Los objetos se almacenaran en un MAP
     */
    private HashMap<String, Pin> map = new HashMap();
    private HashMap<String, PinFijo> pinsF = new HashMap();
    /**
     * JPanel
     */
    private JPanel contenedor;
    private JLabel mapaLabel;
    private int var;
    IO ES = new IO();

    /**
     * DefaultListModel
     *
     * @param jpanel
     * @param mapa
     */
    public ClaseUsuaria(JPanel jpanel, JLabel mapa) {
        this.contenedor = jpanel;
        this.mapaLabel = mapa;
    }

    public ClaseUsuaria() {
    }

    public void Nuevo_Objeto(String nombre) {
        //aumenta contador en +1        
//        this.contador_de_objetos += 1;
        //Crea una nueva instancia de "MiObjeto"
        Pin tmp = new Pin(nombre);
        //coloca al objeto creado en una posicion aleatoria
        tmp.setLocation(30, 30);
        //agrega el objeto en el MAP
        map.put(nombre, tmp);
        ES.imprimirEnArchivoPin(map);

        //agrega el objeto en el JPanel
        this.contenedor.add(tmp);
        this.contenedor.add(mapaLabel);
        //actualiza graficos
        this.contenedor.repaint();
    }

    public void Nuevo_Objeto(int x, int y) {
//        this.contador_de_objetos += 1;
        //Crea una nueva instancia de "MiObjeto"
        PinFijo tmp = new PinFijo();
        //coloca al objeto creado en una posicion aleatoria
        tmp.setLocation(x, y);
        //agrega el objeto en el MAP
//        pinsF.put(String.valueOf(this.contador_de_objetos), tmp);
//        ES.imprimirEnArchivoPinFijo(pinsF);

        //agrega el objeto en el JPanel
        this.contenedor.add(tmp);
        this.contenedor.add(mapaLabel);
        //actualiza graficos
        this.contenedor.repaint();
    }

    public void guardarMapa() {
        map = ES.leerDeArchivoPin();
        for (String pin : map.keySet()) {
            Pin temPin = map.get(pin);
            int x = temPin.getNuevo_X();
            int y = temPin.getNuevo_Y();
            PinFijo nuevoFijo = new PinFijo(x, y,temPin.getKey());
            pinsF.put(pin, nuevoFijo);
        }
        ES.imprimirEnArchivoPinFijo(pinsF);
    }

//    public void pintarFijos() {
//        pinsF = ES.leerDeArchivoPinFijo();
//        for (String key : pinsF.keySet()) {
//            PinFijo temp = pinsF.get(key);
//            int x = temp.getNuevo_X();
//            int y = temp.getNuevo_Y();
//            temp.setLocation(x, y);
//            temp.setLocation(30, 30);
//            this.contenedor.add(temp);
//        }
//        this.contenedor.add(mapaLabel);
//        this.contenedor.repaint();
//    }
    public void pintarFijos() {
        map = ES.leerDeArchivoPin();
        for (String key : map.keySet()) {
            Pin temp = map.get(key);
            int x = temp.getNuevo_X();
            int y = temp.getNuevo_Y();
            Nuevo_Objeto(x, y);
        }
//        this.contenedor.add(mapaLabel);
//        this.contenedor.repaint();
    }

    public void actualizarArchivo() {
        ES.imprimirEnArchivoPin(map);
    }

    public void repintar() {
//        map = ES.leerDeArchivoPin();
//        for (int i = 0; i < map.size(); i++) {
//            Pin temp = (Pin) map.get(String.valueOf(i + 1));
//            int x = temp.getNuevo_X(), y = temp.getNuevo_Y();
//            temp.setLocation(x, y);
//            this.contenedor.add(temp);
//        }
//        this.contenedor.add(mapaLabel);
//        this.contenedor.repaint();
        map = ES.leerDeArchivoPin();
        for (String key : map.keySet()) {
            Pin temp = (Pin) map.get(key);
            int x = temp.getNuevo_X(), y = temp.getNuevo_Y();
            temp.setLocation(x, y);
            this.contenedor.add(temp);
        }
        this.contenedor.add(mapaLabel);
        this.contenedor.repaint();
    }

}
