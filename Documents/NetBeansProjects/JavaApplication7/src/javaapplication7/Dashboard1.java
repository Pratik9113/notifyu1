/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication7;

import java.awt.Color;
/**
 *
 * @author 91799
 */
public class Dashboard1 extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard1
     */
    Color DefaultColor,ClickedColor;
    public Dashboard1() {
        initComponents();
        DefaultColor= new Color(204,204,255);
        ClickedColor = new Color(246,208,129);
        
        // set default color 
         uploadnotice.setBackground(DefaultColor);
         workshop.setBackground(DefaultColor);
         viewnotice.setBackground(DefaultColor);
         //ready.setBackground(DefaultColor);
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
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        workshop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        uploadnotice = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        viewnotice = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        JDesktopPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setText(" DashBoard : - Admin");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 240, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 70));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workshop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workshopMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                workshopMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("workshop");

        javax.swing.GroupLayout workshopLayout = new javax.swing.GroupLayout(workshop);
        workshop.setLayout(workshopLayout);
        workshopLayout.setHorizontalGroup(
            workshopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workshopLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        workshopLayout.setVerticalGroup(
            workshopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workshopLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(workshop, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 170, 50));

        uploadnotice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadnoticeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                uploadnoticeMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("UploadNotice");

        javax.swing.GroupLayout uploadnoticeLayout = new javax.swing.GroupLayout(uploadnotice);
        uploadnotice.setLayout(uploadnoticeLayout);
        uploadnoticeLayout.setHorizontalGroup(
            uploadnoticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uploadnoticeLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        uploadnoticeLayout.setVerticalGroup(
            uploadnoticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uploadnoticeLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(uploadnotice, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 170, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/WhatsApp Image 2023-10-03 at 20.22.44.jpeg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 90, 90));

        viewnotice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewnoticeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewnoticeMousePressed(evt);
            }
        });
        viewnotice.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("ViewNotice");
        viewnotice.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 14, 93, -1));

        jPanel3.add(viewnotice, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 170, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 220, 420));

        javax.swing.GroupLayout JDesktopPanelLayout = new javax.swing.GroupLayout(JDesktopPanel);
        JDesktopPanel.setLayout(JDesktopPanelLayout);
        JDesktopPanelLayout.setHorizontalGroup(
            JDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        JDesktopPanelLayout.setVerticalGroup(
            JDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jPanel1.add(JDesktopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 770, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uploadnoticeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadnoticeMousePressed
        // TODO add your handling code here:
        uploadnotice.setBackground(ClickedColor);
         workshop.setBackground(DefaultColor);
         viewnotice.setBackground(DefaultColor);
    }//GEN-LAST:event_uploadnoticeMousePressed

    private void workshopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workshopMousePressed
        // TODO add your handling code here:
        uploadnotice.setBackground(DefaultColor);
         workshop.setBackground(ClickedColor);
         viewnotice.setBackground(DefaultColor);
    }//GEN-LAST:event_workshopMousePressed

    private void uploadnoticeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadnoticeMouseClicked
        // TODO add your handling code here:
        Uploadnotice upload = new Uploadnotice();
        //JDesktopPanel.removeALL;
        JDesktopPanel.add(upload);//setVisible(true);
        upload.setVisible(true);
    }//GEN-LAST:event_uploadnoticeMouseClicked

    private void workshopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workshopMouseClicked
        // TODO add your handling code here:
         Workshop up= new Workshop ();
        //JDesktopPanel.removeALL;
        JDesktopPanel.add(up);//setVisible(true);
        up.setVisible(true);
    }//GEN-LAST:event_workshopMouseClicked

    private void viewnoticeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewnoticeMousePressed
        // TODO add your handling code here:
         uploadnotice.setBackground(DefaultColor);
         workshop.setBackground(DefaultColor);
         viewnotice.setBackground(ClickedColor);
        
    }//GEN-LAST:event_viewnoticeMousePressed

    private void viewnoticeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewnoticeMouseClicked
        // TODO add your handling code here:// ans 
         NoticeViewAdmin ups= new  NoticeViewAdmin ();
        //JDesktopPanel.removeALL;
        JDesktopPanel.add(ups);//setVisible(true);
        ups.setVisible(true);
        
    }//GEN-LAST:event_viewnoticeMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JDesktopPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel uploadnotice;
    private javax.swing.JPanel viewnotice;
    private javax.swing.JPanel workshop;
    // End of variables declaration//GEN-END:variables
}
