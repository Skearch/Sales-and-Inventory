package Main;
import javax.swing.*;
import static Main.Databases.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class MainForm extends javax.swing.JFrame  {
    public MainForm() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        lblTabName = new javax.swing.JLabel();
        tpMain = new javax.swing.JTabbedPane();
        pnlInventory = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pnlSales = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnNewSales = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnNewSales1 = new javax.swing.JButton();
        btnNewSales2 = new javax.swing.JButton();
        pnlReceiving = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tblReceivingHistoryList = new javax.swing.JTable();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        pnlProduct = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblProductList = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        pnlCategory = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblCategoryList = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        pnlSupplier = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblSupplierList = new javax.swing.JTable();
        jButton13 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        pnlUsers = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(30, 30, 30));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(187, 187, 187));

        lblTabName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTabName.setText("Inventory");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(lblTabName, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(704, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTabName)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tpMain.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tpMain.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tpMain.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tpMainStateChanged(evt);
            }
        });

        jTable1.setForeground(new java.awt.Color(60, 63, 65));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout pnlInventoryLayout = new javax.swing.GroupLayout(pnlInventory);
        pnlInventory.setLayout(pnlInventoryLayout);
        pnlInventoryLayout.setHorizontalGroup(
            pnlInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInventoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        pnlInventoryLayout.setVerticalGroup(
            pnlInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInventoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpMain.addTab("Inventory", pnlInventory);

        jTable2.setForeground(new java.awt.Color(60, 63, 65));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable2KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        btnNewSales.setText("New Sales");
        btnNewSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewSalesActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnNewSales1.setText("Reload");
        btnNewSales1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewSales1ActionPerformed(evt);
            }
        });

        btnNewSales2.setText("View Receipt");
        btnNewSales2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewSales2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNewSales)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNewSales1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNewSales2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(btnNewSales)
                    .addComponent(btnNewSales1)
                    .addComponent(btnNewSales2))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlSalesLayout = new javax.swing.GroupLayout(pnlSales);
        pnlSales.setLayout(pnlSalesLayout);
        pnlSalesLayout.setHorizontalGroup(
            pnlSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        pnlSalesLayout.setVerticalGroup(
            pnlSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        tpMain.addTab("Sales", pnlSales);

        tblReceivingHistoryList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblReceivingHistoryList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblReceivingHistoryList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblReceivingHistoryListKeyReleased(evt);
            }
        });
        jScrollPane13.setViewportView(tblReceivingHistoryList);

        jButton18.setText("Delete");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("Reload");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("New Receiving");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlReceivingLayout = new javax.swing.GroupLayout(pnlReceiving);
        pnlReceiving.setLayout(pnlReceivingLayout);
        pnlReceivingLayout.setHorizontalGroup(
            pnlReceivingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReceivingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlReceivingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlReceivingLayout.createSequentialGroup()
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        pnlReceivingLayout.setVerticalGroup(
            pnlReceivingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReceivingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlReceivingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18)
                    .addComponent(jButton19)
                    .addComponent(jButton20))
                .addContainerGap())
        );

        tpMain.addTab("Receiving", pnlReceiving);

        jButton7.setText("Delete");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        tblProductList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblProductList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblProductList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblProductListKeyReleased(evt);
            }
        });
        jScrollPane12.setViewportView(tblProductList);

        jButton8.setText("Add Product");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton17.setText("Reload");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlProductLayout = new javax.swing.GroupLayout(pnlProduct);
        pnlProduct.setLayout(pnlProductLayout);
        pnlProductLayout.setHorizontalGroup(
            pnlProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlProductLayout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        pnlProductLayout.setVerticalGroup(
            pnlProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton17))
                .addContainerGap())
        );

        tpMain.addTab("Product", pnlProduct);

        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        tblCategoryList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblCategoryList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCategoryList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblCategoryListKeyReleased(evt);
            }
        });
        jScrollPane11.setViewportView(tblCategoryList);

        jButton9.setText("Add Category");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton14.setText("Reload");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCategoryLayout = new javax.swing.GroupLayout(pnlCategory);
        pnlCategory.setLayout(pnlCategoryLayout);
        pnlCategoryLayout.setHorizontalGroup(
            pnlCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCategoryLayout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        pnlCategoryLayout.setVerticalGroup(
            pnlCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton9)
                    .addComponent(jButton14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpMain.addTab("Category", pnlCategory);

        jButton10.setText("Delete");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        tblSupplierList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblSupplierList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblSupplierList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblSupplierListKeyReleased(evt);
            }
        });
        jScrollPane10.setViewportView(tblSupplierList);

        jButton13.setText("Add Supplier");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton15.setText("Reload");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSupplierLayout = new javax.swing.GroupLayout(pnlSupplier);
        pnlSupplier.setLayout(pnlSupplierLayout);
        pnlSupplierLayout.setHorizontalGroup(
            pnlSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSupplierLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlSupplierLayout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        pnlSupplierLayout.setVerticalGroup(
            pnlSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSupplierLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton13)
                    .addComponent(jButton15))
                .addContainerGap())
        );

        tpMain.addTab("Supplier", pnlSupplier);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable7.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable7KeyReleased(evt);
            }
        });
        jScrollPane8.setViewportView(jTable7);

        jButton11.setText("Delete");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Add Account");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton16.setText("Reload");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUsersLayout = new javax.swing.GroupLayout(pnlUsers);
        pnlUsers.setLayout(pnlUsersLayout);
        pnlUsersLayout.setHorizontalGroup(
            pnlUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlUsersLayout.createSequentialGroup()
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        pnlUsersLayout.setVerticalGroup(
            pnlUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton16))
                .addContainerGap())
        );

        tpMain.addTab("Users", pnlUsers);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tpMain, javax.swing.GroupLayout.PREFERRED_SIZE, 1101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tpMain, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1099, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setLocationRelativeTo(null);
        
        if (admin.equals(false)){
            tpMain.remove(2);
            tpMain.remove(2);
            tpMain.remove(2);
            tpMain.remove(2);
            tpMain.remove(2);
        }
    }//GEN-LAST:event_formWindowOpened

    public static ArrayList<Integer> CategoryArrayList = new ArrayList<>();
    public static ArrayList<String> CategoryNameArrayList = new ArrayList<>();
    
    public static ArrayList<Integer> ProductArrayList = new ArrayList<>();
    public static ArrayList<String> ProductNameArrayList = new ArrayList<>();
    
    public static ArrayList<Integer> SupplierArrayList = new ArrayList<>();
    public static ArrayList<String> SupplierNameArrayList = new ArrayList<>();
    
    public void updateSalesTable(){
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column != 0;
            }
        };

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM RECEIPT");

            int columnCount = resultSet.getMetaData().getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(resultSet.getMetaData().getColumnName(i));
            }

            while (resultSet.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    rowData[i] = resultSet.getObject(i + 1);
                }
                model.addRow(rowData);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            jTable2.setModel(model);
        }
    }
    
    public void updateCategoryTable(){
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column != 0;
            }
        };

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM TABLE_CATEGORY");

            int columnCount = resultSet.getMetaData().getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(resultSet.getMetaData().getColumnName(i));
            }

            while (resultSet.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    rowData[i] = resultSet.getObject(i + 1);
                }
                model.addRow(rowData);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            tblCategoryList.setModel(model);
        }
    }
    
    public void updateUsersTable(){
        DefaultTableModel model = new DefaultTableModel();

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM TABLE_ACCOUNTS");

            int columnCount = resultSet.getMetaData().getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(resultSet.getMetaData().getColumnName(i));
            }

            while (resultSet.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    rowData[i] = resultSet.getObject(i + 1);
                }
                model.addRow(rowData);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            jTable7.setModel(model);
        }
    }
    
    public void updateProductTable(){
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column != 0 && column != 1;
            }
        };

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement();
            String query = "SELECT p.ID, " +
                           "COALESCE(c.NAME, 'Unknown Category') AS CATEGORY, " +
                           "p.NAME, p.DESCRIPTION, p.PRICE " +
                           "FROM TABLE_PRODUCT p " +
                           "LEFT JOIN TABLE_CATEGORY c ON p.CATEGORY = c.ID";
            ResultSet resultSet = statement.executeQuery(query);

            int columnCount = resultSet.getMetaData().getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(resultSet.getMetaData().getColumnLabel(i));
            }

            while (resultSet.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    rowData[i] = resultSet.getObject(i + 1);
                }
                model.addRow(rowData);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            tblProductList.setModel(model);
        }
    }
    
    public void updateSupplierTable(){
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column != 0;
            }
        };

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM TABLE_SUPPLIER");

            int columnCount = resultSet.getMetaData().getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(resultSet.getMetaData().getColumnName(i));
            }

            while (resultSet.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    rowData[i] = resultSet.getObject(i + 1);
                }
                model.addRow(rowData);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{  
            tblSupplierList.setModel(model);
        }
    }
    
    public void updateInventoryTable(){
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (admin)
                    return column != 0 && column != 1 && column != 2;
                else
                    return column != 0 && column != 1 && column != 2 && column != 3 && column != 4;
            }
        };

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement();
            String query = "SELECT p.ID, " +
                           "COALESCE(c.NAME, 'Unknown Category') AS CATEGORY, " +
                           "p.NAME, p.STOCK_QUANTITY, p.STATUS " +
                           "FROM TABLE_PRODUCT p " +
                           "LEFT JOIN TABLE_CATEGORY c ON p.CATEGORY = c.ID " +
                           "WHERE p.STOCK_QUANTITY >= 1";
            ResultSet resultSet = statement.executeQuery(query);

            int columnCount = resultSet.getMetaData().getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(resultSet.getMetaData().getColumnLabel(i));
            }

            while (resultSet.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    rowData[i] = resultSet.getObject(i + 1);
                }
                model.addRow(rowData);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jTable1.setModel(model);
        }
    }
    
    public void updateReceivingTable(){
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column != 0 && column != 1 && column != 2;
            }
        };

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement();
            String query = "SELECT r.ID, " +
                           "COALESCE(p.NAME, 'Unknown Product') AS PRODUCT, " +
                           "COALESCE(s.NAME, 'Unknown Supplier') AS SUPPLIER, " +
                           "r.QUANTITY, r.PRICE, r.TOTAL, r.RECEIVED_DATE " +
                           "FROM TABLE_RECEIVED r " +
                           "LEFT JOIN TABLE_PRODUCT p ON r.PRODUCT = p.ID " +
                           "LEFT JOIN TABLE_SUPPLIER s ON r.SUPPLIER = s.ID";
            ResultSet resultSet = statement.executeQuery(query);

            int columnCount = resultSet.getMetaData().getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(resultSet.getMetaData().getColumnLabel(i));
            }

            while (resultSet.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    rowData[i] = resultSet.getObject(i + 1);
                }
                model.addRow(rowData);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            tblReceivingHistoryList.setModel(model);
        }
    }
    
    private void tpMainStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tpMainStateChanged
        String tabSelected = tpMain.getTitleAt(tpMain.getSelectedIndex());
        lblTabName.setText(tabSelected);
        
        switch (tabSelected) {
            case "Inventory":
                updateInventoryTable();
                break;
            case "Sales":
                try {
                    updateSupplierTable();
                    updateProductTable();

                    ProductArrayList.clear();
                    ProductNameArrayList.clear();
                    connection = DriverManager.getConnection(URL, USER, PASSWORD);
                    Statement statement2 = connection.createStatement();

                    resultSet = statement2.executeQuery("SELECT * FROM TABLE_PRODUCT WHERE STOCK_QUANTITY >= 1");
                    while (resultSet.next()) {
                        String columnValue = resultSet.getString("NAME");
                        ProductArrayList.add(resultSet.getInt("ID"));
                        ProductNameArrayList.add(columnValue);
                    }

                    resultSet.close();
                    statement2.close();
                } catch (SQLException ex) {}
                
                updateSalesTable();
                break;
            case "Receiving":
                try {
                    updateReceivingTable();
                    
                    updateSupplierTable();
                    updateProductTable();

                    // jComboBox1
                    SupplierArrayList.clear();
                    SupplierNameArrayList.clear();
                    connection = DriverManager.getConnection(URL, USER, PASSWORD);
                    Statement statement = connection.createStatement();

                    resultSet = statement.executeQuery("SELECT * FROM TABLE_SUPPLIER");
                    while (resultSet.next()) {
                        String columnValue = resultSet.getString("NAME");
                        SupplierArrayList.add(resultSet.getInt("ID"));
                        SupplierNameArrayList.add(columnValue);
                    }

                    resultSet.close();
                    statement.close();

                    // jComboBox2
                    ProductArrayList.clear();
                    ProductNameArrayList.clear();
                    connection = DriverManager.getConnection(URL, USER, PASSWORD);
                    Statement statement2 = connection.createStatement();

                    resultSet = statement2.executeQuery("SELECT * FROM TABLE_PRODUCT");
                    while (resultSet.next()) {
                        String columnValue = resultSet.getString("NAME");
                        ProductArrayList.add(resultSet.getInt("ID"));
                        ProductNameArrayList.add(columnValue);
                    }

                    resultSet.close();
                    statement2.close();
                } catch (SQLException ex) {}

                break;
            case "Category":
                updateCategoryTable();
                break;
            case "Product":
                CategoryArrayList.clear();
                CategoryNameArrayList.clear();
                
                updateProductTable();
                try {
                    connection = DriverManager.getConnection(URL, USER, PASSWORD);
                    Statement statement = connection.createStatement();

                    resultSet = statement.executeQuery("SELECT * FROM TABLE_CATEGORY");
                    while (resultSet.next()) {
                        int idValue = resultSet.getInt("ID");
                        String columnValue = resultSet.getString("NAME");
                        CategoryArrayList.add(idValue);
                        CategoryNameArrayList.add(columnValue);
                    }

                    resultSet.close();
                    statement.close();
                } catch (SQLException ex) { }
                break;
            case "Supplier":
                updateSupplierTable();
                break;
            case "Users":
                updateUsersTable();
                break;
        }
    }//GEN-LAST:event_tpMainStateChanged

    private void btnNewSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewSalesActionPerformed
        new AddSale().setVisible(true);
    }//GEN-LAST:event_btnNewSalesActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int selectedRow = tblCategoryList.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int response = JOptionPane.showConfirmDialog(
                null, 
                "Are you sure you want to delete the selected item?", 
                "Confirmation", 
                JOptionPane.YES_NO_OPTION
        );

        if (response == JOptionPane.YES_OPTION) {
            int id = (int) tblCategoryList.getValueAt(selectedRow, 0);

            try {
                Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                String sql = "DELETE FROM TABLE_CATEGORY WHERE ID = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();
                preparedStatement.close();
                connection.close();
                DefaultTableModel model = (DefaultTableModel) tblCategoryList.getModel();
                model.removeRow(selectedRow);

                JOptionPane.showMessageDialog(null, "Record has been deleted.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                updateCategoryTable();
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int selectedRow = tblProductList.getSelectedRow();
        
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int response = JOptionPane.showConfirmDialog(
                null, 
                "Are you sure you want to delete the selected item?", 
                "Confirmation", 
                JOptionPane.YES_NO_OPTION
        );

        if (response == JOptionPane.YES_OPTION) {
            int id = (int) tblProductList.getValueAt(selectedRow, 0);

            try {
                Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                String sql = "DELETE FROM TABLE_PRODUCT WHERE ID = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();
                preparedStatement.close();
                connection.close();
                DefaultTableModel model = (DefaultTableModel) tblProductList.getModel();
                model.removeRow(selectedRow);
                JOptionPane.showMessageDialog(null, "Record has been deleted.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                updateProductTable();
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int selectedRow = tblSupplierList.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int response = JOptionPane.showConfirmDialog(
                null, 
                "Are you sure you want to delete the selected item?", 
                "Confirmation", 
                JOptionPane.YES_NO_OPTION
        );
        
        int id = (int) tblSupplierList.getValueAt(selectedRow, 0);
        
        if (response == JOptionPane.YES_OPTION) {
            try {
                Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                String sql = "DELETE FROM TABLE_SUPPLIER WHERE ID = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();
                preparedStatement.close();
                connection.close();
                DefaultTableModel model = (DefaultTableModel) tblSupplierList.getModel();
                model.removeRow(selectedRow);
                JOptionPane.showMessageDialog(null, "Record has been deleted.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                updateSupplierTable();
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int selectedRow = jTable2.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int response = JOptionPane.showConfirmDialog(
                null, 
                "Are you sure you want to delete the selected item?", 
                "Confirmation", 
                JOptionPane.YES_NO_OPTION
        );

        if (response == JOptionPane.YES_OPTION) {
            int id = (int) jTable2.getValueAt(selectedRow, 0);
            
            try {
                Connection connection2 = DriverManager.getConnection(URL, USER, PASSWORD);
                String sql2 = "DELETE FROM RECEIPT_ITEMS WHERE RECEIPT_ID = ?";
                PreparedStatement preparedStatement2 = connection2.prepareStatement(sql2);
                preparedStatement2.setInt(1, id);
                preparedStatement2.executeUpdate();
                preparedStatement2.close();
                connection2.close();
                
                Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                String sql = "DELETE FROM RECEIPT WHERE ID = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();
                preparedStatement.close();
                connection.close();
                
                DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
                model.removeRow(selectedRow);

                JOptionPane.showMessageDialog(null, "Record has been deleted.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                updateSalesTable();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        int selectedRow = jTable7.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int response = JOptionPane.showConfirmDialog(
                null, 
                "Are you sure you want to delete the selected item?", 
                "Confirmation", 
                JOptionPane.YES_NO_OPTION
        );

        if (response == JOptionPane.YES_OPTION) {
            String username = (String) jTable7.getValueAt(selectedRow, 0);

            try {
                Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                String sql = "DELETE FROM TABLE_ACCOUNTS WHERE USERNAME = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, username);
                preparedStatement.executeUpdate();
                preparedStatement.close();
                connection.close();
                DefaultTableModel model = (DefaultTableModel) jTable7.getModel();
                model.removeRow(selectedRow);
                JOptionPane.showMessageDialog(null, "Record has been deleted.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                updateUsersTable();
            }
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        new AddUsers().setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTable7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable7KeyReleased
        
        int keyCode = evt.getKeyCode();
        if (keyCode != 10)
            return;
        
        int row = jTable7.getSelectedRow();
        int column = jTable7.getSelectedColumn();

        if (row == -1)
            return;

        DefaultTableModel model = (DefaultTableModel) jTable7.getModel();
        Object newValue = model.getValueAt(row, column);
        String username = (String) model.getValueAt(row, 0);

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            String columnName = jTable7.getColumnName(column);
            String sql = "UPDATE TABLE_ACCOUNTS SET " + columnName + " = ? WHERE USERNAME = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1, newValue);
            preparedStatement.setString(2, username);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            updateUsersTable();
        }
    }//GEN-LAST:event_jTable7KeyReleased

    private void jTable2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyReleased
        int keyCode = evt.getKeyCode();
        if (keyCode != 10)
            return;
        
        int row = jTable2.getSelectedRow();
        int column = jTable2.getSelectedColumn();

        if (row == -1)
            return;
        
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        Object newValue = model.getValueAt(row, column);
        int id = (int) model.getValueAt(row, 0);

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            String columnName = jTable2.getColumnName(column);
            String sql = "UPDATE RECEIPT SET " + columnName + " = ? WHERE ID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1, newValue);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            updateSalesTable();
        }
    }//GEN-LAST:event_jTable2KeyReleased

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        int keyCode = evt.getKeyCode();
        if (keyCode != 10)
            return;
        
        int row = jTable1.getSelectedRow();
        int column = jTable1.getSelectedColumn();

        if (row == -1)
            return;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object newValue = model.getValueAt(row, column);
        int id = (int) model.getValueAt(row, 0);

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            String columnName = jTable1.getColumnName(column);
            String sql = "UPDATE TABLE_PRODUCT SET " + columnName + " = ? WHERE ID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1, newValue);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        updateCategoryTable();
    }//GEN-LAST:event_jTable1KeyReleased

    private void tblSupplierListKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSupplierListKeyReleased
        int keyCode = evt.getKeyCode();
        if (keyCode != 10)
            return;
        
        int row = tblSupplierList.getSelectedRow();
        int column = tblSupplierList.getSelectedColumn();

        if (row == -1)
            return;
        
        DefaultTableModel model = (DefaultTableModel) tblSupplierList.getModel();
        Object newValue = model.getValueAt(row, column);
        int id = (int) model.getValueAt(row, 0);

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            String columnName = tblSupplierList.getColumnName(column);
            String sql = "UPDATE TABLE_SUPPLIER SET " + columnName + " = ? WHERE ID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1, newValue);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            updateSupplierTable();
        }
    }//GEN-LAST:event_tblSupplierListKeyReleased

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        new AddSupplier().setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void tblCategoryListKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCategoryListKeyReleased
        int keyCode = evt.getKeyCode();
        if (keyCode != 10)
            return;
        
        int row = tblCategoryList.getSelectedRow();
        int column = tblCategoryList.getSelectedColumn();

        if (row == -1)
            return;
        
        DefaultTableModel model = (DefaultTableModel) tblCategoryList.getModel();
        Object newValue = model.getValueAt(row, column);
        int id = (int) model.getValueAt(row, 0);

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            String columnName = tblCategoryList.getColumnName(column);
            String sql = "UPDATE TABLE_CATEGORY SET " + columnName + " = ? WHERE ID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1, newValue);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            updateCategoryTable();
        }
    }//GEN-LAST:event_tblCategoryListKeyReleased

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        new AddCategory().setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        updateCategoryTable();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        updateSupplierTable();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        updateUsersTable();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void tblProductListKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblProductListKeyReleased
        int keyCode = evt.getKeyCode();
        if (keyCode != 10)
            return;
        
        int row = tblProductList.getSelectedRow();
        int column = tblProductList.getSelectedColumn();

        if (row == -1)
            return;
        
        DefaultTableModel model = (DefaultTableModel) tblProductList.getModel();
        Object newValue = model.getValueAt(row, column);
        int id = (int) model.getValueAt(row, 0);
        
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            String columnName = tblProductList.getColumnName(column);
            String sql = "UPDATE TABLE_PRODUCT SET " + columnName + " = ? WHERE ID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1, newValue);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            updateProductTable();
        }
    }//GEN-LAST:event_tblProductListKeyReleased

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       new AddProduct().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        updateProductTable();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        new Receiving().setVisible(true);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        updateReceivingTable();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void tblReceivingHistoryListKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblReceivingHistoryListKeyReleased
        int keyCode = evt.getKeyCode();
        if (keyCode != 10)
            return;
        
        int row = tblReceivingHistoryList.getSelectedRow();
        int column = tblReceivingHistoryList.getSelectedColumn();

        if (row == -1)
            return;
        
        DefaultTableModel model = (DefaultTableModel) tblReceivingHistoryList.getModel();
        Object newValue = model.getValueAt(row, column);
        int id = (int) model.getValueAt(row, 0);

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            String columnName = tblReceivingHistoryList.getColumnName(column);
            String sql = "UPDATE TABLE_RECEIVED SET " + columnName + " = ? WHERE ID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1, newValue);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            updateReceivingTable();
        }
    }//GEN-LAST:event_tblReceivingHistoryListKeyReleased

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        int selectedRow = tblReceivingHistoryList.getSelectedRow();
        
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int response = JOptionPane.showConfirmDialog(
                null, 
                "Are you sure you want to delete the selected item?", 
                "Confirmation", 
                JOptionPane.YES_NO_OPTION
        );

        if (response == JOptionPane.YES_OPTION) {
            int id = (int) tblReceivingHistoryList.getValueAt(selectedRow, 0);

            try {
                Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                String sql = "DELETE FROM TABLE_RECEIVED WHERE ID = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();
                preparedStatement.close();
                connection.close();
                DefaultTableModel model = (DefaultTableModel) tblReceivingHistoryList.getModel();
                model.removeRow(selectedRow);
                JOptionPane.showMessageDialog(null, "Record has been deleted.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                updateReceivingTable();
            }
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void btnNewSales1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewSales1ActionPerformed
        updateSalesTable();
    }//GEN-LAST:event_btnNewSales1ActionPerformed

    private void btnNewSales2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewSales2ActionPerformed
        int selectedRow = jTable2.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int id = (int) jTable2.getValueAt(selectedRow, 0);
        
        new ViewReceipt(id).setVisible(true);
    }//GEN-LAST:event_btnNewSales2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewSales;
    private javax.swing.JButton btnNewSales1;
    private javax.swing.JButton btnNewSales2;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable7;
    private javax.swing.JLabel lblTabName;
    private javax.swing.JPanel pnlCategory;
    private javax.swing.JPanel pnlInventory;
    private javax.swing.JPanel pnlProduct;
    private javax.swing.JPanel pnlReceiving;
    private javax.swing.JPanel pnlSales;
    private javax.swing.JPanel pnlSupplier;
    private javax.swing.JPanel pnlUsers;
    private javax.swing.JTable tblCategoryList;
    private javax.swing.JTable tblProductList;
    private javax.swing.JTable tblReceivingHistoryList;
    private javax.swing.JTable tblSupplierList;
    private javax.swing.JTabbedPane tpMain;
    // End of variables declaration//GEN-END:variables
}
