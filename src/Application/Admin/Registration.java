package Application.Admin;

import Application.Cashier.Tables;
import Application.Login;
import Application.Manager.Sales;
import Massege_boxes.RegitrationForm.AdminAccount_Msgs;
import backend_files.Connect_DB;
import backend_files.Encrypter;
import Massege_boxes.RegitrationForm.PasswordValidation_Msgs;
import Massege_boxes.RegitrationForm.Position_Msgs;
import Massege_boxes.RegitrationForm.Username_Msgs;
import backend_files.UserTypeChanger;
import Massege_boxes.RegitrationForm.OneAdminRerquired_Msgs;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Registration extends javax.swing.JFrame {

    PasswordValidation_Msgs test = new PasswordValidation_Msgs();
    Position_Msgs pos = new Position_Msgs();
    AdminAccount_Msgs aacm = new AdminAccount_Msgs();
    Username_Msgs umsg = new Username_Msgs();
    UserTypeChanger utc = new UserTypeChanger();
    Connect_DB cdb = new Connect_DB();
    OneAdminRerquired_Msgs oarm = new OneAdminRerquired_Msgs();

    public Registration() {
        initComponents();
        showUsers();
        selectAddUser.setSelected(true);
        registration.setBackground(new Color(25, 25, 25, 250));
        buttons.setBackground(new Color(255, 255, 255, 0));
        components.setBackground(new Color(25, 25, 25, 0));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttons = new javax.swing.JPanel();
        btnLoginLink = new javax.swing.JButton();
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
        cmbPosition = new javax.swing.JComboBox<>();
        txtAdminUser = new javax.swing.JTextField();
        txtAdminPsw = new javax.swing.JPasswordField();
        btnAddUser = new javax.swing.JButton();
        btnUpdateUser = new javax.swing.JButton();
        txtRetype = new javax.swing.JPasswordField();
        lblPswMessege = new javax.swing.JLabel();
        lblPosMessege = new javax.swing.JLabel();
        lblAdminUserMessege = new javax.swing.JLabel();
        lblAdminPswMessege = new javax.swing.JLabel();
        lblUserMessege = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        lblAdminUser1 = new javax.swing.JLabel();
        lblAdminPsw1 = new javax.swing.JLabel();
        lblPosition1 = new javax.swing.JLabel();
        lblRtpMessege = new javax.swing.JLabel();
        right = new javax.swing.JPanel();
        lblUsers1 = new javax.swing.JLabel();
        lblPsw_PswRst = new javax.swing.JLabel();
        txtPsw_PswRst = new javax.swing.JPasswordField();
        lblNewPsw_PswRst = new javax.swing.JLabel();
        lblRtpPsw_PswRst = new javax.swing.JLabel();
        txtRtpPsw_PswRst = new javax.swing.JPasswordField();
        lblUser_PswRst1 = new javax.swing.JLabel();
        btnClearRecords_PswRst = new javax.swing.JButton();
        btnUpdatePsw = new javax.swing.JButton();
        txtUser_PswRst = new javax.swing.JTextField();
        txtNewPsw_PswRst = new javax.swing.JPasswordField();
        lblUsername_PswRst = new javax.swing.JLabel();
        lblUserMsg_PswRst = new javax.swing.JLabel();
        lblPswMsg_PswRst = new javax.swing.JLabel();
        txtNewPswMsg = new javax.swing.JLabel();
        selectAddUser = new javax.swing.JRadioButton();
        selectDeleteUser = new javax.swing.JRadioButton();
        selectResetPass = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblAdminUser = new javax.swing.JLabel();
        lblAdminPsw = new javax.swing.JLabel();
        lblUser_PswRst = new javax.swing.JLabel();
        btnClearRecords = new javax.swing.JButton();
        btnDeleteUser = new javax.swing.JButton();
        txtAdminUser_DeleteUser = new javax.swing.JTextField();
        txtUser_DeleteUser = new javax.swing.JTextField();
        btnUpdateUser1 = new javax.swing.JButton();
        txtAdminPsw_DeletePsw = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        lblRecordStatus = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLoginLink.setBackground(new java.awt.Color(154, 43, 43));
        btnLoginLink.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLoginLink.setForeground(new java.awt.Color(102, 255, 255));
        btnLoginLink.setText("Back to login");
        btnLoginLink.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLoginLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginLinkMouseClicked(evt);
            }
        });
        btnLoginLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginLinkActionPerformed(evt);
            }
        });
        buttons.add(btnLoginLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 100, 50));

        getContentPane().add(buttons, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 760, -1));

        components.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registration.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        registration.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblReg.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblReg.setForeground(new java.awt.Color(204, 204, 204));
        lblReg.setText("Registration");
        registration.add(lblReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 14, -1, -1));

        left.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsers.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUsers.setText("Users");
        left.add(lblUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        lblUser.setText("Username : ");
        left.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

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
        left.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 200, -1));

        lblUser1.setText("Password :");
        left.add(lblUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

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
        left.add(txtPsw, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 200, -1));

        lblUser2.setText("Re-Type :");
        left.add(lblUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        cmbPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Cashier", "Manager", "Admin" }));
        cmbPosition.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPositionItemStateChanged(evt);
            }
        });
        left.add(cmbPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        txtAdminUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAdminUserKeyReleased(evt);
            }
        });
        left.add(txtAdminUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 197, -1));

        txtAdminPsw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAdminPswKeyReleased(evt);
            }
        });
        left.add(txtAdminPsw, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 197, -1));

        btnAddUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/saved.jpeg"))); // NOI18N
        btnAddUser.setText("Add User");
        btnAddUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddUserMouseClicked(evt);
            }
        });
        left.add(btnAddUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, -1));

        btnUpdateUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.jpeg"))); // NOI18N
        btnUpdateUser.setText("Update User");
        btnUpdateUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateUserMouseClicked(evt);
            }
        });
        left.add(btnUpdateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        txtRetype.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRetypeMouseClicked(evt);
            }
        });
        txtRetype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRetypeActionPerformed(evt);
            }
        });
        txtRetype.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRetypeKeyReleased(evt);
            }
        });
        left.add(txtRetype, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 201, -1));

        lblPswMessege.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        left.add(lblPswMessege, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 268, 20));

        lblPosMessege.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblPosMessege.setText(" ");
        left.add(lblPosMessege, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 101, 20));

        lblAdminUserMessege.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblAdminUserMessege.setText(" ");
        left.add(lblAdminUserMessege, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 260, 190, -1));

        lblAdminPswMessege.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        left.add(lblAdminPswMessege, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 305, 218, 20));

        lblUserMessege.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        left.add(lblUserMessege, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 208, 20));

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clear.jpeg"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });
        left.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 94, -1));

        lblAdminUser1.setText("<html>\n<body>\nAdmin <br/> Username :\n</body>\n</html>");
        left.add(lblAdminUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 45));

        lblAdminPsw1.setText("<html>\n<body>\nAdmin<br/> Password : \n</body>\n</html>");
        left.add(lblAdminPsw1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        lblPosition1.setText("Position :");
        left.add(lblPosition1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        lblRtpMessege.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        left.add(lblRtpMessege, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 268, 20));

        registration.add(left, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 320, 430));

        right.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        right.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsers1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUsers1.setText("Password Reset");
        right.add(lblUsers1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));

        lblPsw_PswRst.setText("Password :");
        right.add(lblPsw_PswRst, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        txtPsw_PswRst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPsw_PswRstMouseClicked(evt);
            }
        });
        right.add(txtPsw_PswRst, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 219, -1));

        lblNewPsw_PswRst.setText("New Password :");
        right.add(lblNewPsw_PswRst, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        lblRtpPsw_PswRst.setText("Re-Type :");
        right.add(lblRtpPsw_PswRst, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));
        right.add(txtRtpPsw_PswRst, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 219, -1));

        lblUser_PswRst1.setText("Username :");
        right.add(lblUser_PswRst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        btnClearRecords_PswRst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clear.jpeg"))); // NOI18N
        btnClearRecords_PswRst.setText("Clear Records");
        btnClearRecords_PswRst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearRecords_PswRstActionPerformed(evt);
            }
        });
        right.add(btnClearRecords_PswRst, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        btnUpdatePsw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.jpeg"))); // NOI18N
        btnUpdatePsw.setText("Update Password");
        btnUpdatePsw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePswActionPerformed(evt);
            }
        });
        right.add(btnUpdatePsw, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        txtUser_PswRst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUser_PswRstMouseClicked(evt);
            }
        });
        txtUser_PswRst.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtUser_PswRstInputMethodTextChanged(evt);
            }
        });
        txtUser_PswRst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUser_PswRstKeyReleased(evt);
            }
        });
        right.add(txtUser_PswRst, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 219, -1));

        txtNewPsw_PswRst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNewPsw_PswRstKeyReleased(evt);
            }
        });
        right.add(txtNewPsw_PswRst, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 220, -1));

        lblUsername_PswRst.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        right.add(lblUsername_PswRst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 270, -1));

        lblUserMsg_PswRst.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblUserMsg_PswRst.setText("      ");
        right.add(lblUserMsg_PswRst, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 230, -1));

        lblPswMsg_PswRst.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblPswMsg_PswRst.setText("      ");
        lblPswMsg_PswRst.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                lblPswMsg_PswRstInputMethodTextChanged(evt);
            }
        });
        right.add(lblPswMsg_PswRst, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 230, -1));

        txtNewPswMsg.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtNewPswMsg.setText("     ");
        right.add(txtNewPswMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 380, -1));

        registration.add(right, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 400, 230));

        selectAddUser.setForeground(new java.awt.Color(204, 204, 204));
        selectAddUser.setText("Add/Update User");
        selectAddUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectAddUserMouseClicked(evt);
            }
        });
        registration.add(selectAddUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 25, -1, -1));

        selectDeleteUser.setForeground(new java.awt.Color(204, 204, 204));
        selectDeleteUser.setText("Delete User");
        selectDeleteUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectDeleteUserMouseClicked(evt);
            }
        });
        registration.add(selectDeleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 90, 30));

        selectResetPass.setForeground(new java.awt.Color(204, 204, 204));
        selectResetPass.setText("Reset Password");
        selectResetPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectResetPassMouseClicked(evt);
            }
        });
        registration.add(selectResetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 25, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Delete User");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 130, 30));

        lblAdminUser.setText("<html>\n<body>\nAdmin <br/> Username :\n</body>\n</html>");
        jPanel1.add(lblAdminUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 45));

        lblAdminPsw.setText("<html>\n<body>\nAdmin<br/> Password : \n</body>\n</html>");
        jPanel1.add(lblAdminPsw, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        lblUser_PswRst.setText("Username :");
        jPanel1.add(lblUser_PswRst, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        btnClearRecords.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clear.jpeg"))); // NOI18N
        btnClearRecords.setText("Clear Records");
        btnClearRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearRecordsActionPerformed(evt);
            }
        });
        jPanel1.add(btnClearRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        btnDeleteUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/remove.jpeg"))); // NOI18N
        btnDeleteUser.setText("Delete User");
        btnDeleteUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteUserMouseClicked(evt);
            }
        });
        jPanel1.add(btnDeleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        txtAdminUser_DeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdminUser_DeleteUserActionPerformed(evt);
            }
        });
        jPanel1.add(txtAdminUser_DeleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 219, -1));
        jPanel1.add(txtUser_DeleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 219, -1));

        btnUpdateUser1.setText("Update User");
        btnUpdateUser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateUser1MouseClicked(evt);
            }
        });
        jPanel1.add(btnUpdateUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));
        jPanel1.add(txtAdminPsw_DeletePsw, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 220, -1));

        registration.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 400, 200));

        components.add(registration, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 12, 760, 500));

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
        tblUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblUsers);

        components.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 12, 440, 490));
        components.add(lblRecordStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 426, 405, -1));

        getContentPane().add(components, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1240, 520));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ui2.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 640));

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
    }//GEN-LAST:event_cmbPositionItemStateChanged

    private void txtAdminUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdminUserKeyReleased
        lblAdminUserMessege.setText(aacm.usernameAvailability(txtAdminUser.getText()));
        lblRecordStatus.setText("");
    }//GEN-LAST:event_txtAdminUserKeyReleased

    private void txtAdminPswKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdminPswKeyReleased
        lblAdminPswMessege.setText(aacm.AdminPasswordAvailability(txtAdminUser.getText(), txtAdminPsw.getText()));
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
        updateUsers();
        showUsers();
    }//GEN-LAST:event_btnUpdateUserMouseClicked

    private void tblUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsersMouseClicked
        resetForm();
        copyTableDataToForms();
    }//GEN-LAST:event_tblUsersMouseClicked

    private void btnClearRecords_PswRstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearRecords_PswRstActionPerformed
        txtUser_PswRst.setText("");
        txtPsw_PswRst.setText("");
        txtNewPsw_PswRst.setText("");
        txtRtpPsw_PswRst.setText("");
    }//GEN-LAST:event_btnClearRecords_PswRstActionPerformed

    private void btnUpdatePswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePswActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdatePswActionPerformed

    private void btnClearRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearRecordsActionPerformed
        txtAdminUser_DeleteUser.setText("");
        txtAdminPsw_DeletePsw.setText("");
        txtUser_DeleteUser.setText("");
        
    }//GEN-LAST:event_btnClearRecordsActionPerformed

    private void btnUpdateUser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateUser1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateUser1MouseClicked

    private void selectAddUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectAddUserMouseClicked
        selectAddUser.setSelected(true);
        selectDeleteUser.setSelected(false);
        selectResetPass.setSelected(false);
    }//GEN-LAST:event_selectAddUserMouseClicked

    private void selectDeleteUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectDeleteUserMouseClicked
        selectAddUser.setSelected(false);
        selectDeleteUser.setSelected(true);
        selectResetPass.setSelected(false);
    }//GEN-LAST:event_selectDeleteUserMouseClicked

    private void selectResetPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectResetPassMouseClicked
        selectAddUser.setSelected(false);
        selectDeleteUser.setSelected(false);
        selectResetPass.setSelected(true);
    }//GEN-LAST:event_selectResetPassMouseClicked

    private void txtRetypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRetypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRetypeActionPerformed

    private void txtAdminUser_DeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdminUser_DeleteUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdminUser_DeleteUserActionPerformed

    private void txtUser_PswRstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUser_PswRstKeyReleased
        lblUsername_PswRst.setText(umsg.validateUsername(txtUser_PswRst.getText()));
        lblRecordStatus.setText("");
    }//GEN-LAST:event_txtUser_PswRstKeyReleased

    private void txtUser_PswRstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUser_PswRstMouseClicked
        lblUsername_PswRst.setText(umsg.validateUsername(txtUser_PswRst.getText()));
        lblRecordStatus.setText("");
    }//GEN-LAST:event_txtUser_PswRstMouseClicked

    private void txtUser_PswRstInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtUser_PswRstInputMethodTextChanged
        lblUsername_PswRst.setText(umsg.validateUsername(txtUser_PswRst.getText()));
        lblRecordStatus.setText("");
    }//GEN-LAST:event_txtUser_PswRstInputMethodTextChanged

    private void lblPswMsg_PswRstInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_lblPswMsg_PswRstInputMethodTextChanged
        lblPswMsg_PswRst.setText(test.PswValCheck(txtPsw_PswRst.getText()));
        lblRecordStatus.setText("");
    }//GEN-LAST:event_lblPswMsg_PswRstInputMethodTextChanged

    private void btnDeleteUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteUserMouseClicked
        validateDeleteUser();
        showUsers();
    }//GEN-LAST:event_btnDeleteUserMouseClicked

    private void btnLoginLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginLinkMouseClicked
       Login login = new Login();
       login.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnLoginLinkMouseClicked

    private void txtPsw_PswRstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPsw_PswRstMouseClicked
        
    }//GEN-LAST:event_txtPsw_PswRstMouseClicked

    private void txtNewPsw_PswRstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewPsw_PswRstKeyReleased
        String newPswVal = test.PswValCheck(txtNewPsw_PswRst.getText().toString());
        txtNewPswMsg.setText(newPswVal);
    }//GEN-LAST:event_txtNewPsw_PswRstKeyReleased

    private void btnLoginLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginLinkActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLoginLinkActionPerformed

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
    private void showUsers() {

        try {
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
                    rowData[i - 1] = result.getObject(i);
                    if (i % 2 == 0) {
                        UserTypeChanger utp = new UserTypeChanger();
                        utp.setType(rowData[i - 1].toString());
                        rowData[i - 1] = utp.getType();
                    }
                }
                model.addRow(rowData);

                // Set the new model on the tblUsers
                tblUsers.setModel(model);
                rowNumber++;

            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

    }

    //This method can insert a new user to the database
    private void insertUsers() {
        try {
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

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //This method validate the user adding process
    private void validateAddUser() {

        if (umsg.validateUsername(txtUser.getText()).equals("Username Available")) {

            if (test.PswValCheck(txtPsw.getText()).equals("Strong Password")) {

                if (test.rtpMatchCheck(txtPsw.getText(), txtRetype.getText()).equals("Re-type matches with the password")) {

                    if (pos.positionStatus(cmbPosition.getSelectedItem().toString()).equals("You selected Cashier") || pos.positionStatus(cmbPosition.getSelectedItem().toString()).equals("You selected Manager") || pos.positionStatus(cmbPosition.getSelectedItem().toString()).equals("You selected Admin")) {

                        if (aacm.usernameAvailability(txtAdminUser.getText()).equals("User is available")) {

                            if (aacm.AdminPasswordAvailability(txtAdminUser.getText(), txtAdminPsw.getText()).equals("")) {
                                insertUsers();
                            } else {
                                lblRecordStatus.setText(aacm.AdminPasswordAvailability(txtAdminUser.getText(), txtAdminPsw.getText()));
                            }
                        } else {
                            lblRecordStatus.setText(aacm.usernameAvailability(txtAdminUser.getText()));
                        }
                    } else {
                        lblRecordStatus.setText(pos.positionStatus(cmbPosition.getSelectedItem().toString()));
                    }
                } else {
                    lblRecordStatus.setText(test.rtpMatchCheck(txtPsw.getText(), txtRetype.getText()));
                }
            } else {
                lblRecordStatus.setText(test.PswValCheck(txtPsw.getText()));
            }
        } else {
            lblRecordStatus.setText(umsg.validateUsername(txtUser.getText()));
        }
    }

    //Reset the complete form
    private void resetForm() {
        txtUser.setText("");
        txtPsw.setText("");
        txtRetype.setText("");
        cmbPosition.setSelectedItem("Select");
        txtAdminUser.setText("");
        txtAdminPsw.setText("");
        txtUser_PswRst.setText("");
        txtPsw_PswRst.setText("");
        txtNewPsw_PswRst.setText("");
        txtRtpPsw_PswRst.setText("");
        txtAdminUser_DeleteUser.setText("");
        txtAdminPsw_DeletePsw.setText("");
        txtUser_DeleteUser.setText("");

        lblAdminPswMessege.setText("");
        lblAdminUserMessege.setText("");
        lblPosMessege.setText("");
        lblPswMessege.setText("");
        lblRtpMessege.setText("");
        lblUserMessege.setText("");

    }

    //Load data to textboxes
    private void loadUpdateUser() {
        int selectedRowIndex = tblUsers.getSelectedRow();
        //Change the txtUserData to the table's first value
        txtUser.setText(tblUsers.getValueAt(selectedRowIndex, 0).toString());
        String position = tblUsers.getValueAt(selectedRowIndex, 1).toString();
        utc.setDBType(position);
        String displayPosition = utc.getDBType();
        System.out.println(displayPosition);

        //Change the select box to the relevent position
        if (displayPosition.equals("A") || displayPosition.equals("DA")) {
            cmbPosition.setSelectedItem("Admin");
        } else if (displayPosition.equals("M") || displayPosition.equals("DM")) {
            cmbPosition.setSelectedItem("Manager");
        } else if (displayPosition.equals("C") || displayPosition.equals("DC")) {
            cmbPosition.setSelectedItem("Cashier");
        } else {
            cmbPosition.setSelectedItem("Select");
        }
    }

    //Update user
    private void updateUsers() {

        Connection conn = cdb.getConnection();

        // SQL update statement
        String sql = "UPDATE users SET status = ? WHERE username = ?";

        utc.setDBType(cmbPosition.getSelectedItem().toString());

        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            // Set the values for the prepared statement
            statement.setString(1, utc.getDBType());
            statement.setString(2, txtUser.getText());

            // Execute the update statement
            int rowsUpdated = statement.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Status updated successfully.");
            } else {
                System.out.println("No user found with the provided ID.");
            }
        } catch (SQLException e) {
            System.out.println("Error updating status: " + e.getMessage());
        }
    }

    //load data to delete user section
    private void loadDeleteUser() {

        int selectedRowIndex = tblUsers.getSelectedRow();
        //Change the txtUserData to the table's first value
        txtUser_DeleteUser.setText(tblUsers.getValueAt(selectedRowIndex, 0).toString());
    }

    private void loadResetPassword() {

        int selectedRowIndex = tblUsers.getSelectedRow();
        txtUser_PswRst.setText(tblUsers.getValueAt(selectedRowIndex, 0).toString());

    }

    //Copy selected tabl's data to form
    private void copyTableDataToForms() {
        if (selectAddUser.isSelected()) {
            loadUpdateUser();
        } else if (selectDeleteUser.isSelected()) {
            loadDeleteUser();
        } else if (selectResetPass.isSelected()) {
            loadResetPassword();
            lblUsername_PswRst.setText(umsg.validateUsername(txtUser_PswRst.getText()));
            lblRecordStatus.setText("");
        }

    }

    //Validate and delete a user
    private void validateDeleteUser() {
        if (umsg.validateUsername(txtUser_DeleteUser.getText()).equals("User Already Exists")) {
            if (aacm.AdminPasswordAvailability(txtAdminUser_DeleteUser.getText(), txtAdminPsw_DeletePsw.getText()).equals("")) {
                int selectedRowIndex = tblUsers.getSelectedRow();
                String status = tblUsers.getValueAt(selectedRowIndex, 1).toString();

                switch (status) {
                    case "Cashier" ->
                        utc.setDBType("Cashier[Deleted]");
                    case "Manager" ->
                        utc.setDBType("Manager[Deleted]");
                    case "Admin" ->
                        utc.setDBType("Admin[Deleted]");
                    default -> {
                    }
                }

                String updatedStatus = utc.getDBType();
                System.out.println(updatedStatus);
                if (oarm.adminAvailability().equals("")) {
                    // SQL update statement
                    String sql = "UPDATE users SET status = ? WHERE username = ?";

                    try {
                        Connection conn = cdb.getConnection();
                        PreparedStatement statement = conn.prepareStatement(sql);

                        // Set the values for the prepared statement
                        statement.setString(1, updatedStatus);
                        statement.setString(2, txtUser_DeleteUser.getText());
                        
                        // Execute the update statement
                        int rowsUpdated = statement.executeUpdate();

                        System.out.println("Rows updated: " + rowsUpdated);
                    } catch (SQLException e) {
                        System.out.println(e.toString());
                    }

                } else {
                    System.out.println(oarm.adminAvailability());

                }
            }else{
                System.out.println(aacm.AdminPasswordAvailability(txtAdminUser_DeleteUser.getText(), txtAdminPsw_DeletePsw.getText()));
            }
        }else{
            System.out.println(umsg.validateUsername(txtUser_DeleteUser.getText()));
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearRecords;
    private javax.swing.JButton btnClearRecords_PswRst;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnLoginLink;
    private javax.swing.JButton btnUpdatePsw;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JButton btnUpdateUser1;
    private javax.swing.JPanel buttons;
    private javax.swing.JComboBox<String> cmbPosition;
    private javax.swing.JPanel components;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAdminPsw;
    private javax.swing.JLabel lblAdminPsw1;
    private javax.swing.JLabel lblAdminPswMessege;
    private javax.swing.JLabel lblAdminUser;
    private javax.swing.JLabel lblAdminUser1;
    private javax.swing.JLabel lblAdminUserMessege;
    private javax.swing.JLabel lblNewPsw_PswRst;
    private javax.swing.JLabel lblPosMessege;
    private javax.swing.JLabel lblPosition1;
    private javax.swing.JLabel lblPswMessege;
    private javax.swing.JLabel lblPswMsg_PswRst;
    private javax.swing.JLabel lblPsw_PswRst;
    private javax.swing.JLabel lblRecordStatus;
    private javax.swing.JLabel lblReg;
    private javax.swing.JLabel lblRtpMessege;
    private javax.swing.JLabel lblRtpPsw_PswRst;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUser1;
    private javax.swing.JLabel lblUser2;
    private javax.swing.JLabel lblUserMessege;
    private javax.swing.JLabel lblUserMsg_PswRst;
    private javax.swing.JLabel lblUser_PswRst;
    private javax.swing.JLabel lblUser_PswRst1;
    private javax.swing.JLabel lblUsername_PswRst;
    private javax.swing.JLabel lblUsers;
    private javax.swing.JLabel lblUsers1;
    private javax.swing.JPanel left;
    private javax.swing.JPanel registration;
    private javax.swing.JPanel right;
    private javax.swing.JRadioButton selectAddUser;
    private javax.swing.JRadioButton selectDeleteUser;
    private javax.swing.JRadioButton selectResetPass;
    private javax.swing.JTable tblUsers;
    private javax.swing.JPasswordField txtAdminPsw;
    private javax.swing.JPasswordField txtAdminPsw_DeletePsw;
    private javax.swing.JTextField txtAdminUser;
    private javax.swing.JTextField txtAdminUser_DeleteUser;
    private javax.swing.JLabel txtNewPswMsg;
    private javax.swing.JPasswordField txtNewPsw_PswRst;
    private javax.swing.JPasswordField txtPsw;
    private javax.swing.JPasswordField txtPsw_PswRst;
    private javax.swing.JPasswordField txtRetype;
    private javax.swing.JPasswordField txtRtpPsw_PswRst;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtUser_DeleteUser;
    private javax.swing.JTextField txtUser_PswRst;
    // End of variables declaration//GEN-END:variables
}
