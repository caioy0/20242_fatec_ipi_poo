
import javax.swing.JOptionPane;

public class TesteLivroDeNotas {
   public static void main(String... args) {
       //construir livro de notas
        LivroDeNotas meuLivro = new LivroDeNotas();
       //acionar o comportmento sobre ele
       var disciplina1 = JOptionPane.showInputDialog("Digite o nome da disciplina");
       meuLivro.nomeDisciplina = disciplina1;
       meuLivro.exibirMensagem();
        //Ou
       //var meuLivro2 = new LivroDeNotas();
       //meuLivro2.exibirMensagem();
       var disciplina2 = JOptionPane.showInputDialog("Digite o nome da disciplina 2: ");
       var meuLivro2 = new LivroDeNotas();
       meuLivro2.nomeDisciplina = disciplina2;
       meuLivro2.exibirMensagem();
       //new LivroDeNotas();
   } 
}