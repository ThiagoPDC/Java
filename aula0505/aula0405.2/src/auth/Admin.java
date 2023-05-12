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
public class Admin extends Usuarios {
    String a2f; //autenticação em dois fatores

    public String getA2f() {
        return a2f;
    }

    public void setA2f(String a2f) {
        this.a2f = a2f;
    }
    
    @Override
    public boolean autenticar(){
        return true;
    }
    
}
