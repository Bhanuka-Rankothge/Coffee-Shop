/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Massege_boxes;

/**
 *
 * @author HP
 */
public class PasswordValidation_Msgs {
    
        //  Variable Declaration
    final private String CHARACTERS_ARE_NOT_ENOUGH = "Characters are not enough (8 - 15 Characters).";
    final private String CHARACTERS_ARE_TOO_MUCH   = "Characters are too much (8 - 15 Characters).";
    final private String MIXING_WONT_SET           = "Password should contain at least one number, capital, simple and a symbol.";
    final private String CANNOT_BE_EMPTY           = "Passwords cannot be Empty";
    final private String RETYPE_WONT_MATCH         = "Retype won\'t match with the password";
    final private String RETYPE_MATCHES            = "Re-type matches with the password";
    final private String VALIDATED                 = "Strong Password";
    
            // Helper method to check if a character array contains a specific character
    private String containsChar(char[] charArray, char c) {
        
        for (char element : charArray) {
            if (element == c) {
                return VALIDATED;
            }
        }  
        return MIXING_WONT_SET;
    }
    
        // Helper method to check if an int array contains a specific integer
    private String containsInt(int[] intArray, int n) {
        for (int element : intArray) {
            if (element == n - '0') {
                return VALIDATED;
            }
        }
        return MIXING_WONT_SET;
    }
    
        // Helper method to check password length
    private String pswLengthCheck(String psw){
        
        if (psw.length() > 7){
            if(psw.length() < 16){
                return VALIDATED;
            }else{
                return CHARACTERS_ARE_TOO_MUCH;
            }            
        }else{
            return CHARACTERS_ARE_NOT_ENOUGH;
        }
    }
        //  Helper method to check password and retype match
    public String rtpMatchCheck(String psw, String rtp){
        if(!psw.equals(rtp)){
            return RETYPE_WONT_MATCH;
        }else{
            return RETYPE_MATCHES;
        }       
    }
    
        //  Helper method to check all characters are included
    private String charIncludeCheck(String psw){
        
                        //Password Character arrays
        char[] capitalLetters = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] simpleLetters = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] numbers = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        char[] symbols = new char[] {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '[', '{', ']', '}', '\\', '|', ';', ':', '\'', '"', ',', '<', '.', '>', '/', '?'};
        
                // Check if the input string contains at least one character from each array
        boolean containsCapitalLetter = false;
        boolean containsSimpleLetter = false;
        boolean containsNumber = false;
        boolean containsSymbol = false;
        
        for (char c : psw.toCharArray()) {
            if (!containsCapitalLetter && containsChar(capitalLetters, c).equals(VALIDATED)) {
                containsCapitalLetter = true;
                }
            if (!containsSimpleLetter && containsChar(simpleLetters, c).equals(VALIDATED)) {
                containsSimpleLetter = true;
                }
            if (!containsNumber && containsInt(numbers, c).equals(VALIDATED)) {
                containsNumber = true;
                }
            if (!containsSymbol && containsChar(symbols, c).equals(VALIDATED)) {
                containsSymbol = true;
                }          
            if (containsCapitalLetter && containsSimpleLetter && containsNumber && containsSymbol) {                       
                    return VALIDATED;
                }
            }
        
        return MIXING_WONT_SET;
    }
    
        //Validate the password
    public String PswValCheck(String psw){
        
        if(!psw.equals("")){
            
            if(!pswLengthCheck(psw).equals(VALIDATED)){
                return pswLengthCheck(psw);
            }
            if(!charIncludeCheck(psw).equals(VALIDATED)){
                return charIncludeCheck(psw);
            }
            if(pswLengthCheck(psw).equals(VALIDATED) && charIncludeCheck(psw).equals(VALIDATED)){
                return VALIDATED;
            }
        }
        return CANNOT_BE_EMPTY;
    }
}
