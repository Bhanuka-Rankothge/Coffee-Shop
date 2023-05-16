package Application.Admin;

import Massege_boxes.RegitrationForm.AdminAccount_Msgs;
import backend_files.Connect_DB;
import backend_files.Encrypter;
import Massege_boxes.RegitrationForm.PasswordValidation_Msgs;
import Massege_boxes.RegitrationForm.Position_Msgs;
import Massege_boxes.RegitrationForm.Username_Msgs;
import backend_files.UserTypeChanger;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Registration1 extends javax.swing.JFrame {
    
    PasswordValidation_Msgs test = new PasswordValidation_Msgs();
    Position_Msgs pos            = new Position_Msgs();
    AdminAccount_Msgs aacm       = new AdminAccount_Msgs();
    Username_Msgs umsg           = new Username_Msgs();
    
    public Registration1() {
        initComponents();
        showUsers();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttons = new javax.swing.JPanel();
        btnSales = new javax.swing.JButton();
        btnReg = new javax.swing.JButton();
        btnTables = new javax.swing.JButton();
        components = new javax.swing.JPanel();
        registration = new javax.swing.JPanel();
        lblReg = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        lblRecordStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 650));

        btnSales.setText("Sales");

        btnReg.setText("Registration");

        btnTables.setText("Tables");

        javax.swing.GroupLayout buttonsLayout = new javax.swing.GroupLayout(buttons);
        buttons.setLayout(buttonsLayout);
        buttonsLayout.setHorizontalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addGap(397, 397, 397)
                .addComponent(btnReg)
                .addGap(30, 30, 30)
                .addComponent(btnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnTables, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonsLayout.setVerticalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(buttonsLayout.createSequentialGroup()
                        .addComponent(btnReg, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnTables, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        components.setPreferredSize(new java.awt.Dimension(1518, 497));

        registration.setBackground(new java.awt.Color(204, 255, 204));
        registration.setMaximumSize(new java.awt.Dimension(1200, 650));
        registration.setMinimumSize(new java.awt.Dimension(1200, 650));
        registration.setPreferredSize(new java.awt.Dimension(1200, 650));

        lblReg.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblReg.setText("Registration");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Add User", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Update/Delete User", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Reset Password", jPanel3);

        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Username", "Position"
            }
        ));
        jScrollPane2.setViewportView(tblUsers);

        javax.swing.GroupLayout registrationLayout = new javax.swing.GroupLayout(registration);
        registration.setLayout(registrationLayout);
        registrationLayout.setHorizontalGroup(
            registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrationLayout.createSequentialGroup()
                .addGroup(registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registrationLayout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(lblReg))
                    .addGroup(registrationLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        registrationLayout.setVerticalGroup(
            registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrationLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblReg)
                .addGroup(registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registrationLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registrationLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout componentsLayout = new javax.swing.GroupLayout(components);
        components.setLayout(componentsLayout);
        componentsLayout.setHorizontalGroup(
            componentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(componentsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblRecordStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        componentsLayout.setVerticalGroup(
            componentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, componentsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(componentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(componentsLayout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(lblRecordStatus))
                    .addComponent(registration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(components, javax.swing.GroupLayout.DEFAULT_SIZE, 1640, Short.MAX_VALUE)
                    .addComponent(buttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(components, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      
    
    // Implement the other WindowListener methods as needed...
    
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
            java.util.logging.Logger.getLogger(Registration1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration1().setVisible(true);
             
            }
        });
    }
    
        //This method can show the users table
    private void showUsers(){

        try{
            Connect_DB cdb = new Connect_DB();
            Connection conn = cdb.getConnection();
            String sql = "SELECT username, status FROM users";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            
                // Create a new TableModel with the data from the ResultSet
            DefaultTableModel model = new DefaultTableModel();
            ResultSetMetaData metaData = result.getMetaData();
            int columnCount = metaData.getColumnCount();
            
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(metaData.getColumnName(i));
            }
            
            int rowNumber = 1;
            
            while (result.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i-1] = result.getObject(i);
                    if(i%2 == 0){
                        UserTypeChanger utp = new UserTypeChanger();
                        utp.setType(rowData[i-1].toString());
                        rowData[i-1] = utp.getType();
                    }
                }
                model.addRow(rowData);
                
                // Set the new model on the tblUsers
                tblUsers.setModel(model);
                rowNumber++;
              
            }                      
        }catch (SQLException ex) {
            System.out.println(ex.toString());           
        }
    
    }
    
        //This method can insert a new user to the database
    private void insertUsers(){
        try{
                // Open a connection
            Connect_DB cdb = new Connect_DB();
            Connection conn = cdb.getConnection();
            
                // Open an encrypter
            Encrypter enc = new Encrypter();
                
                //  Open an UserTypeChanger
            UserTypeChanger utp = new UserTypeChanger();
            
                // Prepare the SQL statement
            String sql = "INSERT INTO users (username, password, status) VALUES(?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
                //  Change user type
            utp.setDBType(cmbPosition.getSelectedItem().toString());
            
                // Set the values for the prepared statement
            ps.setString(1, txtUser.getText());
            ps.setString(2, enc.secure(txtPsw.getText()));
            ps.setString(3, utp.getDBType());
            
                // Execute the SQL statement
            ps.executeUpdate();
            //System.out.println("Data inserted successfully!");
            lblRecordStatus.setText("New User Added");
            showUsers();
            resetForm();
            
        }catch(SQLException ex){
            System.out.println(ex.toString());
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Registration1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        //This method validate the user adding process
    private void validateAddUser(){
        
    if(umsg.validateUsername(txtUser.getText()).equals("Username Available")){
        
            if(test.PswValCheck(txtPsw.getText()).equals("Strong Password")){
                    
                if(test.rtpMatchCheck(txtPsw.getText(), txtRetype.getText()).equals("Re-type matches with the password")){
                
                    if(pos.positionStatus(cmbPosition.getSelectedItem().toString()).equals("You selected Cashier") || pos.positionStatus(cmbPosition.getSelectedItem().toString()).equals("You selected Manager") || pos.positionStatus(cmbPosition.getSelectedItem().toString()).equals("You selected Admin")){                    
                    
                        if(aacm.usernameAvailability(txtAdminUser.getText()).equals("User is available")){
                                     
                            if(aacm.AdminPasswordAvailability(txtAdminUser.getText(),txtAdminPsw.getText()).equals("")){                                
                                insertUsers(); 
                            }else{
                                lblRecordStatus.setText(aacm.AdminPasswordAvailability(txtAdminUser.getText(),txtAdminPsw.getText()));
                            }   
                        }else{
                            lblRecordStatus.setText(aacm.usernameAvailability(txtAdminUser.getText()));
                        }                  
                    }else{
                        lblRecordStatus.setText(pos.positionStatus(cmbPosition.getSelectedItem().toString()));
                    }
                }else{
                    lblRecordStatus.setText(test.rtpMatchCheck(txtPsw.getText(), txtRetype.getText()));
                }
            }else{
                lblRecordStatus.setText(test.PswValCheck(txtPsw.getText()));
            }
        }else{
            lblRecordStatus.setText(umsg.validateUsername(txtUser.getText()));
        }  
    }
    
        //Reset the complete form
    private void resetForm(){
        txtUser.setText("");
        txtPsw.setText("");
        txtRetype.setText("");
        cmbPosition.setSelectedItem("Select");
        txtAdminUser.setText("");
        txtAdminPsw.setText("");
        
        lblAdminPswMessege.setText("");
        lblAdminUserMessege.setText("");
        lblPosMessege.setText("");
        lblPswMessege.setText("");
        lblRtpMessege.setText("");
        lblUserMessege.setText("");
        
    }
    
        //

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReg;
    private javax.swing.JButton btnSales;
    private javax.swing.JButton btnTables;
    private javax.swing.JPanel buttons;
    private javax.swing.JPanel components;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblRecordStatus;
    private javax.swing.JLabel lblReg;
    private javax.swing.JPanel registration;
    private javax.swing.JTable tblUsers;
    // End of variables declaration//GEN-END:variables
}
