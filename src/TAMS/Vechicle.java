/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAMS;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author HP
 */
public class Vechicle extends javax.swing.JFrame {
        Connection conn=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
  
        public Vechicle() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        conn = Mysqlconnect.ConnectDB();
        fetch();

    }
        
    /**
     * Creates new form 
     */
public void fetch(){
        try{
            String sql="select * from vehicle";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            Vtable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
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

        jLabel7 = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        sidepane = new javax.swing.JPanel();
        cap = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Vname = new javax.swing.JTextField();
        Regno = new javax.swing.JTextField();
        Vtype = new javax.swing.JTextField();
        scrolvehicletable = new javax.swing.JScrollPane();
        Vtable = new javax.swing.JTable();
        Modbtn = new javax.swing.JButton();
        Delbtn = new javax.swing.JButton();
        Clrbtn = new javax.swing.JButton();
        Addbtn = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        header.setBackground(new java.awt.Color(102, 0, 153));
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                headerMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("VECHICLE DASHBOARD");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(back)
                .addGap(18, 18, 18)
                .addComponent(Back)
                .addGap(234, 234, 234)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(back))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        sidepane.setBackground(new java.awt.Color(0, 0, 51));
        sidepane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sidepaneMouseEntered(evt);
            }
        });

        cap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Vechicle Name");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Capacity ");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Register Number");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Vechicle Type ");

        Vname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VnameActionPerformed(evt);
            }
        });

        Regno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegnoActionPerformed(evt);
            }
        });

        Vtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VtypeActionPerformed(evt);
            }
        });

        scrolvehicletable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scrolvehicletableMouseClicked(evt);
            }
        });

        Vtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vechicle ID", "Vechicle Name", "Vechicle Type", "Capacity", "Register Number"
            }
        ));
        Vtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VtableMouseClicked(evt);
            }
        });
        Vtable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                VtableKeyTyped(evt);
            }
        });
        scrolvehicletable.setViewportView(Vtable);

        Modbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Modbtn.setText("MODIFY");
        Modbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModbtnActionPerformed(evt);
            }
        });

        Delbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Delbtn.setText("DELETE");
        Delbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelbtnActionPerformed(evt);
            }
        });

        Clrbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Clrbtn.setText("CLEAR");
        Clrbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClrbtnActionPerformed(evt);
            }
        });

        Addbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Addbtn.setText("ADD");
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidepaneLayout = new javax.swing.GroupLayout(sidepane);
        sidepane.setLayout(sidepaneLayout);
        sidepaneLayout.setHorizontalGroup(
            sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidepaneLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidepaneLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(sidepaneLayout.createSequentialGroup()
                        .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addGroup(sidepaneLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(24, 24, 24)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                        .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Vname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Vtype, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Regno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(199, 199, 199)
                        .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Modbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Clrbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Delbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(206, 206, 206))))
            .addGroup(sidepaneLayout.createSequentialGroup()
                .addComponent(scrolvehicletable)
                .addContainerGap())
        );
        sidepaneLayout.setVerticalGroup(
            sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepaneLayout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Vname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Vtype, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Modbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(42, 42, 42)
                .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cap, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Regno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Clrbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(131, 131, 131)
                .addComponent(scrolvehicletable, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sidepane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sidepane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 1168, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void capActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capActionPerformed

    private void VnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VnameActionPerformed

    private void RegnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegnoActionPerformed

    private void VtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VtypeActionPerformed

    private void ModbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModbtnActionPerformed
        // TODO add your handling code here:
        conn = Mysqlconnect.ConnectDB();
        
        int row = Vtable.getSelectedRow();
        //System.out.println(row);
        String cell = Vtable.getModel().getValueAt(row,0).toString();
        System.out.println(cell);
        
        String modsql = "UPDATE VEHICLE SET VNAME =?,CAPACITY =?,VTYPE=?,REGNO=? WHERE VID ="+cell;
            
        try{
            pst=conn.prepareStatement(modsql);
            
            pst.setString(1,Vname.getText());
            pst.setString(2,cap.getText());
            pst.setString(3,Vtype.getText());
            pst.setString(4,Regno.getText());
            
            pst.execute();
            JOptionPane.showMessageDialog(null,"Table Modified");
            fetch();
        }
        catch(Exception e){
            
           JOptionPane.showMessageDialog(null,e);  
        }
        
        
        
    }//GEN-LAST:event_ModbtnActionPerformed

    private void DelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelbtnActionPerformed
        // TODO add your handling code here:
        conn = Mysqlconnect.ConnectDB();

        int row = Vtable.getSelectedRow();
        //System.out.println(row);
        String cell = Vtable.getModel().getValueAt(row,0).toString();
        System.out.println(cell);

        String delsql = "DELETE FROM VEHICLE WHERE VID = "+ cell;
        
        try{
            pst=conn.prepareStatement(delsql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Vechicle Deleted");
            fetch();
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_DelbtnActionPerformed

    private void ClrbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClrbtnActionPerformed
           // Vid2.setText("  ");
            Vname.setText("  ");
            cap.setText("  ");
            Vtype.setText("  ");
            Regno.setText("  ");
          
    }//GEN-LAST:event_ClrbtnActionPerformed
    
    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
          conn  = Mysqlconnect.ConnectDB(); 
      
//      String query = "insert into vehicle (vid, vname, capacity, type, regno)"
//        + " values (?, ?, ?, ?, ?)";

        String query = "insert into vehicle ( vname, capacity, type, regno)"
        + " values ( ?, ?, ?, ?)";
      
      try{
            pst=conn.prepareStatement(query);
            
            // pst.setString(1,Vid2.getText());
           
            pst = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);         
            pst.setString(1,Vname.getText());
            pst.setString(2,cap.getText());
            pst.setString(3,Vtype.getText());
            pst.setString(4,Regno.getText());
            
            pst.execute();
            
           
            
            JOptionPane.showMessageDialog(null,"vechicle added");
            
             try{
                    String sql="select * from vehicle";
                    pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    Vtable.setModel(DbUtils.resultSetToTableModel(rs));
                }
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
               
               
     
      conn.close();
                    }
     catch (Exception e){
       JOptionPane.showMessageDialog(null, e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_AddbtnActionPerformed

    private void headerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseClicked
        // TODO add your handling code here:
        dispose();
        Home Hobj = new Home();
        Hobj.setVisible(true);
        
    }//GEN-LAST:event_headerMouseClicked

    private void scrolvehicletableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scrolvehicletableMouseClicked
                                  
    }//GEN-LAST:event_scrolvehicletableMouseClicked

    private void VtableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VtableKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_VtableKeyTyped

    private void VtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VtableMouseClicked
        // TODO add your handling code here:
        // TO LOAD DATA INTO TEXT FIELD
       DefaultTableModel model = (DefaultTableModel)Vtable.getModel();

        // get the selected row index
       int selectedRowIndex = Vtable.getSelectedRow();
       
        // set the selected row data into jtextfields
       //Vid2.setText(model.getValueAt(selectedRowIndex, 0).toString());
       Vname.setText(model.getValueAt(selectedRowIndex, 1).toString());
       cap.setText(model.getValueAt(selectedRowIndex, 2).toString());
       Vtype.setText(model.getValueAt(selectedRowIndex, 3).toString());
       Regno.setText(model.getValueAt(selectedRowIndex, 4).toString());
    }//GEN-LAST:event_VtableMouseClicked

    private void sidepaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidepaneMouseEntered
        // TODO add your handling code here:

//        
    }//GEN-LAST:event_sidepaneMouseEntered

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
       
    }//GEN-LAST:event_formMouseEntered
 
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
            java.util.logging.Logger.getLogger(Vechicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vechicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vechicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vechicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Vechicle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JLabel Back;
    private javax.swing.JButton Clrbtn;
    private javax.swing.JButton Delbtn;
    private javax.swing.JButton Modbtn;
    private javax.swing.JTextField Regno;
    private javax.swing.JTextField Vname;
    private javax.swing.JTable Vtable;
    private javax.swing.JTextField Vtype;
    private javax.swing.JLabel back;
    private javax.swing.JPanel bg;
    private javax.swing.JTextField cap;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane scrolvehicletable;
    private javax.swing.JPanel sidepane;
    // End of variables declaration//GEN-END:variables
}

