/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfinal;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author OSCAR
 */
public class InicioSesion extends javax.swing.JFrame {

    private Mapa map;
    private final String usuario = "Admin";
    private final String contraseña = "1234";

    /**
     * Creates new form InicioSesio
     */
    public InicioSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aviso = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        botonAviso = new javax.swing.JLabel();
        Opciones = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelInicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        back = new javax.swing.JLabel();

        aviso.setAlwaysOnTop(true);
        aviso.setUndecorated(true);
        aviso.setResizable(false);
        aviso.setSize(new java.awt.Dimension(80, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setText("Ingresa un usuario y contraseña validos, por favor.");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 20, -1, -1));

        jPanel4.setBackground(new java.awt.Color(20, 148, 227));

        botonAviso.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        botonAviso.setForeground(new java.awt.Color(255, 255, 255));
        botonAviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonAviso.setText("Aceptar");
        botonAviso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonAvisoMousePressed(evt);
            }
        });
        botonAviso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonAvisoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonAviso, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonAviso, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 80, 30));

        javax.swing.GroupLayout avisoLayout = new javax.swing.GroupLayout(aviso.getContentPane());
        aviso.getContentPane().setLayout(avisoLayout);
        avisoLayout.setHorizontalGroup(
            avisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        avisoLayout.setVerticalGroup(
            avisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jButton1.setText("Editar mapa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ver listas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO_4.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout OpcionesLayout = new javax.swing.GroupLayout(Opciones.getContentPane());
        Opciones.getContentPane().setLayout(OpcionesLayout);
        OpcionesLayout.setHorizontalGroup(
            OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        OpcionesLayout.setVerticalGroup(
            OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        panelInicio.setBackground(new java.awt.Color(255, 255, 255));
        panelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO_4.png"))); // NOI18N
        panelInicio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 44, -1, -1));

        jPanel2.setBackground(new java.awt.Color(20, 148, 227));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        panelInicio.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, 230));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("CONTRASEÑA");
        panelInicio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 154, -1, -1));

        User.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        User.setForeground(new java.awt.Color(153, 153, 153));
        User.setText("Ingrese su usuario");
        User.setBorder(null);
        User.setFocusable(false);
        User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UserMousePressed(evt);
            }
        });
        User.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UserPassKeyPressed(evt);
            }
        });
        panelInicio.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 114, 210, -1));

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        panelInicio.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 134, 210, 10));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("USUARIO");
        panelInicio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 84, -1, -1));

        Password.setForeground(new java.awt.Color(153, 153, 153));
        Password.setText("xxxxxxxx");
        Password.setBorder(null);
        Password.setFocusable(false);
        Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PasswordMousePressed(evt);
            }
        });
        Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UserPassKeyPressed(evt);
            }
        });
        panelInicio.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 174, 210, -1));
        panelInicio.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 194, 210, -1));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/backIcon_2.png"))); // NOI18N
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        panelInicio.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 11, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 232, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserPassKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            JOptionPane.showMessageDialog(rootPane, "Has pulsado Enter");
            if (User.getText().isEmpty() || String.valueOf(Password.getPassword()).isEmpty()
                    || !User.getText().equals(usuario) || !String.valueOf(Password.getPassword()).equals(contraseña)) {
                aviso.setSize(300, 100);
                aviso.setLocationRelativeTo(rootPane);
                aviso.setVisible(true);
                botonAviso.requestFocus();
            } else {
//                JOptionPane.showMessageDialog(rootPane, "Correcto!");
                Opciones.setLocationRelativeTo(null);
                Opciones.setSize(250,230);
                Opciones.setVisible(true);
                
                this.setVisible(false);
            }

        }

    }//GEN-LAST:event_UserPassKeyPressed

    private void UserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMousePressed
        // TODO add your handling code here:

        // TODO add your handling code here:
        if (User.getText().equals("Ingrese su usuario")) {
            User.setForeground(Color.BLACK);
            User.setText("");
            User.setFocusable(true);
            User.requestFocus();
        }
        if ((String.valueOf(Password.getPassword())).isEmpty()) {
            Password.setForeground(Color.GRAY);
            Password.setText("xxxxxxxx");
        }
    }//GEN-LAST:event_UserMousePressed

    private void PasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordMousePressed
        // TODO add your handling code here:
        if ((String.valueOf(Password.getPassword())).equals("xxxxxxxx")) {
            Password.setForeground(Color.BLACK);
            Password.setText("");
            Password.setFocusable(true);
            Password.requestFocus();
        }
        if (User.getText().isEmpty()) {
            User.setForeground(Color.GRAY);
            User.setText("Ingrese su usuario");
        }

    }//GEN-LAST:event_PasswordMousePressed

    private void botonAvisoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAvisoMousePressed
        // TODO add your handling code here:
        aviso.setVisible(false);
    }//GEN-LAST:event_botonAvisoMousePressed

    private void botonAvisoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonAvisoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            aviso.setVisible(false);
        }
    }//GEN-LAST:event_botonAvisoKeyPressed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        map = new Mapa();
        map.setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        EditarMapa mapEdit = new EditarMapa();
                this.setVisible(false);
                mapEdit.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Opciones;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField User;
    private javax.swing.JFrame aviso;
    private javax.swing.JLabel back;
    private javax.swing.JLabel botonAviso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panelInicio;
    // End of variables declaration//GEN-END:variables
}
