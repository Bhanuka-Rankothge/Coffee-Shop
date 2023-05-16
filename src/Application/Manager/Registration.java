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

public class Registration extends javax.swing.JFrame {
    
    PasswordValidation_Msgs test = new PasswordValidation_Msgs();
    Position_Msgs pos            = new Position_Msgs();
    AdminAccount_Msgs aacm       = new AdminAccount_Msgs();
    Username_Msgs umsg           = new Username_Msgs();
    
    public Registration() {
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
        left = new javax.swing.JPanel();
        lblUsers = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblUser1 = new javax.swing.JLabel();
        txtPsw = new javax.swing.JPasswordField();
        lblUser2 = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        cmbPosition = new javax.swing.JComboBox<>();
        lblAdminUser = new javax.swing.JLabel();
        txtAdminUser = new javax.swing.JTextField();
        lblAdminPsw = new javax.swing.JLabel();
        txtAdminPsw = new javax.swing.JPasswordField();
        btnAddUser = new javax.swing.JButton();
        btnUpdateUser = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtRetype = new javax.swing.JPasswordField();
        lblPswMessege = new javax.swing.JLabel();
        lblRtpMessege = new javax.swing.JLabel();
        lblPosMessege = new javax.swing.JLabel();
        lblAdminUserMessege = new javax.swing.JLabel();
        lblAdminPswMessege = new javax.swing.JLabel();
        lblUserMessege = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        right = new javax.swing.JPanel();
        lblUsers1 = new javax.swing.JLabel();
        lblUser_PswRst = new javax.swing.JLabel();
        txtUser_PswRst = new javax.swing.JTextField();
        lblPsw_PswRst = new javax.swing.JLabel();
        txtPsw_PswRst = new javax.swing.JPasswordField();
        lblNewPsw_PswRst = new javax.swing.JLabel();
        txtNewPsw_PswRst = new javax.swing.JTextField();
        lblRtpPsw_PswRst = new javax.swing.JLabel();
        txtRtpPsw_PswRst = new javax.swing.JPasswordField();
        btnUpdatePsw = new javax.swing.JButton();
        btnClearRecords = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        lblRecordStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 650));
        setMinimumSize(new java.awt.Dimension(1200, 650));
        setPreferredSize(new java.awt.Dimension(1200, 650));

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

        registration.setBackground(new java.awt.Color(204, 255, 204));

        lblReg.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblReg.setText("Registration");

        left.setBackground(new java.awt.Color(255, 153, 153));

        lblUsers.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUsers.setText("Users");

        lblUser.setText("Username : ");

        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserMouseClicked(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserKeyReleased(evt);
            }
        });

        lblUser1.setText("Password :");

        txtPsw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPswMouseClicked(evt);
            }
        });
        txtPsw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPswKeyReleased(evt);
            }
        });

        lblUser2.setText("Re-Type :");

        lblPosition.setText("Position :");

        cmbPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Cashier", "Manager", "Admin" }));
        cmbPosition.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPositionItemStateChanged(evt);
            }
        });

        lblAdminUser.setText("<html>\n<body>\nAdmin <br/> Username :\n</body>\n</html>");

        txtAdminUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAdminUserKeyReleased(evt);
            }
        });

        lblAdminPsw.setText("<html>\n<body>\nAdmin<br/> Password : \n</body>\n</html>");

        txtAdminPsw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAdminPswKeyReleased(evt);
            }
        });

        btnAddUser.setText("Add User");
        btnAddUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddUserMouseClicked(evt);
            }
        });

        btnUpdateUser.setText("Update User");
        btnUpdateUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateUserMouseClicked(evt);
            }
        });

        btnDelete.setText("Delete User");

        txtRetype.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRetypeMouseClicked(evt);
            }
        });
        txtRetype.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRetypeKeyReleased(evt);
            }
        });

        lblPswMessege.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        lblRtpMessege.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        lblPosMessege.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblPosMessege.setText(" ");

        lblAdminUserMessege.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblAdminUserMessege.setText(" ");

        lblAdminPswMessege.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        lblUserMessege.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        btnClear.setText("Clear");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout leftLayout = new javax.swing.GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, leftLayout.createSequentialGroup()
                                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, leftLayout.createSequentialGroup()
                                        .addComponent(lblUser)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, leftLayout.createSequentialGroup()
                                        .addGap(116, 116, 116)
                                        .addComponent(lblUsers))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, leftLayout.createSequentialGroup()
                                        .addComponent(lblUser1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPsw, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblPswMessege, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, leftLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblRtpMessege, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(leftLayout.createSequentialGroup()
                                                .addComponent(lblUser2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtRetype, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(leftLayout.createSequentialGroup()
                                                .addComponent(lblPosition)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cmbPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblPosMessege, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(leftLayout.createSequentialGroup()
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnUpdateUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddUser))))
                    .addGroup(leftLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(leftLayout.createSequentialGroup()
                                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAdminUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAdminPsw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAdminUser, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                    .addComponent(txtAdminPsw)
                                    .addComponent(lblAdminUserMessege, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblAdminPswMessege, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(leftLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblUserMessege, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftLayout.setVerticalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblUsers)
                .addGap(18, 18, 18)
                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserMessege)
                .addGap(2, 2, 2)
                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser1)
                    .addComponent(txtPsw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(lblPswMessege, javax.swing.GroupLayout.DEFAULT_SIZE, 7, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser2)
                    .addComponent(txtRetype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRtpMessege, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPosition)
                    .addComponent(lblPosMessege))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAdminUser, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdminUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(leftLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblAdminPsw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblAdminUserMessege)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAdminPsw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdminPswMessege)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdateUser)
                    .addComponent(btnAddUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btnClear)
                .addContainerGap())
        );

        right.setBackground(new java.awt.Color(255, 153, 153));

        lblUsers1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUsers1.setText("Password Reset");

        lblUser_PswRst.setText("Username :");

        lblPsw_PswRst.setText("Password :");

        lblNewPsw_PswRst.setText("New Password :");

        lblRtpPsw_PswRst.setText("Re-Type :");

        btnUpdatePsw.setText("Update Password");

        btnClearRecords.setText("Clear Records");

        javax.swing.GroupLayout rightLayout = new javax.swing.GroupLayout(right);
        right.setLayout(rightLayout);
        rightLayout.setHorizontalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightLayout.createSequentialGroup()
                .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(lblUsers1))
                    .addGroup(rightLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(rightLayout.createSequentialGroup()
                                .addComponent(btnClearRecords)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdatePsw))
                            .addGroup(rightLayout.createSequentialGroup()
                                .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPsw_PswRst)
                                    .addComponent(lblUser_PswRst)
                                    .addComponent(lblNewPsw_PswRst)
                                    .addComponent(lblRtpPsw_PswRst))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUser_PswRst)
                                    .addComponent(txtPsw_PswRst)
                                    .addComponent(txtNewPsw_PswRst)
                                    .addComponent(txtRtpPsw_PswRst, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        rightLayout.setVerticalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblUsers1)
                .addGap(18, 18, 18)
                .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser_PswRst)
                    .addComponent(txtUser_PswRst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPsw_PswRst)
                    .addComponent(txtPsw_PswRst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewPsw_PswRst)
                    .addComponent(txtNewPsw_PswRst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRtpPsw_PswRst)
                    .addComponent(txtRtpPsw_PswRst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdatePsw)
                    .addComponent(btnClearRecords))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout registrationLayout = new javax.swing.GroupLayout(registration);
        registration.setLayout(registrationLayout);
        registrationLayout.setHorizontalGroup(
            registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrationLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(registrationLayout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(lblReg)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registrationLayout.setVerticalGroup(
            registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrationLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblReg)
                .addGap(18, 18, 18)
                .addGroup(registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(right, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout componentsLayout = new javax.swing.GroupLayout(components);
        components.setLayout(componentsLayout);
        componentsLayout.setHorizontalGroup(
            componentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(componentsLayout.createSequentialGroup()
                .addGroup(componentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(componentsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(componentsLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblRecordStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(registration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        componentsLayout.setVerticalGroup(
            componentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, componentsLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(componentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(componentsLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(components, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(components, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddUserMouseClicked
        validateAddUser();
    }//GEN-LAST:event_btnAddUserMouseClicked

    private void txtPswMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPswMouseClicked
        lblPswMessege.setText(test.PswValCheck(txtPsw.getText()));
        lblRecordStatus.setText("");
    }//GEN-LAST:event_txtPswMouseClicked

    private void txtRetypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRetypeMouseClicked
        lblRtpMessege.setText(test.rtpMatchCheck(txtPsw.getText(), txtRetype.getText()));
        lblRecordStatus.setText("");
    }//GEN-LAST:event_txtRetypeMouseClicked

    private void txtRetypeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRetypeKeyReleased
        lblRtpMessege.setText(test.rtpMatchCheck(txtPsw.getText(), txtRetype.getText()));
        lblRecordStatus.setText("");
    }//GEN-LAST:event_txtRetypeKeyReleased

    private void txtPswKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPswKeyReleased
        lblPswMessege.setText(test.PswValCheck(txtPsw.getText()));
        lblRecordStatus.setText("");
    }//GEN-LAST:event_txtPswKeyReleased

    private void cmbPositionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPositionItemStateChanged
        lblPosMessege.setText(pos.positionStatus(cmbPosition.getSelectedItem().toString()));
        //lblRecordStatus.setText("");
    }//GEN-LAST:event_cmbPositionItemStateChanged

    private void txtAdminUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdminUserKeyReleased
        lblAdminUserMessege.setText(aacm.usernameAvailability(txtAdminUser.getText()));
        lblRecordStatus.setText("");
    }//GEN-LAST:event_txtAdminUserKeyReleased

    private void txtAdminPswKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdminPswKeyReleased
        lblAdminPswMessege.setText(aacm.AdminPasswordAvailability(txtAdminUser.getText(),txtAdminPsw.getText()));
        lblRecordStatus.setText("");
    }//GEN-LAST:event_txtAdminPswKeyReleased

    private void txtUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyReleased
        lblUserMessege.setText(umsg.validateUsername(txtUser.getText()));
        lblRecordStatus.setText("");
    }//GEN-LAST:event_txtUserKeyReleased

    private void txtUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMouseClicked
        lblRecordStatus.setText("");
    }//GEN-LAST:event_txtUserMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        resetForm();   
    }//GEN-LAST:event_btnClearMouseClicked

        ///Update the user's 
    private void btnUpdateUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateUserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateUserMouseClicked
       
    
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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
             
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
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearRecords;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReg;
    private javax.swing.JButton btnSales;
    private javax.swing.JButton btnTables;
    private javax.swing.JButton btnUpdatePsw;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JPanel buttons;
    private javax.swing.JComboBox<String> cmbPosition;
    private javax.swing.JPanel components;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAdminPsw;
    private javax.swing.JLabel lblAdminPswMessege;
    private javax.swing.JLabel lblAdminUser;
    private javax.swing.JLabel lblAdminUserMessege;
    private javax.swing.JLabel lblNewPsw_PswRst;
    private javax.swing.JLabel lblPosMessege;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblPswMessege;
    private javax.swing.JLabel lblPsw_PswRst;
    private javax.swing.JLabel lblRecordStatus;
    private javax.swing.JLabel lblReg;
    private javax.swing.JLabel lblRtpMessege;
    private javax.swing.JLabel lblRtpPsw_PswRst;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUser1;
    private javax.swing.JLabel lblUser2;
    private javax.swing.JLabel lblUserMessege;
    private javax.swing.JLabel lblUser_PswRst;
    private javax.swing.JLabel lblUsers;
    private javax.swing.JLabel lblUsers1;
    private javax.swing.JPanel left;
    private javax.swing.JPanel registration;
    private javax.swing.JPanel right;
    private javax.swing.JTable tblUsers;
    private javax.swing.JPasswordField txtAdminPsw;
    private javax.swing.JTextField txtAdminUser;
    private javax.swing.JTextField txtNewPsw_PswRst;
    private javax.swing.JPasswordField txtPsw;
    private javax.swing.JPasswordField txtPsw_PswRst;
    private javax.swing.JPasswordField txtRetype;
    private javax.swing.JPasswordField txtRtpPsw_PswRst;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtUser_PswRst;
    // End of variables declaration//GEN-END:variables
}
