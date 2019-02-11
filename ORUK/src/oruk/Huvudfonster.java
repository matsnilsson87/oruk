/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oruk;

import com.apple.eawt.Application;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Laptop
 */
public class Huvudfonster extends javax.swing.JFrame {

    private static InfDB db;
    private static String anvandarnamn;

    /**
     * Creates new form Huvudfönster
     */
    public Huvudfonster(InfDB db, String anvandarnamn) {
        initComponents();
        this.db = db;
        this.anvandarnamn = anvandarnamn;
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setThisTitle();
        Application application = Application.getApplication();
        application.setDockIconImage(Toolkit.getDefaultToolkit().getImage("icons/oruklogoliten.png"));
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("icons\\oruklogoliten.png"));
        setValkomstText();
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
        btnMittFlode = new javax.swing.JButton();
        btnMinProfil = new javax.swing.JButton();
        btnMeddelanden = new javax.swing.JButton();
        btnDoodle = new javax.swing.JButton();
        btnLoggaUt = new javax.swing.JButton();
        panelMain = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSkrivInlagg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        btnMittFlode.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnMittFlode.setText("Mitt flöde");
        btnMittFlode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMittFlodeActionPerformed(evt);
            }
        });

        btnMinProfil.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnMinProfil.setText("Min profil");
        btnMinProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinProfilActionPerformed(evt);
            }
        });

        btnMeddelanden.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnMeddelanden.setText("Meddelanden");
        btnMeddelanden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeddelandenActionPerformed(evt);
            }
        });

        btnDoodle.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDoodle.setText("Doodle");
        btnDoodle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoodleActionPerformed(evt);
            }
        });

        btnLoggaUt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLoggaUt.setText("Logga ut");
        btnLoggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaUtActionPerformed(evt);
            }
        });

        panelMain.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(714, Short.MAX_VALUE))
        );

        btnSkrivInlagg.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSkrivInlagg.setText("Skriv inlägg");
        btnSkrivInlagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkrivInlaggActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMittFlode, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMinProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMeddelanden, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDoodle, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLoggaUt, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSkrivInlagg, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 47, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMinProfil)
                    .addComponent(btnMittFlode)
                    .addComponent(btnMeddelanden)
                    .addComponent(btnDoodle)
                    .addComponent(btnLoggaUt)
                    .addComponent(btnSkrivInlagg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMittFlodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMittFlodeActionPerformed
        // TODO add your handling code here:
        JPanel importeradPanel = new MittFlode(db);
        importeradPanel.setBounds(panelMain.getBounds());

        panelMain.removeAll();
        panelMain.revalidate();
        panelMain.repaint();
        panelMain.add(importeradPanel);
        importeradPanel.setLocation(1, 1);
    }//GEN-LAST:event_btnMittFlodeActionPerformed

    private void btnMinProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinProfilActionPerformed
        // TODO add your handling code here:
        JPanel importeradPanel = new MinProfil(db);
        importeradPanel.setBounds(panelMain.getBounds());

        panelMain.removeAll();
        panelMain.revalidate();
        panelMain.repaint();
        panelMain.add(importeradPanel);
        importeradPanel.setLocation(1, 1);
    }//GEN-LAST:event_btnMinProfilActionPerformed

    private void btnMeddelandenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeddelandenActionPerformed

    }//GEN-LAST:event_btnMeddelandenActionPerformed

    public static String getAnvandarnamn() {
        return anvandarnamn;
    }

    private void btnDoodleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoodleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDoodleActionPerformed

    private void btnLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUtActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Vill du logga ut??", "Logga ut",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
     if (response == JOptionPane.NO_OPTION) {

    } else if (response == JOptionPane.YES_OPTION) {
        dispose();
        new LoggaIn(db).setVisible(true);
      }
    }//GEN-LAST:event_btnLoggaUtActionPerformed

    private void btnSkrivInlaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkrivInlaggActionPerformed
        SkapaInlagg skapaInlagg = new SkapaInlagg(db);
        skapaInlagg.setVisible(true);
        
    }//GEN-LAST:event_btnSkrivInlaggActionPerformed

    //Metod för att sätta text i huvudet på fönstret 
    private void setThisTitle() {
        try {
            String fornamn = db.fetchSingle("SELECT FORNAMN FROM ANVANDARE WHERE MAILADRESS='" + anvandarnamn + "'");
            String efternamn = db.fetchSingle("SELECT EFTERNAMN FROM ANVANDARE WHERE MAILADRESS='" + anvandarnamn + "'");
            setTitle("ORUK - Inloggad som " + fornamn + " " + efternamn);

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }

    private void setValkomstText() {
        try {
            String fornamn = db.fetchSingle("SELECT FORNAMN FROM ANVANDARE WHERE MAILADRESS='" + anvandarnamn + "'");
            String efternamn = db.fetchSingle("SELECT EFTERNAMN FROM ANVANDARE WHERE MAILADRESS='" + anvandarnamn + "'");
            jLabel1.setText("Du är nu inloggad som " + fornamn + " " + efternamn + ", Välkommen!");

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoodle;
    private javax.swing.JButton btnLoggaUt;
    private javax.swing.JButton btnMeddelanden;
    private javax.swing.JButton btnMinProfil;
    private javax.swing.JButton btnMittFlode;
    private javax.swing.JButton btnSkrivInlagg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelMain;
    // End of variables declaration//GEN-END:variables
}
