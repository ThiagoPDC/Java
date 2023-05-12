package aula0405;

public class Vendedor extends Funcionario {
    private int numeroVendas;

    public int getNumeroVendas() {
        return numeroVendas;
    }

    public void setNumeroVendas(int numeroVendas) {
        this.numeroVendas = numeroVendas;
    }
    
    private double calcularComissao(){
        //comissao é o numerodevendas% do salariobase
        return this.getSalarioBase() * numeroVendas / 100;
    }
    
    public double calcularSalarioTotal(){
    // total = base + comissao
    return this.getSalarioBase() + this.calcularComissao();
    }
    
    public String toString(){
        String imprime = super.toString();
        imprime += "N° de vendas:"+ this.numeroVendas;
        imprime += "   Comissão:" + this.calcularComissao();
        imprime += "   Salário Total:" + this.calcularSalarioTotal();
        
        return imprime;
    }
}
