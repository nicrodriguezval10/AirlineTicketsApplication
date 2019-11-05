/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Control.ValidarJoin;
import Entidad.Usuario;
import static Frontera.FramePrincipal.sistema;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JPasswordField;


/**
 *
 * @author nicro
 */
public class Join extends javax.swing.JPanel {

    /**
     * Creates new form Join
     */
    public Join() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        nombreTF = new javax.swing.JTextField();
        apellidoTF = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        verificarPassword = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        passwordTF = new javax.swing.JPasswordField();
        verificarPasswordTF = new javax.swing.JPasswordField();
        aviso = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setAutoscrolls(true);

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setText("Registrarse");

        nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombre.setText("Nombres");

        apellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        apellido.setText("Apellidos");

        aceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        regresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email.setText("Email");

        username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        username.setText("Username");

        password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        password.setText("Contraseña");

        verificarPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        verificarPassword.setText("Verificar contraseña");

        aviso.setForeground(java.awt.Color.red);
        aviso.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(194, 194, 194))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(regresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellido)
                            .addComponent(nombre)
                            .addComponent(email)
                            .addComponent(verificarPassword)
                            .addComponent(password)
                            .addComponent(username))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addComponent(emailTF)
                            .addComponent(apellidoTF)
                            .addComponent(nombreTF)
                            .addComponent(passwordTF)
                            .addComponent(verificarPasswordTF)))
                    .addComponent(aviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(titulo)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(nombre)
                                                    .addComponent(nombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(apellido))
                                            .addComponent(apellidoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(email))
                                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(username))
                            .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(password)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(verificarPasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(verificarPassword))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aviso, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptar)
                    .addComponent(regresar))
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        new FramePrincipal().setVisible(true);
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.dispose(); 
    }//GEN-LAST:event_regresarActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // TODO add your handling code here:
        Usuario usuario = new Usuario();
        
        String nombre = nombreTF.getText(), apellido = apellidoTF.getText(), email = emailTF.getText(),
               username = usernameTF.getText(), password = passwordTF.getText();
        
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setEmail(email);
        usuario.setUsername(username);
        usuario.setPassword(password);
        String verificarPassword = verificarPasswordTF.getText();
        
        ValidarJoin verificar = new ValidarJoin();
        
        String respuesta = verificar.verificarJoin(usuario, verificarPassword);
        aviso.setForeground(Color.red);
        if(respuesta.equals("Registro exitoso")) {
            sistema.addUsuarios(usuario);
            System.out.println("-------");
            System.out.println("NUEVO USUARIO AÑADIDO");
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("Email: " + email);
            System.out.println("Username: " + username);
        } else if(respuesta.equals("Longitud de nombre incorrecta")){
            aviso.setText("Longitud de nombre incorrecta");
            
        } else if(respuesta.equals("Email incorrecto")){
            aviso.setText("Email incorrecto");
            
        } else if(respuesta.equals("El email ya existe")){
            aviso.setText("El email ya esta registrado");
            
        } else if(respuesta.equals("Longitud de username incorrecta")){
            aviso.setText("Longitud de username incorrecta");
            
        } else if(respuesta.equals("El primer caracter del username no puede ser un número")){
            aviso.setText("El primer caracter del username no puede ser un número");
            
        } else if(respuesta.equals("El username ya existe")){
            aviso.setText("El username ya existe");
            
        } else if(respuesta.equals("Longitud de contraseña incorrecta")){
            aviso.setText("Longitud de contraseña incorrecta");
            
        } else if(respuesta.equals("Las contraseñas no coinciden")){
            aviso.setText("Las contraseñas no coinciden");
            
        }
        
        System.out.println("-------");
        System.out.println(respuesta);
    }//GEN-LAST:event_aceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JLabel apellido;
    private javax.swing.JTextField apellidoTF;
    private javax.swing.JLabel aviso;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombreTF;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JButton regresar;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel username;
    private javax.swing.JTextField usernameTF;
    private javax.swing.JLabel verificarPassword;
    private javax.swing.JPasswordField verificarPasswordTF;
    // End of variables declaration//GEN-END:variables
}
