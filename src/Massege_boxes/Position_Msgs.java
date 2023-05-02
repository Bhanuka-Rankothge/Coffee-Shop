package Massege_boxes;

public class Position_Msgs {
    
    private final String PLEASE_SELECT_A_POSITION = "Please select a position";
    
        //This method checks the 
    public String positionStatus(String pos){
        
        if(pos.equals("Cashier") || pos.equals("Manager") || pos.equals("Admin")){
            return "You selected " + pos;
        }else{
            return PLEASE_SELECT_A_POSITION;
        }  
    }
    
}
