/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Control.ValidarLogin;
import Entidad.Usuario;
import java.awt.Color;

/**
 *
 * @author nicro
 */
public class Login extends javax.swing.JFrame {
    public static Usuario user;

    /**
     * Creates new form NewJFrame
     */
    public Login() {
        initComponents();
        this.setTitle("Airline Tickets Application");
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
        username = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        aceptarB = new javax.swing.JButton();
        regresarB = new javax.swing.JButton();
        passwordTF = new javax.swing.JPasswordField();
        aviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setText("Iniciar sesión");

        username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        username.setText("Username");

        password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        password.setText("Contraseña");

        aceptarB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aceptarB.setText("Aceptar");
        aceptarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBActionPerformed(evt);
            }
        });

        regresarB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        regresarB.setText("Regresar");
        regresarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBActionPerformed(evt);
            }
        });

        aviso.setForeground(java.awt.Color.red);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(aviso, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(password)
                                    .addComponent(username))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usernameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(passwordTF)))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(regresarB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(aceptarB, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37))))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(username)
                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password)
                    .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(aviso, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regresarB)
                    .addComponent(aceptarB))
                .addGap(31, 31, 31))
        );

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBActionPerformed
        // TODO add your handling code here:
        Usuario usuario = new Usuario();
        usuario.setUsername(usernameTF.getText());
        usuario.setPassword(passwordTF.getText());

        ValidarLogin validar = new ValidarLogin();
        
        user = validar.findUsuario(usernameTF.getText());

        System.out.println("-------");
        String resultado = validar.verificarLogin(usuario);
        System.out.println(resultado);
        
        aviso.setForeground(Color.red);

        if(resultado.equals("Datos incorrectos")){
            aviso.setText("Datos incorrectos");
        } else if (resultado.equals("Longitud de username incorrecta")){
            aviso.setText("Longitud de username incorrecta");
        } else if(resultado.equals("Longitud de contraseña incorrecta")){
            aviso.setText("Longitud de contraseña incorrecta");
        } else if(resultado.equals("Contraseña incorrecta. Escríbala nuevamente")){
            aviso.setText("Contraseña incorrecta. Escríbala nuevamente");
        } else {
            Welcome welcome = new Welcome();
            this.setVisible(false);
            welcome.setLocationRelativeTo(this);
            welcome.setVisible(true);
        }
    }//GEN-LAST:event_aceptarBActionPerformed

    private void regresarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBActionPerformed
        // TODO add your handling code here
        FramePrincipal framePrincipal = new FramePrincipal();
        this.setVisible(false);
        framePrincipal.setLocationRelativeTo(this);
        framePrincipal.setVisible(true);
    }//GEN-LAST:event_regresarBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarB;
    private javax.swing.JLabel aviso;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JButton regresarB;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel username;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
