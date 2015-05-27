/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Djeneba
 */
public class Update extends javax.swing.JFrame {
Database_cnx cnx = new Database_cnx();
          
    /**
     * Creates new form Update
     */
    public Update() {
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
                // Tant qu'il y a des valeurs on les ajoute dans comboBo
                LocalCombo2.addItem(rsetLocal.getString("nom_local")); 
            } 
            
            while(rsetSalle.next())
            {
             
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

        jLabel1 = new javax.swing.JLabel();
        SalleCombo2 = new javax.swing.JComboBox();
        AppareilCombo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Update = new javax.swing.JButton();
        LocalCombo2 = new javax.swing.JComboBox();
        deconnecter = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Mise à jour d'un équipement");

        SalleCombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalleCombo2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Appareil");

        jLabel6.setText("Salle");

        jLabel7.setText("Locaux");

        Update.setLabel("Connecter");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        LocalCombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocalCombo2ActionPerformed(evt);
            }
        });

        deconnecter.setLabel("Se deconnecter");
        deconnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deconnecterActionPerformed(evt);
            }
        });

        jButton1.setText("Supprimer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(LocalCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(SalleCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(AppareilCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Update)
                                .addGap(28, 28, 28)
                                .addComponent(deconnecter))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AppareilCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalleCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LocalCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update)
                    .addComponent(deconnecter))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        Update.getAccessibleContext().setAccessibleName("Connecter");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalleCombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalleCombo2ActionPerformed
        Database_cnx cnx = new Database_cnx();
        String ChoixSalle;
        Statement stmt1 = null;
        Statement stmt2 = null;
        int idSalleSelectionne=0;
        ChoixSalle =(String) SalleCombo2.getSelectedItem();
        String idSalle = "SELECT id_salle FROM salle WHERE nom_salle='"+ChoixSalle+"'";

        try {
            stmt1 = cnx.connection().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet RidSalle = null;
        try {
            RidSalle = stmt1.executeQuery(idSalle);
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while(RidSalle.next()){
                idSalleSelectionne =  RidSalle.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }

        String Nomequipement = "SELECT nom_equipement FROM equipement WHERE id_salle='"+idSalleSelectionne+"'";
        // System.out.println(idLocalSelectionne);
        try {
            stmt2 = cnx.connection().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet ListeEquipement = null;
        try {
            ListeEquipement = stmt2.executeQuery(Nomequipement);
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            AppareilCombo.removeAllItems();
            while(ListeEquipement.next()){
                AppareilCombo.addItem(ListeEquipement.getString("nom_equipement"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_SalleCombo2ActionPerformed

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

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
      Statement statement = null;
        Statement stmt4 = null;
        Statement stmt5 = null;
        Statement stmt7 = null;
        String idsalle;
        String nomSalle;
        String nomEquipement;
        String idlocal;
        int idSalle=0;
        int idLocal=0;
        int idfinalequipement=0;
        String idEquipement;
        String nomLocal;
        
        
        
        try {
            statement = cnx.connection().createStatement();
            System.out.println("connected");
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println("not connected");
        }
        
        
        nomLocal=(String)LocalCombo2.getSelectedItem();
        idlocal="SELECT id_local FROM local WHERE nom_local='"+nomLocal+"'";
         nomSalle=(String)SalleCombo2.getSelectedItem();
        idsalle="SELECT id_salle FROM salle WHERE nom_salle='"+nomSalle+"'";
        nomEquipement=(String) AppareilCombo.getSelectedItem();
        idEquipement="SELECT id_equipement FROM equipement WHERE nom_equipement='"+nomEquipement+"'";
        
        try {
               stmt4 = cnx.connection().createStatement();
           } catch (SQLException ex) {
               Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
           }
        
         try {
               ResultSet Ridlocal = stmt4.executeQuery(idlocal);
               while(Ridlocal.next()){
              System.out.println("test");
               idLocal =  Ridlocal.getInt(1);
              
           }
        
        
        
        try {
               stmt5 = cnx.connection().createStatement();
           } catch (SQLException ex) {
               Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
           }
        
        try {
               ResultSet Ridsalle = stmt5.executeQuery(idsalle);
               while(Ridsalle.next()){
               idSalle =  Ridsalle.getInt(1);
               }
               }
               
               catch (SQLException ex) {
               Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
           }
               
           } catch (SQLException ex) {
               Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
           }
    try {
        stmt7 = cnx.connection().createStatement();
    } catch (SQLException ex) {
        Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        ResultSet Ridequipement = stmt7.executeQuery(idEquipement);
        while(Ridequipement.next()){
               idfinalequipement =  Ridequipement.getInt(1);}
    } catch (SQLException ex) {
        Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
    }
        try {
            statement.executeUpdate("UPDATE equipement SET statut=1 WHERE id_equipement="+idfinalequipement+"");
           // System.out.println("L'equipement a bien ete desactivé");
            JOptionPane.showMessageDialog(null, "L'equipement a bien ete activé");
        } catch (SQLException ex) {
            Logger.getLogger(Ajouter_Salle_Interface.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Problem");
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void deconnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deconnecterActionPerformed
    Statement statement = null;
        Statement stmt4 = null;
        Statement stmt5 = null;
        Statement stmt7 = null;
        String idsalle;
        String nomSalle;
        String nomEquipement;
        String idlocal;
        int idSalle=0;
        int idLocal=0;
        int idfinalequipement=0;
        String idEquipement;
        String nomLocal;
        
        
        
        try {
            statement = cnx.connection().createStatement();
            System.out.println("connected");
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println("not connected");
        }
        
        
        nomLocal=(String)LocalCombo2.getSelectedItem();
        idlocal="SELECT id_local FROM local WHERE nom_local='"+nomLocal+"'";
         nomSalle=(String)SalleCombo2.getSelectedItem();
        idsalle="SELECT id_salle FROM salle WHERE nom_salle='"+nomSalle+"'";
        nomEquipement=(String) AppareilCombo.getSelectedItem();
        idEquipement="SELECT id_equipement FROM equipement WHERE nom_equipement='"+nomEquipement+"'";
        
        try {
               stmt4 = cnx.connection().createStatement();
           } catch (SQLException ex) {
               Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
           }
        
         try {
               ResultSet Ridlocal = stmt4.executeQuery(idlocal);
               while(Ridlocal.next()){
              System.out.println("test");
               idLocal =  Ridlocal.getInt(1);
              
           }
        
        
        
        try {
               stmt5 = cnx.connection().createStatement();
           } catch (SQLException ex) {
               Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
           }
        
        try {
               ResultSet Ridsalle = stmt5.executeQuery(idsalle);
               while(Ridsalle.next()){
               idSalle =  Ridsalle.getInt(1);
               }
               }
               
               catch (SQLException ex) {
               Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
           }
               
           } catch (SQLException ex) {
               Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
           }
    try {
        stmt7 = cnx.connection().createStatement();
    } catch (SQLException ex) {
        Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        ResultSet Ridequipement = stmt7.executeQuery(idEquipement);
        while(Ridequipement.next()){
               idfinalequipement =  Ridequipement.getInt(1);}
    } catch (SQLException ex) {
        Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
    }
        try {
            statement.executeUpdate("UPDATE equipement SET statut=0 WHERE id_equipement="+idfinalequipement+"");
           // System.out.println("L'equipement a bien ete desactivé");
            JOptionPane.showMessageDialog(null, "L'equipement a bien ete desactivé");
        } catch (SQLException ex) {
            Logger.getLogger(Ajouter_Salle_Interface.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Problem");
        }
        
        
    }//GEN-LAST:event_deconnecterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Statement statement = null;
        Statement stmt4 = null;
        Statement stmt5 = null;
        Statement stmt7 = null;
        String idsalle;
        String nomSalle;
        String nomEquipement;
        String idlocal;
        int idSalle=0;
        int idLocal=0;
        int idfinalequipement=0;
        String idEquipement;
        String nomLocal;
        
        
        
        try {
            statement = cnx.connection().createStatement();
            System.out.println("connected");
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println("not connected");
        }
        
        
        nomLocal=(String)LocalCombo2.getSelectedItem();
        idlocal="SELECT id_local FROM local WHERE nom_local='"+nomLocal+"'";
         nomSalle=(String)SalleCombo2.getSelectedItem();
        idsalle="SELECT id_salle FROM salle WHERE nom_salle='"+nomSalle+"'";
        nomEquipement=(String) AppareilCombo.getSelectedItem();
        idEquipement="SELECT id_equipement FROM equipement WHERE nom_equipement='"+nomEquipement+"'";
        
        try {
               stmt4 = cnx.connection().createStatement();
           } catch (SQLException ex) {
               Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
           }
        
         try {
               ResultSet Ridlocal = stmt4.executeQuery(idlocal);
               while(Ridlocal.next()){
              System.out.println("test");
               idLocal =  Ridlocal.getInt(1);
              
           }
        
        
        
        try {
               stmt5 = cnx.connection().createStatement();
           } catch (SQLException ex) {
               Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
           }
        
        try {
               ResultSet Ridsalle = stmt5.executeQuery(idsalle);
               while(Ridsalle.next()){
               idSalle =  Ridsalle.getInt(1);
               }
               }
               
               catch (SQLException ex) {
               Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
           }
               
           } catch (SQLException ex) {
               Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
           }
    try {
        stmt7 = cnx.connection().createStatement();
    } catch (SQLException ex) {
        Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        ResultSet Ridequipement = stmt7.executeQuery(idEquipement);
        while(Ridequipement.next()){
               idfinalequipement =  Ridequipement.getInt(1);}
    } catch (SQLException ex) {
        Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
    }
        try {
            statement.executeUpdate("DELETE FROM equipement WHERE id_equipement="+idfinalequipement+"");
           // System.out.println("L'equipement a bien ete desactivé");
            JOptionPane.showMessageDialog(null, "L'equipement a bien ete supprimer");
        } catch (SQLException ex) {
            Logger.getLogger(Ajouter_Salle_Interface.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Problem");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox AppareilCombo;
    private javax.swing.JComboBox LocalCombo2;
    private javax.swing.JComboBox SalleCombo2;
    private javax.swing.JButton Update;
    private javax.swing.JButton deconnecter;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}