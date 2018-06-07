/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package na.phong.study;

/**
 *
 * @author qvanphong
 */
public class RegisterChecker {
    private boolean passwordMatchCheck(String password, String retype){
        if(password.equals(retype)){
            System.out.println("Password & retype match.");
        return true;
        }
        System.out.println("Password & retype not match.");
        return false;
    }
    private boolean passwordSizeCheck(String password, String retype){
        if(passwordMatchCheck(password, retype)){
            if(password.length() >= 8 && password.length() <= 16)
                return true;
        }
        System.out.println("Password smaller than 8 characters.");
        return false;
    }
    
    private boolean passwordSpecialSymbolCheck(String password, String retype){
        if(passwordSizeCheck(password, retype)){
            for(int i = 0; i < password.length();i++){
                if(((char)password.charAt(i) < 48 || ((char)password.charAt(i) > 57 &&(char)password.charAt(i) < 65) || ((char)password.charAt(i) > 90 && (char)password.charAt(i) < 97) || (char)password.charAt(i) > 122 )){
                    System.out.println("Password contains special character: " + password.charAt(i));
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public boolean passwordCheck(String password, String retype){
        return passwordSpecialSymbolCheck(password, retype);
    }
}
