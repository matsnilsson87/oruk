/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oruk;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/**
 *
 * @author christianrudolphi
 */
public class AdminAndraInlagg2 extends javax.swing.JFrame {

    private final OrukDB db;
    private final String titel;

    /**
     * Creates new form AdminAndraInlagg2
     */
    public AdminAndraInlagg2(OrukDB db, String titel) {
        initComponents();
        this.db=db;
        this.titel=titel;
        fylllista();
    }
    
    private void fylllista() {
        try {
            String rubrik = db.fetchSingle("SELECT RUBRIK FROM INLAGG WHERE IID=(SELECT IID FROM INLAGG WHERE RUBRIK='" + titel + "')");
            String inlagg = db.fetchSingle("SELECT TEXT FROM INLAGG WHERE IID=(SELECT IID FROM INLAGG WHERE RUBRIK='" + titel + "')");
            txtRubrik.setText(rubrik);
            txtInlagg.setText(inlagg);
            
            
            
            ArrayList<String> lista = db.fetchColumn("SELECT NAMN FROM KATEGORI");
            for (int i = 0; i < lista.size(); i++) {
                kategori.addItem(lista.get(i));
            }
        } catch (InfException e) {
        }
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
        btnAndra = new javax.swing.JButton();
        skrr = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInlagg = new javax.swing.JTextArea();
        txtRubrik = new javax.swing.JTextField();
        kategori = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnAndra.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAndra.setText("Ändra inlägg");
        btnAndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraActionPerformed(evt);
            }
        });

        txtInlagg.setLineWrap(true);
        txtInlagg.setWrapStyleWord(true);
        txtInlagg.setColumns(20);
        txtInlagg.setRows(5);
        txtInlagg.setText("\n");
        jScrollPane1.setViewportView(txtInlagg);

        txtRubrik.setBackground(new java.awt.Color(203, 217, 241));
        txtRubrik.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(skrr, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(btnAndra, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(skrr, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnAndra)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraActionPerformed
        try
        {
            String rubrik = txtRubrik.getText();
            String text = txtInlagg.getText();
            String kategori2 = (String) kategori.getSelectedItem();
            String kID = db.fetchSingle("SELECT KID FROM KATEGORI WHERE NAMN = '" + kategori2 + "'");

            String andraData = "UPDATE INLAGG SET RUBRIK='" + rubrik + "', TEXT='" + text + "', KATEGORI='" + kID + "' WHERE IID=(SELECT IID FROM INLAGG WHERE RUBRIK='" + titel + "')";
            db.update(andraData);

            JOptionPane.showMessageDialog(null, "Inlägget har ändrats");
            

        } catch(InfException e)
        {}

    }//GEN-LAST:event_btnAndraActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton btnAndra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kategori;
    private javax.swing.JLabel skrr;
    private javax.swing.JTextArea txtInlagg;
    private javax.swing.JTextField txtRubrik;
    // End of variables declaration//GEN-END:variables
}
