package Main;

import static Main.Databases.PASSWORD;
import static Main.Databases.URL;
import static Main.Databases.USER;
import static Main.Databases.connection;
import static Main.Databases.statement;
import java.sql.*;
import java.util.*;
import java.util.Date;
import javax.swing.JOptionPane;

public class AddUsers extends javax.swing.JFrame {

    public AddUsers() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Account Details");

        jLabel6.setText("Full Name");

        jLabel7.setText("Username");

        jLabel8.setText("Password");

        jLabel9.setText("Employee ID");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Personal Details");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "CASHIER" }));

        jLabel16.setText("Account Type");

        jLabel10.setText("Contact");

        jLabel11.setText("Email");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane9.setViewportView(jTextArea2);

        jLabel17.setText("Address");

        jTextField10.setEnabled(false);

        jLabel12.setText("Age");

        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        jLabel13.setText("Birth Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setLocationRelativeTo(null);
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        jComboBox4.setSelectedItem(null);
    }//GEN-LAST:event_formWindowOpened

    public static int calculateAge(Date birthdate) {
        Calendar currentDate = Calendar.getInstance();

        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(birthdate);

        int age = currentDate.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
        if (currentDate.get(Calendar.DAY_OF_YEAR) < birthDate.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }

        return age;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = jTextField4.getText();
        String username = jTextField5.getText();
        String password = jTextField6.getText();
        String address = jTextArea2.getText();
        String employeeid = jTextField7.getText();
        String ageRaw = jTextField10.getText();
        String contact = jTextField8.getText();
        String email = jTextField9.getText();
        Date birthdate = jDateChooser1.getDate();
        
        if (jDateChooser1.getDate() == null){
            JOptionPane.showMessageDialog(null, "Invalid birth date.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (jComboBox4.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Select the Account Type.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (contact.replace(" ", "").toLowerCase().equals("")){
            JOptionPane.showMessageDialog(null, "Enter contact.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (email.replace(" ", "").toLowerCase().equals("")){
            JOptionPane.showMessageDialog(null, "Enter email.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (ageRaw.replace(" ", "").toLowerCase().equals("")){
            JOptionPane.showMessageDialog(null, "Enter age.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (employeeid.replace(" ", "").toLowerCase().equals("")){
            JOptionPane.showMessageDialog(null, "Enter employee id.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
        if (address.replace(" ", "").toLowerCase().equals("")){
            JOptionPane.showMessageDialog(null, "Enter address.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (name.replace(" ", "").toLowerCase().equals("")){
            JOptionPane.showMessageDialog(null, "Enter name.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (jDateChooser1.getDate() == null){
            JOptionPane.showMessageDialog(null, "Select birth date.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (username.replace(" ", "").toLowerCase().equals("")){
            JOptionPane.showMessageDialog(null, "Enter username.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
        if (password.replace(" ", "").toLowerCase().equals("")){
            JOptionPane.showMessageDialog(null, "Enter password.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        java.sql.Date sqlBirthdate = new java.sql.Date(birthdate.getTime());
        String account_type = jComboBox4.getSelectedItem().toString();
        int age = Integer.parseInt(ageRaw);
        
        if (age < 18){
            JOptionPane.showMessageDialog(null, "Age did not meet the minimum age requirement.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String tableName = "TABLE_ACCOUNTS";
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            String sql = "INSERT INTO " + tableName + " (USERNAME, EMPLOYEE_ID, NAME, PASSWORD, ACCOUNT_TYPE, AGE, ADDRESS, EMAIL, BIRTHDATE, CONTACT) VALUES (?, ?, ?, ?, ?, ?, ?,?, ?, ?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, employeeid);
            statement.setString(3, name);
            statement.setString(4, password);
            statement.setString(5, account_type);
            statement.setInt(6, age);
            statement.setString(7, address);
            statement.setString(8, email);
            statement.setDate(9, sqlBirthdate);
            statement.setString(10, contact);
            statement.executeUpdate();
            statement.close();
            connection.close();
            
            jComboBox4.setSelectedItem(null);
            jTextField4.setText("");
            jTextField8.setText("");
            jTextField10.setText("");
            jTextField9.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            jTextArea2.setText("");
            jDateChooser1.setDate(null);
            JOptionPane.showMessageDialog(null, "Created a " + account_type + " account for " + name + ".", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        if (jDateChooser1.getDate() == null)
            return;
        
        int age = calculateAge(jDateChooser1.getDate());
        jTextField10.setText(""+age);
    }//GEN-LAST:event_jDateChooser1PropertyChange

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
