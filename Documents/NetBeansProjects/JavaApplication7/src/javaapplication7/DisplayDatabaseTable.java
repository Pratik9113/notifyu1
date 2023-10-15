/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/*
package javaapplication7;

public class ButtonInTable1 extends javax.swing.JFrame {

    public ButtonInTable1() {
        initComponents();
    }

    *//*
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
*/
    /*
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ButtonInTable1().setVisible(true);
            }
        });
    }
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
package javaapplication7;

import javax.swing.*;
import javax.swing.event.CellEditorListener;
import javax.swing.table.*;
import java.awt.Component;
import java.util.EventObject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;

 class DisplayDatabaseTable {
    private JTable table; // Declare the table as a class member

    public DisplayDatabaseTable {
        table = new JTable(); // Initialize the table

        DefaultTableModel tableModel = new DefaultTableModel(
                new Object[][] {
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new Object[] {"workshop_id", "workshop_text", "enroll"}
        );

        table.setModel(tableModel);

        // Add the button renderer and editor to the "enroll" column
        table.getColumn("enroll").setCellRenderer(new RendererAndEditor());
        table.getColumn("enroll").setCellEditor(new RendererAndEditor());

        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(new JScrollPane(table));
        f.setBounds(300, 200, 400, 300);
        f.setVisible(true);

        populateTableFromDatabase();
    }

    public void populateTableFromDatabase() {
        var dbconn = DBConnection.connectDB();

        if (dbconn != null) {
            try {
                String sqlQuery = "SELECT workshop_id, workshop_text FROM workshop";
                PreparedStatement st = dbconn.prepareStatement(sqlQuery);
                ResultSet resultSet = st.executeQuery(sqlQuery);
                DefaultTableModel model = (DefaultTableModel) table.getModel(); // Use the class member table
                model.setRowCount(0);

                while (resultSet.next()) {
                    int workshop_id = resultSet.getInt("workshop_id");
                    String workshop_Text = resultSet.getString("workshop_text");
                    model.addRow(new Object[]{workshop_id, workshop_Text, "Enroll"}); // Add a button text here
                }

                resultSet.close();
                st.close();
            } catch (Exception e) {
                e.printStackTrace();
            } /*finally {
                try {
                    dbconn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }*/
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ButtonInTable1();
            }
        });
    }
}

class RendererAndEditor extends AbstractCellEditor implements TableCellRenderer, TableCellEditor {
    private JButton button;

    public RendererAndEditor() {
        button = new JButton("Enroll");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Enroll Button clicked");
            }
        });
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                   boolean hasFocus, int row, int column) {
        return button;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        return button;
    }

    @Override
    public Object getCellEditorValue() {
        return null;
    }

    @Override
    public boolean isCellEditable(EventObject anEvent) {
        return true;
    }

    @Override
    public boolean shouldSelectCell(EventObject anEvent) {
        return true;
    }

    @Override
    public boolean stopCellEditing() {
        return true;
    }

    @Override
    public void cancelCellEditing() { }
}