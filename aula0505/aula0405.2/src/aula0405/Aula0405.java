
package aula0405;

import java.util.ArrayList;
import java.util.List;


public class Aula0405 {

   
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Fernanda");
        g1.setNumClt("123123123");
        g1.setSalarioBase(2);
        g1.setBonus(500);
        
        //System.out.println(g1);
        
        Vendedor v1 = new Vendedor();
        v1.setNome("Leo");
        v1.setNumClt("456456456");
        v1.setSalarioBase(18000);
        v1.setNumeroVendas(15);
        
        //System.out.println(v1);
  
        List<Funcionario> lista = new ArrayList();
        lista.add(g1);
        lista.add(v1);
        
        RelatorioFuncionarios.relatorioNomeSalario(lista);
        
        Funcionario f = new Gerente();
        System.out.println(f);
        
    }
    
    
}
