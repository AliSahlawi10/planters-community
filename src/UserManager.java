/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rajaa
 */
import java.util.ArrayList;

public class UserManager {

    ArrayList<User> users = new ArrayList<>();

    public boolean registerUser(String username, String password){
        if(!username.isEmpty() && !password.isEmpty()){
        users.add(new User(username, password));
        return true;
        }
        else
            return false;
    }

    
    
    public boolean loginUser(String username, String password){
        if(username.isEmpty() || password.isEmpty())
            return false;

        for(User user : users){
            if (user.getUsername().equals(username) && user.getPassword().equals(password))
                return true;
        }
         
        return false;
    }


    
}

