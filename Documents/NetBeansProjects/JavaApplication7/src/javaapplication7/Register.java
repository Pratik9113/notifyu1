/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication7;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        rfullname = new javax.swing.JTextField();
        rpassword = new javax.swing.JPasswordField();
        rphonenumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        remailaddress = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/signup.jpg"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-290, 0, 890, 510));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 510));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Fullname : ");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("EmailAddress : ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 110, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Password : ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 80, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Register Here ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 150, 60));

        jButton1.setBackground(new java.awt.Color(246, 208, 129));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 140, 30));

        jButton2.setBackground(new java.awt.Color(246, 208, 129));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jButton2.setLabel("Back to Login ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 150, 30));

        rfullname.setBackground(new java.awt.Color(204, 255, 204));
        rfullname.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rfullname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        rfullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfullnameActionPerformed(evt);
            }
        });
        jPanel3.add(rfullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 320, 30));

        rpassword.setBackground(new java.awt.Color(204, 255, 204));
        rpassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel3.add(rpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 320, 30));

        rphonenumber.setBackground(new java.awt.Color(204, 255, 204));
        rphonenumber.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rphonenumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        rphonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rphonenumberActionPerformed(evt);
            }
        });
        jPanel3.add(rphonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 320, 30));

        jLabel6.setText("Phone Number : ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 100, 20));

        remailaddress.setBackground(new java.awt.Color(204, 255, 204));
        remailaddress.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        remailaddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        remailaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remailaddressActionPerformed(evt);
            }
        });
        jPanel3.add(remailaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 320, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 380, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        student_signup s = new student_signup();
        s.setLocationRelativeTo(null);
        s.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               String fullname = rfullname.getText();
               String emailaddress = remailaddress.getText();
               String password = new String(rpassword.getPassword());
              String phoneNumber = rphonenumber.getText();
if (phoneNumber.length() != 10) {
    JOptionPane.showMessageDialog(this, "Invalid phone number: It should be exactly 10 digits.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

// Check if the phone number contains only digits
if (!phoneNumber.matches("\\d+")) {
    JOptionPane.showMessageDialog(this, "Invalid phone number: It should contain only digits.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

//        String password = userpassword.getPassword().toString();
           if(fullname.isEmpty() || emailaddress.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this,"email /fullname/password should not be empty","Error",JOptionPane.ERROR_MESSAGE);
            
        }else{
               userRegister(fullname,emailaddress,password,phoneNumber);
           }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rfullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rfullnameActionPerformed

    private void rphonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rphonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rphonenumberActionPerformed

    private void remailaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remailaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_remailaddressActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Register().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField remailaddress;
    private javax.swing.JTextField rfullname;
    private javax.swing.JPasswordField rpassword;
    private javax.swing.JTextField rphonenumber;
    // End of variables declaration//GEN-END:variables

    private void userRegister(String fullname, String emailaddress, String password, String phoneNumber) {
      // Get a database connection
    var dbconn = DBConnection.connectDB();
    
    if (dbconn != null) {
        try {
            // Define the SQL query with placeholders for email and password
            String query = "insert into mysql.signup(s_fullname,s_email,s_password,s_phonenumber) values (?,?,?,?)";
            
            // Create a prepared statement
            PreparedStatement st = dbconn.prepareStatement(query);
            
            // Set the values for the placeholders
            st.setString(1, fullname);
            st.setString(2, emailaddress);
            st.setString(3, password);
             st.setString(4, phoneNumber);
            // Execute the query
                    int res = st.executeUpdate(); 
            JOptionPane.showMessageDialog(this, "User data insert", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex){     
            Logger.getLogger(student_signup.class.getName()).log(Level.SEVERE, null, ex);
        }
    } else {
        System.out.println("The connection is not available.");
    }
    }
    
}
