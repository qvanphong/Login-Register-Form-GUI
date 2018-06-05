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
public interface ArrayListChecker {
//    boolean add(String fullName, String username, String password, String email , ArrayList<AccInformation> arrList);
//    boolean find(String userName, String email, ArrayList<AccInformation> arrList);

    boolean findInDatabase(String username, String password, ArrayList<AccInformation> arrList);

}
