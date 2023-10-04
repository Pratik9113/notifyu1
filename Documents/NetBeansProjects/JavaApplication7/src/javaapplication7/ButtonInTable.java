
/*
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
*//*
public class Studentworkshop extends javax.swing.JInternalFrame {
    // private List<Integer> enrolledWorkshops = new ArrayList<>();
    
    
      private void populateTableFromDatabase() {
   var dbconn = DBConnection.connectDB();
 // Use your connectDB method
    if (dbconn != null) {
        try {
           
            String sqlQuery = "SELECT workshop_id, workshop_text FROM workshop";
            PreparedStatement st = dbconn.prepareStatement(sqlQuery);
            ResultSet resultSet = st.executeQuery(sqlQuery);
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            while (resultSet.next()) {
                 int workshopId = resultSet.getInt("workshop_id");
                String workshopText = resultSet.getString("workshop_text");
                
               model.addRow(new Object[]{workshopId,workshopText});
                
                // updated part
                JButton enrollButton = new JButton("enroll");
                 enrollButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // Handle the enrollment action here
                            // For now, show a message dialog
                             enrollStudentInWorkshop(workshopId);
                          //  JOptionPane.showMessageDialog(null, "Enrolling in Workshop ID: " + workshopId);
                        }
                    });
                 
                 // Add workshop data and the enroll button to the table row
                    model.addRow(new Object[]{workshopId, workshopText,enrollButton});
            }

            resultSet.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                dbconn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}*//*
      private void enrollStudentInWorkshop(int workshopId) {
    // Add your enrollment logic here
    // For now, you can show a message dialog as an example
    JOptionPane.showMessageDialog(null, "Enrolling in Workshop ID: " + workshopId);
}*/
  /*
    public Studentworkshop() {
        //this.enrolledWorkshops = new ArrayList<>();
        
        initComponents();
            this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI uis = (BasicInternalFrameUI)this.getUI();
        uis.setNorthPane(null);
        populateTableFromDatabase();
    //    this.enrolledWorkshops = new ArrayList<>();
    }

    *//*
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
                false, false, false
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
            jTable1.getColumnModel().getColumn(2).setMinWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(100);
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
*/
/*
public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Studentworkshop().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
*/
/*
package javaapplication7;
import javax.swing.*;
import javax.swing.event.CellEditorListener;
import javax.swing.table.*;
import java.awt.Component;

import java.util.EventObject;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;

public class ButtonInTable {
    
public  void populateTableFromDatabase() {
    var dbconn = DBConnection.connectDB();
    
    if (dbconn != null) {
        try {
            String sqlQuery = "SELECT workshop_id, workshop_text FROM workshop";
            PreparedStatement st = dbconn.prepareStatement(sqlQuery);
            ResultSet resultSet = st.executeQuery(sqlQuery);
            DefaultTableModel model = (DefaultTableModel) JTable.getModel();
            model.setRowCount(0);

            while (resultSet.next()) {
                 int workshop_id = resultSet.getInt("workshop_id");
                String workshop_Text = resultSet.getString("workshop_text");
                model.addRow(new Object[]{workshop_id,workshop_Text});
            }

            resultSet.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                dbconn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

  public static void main(String[] args) {

    DefaultTableModel tableModel;
    tableModel = new DefaultTableModel(
            new Object[][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
               {null, null, null},
               {null, null, null},
            new Object[] {"workshop_id", "workshop_text", "enroll"});

    JTable table = new JTable(tableModel);
    table.getColumn("enroll").setCellRenderer(new RendererAndEditor());
    table.getColumn("enroll").setCellEditor(new RendererAndEditor());

    JFrame f = new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.getContentPane().add(new JScrollPane(table));
    f.setBounds(300, 200, 400, 300);
    f.setVisible(true);
  }

}
class RendererAndEditor implements TableCellRenderer, TableCellEditor {

  private JButton button;

  RendererAndEditor() {
    button = new JButton("Button");
    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Button clicked");
      }
    });
  }

  @Override
  public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                 boolean hasFocus, int row, int column) {
    return button;
  }

  @Override
  public java.awt.Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row,
                                                        int column) {
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

  @Override
  public void addCellEditorListener(CellEditorListener l) { }

  @Override
  public void removeCellEditorListener(CellEditorListener l) { }
}

*/
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

public class ButtonInTable {
    private JTable table; // Declare the table as a class member

    public ButtonInTable() {
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
            } finally {
                try {
                    dbconn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ButtonInTable();
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
