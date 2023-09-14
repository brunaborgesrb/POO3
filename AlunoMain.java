import java.util.ArrayList;
import java.util.List;

public class AlunoMain {

    public static void main(String[] args) {
        // criando objetos Aluno
        Aluno aluno1 = new Aluno("João", "2021001", new double[]{8.5, 7.5, 9.0});
        Aluno aluno2 = new Aluno("Maria", "2021002", new double[]{6.0, 6.5, 7.0});
        Aluno aluno3 = new Aluno("Pedro", "2021003", new double[]{9.5, 9.0, 9.5});

        // criando uma lista de alunos
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        // usando uma estrutura de repetição para listar alunos aprovados e reprovados
        List<Aluno> aprovados = new ArrayList<>();
        List<Aluno> reprovados = new ArrayList<>();

        for (Aluno aluno : alunos) {
            double media = aluno.calcularMedia();
            if (media >= 7.0) {
                aprovados.add(aluno);
            } else {
                reprovados.add(aluno);
            }
        }

        // exibindo os alunos aprovados
        System.out.println("Alunos Aprovados:");
        for (Aluno aluno : aprovados) {
            System.out.println("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
        }

        // exibindo os alunos reprovados
        System.out.println("Alunos Reprovados:");
        for (Aluno aluno : reprovados) {
            System.out.println("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
        }
    }
    
}
