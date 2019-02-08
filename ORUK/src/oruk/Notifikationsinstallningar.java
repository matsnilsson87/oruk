/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oruk;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Laptop
 */
public class Notifikationsinstallningar extends javax.swing.JPanel {

    private final InfDB db;

    /**
     * Creates new form Notifikationsinstallningar2
     */
    public Notifikationsinstallningar(InfDB db) {
        initComponents();
        this.db=db;
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
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox9 = new javax.swing.JCheckBox();
        btnSpara = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox1.setText("Vid varje ny kommentar på ett inlägg jag skrivit");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Jag önskar få notifikationer:");

        jCheckBox2.setText("Vid varje ny kommentar på ett inlägg jag följer");

        jCheckBox3.setText("Vid ny mötesinbjudan");

        jCheckBox4.setText("Vid nytt meddelande");

        jCheckBox5.setText("Vid nya inlägg från en tagg jag följer");

        jCheckBox6.setText("Vid nya inlägg från en blogg jag följer");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Jag önskar få notifikationer via:");

        jCheckBox7.setText("E-post");

        jCheckBox8.setText("SMS");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Stäng av alla notifikationer");

        jCheckBox9.setText("Ja");

        btnSpara.setText("Spara ändringar");
        btnSpara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox6)
                            .addComponent(jLabel1))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addContainerGap(12, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox8)
                                    .addComponent(jCheckBox7)
                                    .addComponent(jLabel3)
                                    .addComponent(jCheckBox9))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSpara)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox8))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox9))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnSpara)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    private void btnMittFlodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMittFlodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMittFlodeActionPerformed

    private void btnMinProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinProfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinProfilActionPerformed

    private void btnMeddelandenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeddelandenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMeddelandenActionPerformed

    private void btnDoodleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoodleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDoodleActionPerformed

    private void btnLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoggaUtActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btnSparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaActionPerformed
    //Skapa SQL frågor för alla notiser.
    
    String AID = "";
    
    try {
        String mailadress = Huvudfonster.getAnvandarnamn(); //Hämta userhelvetet
        AID = db.fetchSingle("SELECT AID FROM ANVANDARE WHERE MAILADRESS = '" + mailadress + "' ");
    
    } catch(InfException ex) {
        System.out.println("Kunde ej hitta AID");
    }
    
    //NID#1, Jag vill ha notiser vid nya mötesinbjudningar
    try {
        String query = db.fetchSingle("SELECT NID FROM ANVANDARE_NOTIS WHERE AID = " + AID + " AND NID = 1;  ");
        System.out.println(query); 
            if(query == null){
                if(jCheckBox1.isSelected()) {
                    db.insert("INSERT INTO ANVANDARE_NOTIS (AID, NID) VALUES (" + AID + ", 1); ");
                }
                    } else {
                        if(!jCheckBox1.isSelected()) {
                            db.delete("DELETE FROM ANVANDARE_NOTIS WHERE AID = " + AID + " AND NID = 1; ");
                        }
                    }     
    } catch(InfException ex) {
        System.out.println("Något gick fel vid hanteringen av den första notisen i listan.");
    }
    
    //NID#2, Jag vill ha notiser vi nya inlägg i informellabloggen
    try {
        String query = db.fetchSingle("SELECT NID FROM ANVANDARE_NOTIS WHERE AID = " + AID + " AND NID = 2;  ");
        System.out.println(query); 
            if(query == null){
                if(jCheckBox2.isSelected()) {
                    db.insert("INSERT INTO ANVANDARE_NOTIS (AID, NID) VALUES (" + AID + ", 2); ");
                }
                    } else {
                        if(!jCheckBox2.isSelected()) {
                            db.delete("DELETE FROM ANVANDARE_NOTIS WHERE AID = " + AID + " AND NID = 2; ");
                        }
                    }     
    } catch(InfException ex) {
        System.out.println("Något gick fel vid hanteringen av den andra notisen i listan.");
    }
    
    //NID#3, Jag vill ha notiser vid ny mötesinbjudan
    try {
        String query = db.fetchSingle("SELECT NID FROM ANVANDARE_NOTIS WHERE AID = " + AID + " AND NID = 3;  ");
        System.out.println(query); 
            if(query == null){
                if(jCheckBox3.isSelected()) {
                    db.insert("INSERT INTO ANVANDARE_NOTIS (AID, NID) VALUES (" + AID + ", 3); ");
                }
                    } else {
                        if(!jCheckBox3.isSelected()) {
                            db.delete("DELETE FROM ANVANDARE_NOTIS WHERE AID = " + AID + " AND NID = 3; ");
                        }
                    }     
    } catch(InfException ex) {
        System.out.println("Något gick fel vid hanteringen av den tredje notisen i listan.");
    }
    
    //NID#4, Jag vill ha notiser vid nytt meddelande
    try {
        String query = db.fetchSingle("SELECT NID FROM ANVANDARE_NOTIS WHERE AID = " + AID + " AND NID = 4;  ");
        System.out.println(query); 
            if(query == null){
                if(jCheckBox4.isSelected()) {
                    db.insert("INSERT INTO ANVANDARE_NOTIS (AID, NID) VALUES (" + AID + ", 4); ");
                }
                    } else {
                        if(!jCheckBox4.isSelected()) {
                            db.delete("DELETE FROM ANVANDARE_NOTIS WHERE AID = " + AID + " AND NID = 4; ");
                        }
                    }     
    } catch(InfException ex) {
        System.out.println("Något gick fel vid hanteringen av den fjärde notisen i listan.");
    }
    
    //NID#5, Jag vill ha notiser vid nya inlägg från tagg jag följer
    try {
        String query = db.fetchSingle("SELECT NID FROM ANVANDARE_NOTIS WHERE AID = " + AID + " AND NID = 5;  ");
        System.out.println(query); 
            if(query == null){
                if(jCheckBox5.isSelected()) {
                    db.insert("INSERT INTO ANVANDARE_NOTIS (AID, NID) VALUES (" + AID + ", 5); ");
                }
                    } else {
                        if(!jCheckBox5.isSelected()) {
                            db.delete("DELETE FROM ANVANDARE_NOTIS WHERE AID = " + AID + " AND NID = 5; ");                           JOptionPane.showMessageDialog(null, "Dina ändringar har sparats.");
                        }
                    }     
    } catch(InfException ex) {
        System.out.println("Något gick fel vid hanteringen av den femte notisen i listan.");
    }
    
    //NID#6, Jag vill ha notiser vid nya inlägg från blogg jag följer
    try {
        String query = db.fetchSingle("SELECT NID FROM ANVANDARE_NOTIS WHERE AID = " + AID + " AND NID = 6;  ");
        System.out.println(query); 
            if(query == null){
                if(jCheckBox6.isSelected()) {
                    db.insert("INSERT INTO ANVANDARE_NOTIS (AID, NID) VALUES (" + AID + ", 6); ");
                }
                    } else {
                        if(!jCheckBox6.isSelected()) {
                            db.delete("DELETE FROM ANVANDARE_NOTIS WHERE AID = " + AID + " AND NID = 6; ");
                        }
                    }     
    } catch(InfException ex) {
        System.out.println("Något gick fel vid hanteringen av den sjätte notisen i listan.");
    }
    JOptionPane.showMessageDialog(null, "Dina ändringar har sparats.");
    }//GEN-LAST:event_btnSparaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSpara;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
