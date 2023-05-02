/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Application;

import Massege_boxes.Login_Msgs;
import backend_files.Encrypter;
import backend_files.Connect_DB;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import Application.Manager.Registration;

/**
 *
 * @author HP
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogin = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtPsw = new javax.swing.JPasswordField();
        loginMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 650));
        setMinimumSize(new java.awt.Dimension(1200, 650));

        lblLogin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblLogin.setText("Login");

        lblUser.setText("Username : ");

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });

        jLabel1.setText("Password : ");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtPsw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPswKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(427, 427, 427)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblUser)
                                        .addComponent(jLabel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtUser)
                                        .addComponent(txtPsw, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnClear)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnLogin)))
                            .addGap(71, 71, 71))
                        .addComponent(loginMsg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(lblLogin)))
                .addContainerGap(433, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addComponent(lblLogin)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPsw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin)
                    .addComponent(btnClear))
                .addGap(18, 18, 18)
                .addComponent(loginMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //login button
    
    /**
     * 
     * When button clicked check the all fields are filled *
     * If this condition won't fulfilled display three messages regarding to the particular situation.
     * If the condition fulfilled check the username and password available in the database.
     * 
        * If this fulfilled check then check the user's status.
        * 
            * If it is either Admin or Manager Go to sales section. pasindu - pb, rasanga - rs, avishna -av
            * If it is Cashier Go to Cashier's section.
            * 
        *Else
            * Show username and password is incorrect message   
    */
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        Login_Msgs logins = new Login_Msgs();
        
            // Login Validation
        
        if(txtUser.getText().equals("") & !(txtPsw.getText().equals(""))){
                //Show Enter Username Messege
            loginMsg.setText(logins.getUserEmptyMsg());
            txtPsw.setText("");
            
        }else if(!(txtUser.getText().equals("")) & (txtPsw.getText().equals(""))){
                //Show enter Password Messege
            loginMsg.setText(logins.getPswEmptyMsg());
            txtUser.setText("");

            
        }else if(txtUser.getText().equals("") & (txtPsw.getText().equals(""))){
                //Show enter both username and password Messege
            loginMsg.setText(logins.getBothEmptyMsg());
            txtUser.setText("");
            txtPsw.setText("");
            
        }else{  
            
            Encrypter enc = new Encrypter();
            String encryptedPsw = null;
            
            try {
                    //Encrypt the password
                encryptedPsw = enc.secure(txtPsw.getText());
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Connect_DB cdb = new Connect_DB();
            
            try {
                    //Execute the query
                Connection connection = cdb.getConnection();
                String sql = "SELECT username, status FROM users WHERE users.password = ? AND users.username = ?"; // Replace with your own SELECT query
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, encryptedPsw);
                statement.setString(2, txtUser.getText());
                ResultSet result = statement.executeQuery();

                    //Validations
                if (result.next()) {
                    char status = result.getString("status").charAt(0);

                    if(status == 'A' || status == 'M'){
                            //Admin and manager
                        
                        Registration reg = new Registration();
                        reg.setVisible(true);
                        this.dispose();
                        
                    }else if(status == 'C'){
                            //Cashier
                        this.dispose();
                    }
                } else {
                    loginMsg.setText(logins.getBothIncorrectMsg());
                    txtUser.setText("");
                    txtPsw.setText("");
                }
                connection.close();
            } catch (SQLException e) {
                loginMsg.setText("Error: " + e.getMessage());
            }           
        }
    }//GEN-LAST:event_btnLoginActionPerformed

        //clear button
        //clears the username and password
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
     
        txtUser.setText("");
        txtPsw.setText("");
        loginMsg.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed

    }//GEN-LAST:event_txtUserActionPerformed

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed

        this.loginMsg.setText("");
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtPswKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPswKeyTyped
        this.loginMsg.setText("");
    }//GEN-LAST:event_txtPswKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel loginMsg;
    private javax.swing.JPasswordField txtPsw;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
