/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Dexter Sam
 */
public class Users {
    
    private String UserNameDB;
    private String UserEmailDB;

    public Users(String UserNameDB, String UserEmailDB) {
        this.UserNameDB = UserNameDB;
        this.UserEmailDB = UserEmailDB;
    }
    
    

    public String getUserNameDB() {
        return UserNameDB;
    }

    public void setUserNameDB(String UserNameDB) {
        this.UserNameDB = UserNameDB;
    }

    public String getUserEmailDB() {
        return UserEmailDB;
    }

    public void setUserEmailDB(String UserEmailDB) {
        this.UserEmailDB = UserEmailDB;
    }
    
    
    
}
