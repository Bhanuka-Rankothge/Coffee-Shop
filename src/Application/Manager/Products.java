package Application.Manager;

import Application.Login;
import backend_files.Connect_DB;
import backend_files.Empty_Pass_Exception;
import backend_files.Product_Status_Changer;
import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Products extends javax.swing.JFrame {

    public Products() {
        initComponents();
        loadProducts();
        jPanel3.setBackground(new Color(25,25,25,200));
        jPanel2.setBackground(new Color(25,25,25,200));
    }

    Connect_DB cdb = new Connect_DB();
    Product_Status_Changer psc = new Product_Status_Changer();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productTabs = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        lblProDesc_New = new javax.swing.JLabel();
        txtProDesc_New = new javax.swing.JTextField();
        lblPrice_New = new javax.swing.JLabel();
        txtPrice_New = new javax.swing.JTextField();
        lblDiscount_New = new javax.swing.JLabel();
        txtDiscount_New = new javax.swing.JTextField();
        btnAddProduct_New = new javax.swing.JButton();
        btnClear_New = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtProDesc_Up = new javax.swing.JTextField();
        lblProDesc_Up = new javax.swing.JLabel();
        lblPrice_Up = new javax.swing.JLabel();
        txtPrice_Up = new javax.swing.JTextField();
        lblDiscount_Up = new javax.swing.JLabel();
        txtDiscount_Up = new javax.swing.JTextField();
        btUpdateProduct_Up = new javax.swing.JButton();
        btnClear_Up = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        btnLoginLinkl = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProDesc_New.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblProDesc_New.setForeground(new java.awt.Color(255, 255, 255));
        lblProDesc_New.setText("Product Description :");
        jPanel2.add(lblProDesc_New, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 37, -1, -1));

        txtProDesc_New.setBackground(new java.awt.Color(25, 25, 25));
        txtProDesc_New.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(txtProDesc_New, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 34, 264, -1));

        lblPrice_New.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPrice_New.setForeground(new java.awt.Color(255, 255, 255));
        lblPrice_New.setText("Price :");
        jPanel2.add(lblPrice_New, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 77, -1, -1));

        txtPrice_New.setBackground(new java.awt.Color(25, 25, 25));
        txtPrice_New.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(txtPrice_New, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 74, 264, -1));

        lblDiscount_New.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDiscount_New.setForeground(new java.awt.Color(255, 255, 255));
        lblDiscount_New.setText("Discount :");
        jPanel2.add(lblDiscount_New, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 117, -1, -1));

        txtDiscount_New.setBackground(new java.awt.Color(25, 25, 25));
        txtDiscount_New.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(txtDiscount_New, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 114, 264, -1));

        btnAddProduct_New.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/saved.jpeg"))); // NOI18N
        btnAddProduct_New.setText("Add Product");
        btnAddProduct_New.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddProduct_New.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddProduct_NewMouseClicked(evt);
            }
        });
        jPanel2.add(btnAddProduct_New, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 130, 30));

        btnClear_New.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clear.jpeg"))); // NOI18N
        btnClear_New.setText("Clear");
        btnClear_New.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClear_New.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClear_NewMouseClicked(evt);
            }
        });
        jPanel2.add(btnClear_New, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 90, 30));

        productTabs.addTab("New Product", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtProDesc_Up.setBackground(new java.awt.Color(25, 25, 25));
        txtProDesc_Up.setForeground(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtProDesc_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 34, 264, -1));

        lblProDesc_Up.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblProDesc_Up.setForeground(new java.awt.Color(255, 255, 255));
        lblProDesc_Up.setText("Product Description :");
        jPanel3.add(lblProDesc_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 37, -1, -1));

        lblPrice_Up.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPrice_Up.setForeground(new java.awt.Color(255, 255, 255));
        lblPrice_Up.setText("Price :");
        jPanel3.add(lblPrice_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 77, -1, -1));

        txtPrice_Up.setBackground(new java.awt.Color(25, 25, 25));
        txtPrice_Up.setForeground(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtPrice_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 74, 264, -1));

        lblDiscount_Up.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDiscount_Up.setForeground(new java.awt.Color(255, 255, 255));
        lblDiscount_Up.setText("Discount :");
        jPanel3.add(lblDiscount_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 117, -1, -1));

        txtDiscount_Up.setBackground(new java.awt.Color(25, 25, 25));
        txtDiscount_Up.setForeground(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtDiscount_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 114, 264, -1));

        btUpdateProduct_Up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.jpeg"))); // NOI18N
        btUpdateProduct_Up.setText("Update Product");
        btUpdateProduct_Up.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btUpdateProduct_Up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btUpdateProduct_UpMouseClicked(evt);
            }
        });
        jPanel3.add(btUpdateProduct_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 140, -1));

        btnClear_Up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clear.jpeg"))); // NOI18N
        btnClear_Up.setText("Clear");
        btnClear_Up.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClear_Up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClear_UpMouseClicked(evt);
            }
        });
        btnClear_Up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear_UpActionPerformed(evt);
            }
        });
        jPanel3.add(btnClear_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 80, -1));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/remove.jpeg"))); // NOI18N
        btnDelete.setText("Delete Product");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        jPanel3.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 130, -1));

        productTabs.addTab("Update Product", jPanel3);

        getContentPane().add(productTabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 426, 290));

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Description", "Price", "Discount", "Discount_Qty"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProducts);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 110, 552, -1));

        btnLoginLinkl.setBackground(new java.awt.Color(154, 43, 43));
        btnLoginLinkl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLoginLinkl.setForeground(new java.awt.Color(102, 255, 255));
        btnLoginLinkl.setText("Back to login");
        btnLoginLinkl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLoginLinkl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginLinklMouseClicked(evt);
            }
        });
        btnLoginLinkl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginLinklActionPerformed(evt);
            }
        });
        getContentPane().add(btnLoginLinkl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 40, 120, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ui.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClear_NewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClear_NewMouseClicked
        clearAllData();
    }//GEN-LAST:event_btnClear_NewMouseClicked

    private void btnAddProduct_NewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddProduct_NewMouseClicked
        addProduct();
        clearAllData();
        loadProducts();
        productTabs.setSelectedIndex(0);
    }//GEN-LAST:event_btnAddProduct_NewMouseClicked

    private void btnClear_UpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClear_UpMouseClicked
        clearAllData();
    }//GEN-LAST:event_btnClear_UpMouseClicked

    private void btUpdateProduct_UpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btUpdateProduct_UpMouseClicked
        deleteProduct();
        addProductFromUpdate();
        clearAllData();
        loadProducts();
        productTabs.setSelectedIndex(0);
    }//GEN-LAST:event_btUpdateProduct_UpMouseClicked

    private void tblProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductsMouseClicked
        productTabs.setSelectedIndex(1);
        loadTextboxes();
    }//GEN-LAST:event_tblProductsMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        deleteProduct();
        clearAllData();
        loadProducts();
        productTabs.setSelectedIndex(0);
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnClear_UpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear_UpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClear_UpActionPerformed

    private void btnLoginLinklMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginLinklMouseClicked
        
    }//GEN-LAST:event_btnLoginLinklMouseClicked

    private void btnLoginLinklActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginLinklActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLoginLinklActionPerformed

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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    //Loads products data to products table from database
    private void loadProducts() {

        try {
            // Connect to the database
            Connection conn = cdb.getConnection();

            // Retrieve the data from the database
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM products");

            // Create a new instance of the DefaultTableModel
            DefaultTableModel model = new DefaultTableModel();

            // Populate the DefaultTableModel with the data from the ResultSet
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(metaData.getColumnName(i));
            }
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    if (i == columnCount) {
                        row[i - 1] = psc.getProductDisplayStatus(rs.getObject(i).toString());
                    } else {
                        row[i - 1] = rs.getObject(i);
                    }
                }
                model.addRow(row);
            }

            tblProducts.setModel(model);

            // Close the ResultSet, Statement, and Connection
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }

    //Clear all textboxes
    private void clearAllData() {
        txtDiscount_New.setText("");
        txtDiscount_Up.setText("");
        txtPrice_New.setText("");
        txtPrice_Up.setText("");
        txtProDesc_New.setText("");
        txtProDesc_Up.setText("");
    }

    //Add a new product
    private void addProduct() {
        try {

            Connection conn = cdb.getConnection();

            String insertQuery = "INSERT INTO products (description, price, discount) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(insertQuery);

            // Product Description Validation
            try {
                preparedStatement.setString(1, txtProDesc_New.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Enter Valid Product Description");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Database Error");
            }

            //  Price Validation
            try {

                if (Double.parseDouble(txtPrice_New.getText()) <= 0) {
                    JOptionPane.showMessageDialog(null, "Please Enter a Positive Number");

                } else {
                    preparedStatement.setDouble(2, Double.parseDouble(txtPrice_New.getText()));
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please Enter a Number");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Database Error");
            }

            //Discount Validation
            try {

                if (Double.parseDouble(txtDiscount_New.getText()) <= 0) {
                    JOptionPane.showMessageDialog(null, "Please Enter a Positive Number");

                } else {
                    preparedStatement.setDouble(3, Double.parseDouble(txtDiscount_New.getText()));
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please Enter a Number");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Database Error");
            }

            // Execute the INSERT statement
            int rowsAffected = preparedStatement.executeUpdate();

            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    //Delete a product
    private void deleteProduct() {
        int selectedRow = tblProducts.getSelectedRow();
        Object value = tblProducts.getValueAt(selectedRow, 0).toString();

        // SQL update statement
        String sql = "UPDATE products SET Status = ? WHERE product_ID = ?;";

        // Values to update
        String productID = value.toString();
        System.out.println(productID);

        try (
                Connection conn = cdb.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Set the values for the update statement
            stmt.setString(1, "D");
            stmt.setString(2, productID);

            // Execute the update statement
            int rowsAffected = stmt.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }

    //Add product from update
    private void addProductFromUpdate() {
        try {
            emptyPassCheck();
            Connection conn = cdb.getConnection();

            String insertQuery = "INSERT INTO products (description, price, discount) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(insertQuery);

            // Product Description Validation
            try {
                preparedStatement.setString(1, txtProDesc_Up.getText());
                emptyPassCheck();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Enter Valid Product Description");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Database Error");
            } catch (Empty_Pass_Exception ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }

            //  Price Validation
            try {

                if (Double.parseDouble(txtPrice_Up.getText()) <= 0) {
      
                    JOptionPane.showMessageDialog(null, "Please Enter a Positive Number");

                } else {
                    preparedStatement.setDouble(2, Double.parseDouble(txtPrice_Up.getText()));
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please Enter a Number");
            }

            //Discount Validation
            try {

                if (Double.parseDouble(txtDiscount_Up.getText()) <= 0) {
                    JOptionPane.showMessageDialog(null, "Please Enter a Positive Number");

                } else {
                    preparedStatement.setDouble(3, Double.parseDouble(txtDiscount_Up.getText()));
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please Enter a Number");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Database Error");
            }

            // Execute the INSERT statement
            int rowsAffected = preparedStatement.executeUpdate();

            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        } catch (Empty_Pass_Exception ex) {
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    //Load data to textboxes
    private void loadTextboxes() {
        int selectedRowIndex = tblProducts.getSelectedRow();
        txtProDesc_Up.setText(tblProducts.getValueAt(selectedRowIndex, 1).toString());
        txtPrice_Up.setText(tblProducts.getValueAt(selectedRowIndex, 2).toString());
        txtDiscount_Up.setText(tblProducts.getValueAt(selectedRowIndex, 3).toString());
    }

    //empty pass throw
    private void emptyPassCheck() throws Empty_Pass_Exception {
        // Code that may throw the custom exception
        if (txtProDesc_Up.getText().isEmpty()) {
            throw new Empty_Pass_Exception("Empty Pass exception occurred");
        }
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btUpdateProduct_Up;
    private javax.swing.JButton btnAddProduct_New;
    private javax.swing.JButton btnClear_New;
    private javax.swing.JButton btnClear_Up;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLoginLinkl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDiscount_New;
    private javax.swing.JLabel lblDiscount_Up;
    private javax.swing.JLabel lblPrice_New;
    private javax.swing.JLabel lblPrice_Up;
    private javax.swing.JLabel lblProDesc_New;
    private javax.swing.JLabel lblProDesc_Up;
    private javax.swing.JTabbedPane productTabs;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtDiscount_New;
    private javax.swing.JTextField txtDiscount_Up;
    private javax.swing.JTextField txtPrice_New;
    private javax.swing.JTextField txtPrice_Up;
    private javax.swing.JTextField txtProDesc_New;
    private javax.swing.JTextField txtProDesc_Up;
    // End of variables declaration//GEN-END:variables
}
