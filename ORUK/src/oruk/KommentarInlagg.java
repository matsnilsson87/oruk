/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oruk;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author christianrudolphi
 */
public class KommentarInlagg extends javax.swing.JFrame {
    
    private InfDB db;
    private String titel;
   

    /**
     * Creates new form KommentarInlagg
     */
    public KommentarInlagg(InfDB db, String titel) {
        initComponents();
        this.db=db;
        this.titel=titel;
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
        btnPublicera = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInlagg = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnPublicera.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPublicera.setText("Kommentera");
        btnPublicera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPubliceraMouseClicked(evt);
            }
        });
        btnPublicera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPubliceraActionPerformed(evt);
            }
        });

        txtInlagg.setLineWrap(true);
        txtInlagg.setWrapStyleWord(true);
        txtInlagg.setColumns(20);
        txtInlagg.setRows(5);
        txtInlagg.setText("\n");
        jScrollPane2.setViewportView(txtInlagg);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPublicera, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPublicera)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPubliceraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPubliceraActionPerformed
        try {
            String anvandare = Huvudfonster.getAnvandarnamn(); 
            String aid = "SELECT AID FROM ANVANDARE WHERE MAILADRESS='" + anvandare + "'";
            String aid1 = db.fetchSingle(aid);
            String text = txtInlagg.getText();
            String id1 = db.getAutoIncrement("KOMMENTERA_INLAGG", "KIID");
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();           
            String date = now.toString().substring(0,10);
            String time = now.toString().substring(11,19);
            System.out.println(anvandare);
            System.out.println(aid1);
            System.out.println(id1);
            System.out.println(date);
            System.out.println(time);
            System.out.println(text);
            System.out.println(titel);
            
            String enStrang = "INSERT INTO KOMMENTERA_INLAGG VALUES(" + id1 + ", '" + text + "', '" + date + "', '" + time + "', " + aid1 + ", (SELECT IID FROM INLAGG WHERE RUBRIK='" + titel + "'))";
            db.insert(enStrang);
            
            
            
        } catch (InfException ex) {
            
        }

    }//GEN-LAST:event_btnPubliceraActionPerformed

    private void btnPubliceraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPubliceraMouseClicked
        Forsk.fyllLista();
        dispose();
        
    }//GEN-LAST:event_btnPubliceraMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPublicera;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtInlagg;
    // End of variables declaration//GEN-END:variables
}
