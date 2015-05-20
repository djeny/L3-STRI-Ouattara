package com.mycompany.mavenproject1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Farid
 */
public class Database_cnx {
    public static void main(String[] args) {
        String host="jdbc:mysql://localhost/java_projet";
        String username="root";
        String password="";
     try {
        Connection con = DriverManager.getConnection( host, username, password );
        System.out.println("Worked");
        
    }
    catch ( SQLException err ) {
    System.out.println( err.getMessage( ) );
    }
  }
}
