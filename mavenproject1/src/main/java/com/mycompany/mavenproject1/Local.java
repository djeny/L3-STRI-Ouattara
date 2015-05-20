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
 
public class Local {
    
    /* Déclare les attributs */
    private int idLocal;
    private int nombreSalle;
    
    
    public Local(int idLocal, int nombreSalle){
        this.idLocal     = idLocal;
        this.nombreSalle = nombreSalle;
    }
    
    public int getidLocal(){
        return idLocal;
    }
    
    public int getnombreSalle(){
        return nombreSalle;
    }

 /* public static void main(String args[]) {
    
    Local L = new Local(5,8);
    System.out.println("le numero de la salle est : " + L.getidLocal() + " et nombre de salle est : " + L.getnombreSalle());
        
} */

}
