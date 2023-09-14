public class LivroMain {
    public static void main(String[] args) {
        // criar objetos Livro
        Livro livro1 = new Livro("Aventuras de Sherlock Holmes", "Arthur Conan Doyle", true);
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", false);
        Livro livro3 = new Livro("O Hobbit", "J.R.R. Tolkien", true);

        // verificar a disponibilidade dos livros
        System.out.println(livro1.verificarDisponibilidade());
        System.out.println(livro2.verificarDisponibilidade());
        System.out.println(livro3.verificarDisponibilidade());
    }
}
