/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication7;
//import java.lang.System.Logger;
//import java.lang.System.Logger.Level;
import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 91799
 */
public class student_signup extends javax.swing.JFrame {
    DBConnection conn;
    
    public student_signup() {
        initComponents();
        conn = new DBConnection();
        if(conn == null){
            JOptionPane.showMessageDialog(this, "DB connectionnot available ", "Error", JOptionPane.ERROR_MESSAGE);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        useremail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        userpassword = new javax.swing.JPasswordField();
        loginbutton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(155, 246, 247));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/WhatsApp Image 2023-10-02 at 19.54.41.jpeg"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 490));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 490));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Password : ");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 120, 30));

        useremail.setBackground(new java.awt.Color(204, 255, 204));
        useremail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        useremail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        useremail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useremailActionPerformed(evt);
            }
        });
        jPanel3.add(useremail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 320, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("EmailAddress : ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 120, 30));

        userpassword.setBackground(new java.awt.Color(204, 255, 204));
        userpassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        userpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userpasswordActionPerformed(evt);
            }
        });
        jPanel3.add(userpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 320, 30));

        loginbutton.setBackground(new java.awt.Color(246, 208, 129));
        loginbutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginbutton.setText("Login");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });
        jPanel3.add(loginbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 280, 30));

        jButton1.setBackground(new java.awt.Color(246, 208, 129));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 150, 30));

        jLabel3.setText("Don't have an Account?");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 130, -1));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/WhatsApp Image 2023-10-02 at 20.21.09.jpeg"))); // NOI18N
        jLabel6.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 260, 70));

        jButton2.setBackground(new java.awt.Color(246, 208, 129));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Admin Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 150, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 380, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void useremailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useremailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useremailActionPerformed

    private void userpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userpasswordActionPerformed

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
        String email = useremail.getText();
        String password = new String(userpassword.getPassword());
//        String password = userpassword.getPassword().toString();
        if(email.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this,"email / password should not be empty","Error",JOptionPane.ERROR_MESSAGE);
            
        }
      /*   char[] passwordChars = userpassword.getPassword(); // Get the password as a char[]
    String password = new String(passwordChars); // Convert char[] to String

    if (email.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Email / password should not be empty", "Error", JOptionPane.ERROR_MESSAGE);
    }*/else{
            userLogin(email,password);
        }
    }//GEN-LAST:event_loginbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        AdminLogin rs = new AdminLogin();
        rs.setTitle("admin login ");
        rs.setLocationRelativeTo(null);
        rs.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(student_signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student_signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student_signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student_signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new student_signup().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginbutton;
    private javax.swing.JTextField useremail;
    private javax.swing.JPasswordField userpassword;
    // End of variables declaration//GEN-END:variables

   /* public void userLogin(String email, String password) {
//       Connection dbconn = DBConnection.connectDB();
 var dbconn = DBConnection.connectDB();
       if(dbconn !=null){
       try{
      /* PreparedStatement st = (PreparedStatement)
                      dbconn.prepareStatement("Select* from student_signup WHERE email = ? AND  password = ?");*/
      /* String query = "SELECT * FROM student_signup WHERE email = ? AND password = ?";
            PreparedStatement st = dbconn.prepareStatement(query);
       st.setString(1,email);
       st.setString(2,password);
       ResultSet res = st.executeQuery();
       if(res.next()){
            dispose();
           
       }else {
                JOptionPane.showMessageDialog(this, "Invalid email or password", "Error", JOptionPane.ERROR_MESSAGE);
       }
    }catch(SQLException ex){
        Logger.getLogger(student_signup.class.getName()).log(Level.SEVERE,null,ex);
    }
    }else{
           System.out.println("the connecction is not available ");
       } 
    }*/
  public void userLogin(String email, String password) {
    // Get a database connection
    var dbconn = DBConnection.connectDB();
    
    if (dbconn != null) {
        try {
            // Define the SQL query with placeholders for email and password
            String query = "SELECT * FROM mysql.signup WHERE s_email = ? AND s_password = ?";
            
            // Create a prepared statement
            PreparedStatement st = dbconn.prepareStatement(query);
            
            // Set the values for the placeholders
            st.setString(1, email);
            st.setString(2, password);
            
            // Execute the query
            ResultSet res = st.executeQuery();
            
            if (res.next()) {
                // User is authenticated, you can perform actions here
                dispose();
                //Dashboard1 d = new Dashboard1();
                Dashboard1 d = new Dashboard1();
                d.setTitle("Dashboard");
                d.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid email or password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(student_signup.class.getName()).log(Level.SEVERE, null, ex);
        }
    } else {
        System.out.println("The connection is not available.");
    }
}
}
