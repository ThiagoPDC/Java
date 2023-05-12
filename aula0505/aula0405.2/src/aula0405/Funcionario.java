package aula0405;

/*Classes abstratas são classes que não podem ser instenciadas, mas que podem 
ser herdadas normalmente.
*/
public abstract class Funcionario {
  //SUPER CLASSE
    private String nome;
    private String numClt;
    private double salarioBase;
    /*
        Métodos abstratos são métodos que não são implementados,
    mas indicam que as sub-classes (classes filhas) deverão implementa-los obrigatóriamente
    */
    public abstract  double calcularSalarioTotal();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumClt() {
        return numClt;
    }

    public void setNumClt(String numClt) {
        this.numClt = numClt;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public String toString(){
        String imprime = "--------------\n";
        imprime += "Nome: " + nome + "\n";
        imprime += "N° CLT: " + numClt + "\n";
        imprime += "Salário base: " + salarioBase + "\n";
        
        return imprime;
    }
}
