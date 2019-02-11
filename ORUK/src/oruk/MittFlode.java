/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oruk;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Laptop
 */
public class MittFlode extends javax.swing.JPanel {

    /**
     * Creates new form MittFlode1
     */
    public MittFlode(InfDB db) {
        initComponents();
        this.db = db;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFlode = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnFormell = new javax.swing.JButton();
        btnInformell = new javax.swing.JButton();
        btnForskning = new javax.swing.JButton();
        panel_Inlagg = new javax.swing.JPanel();

        panelFlode.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(176, 203, 247));

        btnFormell.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnFormell.setText("Formell blogg");
        btnFormell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormellActionPerformed(evt);
            }
        });

        btnInformell.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnInformell.setText("Informell blogg");
        btnInformell.setPreferredSize(new java.awt.Dimension(230, 40));
        btnInformell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformellActionPerformed(evt);
            }
        });

        btnForskning.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnForskning.setText("Forskning & Utbildning");
        btnForskning.setPreferredSize(new java.awt.Dimension(230, 40));
        btnForskning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForskningActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFormell, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInformell, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnForskning, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFormell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInformell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnForskning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel_Inlagg.setBackground(new java.awt.Color(176, 203, 247));

        javax.swing.GroupLayout panel_InlaggLayout = new javax.swing.GroupLayout(panel_Inlagg);
        panel_Inlagg.setLayout(panel_InlaggLayout);
        panel_InlaggLayout.setHorizontalGroup(
            panel_InlaggLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_InlaggLayout.setVerticalGroup(
            panel_InlaggLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelFlodeLayout = new javax.swing.GroupLayout(panelFlode);
        panelFlode.setLayout(panelFlodeLayout);
        panelFlodeLayout.setHorizontalGroup(
            panelFlodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFlodeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFlodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Inlagg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        panelFlodeLayout.setVerticalGroup(
            panelFlodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFlodeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(panel_Inlagg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFlode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFlode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnForskningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForskningActionPerformed
        
        JPanel importeradPanel = new ForskningUtbildningAnslag(db);
        importeradPanel.setBounds(panel_Inlagg.getBounds());
        panel_Inlagg.removeAll();
        panel_Inlagg.revalidate();
        panel_Inlagg.repaint();
        panel_Inlagg.add(importeradPanel);
        importeradPanel.setLocation(1, 1);     
    }//GEN-LAST:event_btnForskningActionPerformed

    private void btnFormellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormellActionPerformed
        try {
            ArrayList listan = new ArrayList();
            listan = db.fetchColumn("SELECT IID FROM INLAGG");
            
            for (Object inlagg : listan) {
                String rubrik = db.fetchSingle("SELECT RUBRIK FROM INLAGG WHERE IID=" + inlagg + " AND KATEGORI=3");
                String text = db.fetchSingle("SELECT TEXT FROM INLAGG WHERE IID=" + inlagg + " AND KATEGORI=3");
                
                JPanel importeradPanel = new MittFlodeFormell(db, rubrik, text);
                importeradPanel.setBounds(panel_Inlagg.getBounds());

                panel_Inlagg.add(importeradPanel);
                importeradPanel.setLocation(1, 1); 
            }                         
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ex.getMessage());           
        }
    }//GEN-LAST:event_btnFormellActionPerformed

    private void btnInformellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInformellActionPerformed

    private InfDB db;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFormell;
    private javax.swing.JButton btnForskning;
    private javax.swing.JButton btnInformell;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelFlode;
    private javax.swing.JPanel panel_Inlagg;
    // End of variables declaration//GEN-END:variables
}
