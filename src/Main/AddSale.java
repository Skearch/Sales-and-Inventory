package Main;

import static Main.Databases.PASSWORD;
import static Main.Databases.URL;
import static Main.Databases.USER;
import static Main.Databases.connection;
import static Main.Databases.resultSet;
import static Main.MainForm.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AddSale extends javax.swing.JFrame {

    public AddSale() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAddtoList = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        lblProduct1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSave1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Customer Name");

        btnAddtoList.setText("Add to Cart");
        btnAddtoList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddtoListActionPerformed(evt);
            }
        });

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        lblProduct1.setText("Product Qty");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Sale Details");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel3.setText("Product");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Cart");

        btnSave1.setText("Remove");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblProduct1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(btnAddtoList, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(jTextField3)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnSave1))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblProduct1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddtoList)
                        .addGap(0, 38, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setLocationRelativeTo(null);
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column < 2){
                    return false;
                }
                return true;
            }
            
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                switch (columnIndex) {
                    case 0:
                        return String.class;
                    case 1:
                        return Integer.class;
                    case 2:
                        return Integer.class;
                    case 3:
                        return Float.class;
                    case 4:
                        return Float.class;
                    default:
                        return Object.class;
                }
            }
        };

        model.addColumn("Product Name");
        model.addColumn("Product ID");
        model.addColumn("Quantity");
        model.addColumn("Price");
        model.addColumn("Total");

        jTable2.setModel(model);

        jComboBox2.removeAllItems();
        
        for (String item : ProductNameArrayList) {
            jComboBox2.addItem(item);
        }
        
        jComboBox2.setSelectedItem(null);
    }//GEN-LAST:event_formWindowOpened

    private void btnAddtoListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddtoListActionPerformed
        if (jTextField1.getText().replace(" ", "").toLowerCase().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the customer.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (jTextField3.getText().replace(" ", "").toLowerCase().equals("")) {
            JOptionPane.showMessageDialog(null, "Please provide quantity.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (jComboBox2.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "You must select a product.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int productID = ProductArrayList.get(jComboBox2.getSelectedIndex());
        float productPrice = 0;
        int stockQuantity = 0;
        String productName = jComboBox2.getSelectedItem().toString();

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement();

            resultSet = statement.executeQuery("SELECT * FROM TABLE_PRODUCT WHERE ID = " + productID);
            if (resultSet.next()) {
                productPrice = resultSet.getFloat("PRICE");
                stockQuantity = resultSet.getInt("STOCK_QUANTITY");
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int quantity;
        try {
            quantity = Integer.parseInt(jTextField3.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid quantity format.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (quantity <= 0)
        {
            JOptionPane.showMessageDialog(null, "The quantity cannot be lower than 0.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int currentQuantityInTable = 0;
        for (int i = 0; i < model.getRowCount(); i++) {
            int tableProductID = (int) model.getValueAt(i, 1);
            if (tableProductID == productID) {
                currentQuantityInTable += (int) model.getValueAt(i, 2);
            }
        }

        if (currentQuantityInTable + quantity > stockQuantity) {
            JOptionPane.showMessageDialog(null, "The product " + productName + " only has " + stockQuantity + " in stock", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        float total = productPrice * quantity;
        model.addRow(new Object[]{productName, productID, quantity, productPrice, total});
    }//GEN-LAST:event_btnAddtoListActionPerformed

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        String text = jTextField3.getText();
        StringBuilder newText = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                newText.append(c);
            }
        }
        jTextField3.setText(newText.toString());
    }//GEN-LAST:event_jTextField3KeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int rowCount = model.getRowCount();
        String customer = (String) jTextField1.getText();
        java.sql.Date soldDate = new java.sql.Date(System.currentTimeMillis());
        int receiptId = -1;  
        
        if (rowCount == 0) {
            JOptionPane.showMessageDialog(this, "Cart list is empty, add a product first.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
            String insertSql = "INSERT INTO RECEIPT (DATE, DESCRIPTION, CUSTOMER_NAME) VALUES (?, ?, ?)";
            PreparedStatement insertStmt = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);
            insertStmt.setString(1, soldDate.toString());
            insertStmt.setString(2, jTextArea1.getText());
            insertStmt.setString(3, customer);
            insertStmt.executeUpdate();

            ResultSet generatedKeys = insertStmt.getGeneratedKeys();
            receiptId = -1;

            if (generatedKeys.next()) {
                receiptId = generatedKeys.getInt(1);
            }

            generatedKeys.close();
            insertStmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error updating sales table: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        for (int row = 0; row < rowCount; row++) {
            int productID = (Integer) model.getValueAt(row, 1);
            int qty = (Integer) model.getValueAt(row, 2);
            float price = (float) model.getValueAt(row, 3);
            float total = price * qty;

            try {
                Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                connection.setAutoCommit(false);

                String selectSql = "SELECT STOCK_QUANTITY FROM TABLE_PRODUCT WHERE ID = ?";
                PreparedStatement selectStmt = connection.prepareStatement(selectSql);
                selectStmt.setInt(1, productID);
                ResultSet resultSet = selectStmt.executeQuery();

                if (resultSet.next()) {
                    int currentStock = resultSet.getInt("STOCK_QUANTITY");
                    int newStock = currentStock - qty;

                    String updateSql = "UPDATE TABLE_PRODUCT SET STOCK_QUANTITY = ? WHERE ID = ?";
                    PreparedStatement updateStmt = connection.prepareStatement(updateSql);
                    updateStmt.setInt(1, newStock);
                    updateStmt.setInt(2, productID);
                    updateStmt.executeUpdate();
                    updateStmt.close();
                }

                resultSet.close();
                selectStmt.close();

                String insertSql = "INSERT INTO RECEIPT_ITEMS (RECEIPT_ID, PRODUCT_ID, QUANTITY, PRICE, TOTAL) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement insertStmt = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);
                insertStmt.setInt(1, receiptId);
                insertStmt.setInt(2, productID);
                insertStmt.setInt(3, qty);
                insertStmt.setFloat(4, price);
                insertStmt.setFloat(5, total);
                insertStmt.executeUpdate();
                
                connection.commit();
                connection.close();

                jComboBox2.setSelectedItem(null);
                jTextField3.setText("");
                jTextField1.setText("");
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error updating sales table: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        model.setRowCount(0);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int selectedRow = jTable2.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "No row selected to delete.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int response = JOptionPane.showConfirmDialog(
                null, 
                "Are you sure you want to remove the selected item?", 
                "Confirmation", 
                JOptionPane.YES_NO_OPTION
        );

        if (response == JOptionPane.YES_OPTION) {
            model.removeRow(selectedRow);
        }
    }//GEN-LAST:event_btnSave1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddtoList;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSave1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblProduct1;
    // End of variables declaration//GEN-END:variables
}
