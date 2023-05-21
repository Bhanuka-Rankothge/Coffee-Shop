package Application.Cashier;

import Application.Login;
import Massege_boxes.CalculatorForm.SubTotal_Msgs;
import backend_files.Connect_DB;
import java.awt.Color;
import static java.lang.Double.parseDouble;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.time.LocalDate;

public class Calculator extends javax.swing.JFrame {

    public Calculator() {
        initComponents();
        filterProducts(txtSearchBar.getText());
        txtQty.setText("1");
        setTotals();
        jPanel1.setBackground(new Color(25,25,25,200));
        jPanel2.setBackground(new Color(255,255,255,255));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblProductSet = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtSearchBar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductList = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTemp = new javax.swing.JTable();
        txtQty = new javax.swing.JTextField();
        lblQty = new javax.swing.JLabel();
        btnRemoveProduct = new javax.swing.JButton();
        btnUpdateProduct = new javax.swing.JButton();
        btnClearTable = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblSubTotal = new javax.swing.JLabel();
        lblTotalQty = new javax.swing.JLabel();
        lblDiscount = new javax.swing.JLabel();
        lblTotalCount = new javax.swing.JLabel();
        lblTotal1 = new javax.swing.JLabel();
        lblDiscountCount = new javax.swing.JLabel();
        btnTableReservation = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblSubTotalCount = new javax.swing.JLabel();
        lblTotalQtyCount = new javax.swing.JLabel();
        btnLoginLink = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProductSet.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblProductSet.setForeground(new java.awt.Color(255, 255, 255));
        lblProductSet.setText("Product List");
        jPanel1.add(lblProductSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 160, 38));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        txtSearchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchBarKeyReleased(evt);
            }
        });
        jPanel1.add(txtSearchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 366, -1));

        tblProductList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product_ID", "Product_Description", "Unit Price", "Discount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblProductList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProductList);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 610, 93));

        tblTemp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Product_ID", "Product_Description", "Unit Price", "Discount", "Quantity", "Sub Total", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Float.class,java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTemp);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 290, 627, 225));

        txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtyKeyReleased(evt);
            }
        });
        jPanel1.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 165, -1));

        lblQty.setForeground(new java.awt.Color(255, 255, 255));
        lblQty.setText("Quantity :");
        jPanel1.add(lblQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        btnRemoveProduct.setForeground(new java.awt.Color(102, 102, 102));
        btnRemoveProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/remove.jpeg"))); // NOI18N
        btnRemoveProduct.setText("Remove Product");
        btnRemoveProduct.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRemoveProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoveProductMouseClicked(evt);
            }
        });
        jPanel1.add(btnRemoveProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, 30));

        btnUpdateProduct.setForeground(new java.awt.Color(102, 102, 102));
        btnUpdateProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.jpeg"))); // NOI18N
        btnUpdateProduct.setText("Update Product");
        btnUpdateProduct.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdateProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateProductMouseClicked(evt);
            }
        });
        jPanel1.add(btnUpdateProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 120, 30));

        btnClearTable.setForeground(new java.awt.Color(102, 102, 102));
        btnClearTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clear.jpeg"))); // NOI18N
        btnClearTable.setText("Clear Table");
        btnClearTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClearTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearTableMouseClicked(evt);
            }
        });
        jPanel1.add(btnClearTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 107, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 255, 51));
        jButton1.setText("Print The Bill");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 107, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 680, 534));

        lblSubTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSubTotal.setText("Sub Total :");
        getContentPane().add(lblSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, -1, 51));

        lblTotalQty.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTotalQty.setText("Qty :");
        getContentPane().add(lblTotalQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 180, -1, 51));

        lblDiscount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblDiscount.setText("Discount :");
        getContentPane().add(lblDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 330, -1, 51));

        lblTotalCount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTotalCount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblTotalCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 450, 122, 51));

        lblTotal1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTotal1.setText("Total :");
        getContentPane().add(lblTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 450, -1, 51));

        lblDiscountCount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblDiscountCount.setForeground(new java.awt.Color(102, 255, 51));
        lblDiscountCount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblDiscountCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 330, 122, 51));

        btnTableReservation.setBackground(new java.awt.Color(156, 43, 43));
        btnTableReservation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTableReservation.setForeground(new java.awt.Color(102, 255, 255));
        btnTableReservation.setText("Table Reservation");
        btnTableReservation.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTableReservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTableReservationMouseClicked(evt);
            }
        });
        btnTableReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableReservationActionPerformed(evt);
            }
        });
        getContentPane().add(btnTableReservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, -1, 61));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 400, 340, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSubTotalCount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSubTotalCount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(lblSubTotalCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 122, 51));

        lblTotalQtyCount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTotalQtyCount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(lblTotalQtyCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 122, 51));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 400, 390));

        btnLoginLink.setBackground(new java.awt.Color(156, 43, 43));
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
        getContentPane().add(btnLoginLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 30, 110, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ui.jpeg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Objects
    Connect_DB cdb = new Connect_DB();

    private void txtSearchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchBarKeyReleased
        filterProducts(txtSearchBar.getText());
    }//GEN-LAST:event_txtSearchBarKeyReleased

    private void tblProductListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductListMouseClicked
        loadProduct();
    }//GEN-LAST:event_tblProductListMouseClicked

    private void txtQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyReleased
        loadProduct();
    }//GEN-LAST:event_txtQtyKeyReleased

    private void btnRemoveProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveProductMouseClicked
        removeProduct();
    }//GEN-LAST:event_btnRemoveProductMouseClicked

    private void btnUpdateProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateProductMouseClicked
        updateProduct();
    }//GEN-LAST:event_btnUpdateProductMouseClicked

    private void btnClearTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearTableMouseClicked
        clearTable();
    }//GEN-LAST:event_btnClearTableMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        addSales();
    }//GEN-LAST:event_jButton1MouseClicked

    private void btnTableReservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTableReservationMouseClicked
        Tables tables = new Tables();
        tables.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTableReservationMouseClicked

    private void btnLoginLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginLinkMouseClicked
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLoginLinkMouseClicked

    private void btnLoginLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginLinkActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLoginLinkActionPerformed

    private void btnTableReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTableReservationActionPerformed
        // TODO add your handling code here:
        new Tables().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTableReservationActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    //Change the productlist according to the searchbar text change
    private void filterProducts(String productDescription) {
        try {

            Connection conn = cdb.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Product_ID, description, price, discount FROM products WHERE description LIKE '%" + productDescription + "%' AND status = 'A';");

            // Create a new TableModel with the data from the ResultSet
            DefaultTableModel model = new DefaultTableModel();
            ResultSetMetaData metaData = rs.getMetaData();

            int columnCount = metaData.getColumnCount();

            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(metaData.getColumnName(i));
            }

            while (rs.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i - 1] = rs.getObject(i);
                }
                model.addRow(rowData);
            }

            // Set the new TableModel on the JTable
            tblProductList.setModel(model);

            // Close the ResultSet, Statement, and Connection
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    //Copy searched data to the temporary table
    private void loadProduct() {

        SubTotal_Msgs stm = new SubTotal_Msgs();

        try {
            // Check Quantity Value
            if (Integer.parseInt(txtQty.getText()) >= 1) {

                // Get the selected row index from the source table
                int selectedRowIndex = tblProductList.getSelectedRow();

                int lastRowTempIndex = tblTemp.getRowCount();

                // Get the source table model
                TableModel tblProductListModel = tblProductList.getModel();

                // Create a new destination table model
                DefaultTableModel tblTempModel = (DefaultTableModel) tblTemp.getModel();

                if (tblTempModel == null) {
                    tblTempModel = new DefaultTableModel();
                }

                String lastProductID = tblProductListModel.getValueAt(selectedRowIndex, 0).toString();

                //  Compare the last value is equal
                String preProductID;

                try {
                    preProductID = tblTempModel.getValueAt(lastRowTempIndex - 1, 0).toString();
                } catch (Exception ex) {
                    preProductID = "0";
                }

                if (preProductID.equals(lastProductID)) {
                    //System.out.println("Match");
                } else {
                    //System.out.println("Won\'t Match");

                    if (tblTempModel.getColumnCount() == 0) {
                        for (int i = 0; i < tblProductList.getColumnCount(); i++) {
                            tblTempModel.addColumn(tblProductList.getColumnName(i));
                        }

                        // Add two more columns to the destination table model
                        tblTempModel.addColumn("Quantity");
                        tblTempModel.addColumn("Sub Total");
                        tblTempModel.addColumn("Total");

                    }

                    // Copy the selected row from the source table model to the destination table model
                    Vector<Object> selectedRowData = new Vector<Object>();

                    for (int i = 0; i < tblProductListModel.getColumnCount(); i++) {
                        if (i != 3) {
                            selectedRowData.add(tblProductListModel.getValueAt(selectedRowIndex, i));
                        } else {
                            selectedRowData.add(stm.subDiscount(txtQty.getText(), tblProductListModel.getValueAt(selectedRowIndex, 3).toString()));
                        }
                    }
                    double subTotal = stm.subDiscount(txtQty.getText(), tblProductListModel.getValueAt(selectedRowIndex, 2).toString());
                    double total = stm.subTotal(txtQty.getText(), tblProductListModel.getValueAt(selectedRowIndex, 2).toString(), tblProductListModel.getValueAt(selectedRowIndex, 3).toString());

                    selectedRowData.add(txtQty.getText());
                    selectedRowData.add(subTotal);
                    selectedRowData.add(total);

                    tblTempModel.addRow(selectedRowData);

                    // Set the destination table model to the destination table
                    tblTemp.setModel(tblTempModel);

                    updateTotals();

                    txtQty.setText("1");

                }

            } else {
                JOptionPane.showMessageDialog(null, "Please Enter a value Larger than 0");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "You can't enter any letter and a  character as a value");
        }

    }

    //Remove the product from tblTemp
    private void removeProduct() {
        int selectedRow;
        try {
            selectedRow = tblTemp.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) tblTemp.getModel();
            model.removeRow(selectedRow);
            tblTemp.setModel(model);
            updateTotals();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    //Update all 4 totals
    private void updateTotals() {
        getColumnSum(tblTemp, "Sub Total");
        getColumnSum(tblTemp, "Quantity");
        getColumnSum(tblTemp, "Total");
        getColumnSum(tblTemp, "Discount");
    }

    //Update the column sum of a given table
    private void getColumnSum(JTable table, String columnName) {

        int columnIndex = table.getColumnModel().getColumnIndex(columnName);
        double sum = 0;
        for (int i = 0; i < table.getRowCount(); i++) {
            sum += Double.parseDouble(table.getValueAt(i, columnIndex).toString());
        }

        if (columnName.equals("Quantity")) {
            lblTotalQtyCount.setText(Double.toString(sum));
        } else if (columnName.equals("Sub Total")) {
            lblSubTotalCount.setText(Double.toString(sum));
        } else if (columnName.equals("Total")) {
            lblTotalCount.setText(Double.toString(sum));
        } else if (columnName.equals("Discount")) {
            lblDiscountCount.setText(Double.toString(sum));
        }
    }

    //Update the products
    private void updateProduct() {
        try{
            
        int selectedRow = tblTemp.getSelectedRow();

        if (selectedRow != -1) {

            Object oldQty = tblTemp.getValueAt(selectedRow, 4);
            Object newQty = JOptionPane.showInputDialog(null, "Quantity : ", oldQty);

            Object oldDiscount = tblTemp.getValueAt(selectedRow, 3);
            Object unitDiscount = parseDouble(oldDiscount.toString()) / parseDouble(oldQty.toString());
            Object newDiscount = parseDouble(unitDiscount.toString()) * parseDouble(newQty.toString());

            Object oldSubTotal = tblTemp.getValueAt(selectedRow, 5);
            Object unitSubTotal = parseDouble(oldSubTotal.toString()) / parseDouble(oldQty.toString());
            Object newSubTotal = parseDouble(unitSubTotal.toString()) * parseDouble(newQty.toString());

            Object newTotal = ((parseDouble(newSubTotal.toString())) - parseDouble(newDiscount.toString()));

            if (newQty != null) {

                DefaultTableModel model = (DefaultTableModel) tblTemp.getModel();
                model.setValueAt(newQty, selectedRow, 4);
                model.setValueAt(newDiscount, selectedRow, 3);
                model.setValueAt(newSubTotal, selectedRow, 5);
                model.setValueAt(newTotal, selectedRow, 6);
                tblTemp.setModel(model);
            }
            updateTotals();
        } else {

            JOptionPane.showMessageDialog(null, "Select a row");
        }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }

    //Clear the table
    private void clearTable() {

        String[] columnNames = new String[tblTemp.getColumnCount()];
        for (int i = 0; i < tblTemp.getColumnCount(); i++) {
            columnNames[i] = tblTemp.getColumnName(i);
        }
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        tblTemp.setModel(model);
        updateTotals();
    }

    //Initialize totals when program starts
    private void setTotals() {
        lblTotalQtyCount.setText("0.0");
        lblSubTotalCount.setText("0.0");
        lblTotalCount.setText("0.0");
        lblDiscountCount.setText("0.0");
    }

    //getLast BillID
    private String getLastBillID() {

        String tableName = "bills";
        String billIDColumn = "bill_ID";
        String billID = null;

        try {
            // Establish a connection to the database
            Connection conn = cdb.getConnection();

            // Construct the SQL query to select the last row's billID
            String sql = "SELECT " + billIDColumn + " FROM " + tableName + " ORDER BY " + billIDColumn + " DESC LIMIT 1";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // Retrieve the last row's billID
            if (rs.next()) {

                billID = rs.getString(billIDColumn);

                // Print the last row's billID
            } 

            // Close the result set, statement, and connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e.toString());
        }
        return billID;

    }

    //Adds sales to database
    private void addSales() {
        try {

            LocalDate today = LocalDate.now();

            // Establish a connection to the database
            Connection conn = cdb.getConnection();

            // Create a SQL statement
            Statement stmt = conn.createStatement();

            // Define the SQL query for inserting data into the table
            String sql = null;

            if (lblSubTotalCount.getText().equals("0.0")) {
                JOptionPane.showMessageDialog(jPanel1, "Add at least one product");

            } else {
                sql = "INSERT INTO bills (Sub_Total, Qty_Total, Discount_Total, Total, Date) VALUES ('" + lblSubTotalCount.getText() + "','" + lblTotalQtyCount.getText() + "','" + lblDiscountCount.getText() + "','" + lblTotalCount.getText() + "','" + today.toString() + "');";
                // Execute the SQL query
                int rowsAffected = stmt.executeUpdate(sql);
            }

            // Close the statement and connection
            stmt.close();
            conn.close();

            addSaleProducts(getLastBillID());

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(jPanel1, e.getMessage());
        }
    }

    //Add bill products to table
    private void addSaleProducts(String billID) {

        Connection conn = cdb.getConnection();
        DefaultTableModel model = (DefaultTableModel) tblTemp.getModel();

        int rowCount = model.getRowCount();
        //int colCount = model.getColumnCount();

        Object[][] data = new Object[rowCount][2];

        for (int i = 0; i < rowCount; i++) {
            data[i][0] = model.getValueAt(i, 0);
            data[i][1] = model.getValueAt(i, 4);
            data[i][1] += ".0";
        }

        // Insert the data into the SQL table
        String tableName = "bill_product";
        String columns = "Product_ID, bill_ID, Qty";
        String values = "";

        for (int i = 0; i < rowCount; i++) {
            values += "(";
            values += "'" + data[i][0] + "','" + billID + "','" + data[i][1];
            values = values.substring(0, values.length() - 1); // Remove the last comma
            values += "'),";
        }

        values = values.substring(0, values.length() - 1); // Remove the last comma
        String sql = "INSERT INTO " + tableName + " (" + columns + ") VALUES " + values;
        sql += ";";
        Statement stmt;
        try {

            stmt = conn.createStatement();
            int rowsAffected = stmt.executeUpdate(sql);

            // Close the statement and connection
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(jPanel1, ex.toString());
            deleteLastBill();
        }

    }

    //Delete the last bill
    private void deleteLastBill() {
        Statement statement = null;
        Connection conn;

        try {
            // establish a database connection
            conn = cdb.getConnection();
            // create a statement object to execute SQL statements
            statement = conn.createStatement();

            // get the ID of the last row in the table
            String sql = "SELECT bill_ID FROM bills ORDER BY bill_ID DESC LIMIT 1";
            ResultSet resultSet = statement.executeQuery(sql);
            int lastId = -1;
            if (resultSet.next()) {
                lastId = resultSet.getInt("bill_ID");
            }

            if (lastId != -1) {

                // prepare the SQL statement to delete the last row
                sql = "DELETE FROM bills WHERE bill_ID = " + lastId;
                statement.executeUpdate(sql);

                JOptionPane.showMessageDialog(jPanel1, "Don\'t duplicate the products");
            } else {

                JOptionPane.showMessageDialog(jPanel1, "The table is empty; no rows were deleted.");

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(jPanel1, e.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearTable;
    private javax.swing.JButton btnLoginLink;
    private javax.swing.JButton btnRemoveProduct;
    private javax.swing.JButton btnTableReservation;
    private javax.swing.JButton btnUpdateProduct;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JLabel lblDiscountCount;
    private javax.swing.JLabel lblProductSet;
    private javax.swing.JLabel lblQty;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblSubTotalCount;
    private javax.swing.JLabel lblTotal1;
    private javax.swing.JLabel lblTotalCount;
    private javax.swing.JLabel lblTotalQty;
    private javax.swing.JLabel lblTotalQtyCount;
    private javax.swing.JTable tblProductList;
    private javax.swing.JTable tblTemp;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtSearchBar;
    // End of variables declaration//GEN-END:variables

}
