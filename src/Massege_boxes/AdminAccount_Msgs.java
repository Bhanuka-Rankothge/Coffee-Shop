package Massege_boxes;

import backend_files.Connect_DB;
import backend_files.Encrypter;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminAccount_Msgs {
    
    private final String USERNAME_NOT_AVAILABLE = "This username is not available.";
    private final String USER_NOT_ADMIN         = "This user isn\'t an Admin.";
    private final String PASSWORD_DOESNT_MATCH = "Password doesn\'t match.";
    private final String USER_IS_AVAILABLE      = "User is available";

    Connect_DB cdb = new Connect_DB();
    Encrypter enc  = new Encrypter();
    
        //Check the username availability
    public String usernameAvailability(String user){
              
        try{
                    //Execute the query
            Connection connection = cdb.getConnection();
            String sql = "SELECT username, status FROM users WHERE users.username = ?"; 
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, user);
            ResultSet result = statement.executeQuery();
                
           if(result.next()){
                String status = result.getString("status");
                    
                if("A".equals(status)){
                    return USER_IS_AVAILABLE;
                }else{
                    return USER_NOT_ADMIN;
                }
            }
        
        }catch (SQLException e) {        
            System.out.println(("Error: " + e.getMessage()));               
        } 
        return USERNAME_NOT_AVAILABLE;      
    }
    
    public String passwordAvailability(String user,String pass){
        try{
                //Execute the query
            Connection connection = cdb.getConnection();
            String sql = "SELECT username,status FROM users WHERE users.username = ? AND users.password = ? AND users.status = ?"; 
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, user);
            statement.setString(2, enc.secure(pass));
            statement.setString(3, "A");
            ResultSet result = statement.executeQuery();
                
            if(result.next()){
                return "";
            }      
        }catch (SQLException e) {        
            System.out.println(("Error: " + e.getMessage()));               
        } catch (NoSuchAlgorithmException ex) { 
            Logger.getLogger(AdminAccount_Msgs.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return PASSWORD_DOESNT_MATCH;
    }
}
