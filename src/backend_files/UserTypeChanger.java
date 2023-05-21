package backend_files;

public class UserTypeChanger {
    
    private String usertype;
        
        //  These two methods are used when we want to convert database data to form's data
        //  Set user type
    public void setType(String user){
        
        switch(user){
            case "C":
                this.usertype = "Cashier";
                break;
            case "A":
                this.usertype = "Admin";
                break;
            case "M":
                this.usertype = "Manager";
                break;
            case "DC":
                this.usertype = "Cashier[Deleted]";
                break;
            case "DA":
                this.usertype = "Admin[Deleted]";
                break;
            case "DM":
                this.usertype = "Manager[Deleted]";
                break;
            default:
                this.usertype = "Error";
                break;
        }
    }
    
        //Get user type
    public String getType(){

        return usertype;
    }
    
        //These two methods are used to covert form data to database format
        //Set user type
    public void setDBType(String user){
        
        switch(user){
            case "Cashier":
                this.usertype = "C";
                break;
            case "Admin":
                this.usertype = "A";
                break;
            case "Manager":
                this.usertype = "M";
                break;
            case "Cashier[Deleted]":
                this.usertype = "DC";
                break;
            case "Admin[Deleted]":
                this.usertype = "DA";
                break;
            case "Manager[Deleted]":
                this.usertype = "DM";
                break;
            default:
                this.usertype = "Error";
                break;
        }
    }
    
        //Get user type
    public String getDBType(){
        
        return usertype;
    }
    
}
