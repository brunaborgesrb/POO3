    public class Funcionario {
        String nome;
        double salarioAnual;
        int idade;


    public Funcionario (String nome, double salarioAnual, int idade){
        this.nome = nome;
        this.salarioAnual = salarioAnual;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public int getIdade() {
        return idade;
    }
}