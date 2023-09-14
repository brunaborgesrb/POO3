public class Livro {
    String titulo;
    String autor;
    boolean disponibilidade;

    public Livro (String titulo, String autor, boolean disponibilidade){
        this.titulo = titulo;
        this.autor = autor;
        this.disponibilidade = disponibilidade;
    }

    // método para verificar a disponibilidade do livro
    public String verificarDisponibilidade(){
            if (disponibilidade) {
                return "O livro '" + titulo + "' de " + autor + " está disponível para empréstimo.";
            } else {
                return "O livro '" + titulo + "' de " + autor + " não está disponível para empréstimo.";
            }
        }
    }

