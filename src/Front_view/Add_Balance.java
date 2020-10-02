/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front_view;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.JOptionPane;
import java.io.*;
/**
 *
 * @author Abhijeet_
 */
public class Add_Balance extends javax.swing.JFrame {

    /**
     * Creates new form Add_Balance
     */
    public Add_Balance() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 14)); // NOI18N
        jButton2.setText("Cancel");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Malgun Gothic Semilight", 3, 14)); // NOI18N
        jLabel3.setText("Amount :");

        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton1.setText("Add Money");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel2.setText("National bank Of india");

        jButton3.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 14)); // NOI18N
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
             int Bank_Balance=0;
            String sql3="select Bank_Balance from student_details where Account_no= ? ";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","Abhijeet@123");
            PreparedStatement pst = conn.prepareStatement(sql3);
            
            
            
                      File f1 = new File("C:\\Users\\Abhijeet_\\Documents\\NetBeansProjects\\Banking_project","1.txt");
             FileReader fr = new FileReader(f1);
             String ch ="";
             int t=0;
             while(t!=-1)
             {
               t=fr.read();
               if(t!=-1)
               ch=ch+(char)t;  
             }
             
           int Account_no=0;
           String Sql6 ="Select Account_no from Student_details where Username = ?";
           Connection conn12 = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","Abhijeet@123");
           PreparedStatement pstmt1 = conn12.prepareStatement(Sql6);
           pstmt1.setString(1,ch);
           ResultSet rs2 = pstmt1.executeQuery();
           while(rs2.next())
           {
               Account_no =rs2.getInt("Account_no");
           }
   
            
            
            
            
            
            pst.setString(1,String.valueOf(Account_no));
            ResultSet rs = pst.executeQuery();
            while(rs.next())
                    {
                        Bank_Balance= rs.getInt("Bank_Balance");
                    }
            Bank_Balance= Bank_Balance + Integer.parseInt(txtAmount.getText());
           String sql4; 
           sql4 = "update student_details set Bank_Balance= ? where Account_no=?";
            
            
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","Abhijeet@123");
            PreparedStatement pstm = con.prepareStatement(sql4);
            pstm.setString(1,String.valueOf(Bank_Balance));
            pstm.setString(2, String.valueOf(Account_no));
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Money added to balance");
            con.close();
             String sql5; 
           sql5 = "insert into transaction values (?,?,?,?,?,?)";
           Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","Abhijeet@123");
           PreparedStatement pstmt = conn1.prepareStatement(sql5);
           pstmt.setString(1,NewClass.getdate());
           pstmt.setString(2, NewClass.gettime());
           pstmt.setString(3, String.valueOf(Account_no));
           pstmt.setString(4,txtAmount.getText());
           pstmt.setString(5,"Credit");
           pstmt.setString(6,String.valueOf(Bank_Balance));
           pstmt.executeUpdate();
           JOptionPane.showMessageDialog(null, "Transaction successful");
        }
        catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException  |IOException e)
        {
         JOptionPane.showMessageDialog(null, e);
        }
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Login l1 = new Login();
        l1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Balance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
}
