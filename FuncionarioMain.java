
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncionarioMain {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        // criando uma lista de objetos Funcionario
        List<Funcionario> funcionarios = new ArrayList<>();

        // adicionando funcionários à lista
        funcionarios.add(new Funcionario("João", 60000, 28));
        funcionarios.add(new Funcionario("Maria", 45000, 32));
        funcionarios.add(new Funcionario("Pedro", 70000, 25));
        funcionarios.add(new Funcionario("Ana", 55000, 29));

        // usando uma estrutura de repetição para identificar os funcionários que ganham mais de R$50.000 por ano
        // e têm menos de 30 anos de idade e exibir seus nomes
        System.out.println("Funcionários que ganham mais de R$50.000 por ano e têm menos de 30 anos de idade:");

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getSalarioAnual() > 50000 && funcionario.getIdade() < 30) {
                System.out.println(funcionario.getNome());
            }
        }
    }
    
}
