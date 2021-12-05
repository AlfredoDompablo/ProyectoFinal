/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfinal;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author OSCAR
 */
public class PinFijo extends JLabel implements Serializable, MouseListener {

  

    /**
     * Identificador de objeto
     */
    private String key = "";
    /**
     * Posicion de imagen
     */
    private Point posicion = new Point(0, 0);
    /**
     * Tamaño de imagen
     */
    private Dimension d = new Dimension(32, 32);

    private int nuevo_X = 1;
    private int nuevo_Y = 1;

    public int getNuevo_X() {
        return nuevo_X;
    }

    public int getNuevo_Y() {
        return nuevo_Y;
    }

    public void setNuevo_X(int nuevo_X) {
        this.nuevo_X = nuevo_X;
    }

    public void setNuevo_Y(int nuevo_Y) {
        this.nuevo_Y = nuevo_Y;
    }
    

    public PinFijo(int x, int y, String nombre) {
        //se inician propiedades de objeto
        this.key = nombre;
        this.setToolTipText(key);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.setSize(d);
        this.setPreferredSize(d);
        this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/pin_2.png")));
        this.setText("");
        this.setVisible(true);
//        this.setLocation(posicion);
        //se agregan los listener
        this.addMouseListener(this);
        this.setLocation(x, y);
//        this.addMouseMotionListener(this);
        this.nuevo_X = x;
        this.nuevo_Y = y;
    }
    public PinFijo(){
        this.key = key;
        this.setToolTipText(key);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.setSize(d);
        this.setPreferredSize(d);
        this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/pin_2.png")));
        this.setText("");
        this.setVisible(true);
//        this.setLocation(posicion);
        //se agregan los listener
        this.addMouseListener(this);
//        this.setLocation(x, y);
//        this.addMouseMotionListener(this);
//        this.nuevo_X = x;
//        this.nuevo_Y = y;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setBorder(BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51), 1));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBorder(null);
    }
}
