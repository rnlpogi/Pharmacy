/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ADMIN
 */
public class TRANSACTION extends javax.swing.JFrame {

  Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    private DefaultTableModel model;
    public TRANSACTION() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        CANCEL = new javax.swing.JButton();
        ADD = new javax.swing.JButton();
        category = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        inventorytable = new javax.swing.JTable();
        QUANTITY = new javax.swing.JLabel();
        ADD1 = new javax.swing.JButton();
        txtcash = new javax.swing.JTextField();
        QUANTITY1 = new javax.swing.JLabel();
        txttotalcost = new javax.swing.JTextField();
        QUANTITY2 = new javax.swing.JLabel();
        txtchange = new javax.swing.JTextField();
        QUANTITY3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        order = new javax.swing.JTable();
        pid = new javax.swing.JTextField();

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
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 230, 60));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("INVENTORY ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 160, 60));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("MANAGEMENT SYSTEM");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 310, 60));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("CATEGORY:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 110, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("PRODUCT NAME:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 110, 30));

        pname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pnameKeyTyped(evt);
            }
        });
        jPanel1.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 120, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("PRICE:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 110, 30));

        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceKeyTyped(evt);
            }
        });
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 120, 30));

        CANCEL.setText("CANCEL");
        CANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELActionPerformed(evt);
            }
        });
        jPanel1.add(CANCEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 80, -1));

        ADD.setText("SAVE");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel1.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 493, 80, 20));

        category.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                categoryKeyTyped(evt);
            }
        });
        jPanel1.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 120, 30));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TRANSACTION");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 350, 68));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacy/icons/icons8-logout-24.png"))); // NOI18N
        jLabel3.setText("LOGOUT");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 90));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Order Summary:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 110, 30));

        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });
        quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityKeyTyped(evt);
            }
        });
        jPanel1.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 120, 30));

        inventorytable.setModel(new javax.swing.table.DefaultTableModel(
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
        inventorytable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventorytableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(inventorytable);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 360, 190));

        QUANTITY.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        QUANTITY.setText("QUANTITY:");
        jPanel1.add(QUANTITY, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 110, 30));

        ADD1.setText("ADD");
        ADD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD1ActionPerformed(evt);
            }
        });
        jPanel1.add(ADD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 80, -1));

        txtcash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcashActionPerformed(evt);
            }
        });
        txtcash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcashKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcashKeyTyped(evt);
            }
        });
        jPanel1.add(txtcash, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 60, 30));

        QUANTITY1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        QUANTITY1.setText("CASH:");
        jPanel1.add(QUANTITY1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 50, 30));

        txttotalcost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttotalcostKeyTyped(evt);
            }
        });
        jPanel1.add(txttotalcost, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 70, 30));

        QUANTITY2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        QUANTITY2.setText("TOTAL COST:");
        jPanel1.add(QUANTITY2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, 90, 30));

        txtchange.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtchangeKeyTyped(evt);
            }
        });
        jPanel1.add(txtchange, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, 70, 30));

        QUANTITY3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        QUANTITY3.setText("CHANGE:");
        jPanel1.add(QUANTITY3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 70, 30));

        order.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category", "Product Name", "Prices", "Quantity", "Total"
            }
        ));
        order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(order);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 360, 180));
        jPanel1.add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
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

    private void pnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnameKeyTyped
      char vchar = evt.getKeyChar();
        char bchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar))) {
            evt.consume();
        } else if (!(Character.isAlphabetic(bchar))) {
            evt.consume();
        }
    }//GEN-LAST:event_pnameKeyTyped

    private void priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyTyped
    char vchar = evt.getKeyChar();
        char bchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar))) {
            evt.consume();
        } else if (!(Character.isAlphabetic(bchar))) {
            evt.consume();
        }
        // TODO add your h        // TODO add your handling code here:
    }//GEN-LAST:event_priceKeyTyped

    private void CANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELActionPerformed
   model.removeRow(order.getSelectedRow());
        int sum = 0;
        for (int e = 0; e < order.getRowCount(); e++) {
            sum = sum + Integer.parseInt(order.getValueAt(e, 4).toString());
        }
       
        txttotalcost.setText(Integer.toString(sum));
        updateinventorycancel();
        category.setText("");
pname.setText("");
price.setText("");
quantity.setText("");

        retrieve();
    }//GEN-LAST:event_CANCELActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
    save_data();
       category.setText("");
pname.setText("");
price.setText("");
quantity.setText("");
txttotalcost.setText("");
txtchange.setText("");
txtcash.setText("");
      DefaultTableModel model = (DefaultTableModel) order.getModel();
        model.setRowCount(0);
        retrieve();// TODO add your handling code here:
    }//GEN-LAST:event_ADDActionPerformed

    private void categoryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categoryKeyTyped
   char vchar = evt.getKeyChar();
        char bchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar))) {
            evt.consume();
        } else if (!(Character.isAlphabetic(bchar))) {
            evt.consume();
        } 
    }//GEN-LAST:event_categoryKeyTyped

    private void quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityKeyTyped

    private void inventorytableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventorytableMouseClicked
 DefaultTableModel model=(DefaultTableModel)inventorytable.getModel();
        int selectedRowIndex=inventorytable.getSelectedRow();
      
        pid.setText(model.getValueAt(selectedRowIndex, 0).toString());
        category.setText(model.getValueAt(selectedRowIndex, 1).toString());
        pname.setText(model.getValueAt(selectedRowIndex, 2).toString());
        price.setText(model.getValueAt(selectedRowIndex, 3).toString());        // TODO add your handling code here:
    }//GEN-LAST:event_inventorytableMouseClicked

    private void ADD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD1ActionPerformed
 String Category = category.getText();
String Pname = pname.getText();
int prices = Integer.parseInt(price.getText());
int Quantity = Integer.parseInt(quantity.getText());

int Tprice = Quantity * prices;
int total = Quantity * Tprice;

   model = (DefaultTableModel) order.getModel();
model.addRow(new Object[]{
    Category,
    Pname,
    Tprice,
    Quantity,
    total
});
int sum = 0;
for (int i = 0; i < order.getRowCount(); i++) {
    sum = sum + Integer.parseInt(order.getValueAt(i, 4).toString());
}
    txttotalcost.setText(Integer.toString(sum));
updateinventoryadd();
retrieve();
category.setText("");
pname.setText("");
price.setText("");
quantity.setText("");

  

       // TODO add your handling code here:
    }//GEN-LAST:event_ADD1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 conn = DBConnection.getConnection();  
  retrieve();        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void txtcashKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcashKeyTyped
       char vchar = evt.getKeyChar();
       
        if (!(Character.isDigit(vchar))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcashKeyTyped

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void txttotalcostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttotalcostKeyTyped
 char vchar = evt.getKeyChar();
        char bchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar))) {
            evt.consume();
        } else if (!(Character.isAlphabetic(bchar))) {
            evt.consume();
        }                // TODO add your handling code here:
    }//GEN-LAST:event_txttotalcostKeyTyped

    private void txtchangeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtchangeKeyTyped
 char vchar = evt.getKeyChar();
        char bchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar))) {
            evt.consume();
        } else if (!(Character.isAlphabetic(bchar))) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtchangeKeyTyped

    private void txtcashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcashActionPerformed

    private void orderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderMouseClicked
    DefaultTableModel model = (DefaultTableModel) order.getModel();
       
        int selectedRowIndex = order.getSelectedRow();
        category.setText(model.getValueAt(selectedRowIndex, 0).toString());
        pname.setText(model.getValueAt(selectedRowIndex, 1).toString());
        price.setText(model.getValueAt(selectedRowIndex, 2).toString()); 
        quantity.setText(model.getValueAt(selectedRowIndex, 3).toString());   
             // TODO add your handling code here:
    }//GEN-LAST:event_orderMouseClicked

    private void txtcashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcashKeyReleased
    if (txtcash.getText().isEmpty()) {
            txtchange.setText("");
        } else {
            int total = Integer.parseInt(txttotalcost.getText());

            int pay = Integer.parseInt(txtcash.getText());
            int change = pay - total;
            txtchange.setText(String.valueOf(change));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtcashKeyReleased

    private void quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyReleased
      if (quantity.getText().isEmpty()) {
           
            ADD1.setEnabled(true);
        } else {
            try {
                String sql = "SELECT * FROM inventory WHERE p_id = '" + pid.getText() + "'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                if (rs.next()) {
                    int available_stocks = Integer.parseInt(rs.getString("STOCKS"));
                    int order_quantity = Integer.parseInt(quantity.getText());
                    if (available_stocks <= 5) {
                        //JOptionPane.showMessageDialog(null, "Not Enough Stocks");
                          JOptionPane.showMessageDialog(null, "Not Enough Stocks. Please restock");
                       ADD1.setEnabled(false);
                    } else {
                        //JOptionPane.showMessageDialog(null, "Enough Stocks");
                       
                        ADD1.setEnabled(true);
                    }
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_quantityKeyReleased

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
 LOGIN s= new  LOGIN();
        s.setVisible(true);
        dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(TRANSACTION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TRANSACTION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TRANSACTION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TRANSACTION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TRANSACTION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton ADD1;
    private javax.swing.JButton CANCEL;
    private javax.swing.JLabel QUANTITY;
    private javax.swing.JLabel QUANTITY1;
    private javax.swing.JLabel QUANTITY2;
    private javax.swing.JLabel QUANTITY3;
    private javax.swing.JTextField category;
    private javax.swing.JTable inventorytable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable order;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField price;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField txtcash;
    private javax.swing.JTextField txtchange;
    private javax.swing.JTextField txttotalcost;
    // End of variables declaration//GEN-END:variables
private void retrieve(){
try {
    String sql = "SELECT p_id AS 'PRODUCT ID',Category AS 'CATEGORY',pname AS 'PRODUCT NAME',price AS 'PRICE',stocks AS 'STOCKS'  FROM inventory WHERE expiry > CURDATE()";
pst = conn.prepareStatement(sql);
rs =pst.executeQuery();
inventorytable.setModel(DbUtils.resultSetToTableModel(rs));
inventorytable.removeColumn(inventorytable.getColumnModel().getColumn(0));
}catch(Exception e){
   JOptionPane.showMessageDialog(rootPane, e);
}
} private void updateinventoryadd() {
        try {
            String sql = "UPDATE inventory SET stocks = Stocks - ? WHERE p_id = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, quantity.getText());
            pst.setString(2, pid.getText());
            pst.executeUpdate();
            inventorytable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    private void updateinventorycancel() {
        try {
            String sql = "UPDATE inventory SET Stocks = Stocks + ? WHERE p_id = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, quantity.getText());
            pst.setString(2, pid.getText());
            pst.executeUpdate();
            inventorytable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
private void save_data() {
        model = (DefaultTableModel) order.getModel();
        String category, Pname, Price, Quantity, Total;
        try {
            for (int i = 0; i < order.getRowCount(); i++) {
                category = model.getValueAt(i, 0).toString();
                Pname = model.getValueAt(i, 1).toString();
                Price = model.getValueAt(i, 2).toString();
                Quantity = model.getValueAt(i, 3).toString();
                Total= model.getValueAt(i, 4).toString();
              

                String sql = "INSERT INTO  transaction(category,pname,price,quantity,total)VALUE(?,?,?,?,?)";
                pst = conn.prepareStatement(sql);
                pst.setString(1, category);
                pst.setString(2, Pname);
                pst.setString(3, Price);
                pst.setString(4, Quantity);
                pst.setString(5, Total);
            
                pst.execute();

            }
            JOptionPane.showMessageDialog(null, "Transaction Successful");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }}
