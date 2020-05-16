
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.AbstractCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Register extends javax.swing.JFrame {

    JTable table;
    TableButton3 tableButton3;
    /**
     * Creates new form Register
     */
    public Register() {
       
        initComponents();
        tableButton3 = new TableButton3(); 
        pnlmember.setVisible(false);        
        addmembers am=new addmembers();
        Maintenance maintain=new Maintenance();
        vehicleinfo vehicle =new vehicleinfo();
        am.setVisible(false);
        maintain.setVisible(false);
        vehicle.setVisible(false);

    }
   

    public class TableButton3{
    public TableButton3()
    {
        String[] columnNames = {"Date", "String", "Integer", "Decimal", "Edit","Delete"};
        int row = 16;
        int col = 6;
        

        Object[][] data =
        {
            {new Date(), "A", new Integer(1), new Double(5.1), "Edit1"},
            {new Date(), "B", new Integer(2), new Double(6.2), "Edit2"},
            {new Date(), "C", new Integer(3), new Double(7.3), "Edit3"},
            {new Date(), "D", new Integer(4), new Double(8.4), "Edit4"}
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        table = new JTable( model )
        {
            //  Returning the Class of each column will allow different
            //  renderers to be used based on Class
          
            public Class getColumnClass(int column)
            {
                return getValueAt(0, column).getClass();
            }
        };

        JScrollPane scrollPane = new JScrollPane( table );
        pnltable.add( scrollPane);
        
        //  Create button column
        ButtonColumn buttonColumn1 = new ButtonColumn(table, 4);
        ButtonColumn buttonColumn2 = new ButtonColumn(table, 5);
    }

//    public static void main(String[] args)
//    {
//        TableButton3 frame = new TableButton3();
//        frame.setDefaultCloseOperation( EXIT_ON_CLOSE );
//        frame.pack();
//        frame.setVisible(true);
//    }

    class ButtonColumn extends AbstractCellEditor
        implements TableCellRenderer, TableCellEditor, ActionListener
    {
        JTable table;
        JButton renderButton;
        JButton editButton;
        String text;

        public ButtonColumn(JTable table, int column)
        {
            super();
            this.table = table;
            renderButton = new JButton(new ImageIcon("edit.png"));

            editButton = new JButton(new ImageIcon("edit.png"));
            editButton.setFocusPainted( false );
            editButton.addActionListener( this );

            TableColumnModel columnModel = table.getColumnModel();
            columnModel.getColumn(column).setCellRenderer( this );
            columnModel.getColumn(column).setCellEditor( this );
        }

        public Component getTableCellRendererComponent(
            JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
        {
            if (hasFocus)
            {
                renderButton.setForeground(table.getForeground());
                renderButton.setBackground(UIManager.getColor("Button.background"));
            }
            else if (isSelected)
            {
                renderButton.setForeground(table.getSelectionForeground());
                renderButton.setBackground(table.getSelectionBackground());
            }
            else
            {
                //System.out.println("Inside Else");
                renderButton.setForeground(table.getForeground());
                renderButton.setBackground(UIManager.getColor("Button.background"));
            }
            String temp = (value == null) ? "" : value.toString();
            //renderButton.setText( (value == null) ? "" : value.toString() );
            renderButton.setIcon(new ImageIcon("edit.png"));
            renderButton.setActionCommand(temp);
            return renderButton;
        }

        public Component getTableCellEditorComponent(
            JTable table, Object value, boolean isSelected, int row, int column)
        {
            text = (value == null) ? "" : value.toString();
            editButton.setIcon(new ImageIcon("edit.png"));
            editButton.setActionCommand(text);
            return editButton;
        }

        public Object getCellEditorValue()
        {
            return text;
        }

        public void actionPerformed(ActionEvent e)
        {
            fireEditingStopped();
            System.out.println( e.getActionCommand() + " : " + table.getSelectedRow());
        }
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

        pnlComplete = new javax.swing.JPanel();
        pnlsidemenu = new javax.swing.JPanel();
        lblmember = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblmaintenance = new javax.swing.JLabel();
        lblvehicle = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pnlinclude = new javax.swing.JPanel();
        pnlmember = new javax.swing.JPanel();
        pnladdmember = new javax.swing.JPanel();
        pnltable = new javax.swing.JPanel();
        btnaddmember = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnlheader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        pnlComplete.setBackground(new java.awt.Color(255, 255, 255));

        pnlsidemenu.setBackground(new java.awt.Color(15, 15, 78));
        pnlsidemenu.setForeground(new java.awt.Color(51, 51, 255));

        lblmember.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        lblmember.setForeground(new java.awt.Color(255, 255, 255));
        lblmember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pimages/members.png"))); // NOI18N
        lblmember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblmember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblmemberMouseClicked(evt);
            }
        });

        lblmaintenance.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        lblmaintenance.setForeground(new java.awt.Color(255, 255, 255));
        lblmaintenance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pimages/plan.png"))); // NOI18N
        lblmaintenance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblmaintenance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblmaintenanceMouseClicked(evt);
            }
        });

        lblvehicle.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        lblvehicle.setForeground(new java.awt.Color(255, 255, 255));
        lblvehicle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pimages/maintenance (1).png"))); // NOI18N
        lblvehicle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblvehicle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblvehicleMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pimages/house.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Home");

        jLabel5.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Maintenance");

        jLabel6.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Members");

        jLabel7.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Vehicle");

        javax.swing.GroupLayout pnlsidemenuLayout = new javax.swing.GroupLayout(pnlsidemenu);
        pnlsidemenu.setLayout(pnlsidemenuLayout);
        pnlsidemenuLayout.setHorizontalGroup(
            pnlsidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator3)
            .addComponent(jSeparator4)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlsidemenuLayout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addGroup(pnlsidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlsidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblmember)
                        .addGroup(pnlsidemenuLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(104, 104, 104)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlsidemenuLayout.createSequentialGroup()
                        .addGroup(pnlsidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(lblmaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlsidemenuLayout.createSequentialGroup()
                        .addComponent(lblvehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlsidemenuLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(125, 125, 125))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlsidemenuLayout.createSequentialGroup()
                        .addGroup(pnlsidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79))))
        );
        pnlsidemenuLayout.setVerticalGroup(
            pnlsidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlsidemenuLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lblmember, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblmaintenance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(11, 11, 11)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblvehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(19, 19, 19)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 88, Short.MAX_VALUE))
        );

        pnlinclude.setBackground(new java.awt.Color(255, 255, 255));

        pnlmember.setBackground(new java.awt.Color(255, 255, 255));

        pnladdmember.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnladdmemberLayout = new javax.swing.GroupLayout(pnladdmember);
        pnladdmember.setLayout(pnladdmemberLayout);
        pnladdmemberLayout.setHorizontalGroup(
            pnladdmemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnladdmemberLayout.setVerticalGroup(
            pnladdmemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );

        pnltable.setBackground(new java.awt.Color(255, 255, 255));

        btnaddmember.setBackground(new java.awt.Color(255, 255, 255));
        btnaddmember.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        btnaddmember.setForeground(new java.awt.Color(51, 51, 255));
        btnaddmember.setText("Add Member");
        btnaddmember.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnaddmember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnaddmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddmemberActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pimages/addmem.png"))); // NOI18N

        javax.swing.GroupLayout pnlmemberLayout = new javax.swing.GroupLayout(pnlmember);
        pnlmember.setLayout(pnlmemberLayout);
        pnlmemberLayout.setHorizontalGroup(
            pnlmemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmemberLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(pnlmemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlmemberLayout.createSequentialGroup()
                        .addComponent(pnltable, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlmemberLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnaddmember, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(515, 515, 515)
                .addComponent(pnladdmember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlmemberLayout.setVerticalGroup(
            pnlmemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmemberLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlmemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlmemberLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlmemberLayout.createSequentialGroup()
                        .addGroup(pnlmemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlmemberLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btnaddmember)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(pnltable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlmemberLayout.createSequentialGroup()
                        .addComponent(pnladdmember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlinclude.add(pnlmember);

        javax.swing.GroupLayout pnlCompleteLayout = new javax.swing.GroupLayout(pnlComplete);
        pnlComplete.setLayout(pnlCompleteLayout);
        pnlCompleteLayout.setHorizontalGroup(
            pnlCompleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCompleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlsidemenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlinclude, javax.swing.GroupLayout.PREFERRED_SIZE, 1052, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pnlCompleteLayout.setVerticalGroup(
            pnlCompleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCompleteLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlCompleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlsidemenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlinclude, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pnlheader.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Housing Society Management");

        javax.swing.GroupLayout pnlheaderLayout = new javax.swing.GroupLayout(pnlheader);
        pnlheader.setLayout(pnlheaderLayout);
        pnlheaderLayout.setHorizontalGroup(
            pnlheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlheaderLayout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlheaderLayout.setVerticalGroup(
            pnlheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlheaderLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlheader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlComplete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlheader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(pnlComplete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblmemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmemberMouseClicked
       pnlmember.setVisible(true);
    }//GEN-LAST:event_lblmemberMouseClicked

    private void lblmaintenanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmaintenanceMouseClicked
        // TODO add your handling code here:
        Maintenance maintain= new Maintenance();
        pnlinclude.setVisible(true);
           System.out.println("adding");
        pnlmember.setVisible(false);
        pnlinclude.add(maintain);
        pnlinclude.setVisible(true);
        System.out.println("Added");
        
        
      
    }//GEN-LAST:event_lblmaintenanceMouseClicked

    private void btnaddmemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddmemberActionPerformed
            // TODO add your handling code here:
           pnlinclude.setVisible(true);
            pnltable.setVisible(false);
            
            addmembers am = new addmembers();
           
        
        jPanel1.add(am);
        am.setVisible(true);
        jPanel1.setVisible(true);
         
       // add.setVisible(true);
    }//GEN-LAST:event_btnaddmemberActionPerformed

    private void lblvehicleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblvehicleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblvehicleMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        pnlinclude.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
//        
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddmember;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblmaintenance;
    private javax.swing.JLabel lblmember;
    private javax.swing.JLabel lblvehicle;
    private javax.swing.JPanel pnlComplete;
    private javax.swing.JPanel pnladdmember;
    private javax.swing.JPanel pnlheader;
    private javax.swing.JPanel pnlinclude;
    private javax.swing.JPanel pnlmember;
    private javax.swing.JPanel pnlsidemenu;
    private javax.swing.JPanel pnltable;
    // End of variables declaration//GEN-END:variables
}
