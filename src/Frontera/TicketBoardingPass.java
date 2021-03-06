/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Entidad.Ticket;
import javax.swing.ImageIcon;

/**
 *
 * @author Nicolás
 */
public class TicketBoardingPass extends javax.swing.JFrame { //Esta clase se inicializa después de pagar una reservación ya sea con tarjeta de crédito o con puntos

    private Ticket ticket;

    public TicketBoardingPass(Ticket ticket) {
        this.ticket = ticket;
        initComponents();
        this.setTitle("Airline Tickets Application");
        this.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/icono avion.png")).getImage());
        configuracionInicial();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        asientoTicketL = new javax.swing.JLabel();
        vueloTicketL = new javax.swing.JLabel();
        horaTicketL = new javax.swing.JLabel();
        fechaTicketL = new javax.swing.JLabel();
        destinoTicketL = new javax.swing.JLabel();
        origenTicketL = new javax.swing.JLabel();
        claseTicketL = new javax.swing.JLabel();
        nombreTicketL = new javax.swing.JLabel();
        aceptarB = new javax.swing.JButton();
        asientoPassL = new javax.swing.JLabel();
        fechaPassL = new javax.swing.JLabel();
        vueloPassL = new javax.swing.JLabel();
        horaPassL = new javax.swing.JLabel();
        destinoPassL = new javax.swing.JLabel();
        origenPassL = new javax.swing.JLabel();
        nombrePassL = new javax.swing.JLabel();
        origenPassL1 = new javax.swing.JLabel();
        destinoPassL1 = new javax.swing.JLabel();
        vueloPassL1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        asientoTicketL.setBackground(new java.awt.Color(255, 255, 255));
        asientoTicketL.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        asientoTicketL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asientoTicketL.setText("0");
        asientoTicketL.setOpaque(true);
        getContentPane().add(asientoTicketL, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 230, 40));

        vueloTicketL.setBackground(new java.awt.Color(255, 255, 255));
        vueloTicketL.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        vueloTicketL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vueloTicketL.setText("VUELO");
        vueloTicketL.setOpaque(true);
        getContentPane().add(vueloTicketL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 150, 30));

        horaTicketL.setBackground(new java.awt.Color(255, 255, 255));
        horaTicketL.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        horaTicketL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        horaTicketL.setText("HORA");
        horaTicketL.setOpaque(true);
        getContentPane().add(horaTicketL, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 210, 30));

        fechaTicketL.setBackground(new java.awt.Color(255, 255, 255));
        fechaTicketL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fechaTicketL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fechaTicketL.setText("Fecha");
        fechaTicketL.setOpaque(true);
        getContentPane().add(fechaTicketL, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 120, 30));

        destinoTicketL.setBackground(new java.awt.Color(255, 255, 255));
        destinoTicketL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        destinoTicketL.setText("Destino");
        destinoTicketL.setOpaque(true);
        getContentPane().add(destinoTicketL, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 170, 30));

        origenTicketL.setBackground(new java.awt.Color(255, 255, 255));
        origenTicketL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        origenTicketL.setText("Origen");
        origenTicketL.setOpaque(true);
        getContentPane().add(origenTicketL, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 170, 30));

        claseTicketL.setBackground(new java.awt.Color(255, 255, 255));
        claseTicketL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        claseTicketL.setText("Clase");
        claseTicketL.setOpaque(true);
        getContentPane().add(claseTicketL, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 150, 30));

        nombreTicketL.setBackground(new java.awt.Color(255, 255, 255));
        nombreTicketL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombreTicketL.setText("Nombre");
        nombreTicketL.setOpaque(true);
        getContentPane().add(nombreTicketL, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 290, 40));

        aceptarB.setText("Aceptar");
        aceptarB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        aceptarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBActionPerformed(evt);
            }
        });
        getContentPane().add(aceptarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, -1, -1));

        asientoPassL.setBackground(new java.awt.Color(255, 255, 255));
        asientoPassL.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        asientoPassL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asientoPassL.setText("SILLA");
        asientoPassL.setOpaque(true);
        getContentPane().add(asientoPassL, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, 220, -1));

        fechaPassL.setBackground(new java.awt.Color(255, 255, 255));
        fechaPassL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        fechaPassL.setText("FECHA");
        fechaPassL.setOpaque(true);
        getContentPane().add(fechaPassL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 240, 130, 40));

        vueloPassL.setBackground(new java.awt.Color(255, 255, 255));
        vueloPassL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        vueloPassL.setText("VUELO");
        vueloPassL.setOpaque(true);
        getContentPane().add(vueloPassL, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 240, 90, 40));

        horaPassL.setBackground(new java.awt.Color(255, 255, 255));
        horaPassL.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        horaPassL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        horaPassL.setText("HORA");
        horaPassL.setOpaque(true);
        getContentPane().add(horaPassL, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 120, 50));

        destinoPassL.setBackground(new java.awt.Color(255, 255, 255));
        destinoPassL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        destinoPassL.setText("Destino");
        destinoPassL.setOpaque(true);
        getContentPane().add(destinoPassL, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 360, 250, 40));

        origenPassL.setBackground(new java.awt.Color(255, 255, 255));
        origenPassL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        origenPassL.setText("Origen");
        origenPassL.setOpaque(true);
        getContentPane().add(origenPassL, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 300, 250, 40));

        nombrePassL.setBackground(new java.awt.Color(255, 255, 255));
        nombrePassL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        nombrePassL.setText("Nombre");
        nombrePassL.setOpaque(true);
        getContentPane().add(nombrePassL, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, 360, 30));

        origenPassL1.setBackground(new java.awt.Color(255, 255, 255));
        origenPassL1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        origenPassL1.setText("Origen");
        origenPassL1.setOpaque(true);
        getContentPane().add(origenPassL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, 90, 40));

        destinoPassL1.setBackground(new java.awt.Color(255, 255, 255));
        destinoPassL1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        destinoPassL1.setText("Destino");
        destinoPassL1.setOpaque(true);
        getContentPane().add(destinoPassL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 360, 100, 40));

        vueloPassL1.setBackground(new java.awt.Color(255, 255, 255));
        vueloPassL1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        vueloPassL1.setText("Vuelo");
        vueloPassL1.setOpaque(true);
        getContentPane().add(vueloPassL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 240, 80, 40));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BoardingPass.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBActionPerformed
        // TODO add your handling code here:
        MenuInicial menu = new MenuInicial();
        menu.setLocationRelativeTo(this);
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_aceptarBActionPerformed

    private void configuracionInicial() {
        String nombre = ticket.getReserva().getUsuario().getNombre() + ' ' + ticket.getReserva().getUsuario().getApellido();
        String categoria = ticket.getReserva().getCategoria();
        String origen = ticket.getReserva().getVueloIda().getOrigen();
        String destino = ticket.getReserva().getVueloIda().getDestino();
        String fecha = ticket.getReserva().getVueloIda().getFecha();
        String hora = ticket.getReserva().getVueloIda().getHora();
        String vuelo = Integer.toString(ticket.getReserva().getVueloIda().getId());
        int[] asientos = ticket.getReserva().getPuestosIda();

        //Información del ticket
        nombreTicketL.setText(nombre);
        claseTicketL.setText(categoria);
        origenTicketL.setText(origen);
        destinoTicketL.setText(destino);
        fechaTicketL.setText(fecha);
        horaTicketL.setText(hora);
        vueloTicketL.setText(vuelo);
        System.out.println("Longitud: " + asientos.length);
        if(asientos.length == 1){
        asientoTicketL.setText("" + asientos[0]);
        } else {
        asientoTicketL.setText("" + asientos[0] + "-" + asientos[asientos.length-1]);
        }

        //Información del pase de abordar
        nombrePassL.setText(nombre);
        origenPassL.setText(origen);
        destinoPassL.setText(destino);
        fechaPassL.setText(fecha);
        horaPassL.setText(hora);
        if(asientos.length == 1){
        asientoPassL.setText("" + asientos[0]);
        } else {
        asientoPassL.setText("" + asientos[0] + "-" + asientos[asientos.length-1]);
        }
        vueloPassL.setText(vuelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarB;
    private javax.swing.JLabel asientoPassL;
    private javax.swing.JLabel asientoTicketL;
    private javax.swing.JLabel claseTicketL;
    private javax.swing.JLabel destinoPassL;
    private javax.swing.JLabel destinoPassL1;
    private javax.swing.JLabel destinoTicketL;
    private javax.swing.JLabel fechaPassL;
    private javax.swing.JLabel fechaTicketL;
    private javax.swing.JLabel horaPassL;
    private javax.swing.JLabel horaTicketL;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel nombrePassL;
    private javax.swing.JLabel nombreTicketL;
    private javax.swing.JLabel origenPassL;
    private javax.swing.JLabel origenPassL1;
    private javax.swing.JLabel origenTicketL;
    private javax.swing.JLabel vueloPassL;
    private javax.swing.JLabel vueloPassL1;
    private javax.swing.JLabel vueloTicketL;
    // End of variables declaration//GEN-END:variables
}
