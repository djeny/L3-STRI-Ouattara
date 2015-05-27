package com.mycompany.mavenproject1;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Djeneba
 */
public class Ajouter_Salle_Interface extends javax.swing.JFrame {
Database_cnx cnx = new Database_cnx(); // connexion a la base de donnée
    /**
     * Creates new form Ajouter_Salle
     */
    public Ajouter_Salle_Interface() {
        initComponents();
        
        //La requete qui recupère la liste des salles
         String insertLocal = "select nom_local FROM local"; 
         try {
          // Creation des Statements
             Statement stmt1 = cnx.connection().createStatement();
             // L'execution du query et l'insertion des resultat dans ResultSet
          ResultSet rsetSalle = stmt1.executeQuery(insertLocal);
          try {
            while(rsetSalle.next())
            {
                // Tant qu'il y a des valeurs on les ajoute dans comboBox
                LocalCombo.addItem(rsetSalle.getString("nom_local")); 
            } 
                
           /** on ferme la connexion */ 
            cnx.connection().close();
            }
              catch (SQLException ex) {
            System.out.println("Problème");
            }
              }
         
         
         catch( SQLException err ) {
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
        AddSalleChoixLocal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LocalCombo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        nomSalle = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        numSalle = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        nbreEquipement = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("AJOUTER SALLE");

        AddSalleChoixLocal.setText("Choisissez le local de la salle à ajouter:");

        jLabel3.setText("Ajouter le nom de la salle:");

        LocalCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocalComboActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(nomSalle);

        jButton1.setText("Ajouter la salle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Ajouter le numero de la salle:");

        jScrollPane2.setViewportView(numSalle);

        jLabel4.setText("Ajouter le nombre d'équipements (actuel) de la salle:");

        jScrollPane3.setViewportView(nbreEquipement);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddSalleChoixLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LocalCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddSalleChoixLocal)
                            .addComponent(LocalCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Statement statement = null;
    Statement stmt4 = null;
    
        int idLocal=0;
        int idsalle=0;
        int parsenumsalle;
        int parsenbreequipement;
        
        
        String nomLocal;
        String nomsalle;
        String numsalle;
        String nbreequipement;
        
    try {
        
        stmt4 = cnx.connection().createStatement();
        System.out.println("statement ok");
    } catch (SQLException ex) {
        Logger.getLogger(Ajouter_Salle_Interface.class.getName()).log(Level.SEVERE, null, ex);
    }
       
        
        try {
            statement = cnx.connection().createStatement();
            System.out.println("connected");
        } catch (SQLException ex) {
            Logger.getLogger(Ajouter_Salle_Interface.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println("not connected");
        }
        nomLocal=(String)LocalCombo.getSelectedItem();
        numsalle=numSalle.getText();
        parsenumsalle=Integer.parseInt(numsalle);
        nomsalle=nomSalle.getText();
        nbreequipement=nbreEquipement.getText();
        parsenbreequipement=Integer.parseInt(nbreequipement);
        
        String idlocal = "SELECT id_local FROM local WHERE nom_local='"+nomLocal+"'";
        
       
        
        try {
               ResultSet Ridlocal = stmt4.executeQuery(idlocal);
               while(Ridlocal.next()){
              System.out.println("test");
               idLocal =  Ridlocal.getInt(1);
               System.out.println(idLocal);
               }
             
              // System.out.println(idLocal);
           } catch (SQLException ex) {
               Logger.getLogger(Ajouter_Salle_Interface.class.getName()).log(Level.SEVERE, null, ex);
           }
        
        
        Salle s = new Salle(idLocal,idsalle,parsenbreequipement,nomsalle,parsenumsalle);
        
         try {
            statement.executeUpdate("INSERT INTO salle " + "VALUES (DEFAULT, '"+s.getnomSalle()+"','"+s.getnumSalle()+"', '" +s.getnombreEquipement()+ "', '"+s.getidLocal()+"')");
             JOptionPane.showMessageDialog(null, "La salle a été ajoutée avec succès.");
        } catch (SQLException ex) {
            Logger.getLogger(Ajouter_Salle_Interface.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "La salle n'a pas été ajoutée avec succes.");

        }
            
        

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
  
    private void LocalComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocalComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocalComboActionPerformed

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
            java.util.logging.Logger.getLogger(Ajouter_Salle_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ajouter_Salle_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ajouter_Salle_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ajouter_Salle_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ajouter_Salle_Interface().setVisible(true);
            }
        });
    }

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddSalleChoixLocal;
    private javax.swing.JComboBox LocalCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane nbreEquipement;
    private javax.swing.JTextPane nomSalle;
    private javax.swing.JTextPane numSalle;
    // End of variables declaration//GEN-END:variables
}