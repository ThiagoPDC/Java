/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1105;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author tigas
 */
public class Aula1105 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente c1 = new Cliente();
        c1.setId(1);
        c1.setNome("Lelo balelo");
        c1.setCpf("123 456 789 00");
        
        Endereco e1 = new Endereco();
        e1.setRua("josefino magalhaes");
        e1.setNumero("92");
        e1.setCidade("seurra bo");
        e1.setBairro("centro");
        
        c1.setEndereco(e1);
        System.out.println(c1.getNome());
        System.out.println(c1.getEndereco().getCidade());
        
        Produto p1 = new Produto();
        p1.setNome("Coca-Cola");
        p1.setValor(4.5);
        p1.setQuantidade(2);
        
        Produto p2 = new Produto();
        p2.setNome("Salgado");
        p2.setValor(5);
        p2.setQuantidade(3);
        
        Venda v = new Venda();
        v.setId(1);
        v.setDataVenda("11/05/2023");
        v.setFormaPagamento("Cartão");
        v.setCliente(c1);

        //add os produtos
        v.addProduto(p1);
        v.addProduto(p2);
    
  }
    
}
