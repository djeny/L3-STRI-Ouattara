/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Goktan
 */
public class Salle {
    
    /* Déclare les attributs */
    private int    idLocal;
    private int    idSalle;
    private int    nombreEquipement;
    private String nomSalle;
    private int numSalle;
        
    /**
     *
     * @param idLocal
     * @param idSalle
     * @param nombreEquipement
     * @param nomSalle
     * @param numSalle
     */
    public Salle(int idLocal, int idSalle,int nombreEquipement, String nomSalle, int numSalle ){
        this.idLocal          = idLocal;
        this.idSalle          = idSalle;
        this.nombreEquipement = nombreEquipement;
        this.nomSalle         = nomSalle;
        this.numSalle         = numSalle;
    }
    
    /**
     *
     * @return
     */
    public int getidLocal(){
        return idLocal;
    }
    
    /**
     *
     * @return
     */
    public int getidSalle(){
        return idSalle;
    }
    
    /**
     *
     * @return
     */
    public int getnombreEquipement(){
        return nombreEquipement;
    }
    
    /**
     *
     * @return
     */
    public String getnomSalle(){
        return nomSalle;
    }
 
    /**
     *
     * @return
     */
    public int getnumSalle(){
        return numSalle;
    }
 /* public static void main(String args[]) {
    
    Salle S = new Salle(5,8,0,"Daurat");
    System.out.println("parametres de la salle : " + S.getidLocal()+ " " + S.getidSalle() + " " + S.getnombreEquipement() + " " + S.getnomSalle());
    
} */
}

