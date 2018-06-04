/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package na.phong.study;

import java.util.ArrayList;

/**
 *
 * @author qvanphong
 */
public class AccountData {
    private ArrayList<AccInformation> arrInfo = new ArrayList<>();
    
    public boolean add(String name, String username, String password){
        if(find(username, password)){
            System.out.println("Already exist");
            return false;
        }
        System.out.println("Added to database");
        arrInfo.add(new AccInformation(name, username, password));
        return true;
    }

    public ArrayList<AccInformation> getArrInfo() {
        return arrInfo;
    }

    public AccountData() {
    }
    
    public boolean find(String username, String password){
        for(int i = 0; i < arrInfo.size(); i++){
            if(arrInfo.get(i).getUsername().equals(username) && arrInfo.get(i).getPassword().equals(password)){
                System.out.println(username+ " found in database. Logged in"); 
                return true;
            }
            
        }
        System.out.println(username + " not found in database. ");
        return false;
    }
      public boolean find(String username){
        for(int i = 0; i < arrInfo.size(); i++){
            if(arrInfo.get(i).getUsername().equals(username)){
                System.out.println(username+ " found in database. "); 
                return true;
            }
            
        }
        System.out.println(username + " not found in database. ");
        return false;
    }
    
}
