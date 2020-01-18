/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Entidad.Reserva;
import javax.swing.ImageIcon;

/**
 *
 * @author alemr
 */
public class Seat extends javax.swing.JFrame {

    private int[] puestosIda, puestosVuelta;
    private Reserva reserva;

    /**
     * Creates new form Seat
     */
    
    public Seat(int[] puestosIda, Reserva reserva) {
        initComponents();
        this.puestosIda = puestosIda;
        this.reserva = reserva;
        this.setTitle("Airline Tickets Application");
        this.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/icono avion.png")).getImage());
        if (!reserva.isIdaVuelta()) {
            configuracionInicial();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        pasajero1T = new java.awt.Label();
        pasajero2T = new java.awt.Label();
        pasajero3T = new java.awt.Label();
        pasajero4T = new java.awt.Label();
        pasajero5T = new java.awt.Label();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Pasajero5VueltaT = new java.awt.Label();
        pasajero4VueltaT = new java.awt.Label();
        pasajero3VueltaT = new java.awt.Label();
        pasajero2VueltaT = new java.awt.Label();
        pasajero1VueltaT = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();

        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pasajero1T.setAlignment(java.awt.Label.CENTER);
        pasajero1T.setBackground(new java.awt.Color(255, 255, 255));
        pasajero1T.setText("N/A");
        jPanel1.add(pasajero1T, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 70, -1));

        pasajero2T.setAlignment(java.awt.Label.CENTER);
        pasajero2T.setBackground(new java.awt.Color(255, 255, 255));
        pasajero2T.setText("N/A");
        jPanel1.add(pasajero2T, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 70, -1));

        pasajero3T.setAlignment(java.awt.Label.CENTER);
        pasajero3T.setBackground(new java.awt.Color(255, 255, 255));
        pasajero3T.setText("N/A");
        jPanel1.add(pasajero3T, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 70, -1));

        pasajero4T.setAlignment(java.awt.Label.CENTER);
        pasajero4T.setBackground(new java.awt.Color(255, 255, 255));
        pasajero4T.setText("N/A");
        jPanel1.add(pasajero4T, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 70, 20));

        pasajero5T.setAlignment(java.awt.Label.CENTER);
        pasajero5T.setBackground(new java.awt.Color(255, 255, 255));
        pasajero5T.setText("N/A");
        jPanel1.add(pasajero5T, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 70, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SillasAvion.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 330));

        jTabbedPane1.addTab("Sillas Ida", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pasajero5VueltaT.setAlignment(java.awt.Label.CENTER);
        Pasajero5VueltaT.setBackground(new java.awt.Color(255, 255, 255));
        Pasajero5VueltaT.setText("N/A");
        jPanel2.add(Pasajero5VueltaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 70, -1));

        pasajero4VueltaT.setAlignment(java.awt.Label.CENTER);
        pasajero4VueltaT.setBackground(new java.awt.Color(255, 255, 255));
        pasajero4VueltaT.setText("N/A");
        jPanel2.add(pasajero4VueltaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 70, -1));

        pasajero3VueltaT.setAlignment(java.awt.Label.CENTER);
        pasajero3VueltaT.setBackground(new java.awt.Color(255, 255, 255));
        pasajero3VueltaT.setText("N/A");
        jPanel2.add(pasajero3VueltaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 70, -1));

        pasajero2VueltaT.setAlignment(java.awt.Label.CENTER);
        pasajero2VueltaT.setBackground(new java.awt.Color(255, 255, 255));
        pasajero2VueltaT.setText("N/A");
        jPanel2.add(pasajero2VueltaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 70, -1));

        pasajero1VueltaT.setAlignment(java.awt.Label.CENTER);
        pasajero1VueltaT.setBackground(new java.awt.Color(255, 255, 255));
        pasajero1VueltaT.setText("N/A");
        jPanel2.add(pasajero1VueltaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 70, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SillasAvion.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 330));

        jTabbedPane1.addTab("Sillas Vuelta", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void configuracionInicial() {
        /*pasajero1T.setVisible(false);
        pasajero2T.setVisible(false);
        pasajero3T.setVisible(false);
        pasajero4T.setVisible(false);
        pasajero5T.setVisible(false);
        
        pasajero1VueltaT.setVisible(false);
        pasajero2VueltaT.setVisible(false);
        pasajero3VueltaT.setVisible(false);
        pasajero4VueltaT.setVisible(false);
        Pasajero5VueltaT.setVisible(false);*/
        
        switch (reserva.getNumeroPuestos()) {
            case 1:
                pasajero1T.setVisible(true);
                pasajero1T.setText(("" + (puestosIda[0] + 1)));
                break;

            case 2:
                pasajero1T.setVisible(true);
                pasajero1T.setText(("" + (puestosIda[0] + 1)));
                pasajero2T.setVisible(true);
                pasajero2T.setText(("" + (puestosIda[1] + 1)));
                break;

            case 3:
                pasajero1T.setVisible(true);
                pasajero1T.setText(("" + (puestosIda[0] + 1)));
                pasajero2T.setVisible(true);
                pasajero2T.setText(("" + (puestosIda[1] + 1)));
                pasajero3T.setVisible(true);
                pasajero3T.setText(("" + (puestosIda[2] + 1)));
                break;

            case 4:
                pasajero1T.setVisible(true);
                pasajero1T.setText(("" + (puestosIda[0] + 1)));
                pasajero2T.setVisible(true);
                pasajero2T.setText(("" + (puestosIda[1] + 1)));
                pasajero3T.setVisible(true);
                pasajero3T.setText(("" + (puestosIda[2] + 1)));
                pasajero4T.setVisible(true);
                pasajero4T.setText(("" + (puestosIda[3] + 1)));
                break;

            case 5:
                pasajero1T.setVisible(true);
                pasajero1T.setText(("" + (puestosIda[0] + 1)));
                pasajero2T.setVisible(true);
                pasajero2T.setText(("" + (puestosIda[1] + 1)));
                pasajero3T.setVisible(true);
                pasajero3T.setText(("" + (puestosIda[2] + 1)));
                pasajero4T.setVisible(true);
                pasajero4T.setText(("" + (puestosIda[3] + 1)));
                pasajero5T.setVisible(true);
                pasajero5T.setText(("" + (puestosIda[4] + 1)));
                break;
        }

        if (reserva.isIdaVuelta()) {
            switch (reserva.getNumeroPuestosVuelta()) {
                case 1:

                    pasajero1VueltaT.setVisible(true);
                    pasajero1VueltaT.setText(("" + (puestosVuelta[0] + 1)));
                    break;

                case 2:

                    pasajero1VueltaT.setVisible(true);
                    pasajero1VueltaT.setText(("" + (puestosVuelta[0] + 1)));
                    pasajero2VueltaT.setVisible(true);
                    pasajero2VueltaT.setText(("" + (puestosVuelta[1] + 1)));
                    break;

                case 3:

                    pasajero1VueltaT.setVisible(true);
                    pasajero1VueltaT.setText(("" + (puestosVuelta[0] + 1)));
                    pasajero2VueltaT.setVisible(true);
                    pasajero2VueltaT.setText(("" + (puestosVuelta[1] + 1)));
                    pasajero3VueltaT.setVisible(true);
                    pasajero3VueltaT.setText(("" + (puestosVuelta[2] + 1)));
                    break;

                case 4:

                    pasajero1VueltaT.setVisible(true);
                    pasajero1VueltaT.setText(("" + (puestosVuelta[0] + 1)));
                    pasajero2VueltaT.setVisible(true);
                    pasajero2VueltaT.setText(("" + (puestosVuelta[1] + 1)));
                    pasajero3VueltaT.setVisible(true);
                    pasajero3VueltaT.setText(("" + (puestosVuelta[2] + 1)));
                    pasajero4VueltaT.setVisible(true);
                    pasajero4VueltaT.setText(("" + (puestosVuelta[3] + 1)));
                    break;

                case 5:

                    pasajero1VueltaT.setVisible(true);
                    pasajero1VueltaT.setText(("" + (puestosVuelta[0] + 1)));
                    pasajero2VueltaT.setVisible(true);
                    pasajero2VueltaT.setText(("" + (puestosVuelta[1] + 1)));
                    pasajero3VueltaT.setVisible(true);
                    pasajero3VueltaT.setText(("" + (puestosVuelta[2] + 1)));
                    pasajero4VueltaT.setVisible(true);
                    pasajero4VueltaT.setText(("" + (puestosVuelta[3] + 1)));
                    Pasajero5VueltaT.setVisible(true);
                    Pasajero5VueltaT.setText(("" + (puestosVuelta[4] + 1)));
                    break;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label Pasajero5VueltaT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Label pasajero1T;
    private java.awt.Label pasajero1VueltaT;
    private java.awt.Label pasajero2T;
    private java.awt.Label pasajero2VueltaT;
    private java.awt.Label pasajero3T;
    private java.awt.Label pasajero3VueltaT;
    private java.awt.Label pasajero4T;
    private java.awt.Label pasajero4VueltaT;
    private java.awt.Label pasajero5T;
    // End of variables declaration//GEN-END:variables

    public void setPuestosVuelta(int[] puestosVuelta) {
        this.puestosVuelta = puestosVuelta;
        configuracionInicial();
    }
}
