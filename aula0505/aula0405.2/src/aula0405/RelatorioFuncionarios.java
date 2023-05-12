/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula0405;

import java.util.List;

/**
 *
 * @author ifsp
 */
public class RelatorioFuncionarios {
    //metodo para imprimir o nome e salario dos funcionarios
    public static void relatorioNomeSalario(List<Funcionario>lista){
        for(Funcionario f : lista)
            System.out.println(f.getNome() + "-" + f.calcularSalarioTotal());
    }
}
