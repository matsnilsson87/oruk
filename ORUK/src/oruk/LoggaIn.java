package oruk;

import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import oru.inf.*;
import javax.swing.*;
import java.util.*;


public class LoggaIn extends javax.swing.JFrame {

    private static InfDB db;
    private ArrayList<String> lista;

    public LoggaIn(InfDB db) {
        initComponents();
        this.db = db;
        fyllAnvandarnamnsLista();
        setTitle("ORUK - Logga in");
        this.lista = new ArrayList<>();
        
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
        btnClose = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        losenord = new javax.swing.JPasswordField();
        lblAnvandarnamn = new javax.swing.JLabel();
        lblLosenord = new javax.swing.JLabel();
        btnLoggaIn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbxAnvandarnamn = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(47, 92, 168));

        btnClose.setText("X");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        losenord.setBackground(new java.awt.Color(176, 203, 247));
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

        btnLoggaIn.setBackground(new java.awt.Color(49, 100, 184));
        btnLoggaIn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLoggaIn.setText("Logga in");
        btnLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInActionPerformed(evt);
            }
        });

        cmbxAnvandarnamn.setEditable(true);
        cmbxAnvandarnamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxAnvandarnamnActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oruk/icons/oruklogostorre.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cmbxAnvandarnamn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLosenord)
                        .addComponent(lblAnvandarnamn)
                        .addComponent(losenord, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                        .addComponent(btnLoggaIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jLabel1))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addComponent(lblAnvandarnamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbxAnvandarnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblLosenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(losenord, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnLoggaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnClose))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnClose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseActionPerformed

    //Gör att btnLoggIn blir klickad om man trycker enter medan fokus är i lösenordstextfältet
    private void losenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_losenordActionPerformed
        btnLoggaIn.doClick();
    }//GEN-LAST:event_losenordActionPerformed

    private void btnLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInActionPerformed
        Crypto crypto = new BasicEncrypt();
        String losen = losenord.getText();
        String enc = new String(crypto.encrypt(losen.getBytes()));
        String dec = new String(crypto.decrypt(enc.getBytes()));
        String anv = (String) cmbxAnvandarnamn.getSelectedItem();
        byte[] bytes = null;
        
        try{
           lista = db.fetchColumn("SELECT LOSENORD FROM ANVANDARE WHERE MAILADRESS = '" + anv + "'");
        }  catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Användaren finns ej");
        }
        
        try{
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DataOutputStream out = new DataOutputStream(baos);
          for (String element : lista) {
             out.writeUTF(element);
             }
           bytes = baos.toByteArray();
           for(int i = 0; i < bytes.length; i++){
               String str = new String(crypto.encrypt(bytes));
               if(str.contains(enc)){
                   new Huvudfonster(db, anv).setVisible(true);
                   break;
               }
               else{
                   JOptionPane.showMessageDialog(null, "Fel lösenord!");
               }
           }
        }
        catch(IOException ex){
           JOptionPane.showConfirmDialog(null, "Hoppla!");
         } 
    }//GEN-LAST:event_btnLoggaInActionPerformed

    //Metod som gör så att rutan blir tom när fokus ges
    private void losenordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_losenordFocusGained
        losenord.setText("");
    }//GEN-LAST:event_losenordFocusGained

    //Metod som gör att fokus ges till lösenordstextrutan om man trycker enter i användarnamnsrutan
    private void cmbxAnvandarnamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxAnvandarnamnActionPerformed
        losenord.requestFocus();
    }//GEN-LAST:event_cmbxAnvandarnamnActionPerformed

    //Metod som körs i konstruktorn för att fylla JComboBoxen med användarnamn
    private void fyllAnvandarnamnsLista() {        
        try {
            ArrayList listan = new ArrayList();
            listan = db.fetchColumn("SELECT MAILADRESS FROM ANVANDARE");

            for (Object mailadress : listan) {
                String anvandare = mailadress.toString();
                cmbxAnvandarnamn.addItem(anvandare);
            }
            cmbxAnvandarnamn.setSelectedIndex(-1);
            lblAnvandarnamn.requestFocus();
            losenord.setText("SkrivLösenord");
            
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ex.getMessage());
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnLoggaIn;
    private javax.swing.JComboBox<String> cmbxAnvandarnamn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAnvandarnamn;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JPasswordField losenord;
    // End of variables declaration//GEN-END:variables
}
