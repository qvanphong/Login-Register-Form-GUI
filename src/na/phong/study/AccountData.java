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
    private ArrayList<AccInformation> arrList = new ArrayList<>();
//    @Override
    public boolean add(String fullName, String username, String password, String email) {
        if(find(username, email)){//Co ton tai tai khoan
            //Show error dialog
            System.out.println("Error while adding new account.");
            return false;
        }
        arrList.add(new AccInformation(fullName, username, password, email));
        return true;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
    public boolean find(String userName, String email) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(AccInformation a : arrList ){
            if(a.getUsername().equals(userName)){
                //Show username already taken dialog
                //wip
                System.out.println("Username already exist in database.");
                return true;
            }
            if(a.getEmail().equals(email)){
                //Show email already taken dialog
                //wip
                System.out.println("Email already exist in database.");
                return true;
            }
        }
        return false;
    }

    public ArrayList<AccInformation> getArrList() {
        return arrList;
    }
    
}
