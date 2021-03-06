
package oruk;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import oru.inf.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Doodle extends javax.swing.JPanel {

    private static OrukDB db;
    private ArrayList<String> enLista;
    private ArrayList<String> lista1;
    private String motesnamn;
    private String etttid;
    private String tvatid;
    private String tretid;
    private String formatdatum1;
    private String formatdatum2;
    private String formatdatum3;
    private String motesID;
    private String motesnamn2;
    
    public Doodle(OrukDB db) {
        initComponents();
        this.db = db;
        this.enLista = new ArrayList<>();
        this.lista1 = new ArrayList<>();
        fylllista();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMinProfil = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        motesLista = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mRubrik = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        datum1 = new org.jdesktop.swingx.JXDatePicker();
        datum2 = new org.jdesktop.swingx.JXDatePicker();
        datum3 = new org.jdesktop.swingx.JXDatePicker();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tid1 = new javax.swing.JTextField();
        tid2 = new javax.swing.JTextField();
        tid3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mText = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        inbokadeM = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        panelMinProfil.setBackground(new java.awt.Color(255, 255, 255));
        panelMinProfil.setPreferredSize(new java.awt.Dimension(915, 592));

        motesLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                motesListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(motesLista);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Gå vidare");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Mötesinbjudningar");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Rubrik");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Mötesbeskrivning");

        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setText("Skapa mötesförslag");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        datum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datum1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel4.setText("Datum och tid");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel5.setText("Datum och tid");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel6.setText("Datum och tid");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Skapa nytt möte");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setText("Förslag på datum och tid");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setText("YYYY/MM/DD");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel10.setText("HH:MM:SS");

        mText.setLineWrap(true);
        mText.setWrapStyleWord(true);
        mText.setColumns(20);
        mText.setRows(5);
        jScrollPane2.setViewportView(mText);

        inbokadeM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inbokadeMMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(inbokadeM);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Inbokade möten");

        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setText("Visa möte");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMinProfilLayout = new javax.swing.GroupLayout(panelMinProfil);
        panelMinProfil.setLayout(panelMinProfilLayout);
        panelMinProfilLayout.setHorizontalGroup(
            panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMinProfilLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(32, 32, 32)
                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(64, 64, 64)
                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMinProfilLayout.createSequentialGroup()
                        .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(mRubrik)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                        .addGap(79, 79, 79)
                        .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(panelMinProfilLayout.createSequentialGroup()
                                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(datum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(datum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(datum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(29, 29, 29)
                                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10)
                                    .addComponent(tid2, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(tid1)
                                    .addComponent(tid3)))
                            .addComponent(jButton2)))
                    .addComponent(jLabel3))
                .addGap(99, 99, 99))
        );
        panelMinProfilLayout.setVerticalGroup(
            panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMinProfilLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMinProfilLayout.createSequentialGroup()
                        .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)
                            .addComponent(jButton1))
                        .addGap(95, 95, 95))
                    .addGroup(panelMinProfilLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMinProfilLayout.createSequentialGroup()
                                .addComponent(mRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3))
                            .addGroup(panelMinProfilLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10))))
                        .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMinProfilLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tid1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(datum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(16, 16, 16)
                                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(datum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tid2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(datum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tid3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMinProfilLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMinProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 1058, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMinProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void datum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datum1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String MID = "";
        String formatdatum11 = "";
        String formatdatum22 = "";
        String formatdatum33 = "";
        try{
            MID = db.getAutoIncrement("MOTE", "MID");
            String aid = db.fetchSingle("SELECT AID FROM ANVANDARE WHERE MAILADRESS = '"+Huvudfonster.getAnvandarnamn()+"'");
            db.insert("INSERT INTO MOTE VALUES ("+MID+", '"+mRubrik.getText()+"', '"+mText.getText()+"', "+aid+", null, null)");
            JOptionPane.showMessageDialog(null, "Mötet har skapats");
            DateFormat formatDatum = new SimpleDateFormat("yyyy-MM-dd");
            formatdatum11 = formatDatum.format(datum1.getDate());
            formatdatum22 = formatDatum.format(datum2.getDate());
            formatdatum33 = formatDatum.format(datum3.getDate());
            this.formatdatum1 = formatdatum11;
            this.formatdatum2 = formatdatum22;
            this.formatdatum3 = formatdatum33;
            this.motesID = MID;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        this.etttid = tid1.getText();
        this.tvatid = tid2.getText();
        this.tretid = tid3.getText();
        try{
            new Inbjudningar(db, MID, etttid, tvatid, tretid, this.formatdatum1, this.formatdatum2, this.formatdatum3, this.motesID).setVisible(true);
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new DoodleFrame(db, motesnamn).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void motesListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_motesListaMouseClicked
        this.motesnamn = motesLista.getSelectedValue();
    }//GEN-LAST:event_motesListaMouseClicked

    private void inbokadeMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inbokadeMMouseClicked
        this.motesnamn2 = inbokadeM.getSelectedValue();
    }//GEN-LAST:event_inbokadeMMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String MID = "";
        String datum = "";
        String tid = "";
        String organisator1 = "";
        String organisator2 = "";
        try{
            MID = db.fetchSingle("SELECT MID FROM MOTE WHERE RUBRIK = '"+motesnamn2+"'");
            datum = db.fetchSingle("SELECT DATUM FROM MOTE WHERE MID ="+MID);
            tid = db.fetchSingle("SELECT TID FROM MOTE WHERE MID ="+MID);
            organisator1 = db.fetchSingle("SELECT FORNAMN FROM ANVANDARE JOIN MOTE ON ANVANDARE.AID = MOTE.ORGANISATOR AND MOTE.MID ="+MID);
            organisator2 = db.fetchSingle("SELECT EFTERNAMN FROM ANVANDARE JOIN MOTE ON ANVANDARE.AID = MOTE.ORGANISATOR AND MOTE.MID ="+MID);
        }
        catch(InfException e){
            
        }
        JOptionPane.showMessageDialog(null, "Mötestid: "+datum + " " + tid + "\nOrganisatör: " + organisator1 + " " + organisator2, motesnamn2, 3, null);
    }//GEN-LAST:event_jButton3ActionPerformed

    public void fylllista(){
         DefaultListModel model = new DefaultListModel();
         DefaultListModel model1 = new DefaultListModel();
        ArrayList<String> enLista = null;
        String AID = "";
        ArrayList<String> enLista2 = null;
        try{
            AID = db.fetchSingle("SELECT AID FROM ANVANDARE WHERE MAILADRESS = '"+Huvudfonster.getAnvandarnamn()+"'");
            enLista = db.fetchColumn("SELECT DISTINCT RUBRIK FROM MOTE JOIN MOTE_FORFRAGA ON MOTE_FORFRAGA.MID = MOTE.MID WHERE MOTE_FORFRAGA.AID ="+AID);
            }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        try {
            String svar = "";
            for (int i = 0; i < enLista.size(); i++) {
                svar = enLista.get(i);
                model.addElement(svar);
            }
            
            motesLista.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Du har inga aktuella möten");
        }
        
        try{
             ArrayList<String> listan = db.fetchColumn("SELECT MOTE.RUBRIK FROM MOTE\n"
                                    + "JOIN MOTE_DELTAGANDE ON MOTE.MID=MOTE_DELTAGANDE.MID\n"
                                    + "WHERE AID='" + AID + "'");
             String svar = "";
             for(int i = 0; i < listan.size(); i++){
                 svar = listan.get(i);
                 model1.addElement(svar);
             }
             inbokadeM.setModel(model1);
        }
        catch(Exception e){
        }

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker datum1;
    private org.jdesktop.swingx.JXDatePicker datum2;
    private org.jdesktop.swingx.JXDatePicker datum3;
    private javax.swing.JList<String> inbokadeM;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField mRubrik;
    private javax.swing.JTextArea mText;
    private javax.swing.JList<String> motesLista;
    private javax.swing.JPanel panelMinProfil;
    private javax.swing.JTextField tid1;
    private javax.swing.JTextField tid2;
    private javax.swing.JTextField tid3;
    // End of variables declaration//GEN-END:variables
}
