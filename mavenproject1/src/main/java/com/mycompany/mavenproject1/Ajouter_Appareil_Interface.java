package com.mycompany.mavenproject1;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Farid
 */
public class Ajouter_Appareil_Interface extends javax.swing.JFrame {
       Database_cnx cnx = new Database_cnx(); // connexion a la base de donnée
    /**
     * Creates new form Ajouter_Appareil_Interface
     */
    public Ajouter_Appareil_Interface() {
       initComponents();
       // Les requetes SQL qui recuperent de la base de donnée les informations
       String insertLocal = "select nom_local FROM local"; 
       String insertSalle = "select nom_salle FROM salle";
       String insertOS = "select nom_OS FROM os";
       
        try {
          // Creation des Statements
          Statement stmt1 = cnx.connection().createStatement(); 
          Statement stmt2 = cnx.connection().createStatement();
          Statement stmt3 = cnx.connection().createStatement();
          // L'execution des query et l'insertion des resultat dans ResultSet
          ResultSet rsetLocal = stmt1.executeQuery(insertLocal);
          ResultSet rsetSalle = stmt2.executeQuery(insertSalle);
          ResultSet rsetOS = stmt3.executeQuery(insertOS);
      
           try {
            while(rsetLocal.next())
            {
                // Tant qu'il y a des valeurs on les ajoute dans comboBox
                LocalCombo.addItem(rsetLocal.getString("nom_local")); 
            } 
            
            while(rsetSalle.next())
            {
             
                SalleCombo.addItem(rsetSalle.getString("nom_salle"));
            } 
            
            while(rsetOS.next())
            {
             
                OSCombo.addItem(rsetOS.getString("nom_OS"));
            }
            
            
            /** on ferme la connexion */ 
            cnx.connection().close();

        } catch (SQLException ex) {
            System.out.println("Problème");
         //   Logger.getLogger(Prets.class.getName()).log(Level.SEVERE, null, ex);
        } //catch (ClassNotFoundException ex) {
         //   Logger.getLogger(Prets.class.getName()).log(Level.SEVERE, null, ex);
       // }
    }
    catch ( SQLException err ) {
    System.out.println( err.getMessage( ) );
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Nom = new javax.swing.JTextField();
        MAC = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Type = new javax.swing.JLabel();
        CategorieCombo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        LabelOS = new javax.swing.JLabel();
        OSCombo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        StatutCombo = new javax.swing.JComboBox();
        LocalCombo = new javax.swing.JComboBox();
        SalleCombo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Ajout d'un appareil");

        Nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomActionPerformed(evt);
            }
        });

        MAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MACActionPerformed(evt);
            }
        });

        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nom");

        jLabel3.setText("Adresse MAC");

        Type.setText("Categorie");

        CategorieCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PC", "Portable", "Tablette", "Routeur", "Switch" }));

        jLabel4.setText("Emplacement Géographique");

        LabelOS.setText("System d'exploitation");

        OSCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OSComboActionPerformed(evt);
            }
        });

        jLabel5.setText("Statut");

        StatutCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ON", "OFF" }));
        StatutCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatutComboActionPerformed(evt);
            }
        });

        jLabel6.setText("Local");

        jLabel7.setText("Salle");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(LabelOS)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StatutCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OSCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LocalCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SalleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(Type)
                                    .addComponent(jLabel2))
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CategorieCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MAC, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(65, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel7)
                        .addGap(79, 79, 79))))
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Type)
                    .addComponent(CategorieCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MAC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(LocalCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelOS, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OSCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(StatutCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomActionPerformed

    private void MACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MACActionPerformed
           // TODO add your handling code here:
    }//GEN-LAST:event_MACActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Statement statement = null; 
        int status = 0;
        int idSalle =0;
        int idOS=0;
        String Name;
        String adresse_MAC;
        String categorie;
        String statut;
        String nomsalle;
        String nomOS;
        Statement stmt4 = null;
        Statement stmt5 = null;
        
        try {
            statement = cnx.connection().createStatement();
            System.out.println("connected");
        } catch (SQLException ex) {
            Logger.getLogger(Ajouter_Appareil_Interface.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println("not connected");
        }
        Name = Nom.getText();
        adresse_MAC = MAC.getText();
        categorie =(String) CategorieCombo.getSelectedItem();
        statut = (String) StatutCombo.getSelectedItem();
        nomsalle= (String) SalleCombo.getSelectedItem();
        nomOS= (String) OSCombo.getSelectedItem();
        
        String idsalle = "SELECT id_salle FROM salle WHERE nom_salle='"+nomsalle+"'";
        String idos = "SELECT id_OS FROM os WHERE nom_OS='"+nomOS+"'";
        
       
         try {
               stmt5 = cnx.connection().createStatement();
           } catch (SQLException ex) {
               Logger.getLogger(Ajouter_Appareil_Interface.class.getName()).log(Level.SEVERE, null, ex);
           }
           try {
               ResultSet RidOS = stmt5.executeQuery(idos);
               while(RidOS.next()){
               idOS =  RidOS.getInt(1);
               }
             
               System.out.println(idSalle);
           } catch (SQLException ex) {
               Logger.getLogger(Ajouter_Appareil_Interface.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           try {
               stmt4 = cnx.connection().createStatement();
           } catch (SQLException ex) {
               Logger.getLogger(Ajouter_Appareil_Interface.class.getName()).log(Level.SEVERE, null, ex);
           }
           try {
               ResultSet RidSalle = stmt4.executeQuery(idsalle);
               while(RidSalle.next()){
               idSalle =  RidSalle.getInt(1);
               }
              // System.out.println(RidSalle); 
               System.out.println(idSalle);
           } catch (SQLException ex) {
               Logger.getLogger(Ajouter_Appareil_Interface.class.getName()).log(Level.SEVERE, null, ex);
           }
     
        
       // System.out.println((String)valeur);      
        Equipement e = new Equipement(0,categorie,statut,adresse_MAC,Name);
        if (e.getstatut().equals("OFF"))
            status = 0;
        else
            status = 1;
        try {
            statement.executeUpdate("INSERT INTO equipement " + "VALUES (DEFAULT, '"+e.getcategorie()+"', "+idSalle+", " + status + ", '"+e.getadresseMac()+"', '"+e.getnomEquipement()+"', DEFAULT, "+idOS+")");
            JOptionPane.showMessageDialog(null, "L'appareil a bien été inserée");
        } catch (SQLException ex) {
            Logger.getLogger(Ajouter_Appareil_Interface.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Problem");
        }
           // incrementer le nombre d'equipement dans la salle concernée
           // statement.executeUpdate("UPDATE salle SET [nb_equipement]=[nb_equipement]+1");
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void StatutComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatutComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatutComboActionPerformed

    private void OSComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OSComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OSComboActionPerformed

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
            java.util.logging.Logger.getLogger(Ajouter_Appareil_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ajouter_Appareil_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ajouter_Appareil_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ajouter_Appareil_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ajouter_Appareil_Interface().setVisible(true);
                new Interface().dispose();

            }

            private void setVisible() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            private void setVisible(boolean b) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CategorieCombo;
    private javax.swing.JLabel LabelOS;
    private javax.swing.JComboBox LocalCombo;
    private javax.swing.JTextField MAC;
    private javax.swing.JTextField Nom;
    private javax.swing.JComboBox OSCombo;
    private javax.swing.JComboBox SalleCombo;
    private javax.swing.JComboBox StatutCombo;
    private javax.swing.JLabel Type;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
