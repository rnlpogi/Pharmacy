/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ADMIN
 */
public class SALESREPORT extends javax.swing.JFrame {
Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public SALESREPORT() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        soldnow = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sold = new javax.swing.JTable();
        monthchooser = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        totals = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("INVENTORY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 170, 50));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 255, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("STOCKIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 170, 40));

        jButton3.setBackground(new java.awt.Color(51, 255, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("SALES REPORT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 170, 40));

        jButton4.setBackground(new java.awt.Color(51, 255, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("EXPIRED MEDS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 170, 40));

        jButton5.setBackground(new java.awt.Color(51, 255, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("TRANSACTION");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 170, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("VANCE PHARMACY");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 230, 60));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("INVENTORY ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 160, 60));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("MANAGEMENT SYSTEM");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 310, 60));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        soldnow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        soldnow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soldnowMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(soldnow);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 580, 160));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SALES REPORT");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 400, 90));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacy/icons/icons8-logout-24.png"))); // NOI18N
        jLabel13.setText("LOGOUT");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 90));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("SALES REPORT");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 400, 90));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 90));
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("SALES REPORT");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 400, 90));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 90));
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        total.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel6.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 90, 30));

        sold.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        sold.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soldMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(sold);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 580, 200));

        monthchooser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT MONTH", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" }));
        monthchooser.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                monthchooserPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel6.add(monthchooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 100, 90, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("SELECT MONTH");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("OVERALL SALES REPORT:");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("SALES REPORT TODAY:");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("TOTAL SALES:");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, 30));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("TOTAL SALES");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("TOTAL SALES");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, 30));

        totals.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel1.add(totals, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 580, 130, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("TOTAL SALES");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("TOTAL SALES TODAY:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 580, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        INVENTORY s= new  INVENTORY();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        STOCKIN s= new  STOCKIN();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SALESREPORT s= new  SALESREPORT();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        EXPIREDMEDS s= new  EXPIREDMEDS();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        TRANSACTION s= new  TRANSACTION();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void soldnowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soldnowMouseClicked

    }//GEN-LAST:event_soldnowMouseClicked

    private void soldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_soldMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    conn = DBConnection.getConnection();
    retrievesold();
    retrievesoldnow();
    }//GEN-LAST:event_formWindowOpened

    private void monthchooserPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_monthchooserPopupMenuWillBecomeInvisible
if (monthchooser.getSelectedItem().equals("JANUARY")) {
            january();
        }else if (monthchooser.getSelectedItem().equals("FEBRUARY")) {
            february();
        }else if(monthchooser.getSelectedItem().equals("MARCH")){
            march();
        }
        else if(monthchooser.getSelectedItem().equals("APRIL")){
            april();
        }else if(monthchooser.getSelectedItem().equals("MAY")){
            may();
        }else if(monthchooser.getSelectedItem().equals("JUNE")){
            june();
        }else if(monthchooser.getSelectedItem().equals("JULY")){
            july();
        }else if(monthchooser.getSelectedItem().equals("AUGUST")){
            august();
        }else if(monthchooser.getSelectedItem().equals("SEPTEMBER")){
            september();
        }else if(monthchooser.getSelectedItem().equals("OCTOBER")){
            october();
        }else if(monthchooser.getSelectedItem().equals("NOVEMBER")){
            november();
        }else if(monthchooser.getSelectedItem().equals("DECEMBER")){
            December();
        }
        else{
            retrievesold();
        }           // TODO add your handling code here:
    }//GEN-LAST:event_monthchooserPopupMenuWillBecomeInvisible

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
 LOGIN s= new  LOGIN();
        s.setVisible(true);
        dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

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
            java.util.logging.Logger.getLogger(SALESREPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SALESREPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SALESREPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SALESREPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SALESREPORT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox monthchooser;
    private javax.swing.JTable sold;
    private javax.swing.JTable soldnow;
    private javax.swing.JLabel total;
    private javax.swing.JLabel totals;
    // End of variables declaration//GEN-END:variables
private void retrievesold() {
    try {
        String sql = "SELECT Date AS 'Date', category AS 'Category', pname AS 'Product Name', price AS 'Price', quantity AS 'Quantity',total AS 'Total' FROM transaction";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        sold.setModel(DbUtils.resultSetToTableModel(rs));
         int sum = 0;
        for (int i=0; i<sold.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(sold.getValueAt(i,5).toString());
        }
        total.setText(Integer.toString(sum));
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, e);
    }
}
private void retrievesoldnow() {
   try {
        String sql = "SELECT Date AS 'Date', category AS 'Category', pname AS 'Product Name', price AS 'Price', quantity AS 'Quantity',total AS 'Total' FROM transaction WHERE date =CURDATE()";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        soldnow.setModel(DbUtils.resultSetToTableModel(rs));
         int sum = 0;
        for (int i=0; i<soldnow.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(sold.getValueAt(i,5).toString());
        }
        totals.setText(Integer.toString(sum));
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, e);
    }
}
    private void january(){
       try {
     String sql = "SELECT Date AS 'Date', category AS 'Category', pname AS 'Product Name', price AS 'Price', quantity AS 'Quantity',total AS 'Total' FROM transaction WHERE MONTH(date)=1";
        pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                sold.setModel(DbUtils.resultSetToTableModel(rs));
                          int sum = 0;
        for (int i=0; i<sold.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(sold.getValueAt(i,5).toString());
        }
        total.setText(Integer.toString(sum));
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
   private void february(){
     try {
     String sql = "SELECT Date AS 'Date', category AS 'Category', pname AS 'Product Name', price AS 'Price', quantity AS 'Quantity',total AS 'Total' FROM transaction WHERE MONTH(date)=3";
        pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                sold.setModel(DbUtils.resultSetToTableModel(rs));
                          int sum = 0;
        for (int i=0; i<sold.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(sold.getValueAt(i,5).toString());
        }
        total.setText(Integer.toString(sum));
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
    private void march(){
    try {
     String sql = "SELECT Date AS 'Date', category AS 'Category', pname AS 'Product Name', price AS 'Price', quantity AS 'Quantity',total AS 'Total' FROM transaction WHERE MONTH(date)=3";
        pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                sold.setModel(DbUtils.resultSetToTableModel(rs));
                          int sum = 0;
        for (int i=0; i<sold.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(sold.getValueAt(i,5).toString());
        }
        total.setText(Integer.toString(sum));
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
     private void april(){
      try {
     String sql = "SELECT Date AS 'Date', category AS 'Category', pname AS 'Product Name', price AS 'Price', quantity AS 'Quantity',total AS 'Total' FROM transaction WHERE MONTH(date)=4";
        pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                sold.setModel(DbUtils.resultSetToTableModel(rs));
                          int sum = 0;
        for (int i=0; i<sold.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(sold.getValueAt(i,5).toString());
        }
        total.setText(Integer.toString(sum));
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
      private void may(){
     try {
     String sql = "SELECT Date AS 'Date', category AS 'Category', pname AS 'Product Name', price AS 'Price', quantity AS 'Quantity',total AS 'Total' FROM transaction WHERE MONTH(date)=5";
        pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                sold.setModel(DbUtils.resultSetToTableModel(rs));
                          int sum = 0;
        for (int i=0; i<sold.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(sold.getValueAt(i,5).toString());
        }
        total.setText(Integer.toString(sum));
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
       private void june(){
   try {
     String sql = "SELECT Date AS 'Date', category AS 'Category', pname AS 'Product Name', price AS 'Price', quantity AS 'Quantity',total AS 'Total' FROM transaction WHERE MONTH(date)=6";
        pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                sold.setModel(DbUtils.resultSetToTableModel(rs));
                          int sum = 0;
        for (int i=0; i<sold.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(sold.getValueAt(i,5).toString());
        }
        total.setText(Integer.toString(sum));
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
        private void july(){
  try {
     String sql = "SELECT Date AS 'Date', category AS 'Category', pname AS 'Product Name', price AS 'Price', quantity AS 'Quantity',total AS 'Total' FROM transaction WHERE MONTH(date)=7";
        pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                sold.setModel(DbUtils.resultSetToTableModel(rs));
                          int sum = 0;
        for (int i=0; i<sold.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(sold.getValueAt(i,5).toString());
        }
        total.setText(Integer.toString(sum));
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
         private void august(){
     try {
     String sql = "SELECT Date AS 'Date', category AS 'Category', pname AS 'Product Name', price AS 'Price', quantity AS 'Quantity',total AS 'Total' FROM transaction WHERE MONTH(date)=8";
        pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                sold.setModel(DbUtils.resultSetToTableModel(rs));
                          int sum = 0;
        for (int i=0; i<sold.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(sold.getValueAt(i,5).toString());
        }
        total.setText(Integer.toString(sum));
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
          private void september(){
   try {
     String sql = "SELECT Date AS 'Date', category AS 'Category', pname AS 'Product Name', price AS 'Price', quantity AS 'Quantity',total AS 'Total' FROM transaction WHERE MONTH(date)=9";
        pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                sold.setModel(DbUtils.resultSetToTableModel(rs));
                          int sum = 0;
        for (int i=0; i<sold.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(sold.getValueAt(i,5).toString());
        }
        total.setText(Integer.toString(sum));
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
           private void october(){
     try {
     String sql = "SELECT Date AS 'Date', category AS 'Category', pname AS 'Product Name', price AS 'Price', quantity AS 'Quantity',total AS 'Total' FROM transaction WHERE MONTH(date)=10";
        pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                sold.setModel(DbUtils.resultSetToTableModel(rs));
                          int sum = 0;
        for (int i=0; i<sold.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(sold.getValueAt(i,5).toString());
        }
        total.setText(Integer.toString(sum));
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
            private void november(){
    try {
     String sql = "SELECT Date AS 'Date', category AS 'Category', pname AS 'Product Name', price AS 'Price', quantity AS 'Quantity',total AS 'Total' FROM transaction WHERE MONTH(date)=11";
        pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                sold.setModel(DbUtils.resultSetToTableModel(rs));
                          int sum = 0;
        for (int i=0; i<sold.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(sold.getValueAt(i,5).toString());
        }
        total.setText(Integer.toString(sum));
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
             private void December(){
   try {
     String sql = "SELECT Date AS 'Date', category AS 'Category', pname AS 'Product Name', price AS 'Price', quantity AS 'Quantity',total AS 'Total' FROM transaction WHERE MONTH(date)=12";
        pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                sold.setModel(DbUtils.resultSetToTableModel(rs));
                          int sum = 0;
        for (int i=0; i<sold.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(sold.getValueAt(i,5).toString());
        }
        total.setText(Integer.toString(sum));
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }}
}
