

package auth;


public class Autenticacao {
    private String mensagem;

    public String getMensagem() {
        return mensagem;
    }
    
    public boolean validarAutenticacao(IAutenticavel auth){
        if(auth.autenticar() == false){
            mensagem = "Erro ao auitenticar";
            return false;
        }
        
        return true;
    }
    
}

