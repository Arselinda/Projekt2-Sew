
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arsshe14
 */

public class MainWindow extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement prepInsertCity = null;
    PreparedStatement prepDeleteCity=null;
    PreparedStatement prepUpdateCity=null;
    PreparedStatement prepBrowse = null;
    ResultSet resBrowse = null;
    
    
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        
        initComponents();
        try {
                // TODO code application logic here
                
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {

                System.out.println("Could not load mysql driver ");
             // DIALOG BOX
        javax.swing.JOptionPane.showMessageDialog(this, "Datenbanktreiber konnte nicht geladen werden");
        System.exit(1);
            }
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbServer = new javax.swing.JLabel();
        txtServer = new javax.swing.JTextField();
        lbPort = new javax.swing.JLabel();
        lbUsername = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        lbDatabase = new javax.swing.JLabel();
        txtPort = new javax.swing.JTextField();
        txtDatabase = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnConnect = new javax.swing.JButton();
        btnDisconnect = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        lbId = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbDescription = new javax.swing.JLabel();
        lbPrice = new javax.swing.JLabel();
        lbQuantity = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbServer.setText("Server:");

        txtServer.setText("localhost");
        txtServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServerActionPerformed(evt);
            }
        });

        lbPort.setText("Port:");

        lbUsername.setText("Username:");

        lbPassword.setText("Password:");

        lbDatabase.setText("Database:");

        txtPort.setText("3306");
        txtPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPortActionPerformed(evt);
            }
        });

        txtDatabase.setText("world");
        txtDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatabaseActionPerformed(evt);
            }
        });

        txtUsername.setText("root");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnConnect.setText("Connect");
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });

        btnDisconnect.setText("Disconnect");
        btnDisconnect.setEnabled(false);
        btnDisconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisconnectActionPerformed(evt);
            }
        });

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        lbId.setText("ID");

        lbName.setText("Name");

        lbDescription.setText("Description");

        lbPrice.setText("Price");

        lbQuantity.setText("Quantity");

        txtId.setEditable(false);
        txtId.setEnabled(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        btnNext.setText(">");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setText("<");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDatabase)
                            .addComponent(lbPort)
                            .addComponent(lbServer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtServer, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbPassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbUsername)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDisconnect)
                            .addComponent(btnConnect))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbName)
                            .addComponent(lbId)
                            .addComponent(lbDescription)
                            .addComponent(lbPrice)
                            .addComponent(lbQuantity))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtId)
                                    .addComponent(txtName)
                                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtQuantity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(64, 64, 64))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsername)
                    .addComponent(txtServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbServer)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConnect))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPort)
                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisconnect))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDatabase)
                    .addComponent(txtDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbId)
                    .addComponent(btnInsert))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescription)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrice)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbQuantity))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServerActionPerformed

    private void txtPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPortActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnDisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisconnectActionPerformed
        
           try {
                con.close();
                btnConnect.setEnabled(true);
                btnDisconnect.setEnabled(false);
                txtServer.setEnabled(true);
            } catch (Exception ex) {
                System.out.println("Could not load to world database");
                javax.swing.JOptionPane.showMessageDialog(this, "You could not disconnect ");
            }
            
    }//GEN-LAST:event_btnDisconnectActionPerformed

    private void txtDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatabaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatabaseActionPerformed

    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed
        // TODO add your handling code here:
        try {
                con = DriverManager.getConnection("jdbc:mysql://"+txtServer.getText() + ":"+txtPort.getText()+"/"+txtDatabase.getText(), txtUsername.getText(), txtPassword.getText());
                btnConnect.setEnabled(false);
                btnDisconnect.setEnabled(true);
                txtServer.setEnabled(false);
                
            } catch (SQLException ex) {
                System.out.println("Could not load to world database");
                javax.swing.JOptionPane.showMessageDialog(this, "Datenbanktreiber konnte nicht geladen werden");
            }
        
         try {
            
               prepBrowse = con.prepareStatement("SELECT * FROM city");
               
               resBrowse = prepBrowse.executeQuery();
               
               if(resBrowse.next()){
                  int id=resBrowse.getInt("ID");
                  String name= resBrowse.getString("Name");
                  String cc= resBrowse.getString("CountryCode");
                   String district= resBrowse.getString("District");
                   int population=resBrowse.getInt("Population");
                  
                  txtId.setText(""+id);
                  txtName.setText(name);
                  txtDescription.setText(district);
                  txtPrice.setText(cc);
                  txtQuantity.setText(""+population);
                  
               }
            } catch (SQLException ex) {
                System.out.println("Could not do select statement");
                javax.swing.JOptionPane.showMessageDialog(this, "could not...");
            }
    }//GEN-LAST:event_btnConnectActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        String sql="INSERT INTO city (Name,CountryCode,District,Population) VALUES (?,?,?,?)";
        try {
            prepInsertCity=con.prepareStatement(sql);
            prepInsertCity.setString(1, txtName.getText());
            prepInsertCity.setString(2, txtPrice.getText());
            prepInsertCity.setString(3, txtDescription.getText());
            prepInsertCity.setInt(4, Integer.parseInt(txtQuantity.getText()));
            int rows_changes = prepInsertCity.executeUpdate();
            
            if (rows_changes > 0){
                javax.swing.JOptionPane.showMessageDialog(this, "Stadt wurde eingefuegt!");

            }
            else {
                javax.swing.JOptionPane.showMessageDialog(this, "Konnte nicht eingefuegt werde!");
            }
            resBrowse = prepBrowse.executeQuery();
            
        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        
         try {
               
               if(resBrowse.next()){
                 
               }
               else {
                   resBrowse.first();
               } 
               int id=resBrowse.getInt("ID");
                  String name= resBrowse.getString("Name");
                  String cc= resBrowse.getString("CountryCode");
                   String district= resBrowse.getString("District");
                   int population=resBrowse.getInt("Population");
                  
                  txtId.setText(""+id);
                  txtName.setText(name);
                  txtDescription.setText(district);
                  txtPrice.setText(cc);
                  txtQuantity.setText(""+population);
                  
            } catch (SQLException ex) {
                System.out.println("Could not do select statement");
                javax.swing.JOptionPane.showMessageDialog(this, "could not...");
            }
                                  
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        
         try {
               if(resBrowse.previous()){    
               }
               else {
                   resBrowse.last();
                   
               }
                   int id=resBrowse.getInt("ID");
                  String name= resBrowse.getString("Name");
                  String cc= resBrowse.getString("CountryCode");
                   String district= resBrowse.getString("District");
                   int population=resBrowse.getInt("Population");
                  
                  txtId.setText(""+id);
                  txtName.setText(name);
                  txtDescription.setText(district);
                  txtPrice.setText(cc);
                  txtQuantity.setText(""+population);
               
            } catch (SQLException ex) {
                System.out.println("Could not do select statement");
                javax.swing.JOptionPane.showMessageDialog(this, "could not...");
            }
                                  
     
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String sql="UPDATE city SET Name=?,CountryCode=?,District=?,Population=? WHERE ID=?";
        try {
            prepUpdateCity=con.prepareStatement(sql);
            prepUpdateCity.setString(1, txtName.getText());
            prepUpdateCity.setString(2, txtPrice.getText());
            prepUpdateCity.setString(3, txtDescription.getText());
            prepUpdateCity.setInt(4, Integer.parseInt(txtQuantity.getText()));
            prepUpdateCity.setInt(5, Integer.parseInt(txtId.getText()));
            System.out.println(prepUpdateCity);
            int rows_changes = prepUpdateCity.executeUpdate();
            
            if (rows_changes > 0){
                javax.swing.JOptionPane.showMessageDialog(this, "Stadt wurde geandert!");

            }
            else {
                javax.swing.JOptionPane.showMessageDialog(this, "Konnte nicht Stadt andern!");
            }
            resBrowse = prepBrowse.executeQuery();
            
        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String sql="DELETE FROM city WHERE ID=?";
        try{
            prepDeleteCity = con.prepareStatement(sql);
            prepDeleteCity.setInt(1, Integer.parseInt(txtId.getText()));
            int rows_changes = prepDeleteCity.executeUpdate();
            
            if (rows_changes > 0){
                javax.swing.JOptionPane.showMessageDialog(this, "Stadt geloscht!");

            }
            else {
                javax.swing.JOptionPane.showMessageDialog(this, "Konnte nicht Stadt loschen");
            }
            txtId.setText("");
            txtName.setText("");
            txtPrice.setText("");
            txtDescription.setText("");
            txtQuantity.setText("");
            resBrowse = prepBrowse.executeQuery();
        }
         catch (SQLException ex) {
            System.out.println("Neue Stadt konntr nicht eingefuegt werden");
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConnect;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDisconnect;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lbDatabase;
    private javax.swing.JLabel lbDescription;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbPort;
    private javax.swing.JLabel lbPrice;
    private javax.swing.JLabel lbQuantity;
    private javax.swing.JLabel lbServer;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JTextField txtDatabase;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtServer;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
