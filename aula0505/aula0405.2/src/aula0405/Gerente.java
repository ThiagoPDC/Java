package aula0405;

public class Gerente extends Funcionario {
    
    private double bonus; 

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public double calcularSalarioTotal(){
        return this.getSalarioBase() + this.bonus;
    }
    
    public String toString(){
        String imprime = super.toString();
        imprime += "Bônus injusto: " + this.bonus + "\n";
        imprime += "Gerentes que prestam: " + this.calcularSalarioTotal() + "\n";
        
        return imprime;

    }
}
