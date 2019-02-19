/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//Att lägga till: 
//1. Om man vill stänga av alla notiser.
//2. Hur man vill ha notiser (bara Email..)

package oruk;

import javax.swing.JOptionPane;

import oru.inf.InfException;

/**
 *
 * @author Laptop
 */
public class Notifikationsinstallningar extends javax.swing.JPanel {

    private final OrukDB db;

    /**
     * Creates new form Notifikationsinstallningar2
     */
    public Notifikationsinstallningar(OrukDB db) {
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
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        cbEmail = new javax.swing.JCheckBox();
        cbSMS = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        btnSpara = new javax.swing.JButton();
        taBortNotsier = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox1.setText("Vid nya inlägg i det formella flödet");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Jag önskar få notifikationer:");

        jCheckBox3.setText("Vid ny mötesinbjudan");

        jCheckBox6.setText("Vid nya inlägg i det informella flödet");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Jag önskar få notifikationer via:");

        cbEmail.setText("E-post");
        cbEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEmailActionPerformed(evt);
            }
        });

        cbSMS.setText("SMS");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Stäng av alla notifikationer");

        btnSpara.setText("Spara ändringar");
        btnSpara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaActionPerformed(evt);
            }
        });

        taBortNotsier.setText("OK");
        taBortNotsier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortNotsierActionPerformed(evt);
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
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox6)
                            .addComponent(jLabel1))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addContainerGap(12, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbSMS)
                                    .addComponent(cbEmail)
                                    .addComponent(jLabel3)
                                    .addComponent(taBortNotsier))
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
                    .addComponent(cbEmail))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSMS)
                    .addComponent(jCheckBox6))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox3)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(taBortNotsier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
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
        System.out.println(mailadress);
        AID = db.fetchSingle("SELECT AID FROM ANVANDARE WHERE MAILADRESS = '" + mailadress + "' ");
        System.out.println(AID);
    
    } catch(InfException ex) {
        System.out.println("Kunde ej hitta AID");
    }
    
    //NID#1, Jag vill ha notiser vid nya inlägg i det formella flödet
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
    
    //NID#3, Jag vill ha notiser vid nya mötesinbjudningar
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
    
    //NID#6, Jag vill ha notiser vid nya inlägg i det informella flödet
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
        JOptionPane.showMessageDialog(null, ex.getMessage());
        System.out.println("Något gick fel vid hanteringen av den sjätte notisen i listan.");
    }
    
    if(cbEmail.isSelected()) {
        updateEmail("JA");
    } else {
        updateEmail("NEJ");
    }
    
    if(cbSMS.isSelected()) {
        updateSMS("JA");
    } else {
        updateSMS("NEJ");
    }
    
    JOptionPane.showMessageDialog(null, "Dina ändringar har sparats.");
    }//GEN-LAST:event_btnSparaActionPerformed

    private void cbEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEmailActionPerformed

    private void taBortNotsierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortNotsierActionPerformed
        
        try {
            String AID = db.fetchSingle("SELECT AID FROM ANVANDARE WHERE MAILADRESS = '"+Huvudfonster.getAnvandarnamn()+"' ");
            db.delete("DELETE FROM ANVANDARE_NOTIS WHERE AID = "+AID+" ");
            JOptionPane.showMessageDialog(null, "Dina ändringar har sparats.");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Kontrollera din inmatning.");
        }
    }//GEN-LAST:event_taBortNotsierActionPerformed

    
    private void updateEmail(String bamboozle) {
        String AID = "";
        String arDenNull = null;
        
        
        try {
            AID = db.fetchSingle("SELECT AID FROM ANVANDARE WHERE MAILADRESS = '"+Huvudfonster.getAnvandarnamn()+"' ");
            System.out.println(AID);
            arDenNull = db.fetchSingle("SELECT AID FROM NOTIS_EMAIL_SMS WHERE AID = "+AID+" ");
            System.out.println(arDenNull);
            
            if(arDenNull == null ) {
                db.insert("INSERT INTO NOTIS_EMAIL_SMS (AID, EMAIL) VALUES ("+AID+", '"+bamboozle+"') ");
            } else {
                db.update("UPDATE NOTIS_EMAIL_SMS SET EMAIL = '"+bamboozle+"' WHERE AID = "+AID+" "); 
            }
                 
        } catch(InfException e ) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void updateSMS(String bamboozle2) { //Kommer efter email
        String AID = "";
        
        try {
            AID = db.fetchSingle("SELECT AID FROM ANVANDARE WHERE MAILADRESS = '"+Huvudfonster.getAnvandarnamn()+"' ");
            db.update("UPDATE NOTIS_EMAIL_SMS SET SMS = '"+bamboozle2+"' WHERE AID = "+AID+" ");
            
        } catch(InfException e ) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSpara;
    private javax.swing.JCheckBox cbEmail;
    private javax.swing.JCheckBox cbSMS;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton taBortNotsier;
    // End of variables declaration//GEN-END:variables
}
