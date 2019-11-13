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
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author nicro
 */
public class ReservationIda extends javax.swing.JFrame {
    private VueloDAO vdao = new VueloDAO();
    //public static int idReserva = 0;
    
    private boolean esIdaVuelta, esEquipaje;
    private String lugarOrigen, lugarDestino, fechaSalida, horaSalida, categoria1, peso1;
    private int puestos, peso;
       
    public ReservationIda() {
        initComponents();
        configuracionInicial();
        this.setTitle("Airline Tickets Application");
        this.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/icono avion.png")).getImage());
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
        OrigenCB = new javax.swing.JComboBox<>();
        destinoCB = new javax.swing.JComboBox<>();
        horaCB = new javax.swing.JComboBox<>();
        idaVueltaCB = new javax.swing.JCheckBox();
        noPuestosCB = new javax.swing.JComboBox<>();
        categoriaCB = new javax.swing.JComboBox<>();
        equipajeCB = new javax.swing.JCheckBox();
        pesoEquipaje = new javax.swing.JLabel();
        pesoEquipajeCB = new javax.swing.JComboBox<>();
        cancelar = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        fechaCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        aviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(java.awt.Color.white);
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setText("Realizar Reservación");
        panelPrincipal.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        OrigenCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bogotá", "Medellin", "Cali", "Barranquilla" }));
        OrigenCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrigenCBActionPerformed(evt);
            }
        });
        panelPrincipal.add(OrigenCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 170, 30));

        destinoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bogotá", "Medellin", "Cali", "Barranquilla" }));
        destinoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinoCBActionPerformed(evt);
            }
        });
        panelPrincipal.add(destinoCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 170, 30));

        horaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaCBActionPerformed(evt);
            }
        });
        panelPrincipal.add(horaCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 70, 30));

        idaVueltaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idaVueltaCBActionPerformed(evt);
            }
        });
        panelPrincipal.add(idaVueltaCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        noPuestosCB.setModel(new javax.swing.DefaultComboBoxModel<>(new Integer[] { 1, 2, 3, 4, 5 }));
        noPuestosCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noPuestosCBActionPerformed(evt);
            }
        });
        panelPrincipal.add(noPuestosCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 170, 30));

        categoriaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Turista", "Ejecutiva", "Primera clase" }));
        categoriaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaCBActionPerformed(evt);
            }
        });
        panelPrincipal.add(categoriaCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 170, 30));

        equipajeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipajeCBActionPerformed(evt);
            }
        });
        panelPrincipal.add(equipajeCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        pesoEquipaje.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pesoEquipaje.setText("Peso del equipaje");
        panelPrincipal.add(pesoEquipaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 137, 43));

        pesoEquipajeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10-20 Kg", "21-30 Kg", "30-40 Kg", "40-50 Kg" }));
        pesoEquipajeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoEquipajeCBActionPerformed(evt);
            }
        });
        panelPrincipal.add(pesoEquipajeCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 94, -1));

        cancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnPlane.png"))); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.setContentAreaFilled(false);
        cancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnPlane.png"))); // NOI18N
        cancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnBack.png"))); // NOI18N
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        panelPrincipal.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, -1, -1));

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
        panelPrincipal.add(siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, -1, -1));

        fechaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaCBActionPerformed(evt);
            }
        });
        panelPrincipal.add(fechaCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 70, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ReservIda.png"))); // NOI18N
        panelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 330));

        aviso.setForeground(java.awt.Color.red);
        panelPrincipal.add(aviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 530, 20));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idaVueltaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idaVueltaCBActionPerformed
        esIdaVuelta = idaVueltaCB.isSelected();
    }//GEN-LAST:event_idaVueltaCBActionPerformed

    private void equipajeCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipajeCBActionPerformed
        esEquipaje = equipajeCB.isSelected();
        
        if(esEquipaje) {
            pesoEquipaje.setVisible(true);
            pesoEquipajeCB.setVisible(true); 
        }
        
        else {
            pesoEquipaje.setVisible(false);
            pesoEquipajeCB.setVisible(false);
        }
    }//GEN-LAST:event_equipajeCBActionPerformed

    private void categoriaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaCBActionPerformed
        // TODO add your handling code here:
        categoria1 = categoriaCB.getItemAt(categoriaCB.getSelectedIndex());
    }//GEN-LAST:event_categoriaCBActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        categoria1 = categoriaCB.getItemAt(categoriaCB.getSelectedIndex());
        esEquipaje = equipajeCB.isSelected();
        lugarOrigen = OrigenCB.getItemAt(OrigenCB.getSelectedIndex());
        lugarDestino = destinoCB.getItemAt(destinoCB.getSelectedIndex());
        fechaSalida = fechaCB.getItemAt(fechaCB.getSelectedIndex());
        horaSalida = horaCB.getItemAt(horaCB.getSelectedIndex());
        puestos = noPuestosCB.getItemAt(noPuestosCB.getSelectedIndex());
        
        ValidarReserva validar = new ValidarReserva();
        
        System.out.println("-------");
        String resultado = validar.VerificarReservaIda(lugarOrigen, lugarDestino, fechaSalida, horaSalida);
        System.out.println(resultado);
        
        aviso.setForeground(Color.red);

        if(resultado.equals("Ubicación de origen inválida. Por favor escoja una de las opciones")){
            aviso.setText("Ubicación de origen inválida. Por favor escoja una de las opciones");
        } else if(resultado.equals("Ubicación de destino inválida. Por favor escoja una de las opciones")){
            aviso.setText("Ubicaión de destino inválida. Por favor escoja una de las opciones");
        } else if(resultado.equals("Fecha de vuelo inválida. Por favor escoja una de las opciones")){
            aviso.setText("Fecha de vuelo inválida. Por favor escoja una de las opciones");
        } else if(resultado.equals("Hora de vuelo inválida. Por favor escoja una de las opciones")){
            aviso.setText("Hora de vuelo inválida. Por favor escoja una de las opciones");
        } else{
        if(esEquipaje){
            peso1 = pesoEquipajeCB.getItemAt(pesoEquipajeCB.getSelectedIndex());
            peso = pesoEquipajeCB.getSelectedIndex() + 1;
        } else {
            peso1 = "Ninguno";
            peso = 0;
        }
        this.setVisible(false);
        if(esIdaVuelta) {
            reservationVuelta reservacion = new reservationVuelta(esEquipaje, lugarOrigen, lugarDestino, fechaSalida, horaSalida, categoria1, peso1, puestos, peso);
            reservacion.setLocationRelativeTo(this);
            reservacion.setVisible(true);
            reservacion.setAlwaysOnTop(true);
        } else {
            Vuelo vuelo = null;
           
            if(vdao.leer(lugarOrigen, lugarDestino, fechaSalida, horaSalida) != null){
                vuelo = vdao.leer(lugarOrigen, lugarDestino, fechaSalida, horaSalida);
            }
            ReservationResumen rResumen = new ReservationResumen(vuelo, puestos, categoria1, esEquipaje, peso, peso1, false);
            rResumen.setLocationRelativeTo(this);
            rResumen.setVisible(true);
            rResumen.setAlwaysOnTop( true );
        }
    }
    }//GEN-LAST:event_siguienteActionPerformed

    private void pesoEquipajeCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoEquipajeCBActionPerformed
        // TODO add your handling code here:
        peso1 = pesoEquipajeCB.getItemAt(pesoEquipajeCB.getSelectedIndex());
        peso = pesoEquipajeCB.getSelectedIndex() + 1;
    }//GEN-LAST:event_pesoEquipajeCBActionPerformed

    private void OrigenCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrigenCBActionPerformed
        // TODO add your handling code here:
        int count = 0;
        lugarOrigen = OrigenCB.getItemAt(OrigenCB.getSelectedIndex());
        ArrayList<String> al = new ArrayList<>();
        
        String query = "v.origen LIKE '"+lugarOrigen+"'";
        for(String s : vdao.leerdiffparametertolist("destino",query)){
                count++;
                al.add(s);
            }
        
       /* for(Vuelo v : sistema.getVuelos()) {
            if(v.getOrigen().equals(lugarOrigen)) {
                count++;
                al.add(v.getDestino());
            }
        }*/
        
        String ciudadesDestino[] = new String[(count + 1)];
        ciudadesDestino[0] = "Ninguno";
        
        for(int i = 0; i < count; i++)
            ciudadesDestino[(i + 1)] = al.get(i);
        
        destinoCB.setModel(new javax.swing.DefaultComboBoxModel<>(ciudadesDestino));
    }//GEN-LAST:event_OrigenCBActionPerformed

    private void destinoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinoCBActionPerformed
        // TODO add your handling code here:
        lugarDestino = destinoCB.getItemAt(destinoCB.getSelectedIndex());
        ArrayList<String> al = new ArrayList<>();
        int count = 0;
        
        String query = "v.origen LIKE '" + lugarOrigen + "' AND v.destino LIKE '" + lugarDestino + "'";
        for(String s : vdao.leerdiffparametertolist("fecha",query)){
            count++;
            al.add(s);
        } 
        
        /*for(Vuelo v : sistema.getVuelos()) {
            if(v.getOrigen().equals(lugarOrigen) && v.getDestino().equals(lugarDestino)) {
                count++;
                al.add(v.getFecha());
            }
        }*/
        
        String fechasSalida[] = new String[(count + 1)];
        fechasSalida[0] = "Ninguna";
        
        for(int i = 0; i < count; i++)
            fechasSalida[(i + 1)] = al.get(i);
        
        fechaCB.setModel(new javax.swing.DefaultComboBoxModel<>(fechasSalida));
    }//GEN-LAST:event_destinoCBActionPerformed

    private void noPuestosCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noPuestosCBActionPerformed
        // TODO add your handling code here:
        puestos = noPuestosCB.getItemAt(noPuestosCB.getSelectedIndex());
    }//GEN-LAST:event_noPuestosCBActionPerformed

    private void horaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaCBActionPerformed
        // TODO add your handling code here:
        horaSalida = horaCB.getItemAt(horaCB.getSelectedIndex());
    }//GEN-LAST:event_horaCBActionPerformed

    private void fechaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaCBActionPerformed
        // TODO add your handling code here:
        fechaSalida = fechaCB.getItemAt(fechaCB.getSelectedIndex());
        ArrayList<String> al = new ArrayList<>();
        int count = 0;

        String query = "v.origen LIKE '" + lugarOrigen + "' AND v.destino LIKE '" + lugarDestino + "' AND v.fecha LIKE '" + fechaSalida + "'";
        for(String s : vdao.leerdiffparametertolist("hora",query)){
                count++;
                al.add(s);
            }   
        /*for(Vuelo v : sistema.getVuelos()) {
            if(v.getOrigen().equals(lugarOrigen) && v.getDestino().equals(lugarDestino) && v.getFecha().equals(fechaSalida)) {
                count++;
                al.add(v.getHora());   
            }
        }*/
        
        String horasSalida[] = new String[(count + 1)];
        horasSalida[0] = "Ninguna";
        
        for(int i = 0; i < count; i++)
            horasSalida[(i + 1)] = al.get(i);
        
        horaCB.setModel(new javax.swing.DefaultComboBoxModel<>(horasSalida));
    }//GEN-LAST:event_fechaCBActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MenuInicial menu = new MenuInicial();
        menu.setLocationRelativeTo(this);
        menu.setVisible(true);
        menu.setAlwaysOnTop(true);
    }//GEN-LAST:event_cancelarActionPerformed

    private void configuracionInicial() {
        pesoEquipaje.setVisible(false);
        pesoEquipajeCB.setVisible(false);
        
        int x = vdao.leerdiffallparametertolist("origen").size();
        String ciudadesOrigen[] = new String[(x + 1)];
        ciudadesOrigen[0] = "Ninguno";
        
        int i = 1;
        for(String s : vdao.leerdiffallparametertolist("origen")){
            ciudadesOrigen[i] = s;
            i++;
        }
        /*for(Vuelo v : sistema.getVuelos()) {
            ciudadesOrigen[i] = v.getOrigen();
            i++;
        }*/
        
        OrigenCB.setModel(new javax.swing.DefaultComboBoxModel<>(ciudadesOrigen));
        destinoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Ninguno"}));
        fechaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Ninguna"}));
        horaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Ninguna"}));
        pesoEquipajeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"10-20 Kg", "21-30 Kg", "30-40 Kg", "40-50 Kg"}));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> OrigenCB;
    private javax.swing.JLabel aviso;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox<String> categoriaCB;
    private javax.swing.JComboBox<String> destinoCB;
    private javax.swing.JCheckBox equipajeCB;
    private javax.swing.JComboBox<String> fechaCB;
    private javax.swing.JComboBox<String> horaCB;
    private javax.swing.JCheckBox idaVueltaCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<Integer> noPuestosCB;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel pesoEquipaje;
    public javax.swing.JComboBox<String> pesoEquipajeCB;
    private javax.swing.JButton siguiente;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
