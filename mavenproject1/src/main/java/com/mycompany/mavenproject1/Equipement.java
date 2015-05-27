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
    
  private int    idEquipement;
  private String categorie;
  private String statut;
  private String adresseMac;
  private String nomEquipement;
  
    /**
     *
     * @param idEquipement
     * @param categorie
     * @param statut
     * @param adresseMac
     * @param nomEquipement
     */
    public Equipement(int idEquipement,String categorie,String statut,String adresseMac,String nomEquipement){
      this.idEquipement=idEquipement;
      this.categorie=categorie;
      this.statut=statut;
      this.adresseMac=adresseMac;
      this.nomEquipement=nomEquipement;
      
  }

    /**
     *
     * @return
     */
    public int getidEquipement(){
return idEquipement;
}
  
    /**
     *
     * @return
     */
    public String getcategorie(){
return categorie;
}
  
    /**
     *
     * @return
     */
    public String getstatut(){
return statut;
}
    
    /**
     *
     * @return
     */
    public String getadresseMac(){
return adresseMac;
}
       
    /**
     *
     * @return
     */
    public String getnomEquipement(){
return nomEquipement;
}
  
  
      
/*
 public static void main(String args[]) {
    
    Equipement E = new Equipement(5,8,"portable","Actif");
    System.out.println("parametres de l'équipement : " + E.getidEquipement()+ " " + E.getidSalle() + " " + E.getcategorie() + " " + E.getstatutEquipement());
    
}*/
}

