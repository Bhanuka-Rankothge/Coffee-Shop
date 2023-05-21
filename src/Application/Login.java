package Application;

import Application.Admin.Registration;
import Application.Cashier.Calculator;
import Application.Manager.Sales;
import Massege_boxes.LoginForm.Login_Msgs;
import backend_files.Encrypter;
import backend_files.Connect_DB;

import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        jPanel1.setBackground(new Color(205, 205, 255, 250));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        txtPsw = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        loginMsg = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogin.setBackground(new java.awt.Color(60, 63, 65));
        lblLogin.setFont(new java.awt.Font("Bookman Old Style", 1, 48)); // NOI18N
        lblLogin.setText("Welcome");
        jPanel1.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 240, 40));

        txtUser.setBackground(new java.awt.Color(205, 205, 255));
        txtUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
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
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 310, -1));

        lblUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUser.setText("Username : ");
        jPanel1.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 140, 30));

        txtPsw.setBackground(new java.awt.Color(205, 205, 255));
        txtPsw.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtPsw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPswKeyTyped(evt);
            }
        });
        jPanel1.add(txtPsw, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 310, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Password : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 120, 30));

        loginMsg.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        loginMsg.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(loginMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 322, 42));

        btnClear.setBackground(new java.awt.Color(204, 204, 204));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 80, 30));

        btnLogin.setBackground(new java.awt.Color(204, 204, 204));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 80, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 420, 410));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login.jpeg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //login button

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        Login_Msgs logins = new Login_Msgs();

        // Login Validation
        if (txtUser.getText().equals("") & !(txtPsw.getText().equals(""))) {
            //Show Enter Username Messege
            loginMsg.setText(logins.getUserEmptyMsg());
            txtPsw.setText("");

        } else if (!(txtUser.getText().equals("")) & (txtPsw.getText().equals(""))) {
            //Show enter Password Messege
            loginMsg.setText(logins.getPswEmptyMsg());
            txtUser.setText("");

        } else if (txtUser.getText().equals("") & (txtPsw.getText().equals(""))) {
            //Show enter both username and password Messege
            loginMsg.setText(logins.getBothEmptyMsg());
            txtUser.setText("");
            txtPsw.setText("");

        } else {

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

                    switch (status) {
                        //Admin login for registration
                        case 'A' -> {
                            Registration reg = new Registration();
                            reg.setVisible(true);
                            this.dispose();
                        }
                        //Cashier login for calculator
                        case 'C' -> {
                            Calculator cal = new Calculator();
                            cal.setVisible(true);
                            this.dispose();
                        }
                        //Manager login for sales
                        case 'M' -> {
                            Sales sales = new Sales();
                            sales.setVisible(true);
                            this.dispose();
                        }
                        default -> {
                        }
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel loginMsg;
    private javax.swing.JPasswordField txtPsw;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
