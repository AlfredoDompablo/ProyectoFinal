/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfinal;

import java.io.Serializable;
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
    private int contador_de_objetos = 0;
    /**
     * Los objetos se almacenaran en un MAP
     */
    private Map map = new HashMap();
    /**
     * JPanel
     */
    private  JPanel contenedor;
    private  JLabel mapaLabel;
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

    

  
    
    /**
     * Metodo que crea un nuevo objeto
     */
    public void Nuevo_Objeto() {
        //aumenta contador en +1        
        this.contador_de_objetos += 1;
        //Crea una nueva instancia de "MiObjeto"
        Pin tmp = new Pin(String.valueOf(this.contador_de_objetos));
        //coloca al objeto creado en una posicion aleatoria
        tmp.setLocation(30, 30);
        //agrega el objeto en el MAP
        map.put(String.valueOf(this.contador_de_objetos), tmp);
        ES.imprimirEnArchivoPin(map);
        
        //agrega el objeto en el JPanel
        this.contenedor.add(tmp);
        this.contenedor.add(mapaLabel);
        //actualiza graficos
        this.contenedor.repaint();
    }
   
    public void actualizarArchivo(){
        ES.imprimirEnArchivoPin(map);
    }
    public void repintar() {
        map = ES.leerDeArchivoPin();
        for (int i = 0; i < map.size(); i++) {
            Pin temp = (Pin) map.get(String.valueOf(i + 1));
            int x = temp.getNuevo_X(), y = temp.getNuevo_Y();
            temp.setLocation(x, y);
            this.contenedor.add(temp);
        }
        this.contenedor.add(mapaLabel);
        this.contenedor.repaint();
    }

}
