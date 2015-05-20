/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Djeneba
 */

public class Equipement {
    
    
       private int idEquipement;
       private int    idSalle;
       private String categorie;
       private String statutEquipement;
    
    
    public void setIdEquipement(int idEquipement) {
        this.idEquipement = idEquipement;
    }

    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    /* Déclare les attributs */
    public void setStatutEquipement(String statutEquipement) {
        this.statutEquipement = statutEquipement;
    }
        
    
    public Equipement(int idEquipement, int idSalle,String categorie, String statutEquipement ){
        this.idEquipement       = idEquipement;
        this.idSalle            = idSalle;
        this.categorie          = categorie;
        this.statutEquipement   = statutEquipement;
    }
    
    public int getidEquipement(){
        return idEquipement;
    }
    
    public int getidSalle(){
        return idSalle;
    }
    
    public String getcategorie(){
        return categorie;
    }
    
    public String getstatutEquipement(){
        return statutEquipement;
    }
/*
 public static void main(String args[]) {
    
    Equipement E = new Equipement(5,8,"portable","Actif");
    System.out.println("parametres de l'équipement : " + E.getidEquipement()+ " " + E.getidSalle() + " " + E.getcategorie() + " " + E.getstatutEquipement());
    
}*/
}

