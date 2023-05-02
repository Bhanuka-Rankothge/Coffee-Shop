/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend_files;

/**
 *
 * @author HP
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
        
public class Connect_DB {
    // Connection parameters
    String url = "jdbc:mysql://localhost:3306/koopi_kade_copy?zeroDateTimeBehavior=CONVERT_TO_NULL";
    String username = "root";
    String password = "";
    
   public Connection getConnection(){
        Connection conn = null;
        
        //System.out.println(url);
        
        try {
            // Connect to database
            conn = DriverManager.getConnection(url, username, password);
            //System.out.println("Connected to database successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
            //System.out.println("Error");
        }
        
        return conn;  
   }    
}
