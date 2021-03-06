package oruk;

import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import oru.inf.*;
import javax.swing.*;
import java.util.*;

public class LoggaIn extends javax.swing.JFrame {

    private static OrukDB db;
    private ArrayList<String> lista;

    public LoggaIn(OrukDB db) {
        initComponents();
        this.db = db;
        ComboBoxAutoComplete.enable(cmbxAnvandarnamn);
        fyllCmbxAnvandarnamn();
        setTitle("ORUK - Logga in");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("icons\\oruklogoliten.png"));
        this.setLocationRelativeTo(null);
        btnLoggaInOnline.setVisible(false);
        txtFldIpAdress.setVisible(false);
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
        jPanel1 = new javax.swing.JPanel();
        losenord = new javax.swing.JPasswordField();
        lblAnvandarnamn = new javax.swing.JLabel();
        lblLosenord = new javax.swing.JLabel();
        btnLoggaIn = new javax.swing.JButton();
        lblIcon = new javax.swing.JLabel();
        cmbxAnvandarnamn = new javax.swing.JComboBox<>();
        txtFldIpAdress = new javax.swing.JTextField();
        btnLoggaInOnline = new javax.swing.JButton();
        btnAndraInloggsTyp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        losenord.setBackground(new java.awt.Color(204, 204, 204));
        losenord.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        losenord.setText("qwerty12345");
        losenord.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                losenordFocusGained(evt);
            }
        });
        losenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                losenordActionPerformed(evt);
            }
        });

        lblAnvandarnamn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAnvandarnamn.setText("Användarnamn:");

        lblLosenord.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblLosenord.setText("Lösenord:");

        btnLoggaIn.setBackground(new java.awt.Color(204, 204, 204));
        btnLoggaIn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLoggaIn.setText("Logga in");
        btnLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInActionPerformed(evt);
            }
        });

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oruk/icons/oruklogostorre.png"))); // NOI18N

        cmbxAnvandarnamn.setEditable(true);

        txtFldIpAdress.setText("217.175.124.38");
        txtFldIpAdress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFldIpAdressFocusGained(evt);
            }
        });
        txtFldIpAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldIpAdressActionPerformed(evt);
            }
        });

        btnLoggaInOnline.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLoggaInOnline.setText("Anslut till IP");
        btnLoggaInOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInOnlineActionPerformed(evt);
            }
        });

        btnAndraInloggsTyp.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        btnAndraInloggsTyp.setText("Avancerad inlogging");
        btnAndraInloggsTyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraInloggsTypActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLoggaInOnline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFldIpAdress)
                            .addComponent(cmbxAnvandarnamn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                            .addComponent(lblLosenord)
                            .addComponent(lblAnvandarnamn)
                            .addComponent(losenord)
                            .addComponent(btnLoggaIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(btnAndraInloggsTyp, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblAnvandarnamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbxAnvandarnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblLosenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(losenord, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnLoggaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFldIpAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnLoggaInOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(btnAndraInloggsTyp, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInActionPerformed
        Crypto crypto = new BasicEncrypt();
        String losen = losenord.getText();
        String enc = new String(crypto.encrypt(losen.getBytes()));
        String dec = new String(crypto.decrypt(enc.getBytes()));
        String anv = (String) cmbxAnvandarnamn.getSelectedItem();
        byte[] bytes = null;

        try {
            lista = db.fetchColumn("SELECT LOSENORD FROM ANVANDARE WHERE MAILADRESS = '" + anv + "'");
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "bläbläbläblä");
        }

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DataOutputStream out = new DataOutputStream(baos);
            for (String element : lista) {
                out.writeUTF(element);

            }
            bytes = baos.toByteArray();
            for (int i = 0; i < bytes.length; i++) {
                String str = new String(crypto.encrypt(bytes));

                if (str.trim().equals(enc)) {
                    dispose();
                    new Huvudfonster(db, anv).setVisible(true);

                    break;

                } else {
                    JOptionPane.showMessageDialog(null, "Fel lösenord!");
                    break;
                }
            }
        } catch (IOException ex) {
            JOptionPane.showConfirmDialog(null, "Hoppla!");
        }
    }//GEN-LAST:event_btnLoggaInActionPerformed

    //Gör att btnLoggIn blir klickad om man trycker enter medan fokus är i lösenordstextfältet
    private void losenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_losenordActionPerformed
        btnLoggaIn.doClick();
    }//GEN-LAST:event_losenordActionPerformed

    //Metod som gör så att rutan blir tom när fokus ges
    private void losenordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_losenordFocusGained
        losenord.setText("");
    }//GEN-LAST:event_losenordFocusGained

    private void cmbxAnvandarnamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxAnvandarnamnActionPerformed
        //
    }//GEN-LAST:event_cmbxAnvandarnamnActionPerformed

    private void btnAndraInloggsTypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraInloggsTypActionPerformed
        if (btnLoggaIn.isVisible()) {
            btnAndraInloggsTyp.setText("Vanlig inloggning");
            btnLoggaInOnline.setVisible(true);
            txtFldIpAdress.setVisible(true);
            btnLoggaIn.setVisible(false);
        } else {
            btnAndraInloggsTyp.setText("Avancerad inloggning");
            btnLoggaInOnline.setVisible(false);
            txtFldIpAdress.setVisible(false);
            btnLoggaIn.setVisible(true);
        }
    }//GEN-LAST:event_btnAndraInloggsTypActionPerformed

    private void txtFldIpAdressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFldIpAdressFocusGained
        txtFldIpAdress.setText("");
    }//GEN-LAST:event_txtFldIpAdressFocusGained

    private void btnLoggaInOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInOnlineActionPerformed
        String nyIP = txtFldIpAdress.getText();
        db = new OrukDB(nyIP);
        this.dispose();
        new LoggaIn(db).setVisible(true);

    }//GEN-LAST:event_btnLoggaInOnlineActionPerformed

    private void txtFldIpAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldIpAdressActionPerformed
        btnLoggaInOnline.doClick();
    }//GEN-LAST:event_txtFldIpAdressActionPerformed

    //Metod som körs i konstruktorn för att fylla JComboBoxen med användarnamn
    private void fyllCmbxAnvandarnamn() {
        try {
            ArrayList listan = new ArrayList();
            listan = db.fetchColumn("SELECT MAILADRESS FROM ANVANDARE");
            ArrayList<String> allaAnvandare = new ArrayList<>();

            for (Object mailadress : listan) {
                String anvandare = mailadress.toString();
                allaAnvandare.add(anvandare);
            }
            allaAnvandare.sort(String::compareToIgnoreCase);

            for (String namn : allaAnvandare) {
                cmbxAnvandarnamn.addItem(namn);
            }
            cmbxAnvandarnamn.setSelectedIndex(-1);

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Knas med anslutningen");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraInloggsTyp;
    private javax.swing.JButton btnLoggaIn;
    private javax.swing.JButton btnLoggaInOnline;
    private javax.swing.JComboBox<String> cmbxAnvandarnamn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAnvandarnamn;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JPasswordField losenord;
    private javax.swing.JTextField txtFldIpAdress;
    // End of variables declaration//GEN-END:variables
}
