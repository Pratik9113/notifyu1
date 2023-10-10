package javaapplication7;
import javax.swing.*;

import javax.swing.table.TableCellRenderer;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;

import javax.swing.JOptionPane;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class ButtonInTable extends javax.swing.JInternalFrame {
    // private List<Integer> enrolledWorkshops = new ArrayList<>();
    private void populateTableFromDatabase() {
    var dbconn = DBConnection.connectDB();

    if (dbconn != null) {
        try {
            String sqlQuery = "SELECT workshop_id, workshop_text FROM workshop";
            try (PreparedStatement st = dbconn.prepareStatement(sqlQuery);
                 ResultSet resultSet = st.executeQuery(sqlQuery)) {
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);

                while (resultSet.next()) {
                    int workshopId = resultSet.getInt("workshop_id");
                    String workshopText = resultSet.getString("workshop_text");

                    // Create a button for each row
                    JButton enrollButton = new JButton("enroll");
                    enrollButton.addActionListener((ActionEvent e) -> {
                       /* int selectedRow = jTable1.getSelectedRow();
                        if (selectedRow != -1) {
                            int selectedWorkshopId = (int) jTable1.getValueAt(selectedRow, 0);
                            enrollStudentInWorkshop(selectedWorkshopId);
                        } else {*/
                            JOptionPane.showMessageDialog(null, "Please select a workshop to enroll.");
                      //  }
                    });

                    // Add the data and button to the model
                    model.addRow(new Object[]{workshopId, workshopText, enrollButton});
                }
                 jTable1.getColumnModel().getColumn(2).setCellRenderer(new ButtonRenderer());
                 jTable1.getColumnModel().getColumn(2).setCellEditor(new ButtonEditor(new JTextField()));
            }
        } catch (SQLException e) {
        } finally {
            try {
                dbconn.close();
            } catch (SQLException e) {
            }
        }
    }
}

    
     /* private void populateTableFromDatabase() {
    var dbconn = DBConnection.connectDB();
    
    if (dbconn != null) {
        try {
            String sqlQuery = "SELECT workshop_id, workshop_text FROM workshop";
            try (PreparedStatement st = dbconn.prepareStatement(sqlQuery); ResultSet resultSet = st.executeQuery(sqlQuery)) {
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                
                while (resultSet.next()) {
                    int workshopId = resultSet.getInt("workshop_id");
                    String workshopText = resultSet.getString("workshop_text");
                    
                    model.addRow(new Object[]{workshopId, workshopText});
                }
                
                // Add the "enroll" button outside the while loop
                JButton enrollButton = new JButton("enroll");
                enrollButton.addActionListener((ActionEvent e) -> {
                    // Handle the enrollment action here
                    // For now, show a message dialog
                    int selectedRow = jTable1.getSelectedRow();
                    if (selectedRow != -1) {
                        int workshopId = (int) jTable1.getValueAt(selectedRow, 0);
                        enrollStudentInWorkshop(workshopId);
                    } else {
                        JOptionPane.showMessageDialog(null, "Please select a workshop to enroll.");
                    }
                });
                
                model.addColumn("enroll");
                for (int i = 0; i < model.getRowCount(); i++) {
                    model.setValueAt(enrollButton, i, 3);
                }
            }
        } catch (SQLException e) {
        } finally {
            try {
                dbconn.close();
            } catch (SQLException e) {
            }
        }
    }
}*/

      private void enrollStudentInWorkshop(int workshopId) {
    // Add your enrollment logic here
    // For now, you can show a message dialog as an example
    JOptionPane.showMessageDialog(null, "Enrolling in Workshop ID: " + workshopId);
}
    public ButtonInTable() {
        //this.enrolledWorkshops = new ArrayList<>();
        
        initComponents();
            this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI uis = (BasicInternalFrameUI)this.getUI();
        uis.setNorthPane(null);
        populateTableFromDatabase();
    //    this.enrolledWorkshops = new ArrayList<>();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(680, 430));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "workshop_id", "workshop_text", "enroll"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(50);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(1).setMinWidth(200);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(200);
            jTable1.getColumnModel().getColumn(2).setMinWidth(50);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(50);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 470, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new StudentWorkshop().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
class ButtonRenderer extends JButton implements TableCellRenderer {
        public ButtonRenderer() {
            setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (isSelected) {
                setForeground(table.getSelectionForeground());
                setBackground(table.getSelectionBackground());
            } else {
                setForeground(table.getForeground());
                setBackground(UIManager.getColor("Button.background"));
            }
            setText((value == null) ? "" : value.toString());
            return this;
        }
    }

    class ButtonEditor extends DefaultCellEditor {
        private final JButton button;

        public ButtonEditor(JTextField textField) {
            super(textField);
            button = new JButton();
            button.setOpaque(true);
            button.addActionListener((ActionEvent e) -> {
                fireEditingStopped();
            });
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            if (isSelected) {
                button.setForeground(table.getSelectionForeground());
                button.setBackground(table.getSelectionBackground());
            } else {
                button.setForeground(table.getForeground());
                button.setBackground(table.getBackground());
            }

            button.setText((value == null) ? "" : value.toString());
            return button;
        }
    }
}
