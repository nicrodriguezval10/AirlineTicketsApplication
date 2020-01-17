/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Control.ValidarReserva;
import DAO.VueloDAO;
import Entidad.Vuelo;
import java.awt.Color;
//import static Frontera.FramePrincipal.sistema;
//import static Frontera.ReservationIda.idReserva;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author nicro
 */
public class ReservationVuelta extends javax.swing.JFrame {

    private VueloDAO vdao = new VueloDAO();

    private boolean esEquipaje;
    private String lugarOrigen, lugarDestino, fechaSalida, horaSalida, categoria1, peso1;
    private int puestos, peso; //Hasta acá es la información de la ida

    private boolean esEquipajeVuelta;
    private String fechaVuelta, horaVuelta, categoriaVuelta, peso1Vuelta;
    private int puestosVuelta, pesoVuelta;

    /**
     * Creates new form reservationVuelta
     */
    public ReservationVuelta(boolean esEquipaje, String lugarOrigen, String lugarDestino, String fechaSalida, String horaSalida, String categoria1, String peso1, int puestos, int peso) {
        this.esEquipaje = esEquipaje;
        this.lugarOrigen = lugarOrigen;
        this.lugarDestino = lugarDestino;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.categoria1 = categoria1;
        this.peso1 = peso1;
        this.puestos = puestos;
        this.peso = peso;
        puestosVuelta = puestos;
        categoriaVuelta = categoria1;

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

        panelPrincipal = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        horaCB = new javax.swing.JComboBox<>();
        equipajeCB = new javax.swing.JCheckBox();
        pesoEquipaje = new javax.swing.JLabel();
        pesoEquipajeCB = new javax.swing.JComboBox<>();
        cancelar = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        origenVuelta = new javax.swing.JLabel();
        destinoVuelta = new javax.swing.JLabel();
        fechaCB = new javax.swing.JComboBox<>();
        noPuestosL = new javax.swing.JLabel();
        categoriaL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        aviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(java.awt.Color.white);
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setText("Informaciónde vuelo de vuelta");
        panelPrincipal.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        horaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaCBActionPerformed(evt);
            }
        });
        panelPrincipal.add(horaCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 210, 70, 30));

        equipajeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipajeCBActionPerformed(evt);
            }
        });
        panelPrincipal.add(equipajeCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        pesoEquipaje.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pesoEquipaje.setText("Peso del equipaje");
        panelPrincipal.add(pesoEquipaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 137, 43));

        pesoEquipajeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10-20 Kg", "21-30 Kg", "30-40 Kg", "40-50 Kg" }));
        pesoEquipajeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoEquipajeCBActionPerformed(evt);
            }
        });
        panelPrincipal.add(pesoEquipajeCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 94, -1));

        cancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnPlane.png"))); // NOI18N
        cancelar.setText("Volver");
        cancelar.setContentAreaFilled(false);
        cancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnPlane.png"))); // NOI18N
        cancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnBack.png"))); // NOI18N
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        panelPrincipal.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 120, -1));

        siguiente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnPlane.png"))); // NOI18N
        siguiente.setText("Siguiente");
        siguiente.setContentAreaFilled(false);
        siguiente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnPlane.png"))); // NOI18N
        siguiente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnNext.png"))); // NOI18N
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });
        panelPrincipal.add(siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, -1, -1));

        origenVuelta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPrincipal.add(origenVuelta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 170, 30));

        destinoVuelta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPrincipal.add(destinoVuelta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 170, 30));

        fechaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaCBActionPerformed(evt);
            }
        });
        panelPrincipal.add(fechaCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 70, 30));

        noPuestosL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPrincipal.add(noPuestosL, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 170, 30));

        categoriaL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelPrincipal.add(categoriaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 170, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ReservVuelta.png"))); // NOI18N
        panelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 330));

        aviso.setForeground(java.awt.Color.red);
        panelPrincipal.add(aviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 540, 20));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void horaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaCBActionPerformed
        // TODO add your handling code here:
        horaVuelta = horaCB.getItemAt(horaCB.getSelectedIndex());
    }//GEN-LAST:event_horaCBActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        horaVuelta = horaCB.getItemAt(horaCB.getSelectedIndex());
        fechaVuelta = fechaCB.getItemAt(fechaCB.getSelectedIndex());
        esEquipajeVuelta = equipajeCB.isSelected();

        ValidarReserva validar = new ValidarReserva();

        System.out.println("-------");
        String resultado = validar.VerificarReservaVuelta(fechaVuelta, horaVuelta);
        System.out.println(resultado);

        aviso.setForeground(Color.red);

        if (resultado.equals("Fecha de vuelo inválida. Por favor escoja una de las opciones")) {
            aviso.setText("Fecha de vuelo inválida. Por favor escoja una de las opciones");
        } else if (resultado.equals("Hora de vuelo inválida. Por favor escoja una de las opciones")) {
            aviso.setText("Hora de vuelo inválida. Por favor escoja una de las opciones");
        } else {
            if (esEquipajeVuelta) {
                peso1Vuelta = pesoEquipajeCB.getItemAt(pesoEquipajeCB.getSelectedIndex());
                pesoVuelta = pesoEquipajeCB.getSelectedIndex() + 1;
            } else {
                peso1Vuelta = "Ninguno";
                pesoVuelta = 0;
            }

            Vuelo vueloIda = null;
            Vuelo vueloVuelta = null;

            if (vdao.leer(lugarOrigen, lugarDestino, fechaSalida, horaSalida) != null) {
                vueloIda = vdao.leer(lugarOrigen, lugarDestino, fechaSalida, horaSalida);
            }

            if (vdao.leer(lugarDestino, lugarOrigen, fechaVuelta, horaVuelta) != null) {
                vueloVuelta = vdao.leer(lugarDestino, lugarOrigen, fechaVuelta, horaVuelta);
            }

            ReservationResumen rResumen = new ReservationResumen(vueloIda, puestos, categoria1, esEquipaje, peso, peso1, true);

            rResumen.setVueloVuelta1(vueloVuelta);
            rResumen.setCategoriaVuelta(categoriaVuelta);
            rResumen.setIsEquipajeVuelta(esEquipajeVuelta);
            rResumen.setPuestosReservadosVuelta(puestosVuelta);
            rResumen.setPeso1vuelta(peso1Vuelta);
            rResumen.setPesoVuelta(pesoVuelta);

            rResumen.setLocationRelativeTo(this);
            this.setVisible(false);
            rResumen.setVisible(true);
        }
    }//GEN-LAST:event_siguienteActionPerformed

    private void pesoEquipajeCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoEquipajeCBActionPerformed
        // TODO add your handling code here:
        peso1Vuelta = pesoEquipajeCB.getItemAt(pesoEquipajeCB.getSelectedIndex());
        pesoVuelta = pesoEquipajeCB.getSelectedIndex() + 1;
    }//GEN-LAST:event_pesoEquipajeCBActionPerformed

    private void equipajeCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipajeCBActionPerformed
        esEquipajeVuelta = equipajeCB.isSelected();

        if (esEquipajeVuelta) {
            pesoEquipaje.setVisible(true);
            pesoEquipajeCB.setVisible(true);
        } else {
            pesoEquipaje.setVisible(false);
            pesoEquipajeCB.setVisible(false);
        }
    }//GEN-LAST:event_equipajeCBActionPerformed

    private void fechaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaCBActionPerformed
        // TODO add your handling code here:
        fechaVuelta = fechaCB.getItemAt(fechaCB.getSelectedIndex());
        ArrayList<String> al = new ArrayList<>();
        int count = 0;

        String query = "v.origen LIKE '" + lugarDestino + "' AND v.destino LIKE '" + lugarOrigen + "' AND v.fecha LIKE '" + fechaVuelta + "'";
        for (String s : vdao.leerposteriorparametertolist("hora", horaSalida, query)) {
            count++;
            al.add(s);
        }

        /*for(Vuelo v : sistema.getVuelos()) {
            if(v.getOrigen().equals(lugarDestino) && v.getDestino().equals(lugarOrigen) && v.getFecha().equals(fechaVuelta)) {
                count++;
                al.add(v.getHora());   
            }
        }*/
        String horasSalida[] = new String[(count + 1)];
        horasSalida[0] = "Ninguna";

        for (int i = 0; i < count; i++) {
            horasSalida[(i + 1)] = al.get(i);
        }

        horaCB.setModel(new javax.swing.DefaultComboBoxModel<>(horasSalida));
    }//GEN-LAST:event_fechaCBActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        ReservationIda reservacion = new ReservationIda();
        reservacion.setLocationRelativeTo(this);
        this.setVisible(false);
        reservacion.setVisible(true);
    }//GEN-LAST:event_cancelarActionPerformed

    private void configuracionInicial() {
        origenVuelta.setText(lugarDestino);
        destinoVuelta.setText(lugarOrigen);
        noPuestosL.setText(("" + puestosVuelta));
        categoriaL.setText(categoriaVuelta);
        pesoEquipaje.setVisible(false);
        pesoEquipajeCB.setVisible(false);

        ArrayList<String> al = new ArrayList<>();
        int count = 0;

        String query = "v.origen LIKE '" + lugarDestino + "' AND v.destino LIKE '" + lugarOrigen + "'";
        for (String s : vdao.leerposteriorparametertolist("fecha",fechaSalida, query)) {
            count++;
            al.add(s);
        }

        /*for(Vuelo v : sistema.getVuelos()) {
            if(v.getOrigen().equals(lugarDestino) && v.getDestino().equals(lugarOrigen)) {
                count++;
                al.add(v.getFecha());
            }
        }*/
        String fechaVuelta[] = new String[(count + 1)];
        fechaVuelta[0] = "Ninguna";

        for (int i = 0; i < count; i++) {
            fechaVuelta[(i + 1)] = al.get(i);
        }

        fechaCB.setModel(new javax.swing.DefaultComboBoxModel<>(fechaVuelta));
        horaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Ninguna"}));
        pesoEquipajeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"10-20 Kg", "21-30 Kg", "30-40 Kg", "40-50 Kg"}));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aviso;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel categoriaL;
    private javax.swing.JLabel destinoVuelta;
    private javax.swing.JCheckBox equipajeCB;
    private javax.swing.JComboBox<String> fechaCB;
    private javax.swing.JComboBox<String> horaCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel noPuestosL;
    private javax.swing.JLabel origenVuelta;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel pesoEquipaje;
    public javax.swing.JComboBox<String> pesoEquipajeCB;
    private javax.swing.JButton siguiente;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
