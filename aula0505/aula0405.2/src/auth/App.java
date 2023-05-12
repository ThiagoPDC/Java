/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auth;

/**
 *
 * @author ifsp
 */
public class App implements IAutenticavel{
    private String token;
    
   

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
 
    public boolean autenticar(){
           return token.equals("aBC123");
       }
}
