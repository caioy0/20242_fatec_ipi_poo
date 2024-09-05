
import javax.swing.JOptionPane;

public class LivroDeNotas {
    String nomeDisciplina = null;
    public void exibirMensagem(){
        //System.out.println("Bem vindo ao sistema de notas");
        JOptionPane.showMessageDialog(
            null, 
            String.format(
                "Bem vindo ao livro de notas da disciplina %s", 
                nomeDisciplina
            )    
        );
    }
}