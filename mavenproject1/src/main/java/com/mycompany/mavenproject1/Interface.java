package com.mycompany.mavenproject1;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Farid
 */
public class Interface extends javax.swing.JFrame {

    Database_cnx cnx = new Database_cnx();
    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
       String insertLocal = "select nom_local FROM local"; 
       String insertSalle = "select nom_salle FROM salle";
       String insertOS = "select Nom_equipement FROM equipement";
       
        try {
          // Creation des Statements
          Statement stmt1 = cnx.connection().createStatement(); 
          Statement stmt2 = cnx.connection().createStatement();
          Statement stmt3 = cnx.connection().createStatement();
          // L'execution des query et l'insertion des resultat dans ResultSet
          ResultSet rsetLocal = stmt1.executeQuery(insertLocal);
          ResultSet rsetSalle = stmt2.executeQuery(insertSalle);
          ResultSet rsetAppareil = stmt3.executeQuery(insertOS);
      
           try {
            while(rsetLocal.next())
            {
                // Tant qu'il y a des valeurs on les ajoute dans comboBox
                LocalCombo1.addItem(rsetLocal.getString("nom_local"));
                LocalCombo2.addItem(rsetLocal.getString("nom_local")); 
            } 
            
            while(rsetSalle.next())
            {
             
                SalleCombo1.addItem(rsetSalle.getString("nom_salle"));
                SalleCombo2.addItem(rsetSalle.getString("nom_salle"));
            } 
            
            while(rsetAppareil.next())
            {
             
                AppareilCombo.addItem(rsetAppareil.getString("Nom_equipement"));
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

        jRadioButton1 = new javax.swing.JRadioButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        LocalCombo1 = new javax.swing.JComboBox();
        SalleCombo1 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(11, 0), new java.awt.Dimension(11, 0), new java.awt.Dimension(11, 32767));
        jLabel4 = new javax.swing.JLabel();
        LocalCombo2 = new javax.swing.JComboBox();
        SalleCombo2 = new javax.swing.JComboBox();
        AppareilCombo = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Ajouter_Appareil = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        Ajout_Connexion = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LocalCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocalCombo1ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PC", "Portable", "Tablette", "Routeur", "Switch" }));

        jLabel1.setText("Locaux");

        jLabel2.setText("Salle");

        jLabel3.setText("Categorie");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 0, 51));

        LocalCombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocalCombo2ActionPerformed(evt);
            }
        });

        SalleCombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalleCombo2ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Appareil");

        jLabel6.setText("Salle");

        jLabel7.setText("Locaux");

        jButton3.setText("Ajouter une salle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ajouter_SalleActionPerformed(evt);
            }
        });

        Ajouter_Appareil.setText("Ajouter un appareil");
        Ajouter_Appareil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ajouter_AppareilActionPerformed(evt);
            }
        });

        jButton7.setText("Supprimer une salle");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Supprimer un appareil");

        Ajout_Connexion.setText("Connecter 2 appareils");
        Ajout_Connexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ajout_ConnexionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LocalCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(LocalCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SalleCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(SalleCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(136, 136, 136)
                                        .addComponent(jButton1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(AppareilCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Ajout_Connexion, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ajouter_Appareil, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(119, 119, 119))))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocalCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalleCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AppareilCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LocalCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalleCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton8)
                    .addComponent(Ajout_Connexion))
                .addGap(40, 40, 40)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ajouter_Appareil)
                    .addComponent(jButton3)
                    .addComponent(jButton7))
                .addGap(75, 75, 75)
                .addComponent(jLabel8)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LocalCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocalCombo1ActionPerformed
        String ChoixLocal;
        Statement stmt1 = null;
        Statement stmt2 = null;
        int idLocalSelectionne=0;
        ChoixLocal =(String) LocalCombo1.getSelectedItem();
        String idLocal = "SELECT id_local FROM local WHERE nom_local='"+ChoixLocal+"'";

        try {
            stmt1 = cnx.connection().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet RidLocal = null;
        try {
            RidLocal = stmt1.executeQuery(idLocal);
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while(RidLocal.next()){
            idLocalSelectionne =  RidLocal.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        String NomSalle = "SELECT nom_salle FROM salle WHERE id_local='"+idLocalSelectionne+"'";
        // System.out.println(idLocalSelectionne);
        try {
            stmt2 = cnx.connection().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet ListeSalle = null;
        try {
            ListeSalle = stmt2.executeQuery(NomSalle);
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        try {
            SalleCombo1.removeAllItems();
            while(ListeSalle.next()){
            SalleCombo1.addItem(ListeSalle.getString("nom_salle")); 
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_LocalCombo1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LocalCombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocalCombo2ActionPerformed
        String ChoixLocal;
        Statement stmt1 = null;
        Statement stmt2 = null;
        int idLocalSelectionne=0;
        ChoixLocal =(String) LocalCombo2.getSelectedItem();
        String idLocal = "SELECT id_local FROM local WHERE nom_local='"+ChoixLocal+"'";

        try {
            stmt1 = cnx.connection().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet RidLocal = null;
        try {
            RidLocal = stmt1.executeQuery(idLocal);
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while(RidLocal.next()){
            idLocalSelectionne =  RidLocal.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        String NomSalle = "SELECT nom_salle FROM salle WHERE id_local='"+idLocalSelectionne+"'";
        // System.out.println(idLocalSelectionne);
        try {
            stmt2 = cnx.connection().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet ListeSalle = null;
        try {
            ListeSalle = stmt2.executeQuery(NomSalle);
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        try {
            SalleCombo2.removeAllItems();
            while(ListeSalle.next()){
            SalleCombo2.addItem(ListeSalle.getString("nom_salle")); 
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_LocalCombo2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Ajouter_SalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ajouter_SalleActionPerformed
        Ajouter_Salle_Interface s;
        s = new Ajouter_Salle_Interface();
        s.setVisible(true);
    }//GEN-LAST:event_Ajouter_SalleActionPerformed

    private void Ajouter_AppareilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ajouter_AppareilActionPerformed
        // close();
        Ajouter_Appareil_Interface s = new Ajouter_Appareil_Interface();
        s.setVisible(true);
                
    }//GEN-LAST:event_Ajouter_AppareilActionPerformed

    private void Ajout_ConnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ajout_ConnexionActionPerformed
        Connexion c = new Connexion();
        c.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_Ajout_ConnexionActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Supprimer_Salle_Interface inter= new Supprimer_Salle_Interface();
        inter.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void SalleCombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalleCombo2ActionPerformed
        String ChoixSalle;
        Statement stmt1 = null;
        Statement stmt2 = null;
        int idSalleSelectionne=0;
        ChoixSalle =(String) SalleCombo2.getSelectedItem();
        String idSalle = "SELECT id_salle FROM salle WHERE nom_salle='"+ChoixSalle+"'";

        try {
            stmt1 = cnx.connection().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet RidSalle = null;
        try {
            RidSalle = stmt1.executeQuery(idSalle);
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while(RidSalle.next()){
            idSalleSelectionne =  RidSalle.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        String Nomequipement = "SELECT nom_equipement FROM equipement WHERE id_salle='"+idSalleSelectionne+"'";
        // System.out.println(idLocalSelectionne);
        try {
            stmt2 = cnx.connection().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet ListeEquipement = null;
        try {
            ListeEquipement = stmt2.executeQuery(Nomequipement);
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        try {
            AppareilCombo.removeAllItems();
            while(ListeEquipement.next()){
            AppareilCombo.addItem(ListeEquipement.getString("nom_equipement")); 
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_SalleCombo2ActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajout_Connexion;
    private javax.swing.JButton Ajouter_Appareil;
    private javax.swing.JComboBox AppareilCombo;
    private javax.swing.JComboBox LocalCombo1;
    private javax.swing.JComboBox LocalCombo2;
    private javax.swing.JComboBox SalleCombo1;
    private javax.swing.JComboBox SalleCombo2;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
