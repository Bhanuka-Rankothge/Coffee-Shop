package Massege_boxes;

import backend_files.Connect_DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Username_Msgs {
    
    private final String USER_ALREADY_EXISTS = "User Already Exists";
    private final String USERNAME_AVAILABLE  = "Username Available";
    private final String USERNAME_IS_EMPTY   = "Please Fill the Username";
   
    Connect_DB cdb = new Connect_DB();
   
    public String validateUsername(String user){
       try{
           
            if(user.equals("")){
                return USERNAME_IS_EMPTY;
            }
           
                    //Execute the query
            Connection connection = cdb.getConnection();
            String sql = "SELECT username FROM users WHERE users.username = ?"; 
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, user);
            ResultSet result = statement.executeQuery();
                
            if(result.next()){
                return USER_ALREADY_EXISTS;
            }
        
        }catch (SQLException e) {        
            System.out.println(("Error: " + e.getMessage()));               
        }       
       return USERNAME_AVAILABLE;
   }
}
