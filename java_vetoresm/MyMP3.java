import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class MyMP3 {
    public static void main(String[] args) {
        var musicas = new ArrayList<Musica>();
        //1 - Cadastrar musica 2 - visualizar a lista, 3 - Remover musica 0 - sair
        int op;
        var menu = 
            "1-Cadastrar musica \n2-Listar Musicas \n3-Remover \n0-Sair";
        do {
            op = parseInt(showInputDialog(menu));
            switch (op) { // Note as chaves no case 1 e 3. Para restringir o escopo das variaveis. E os metodos de adicionar e remover sao diferentes
                case 1:{
                    var titulo = showInputDialog("Titulo?");
                    var musica = new Musica(titulo);
                    musicas.add(musica); 
                    showMessageDialog(null, "musica adicionada");
                    break;
                }
                case 2:
                    if ( !musicas.isEmpty()) { // o ! indica se nao esta vazio ao inves de se esta vazio
                        var sb = new StringBuilder("");
                        for (var m : musicas) {
                            sb.append(m.getTitulo()).append("\n");
                        }
                        showMessageDialog(null, sb.toString());
                    }
                    break;
                case 3:{
                    var titulo = showInputDialog("Qual musica deseja remover?");
                    musicas.remove(new Musica(titulo));
                    break;
                }
                case 0:
                    showMessageDialog(null, "Ate mais");
                    op = 0;
                    break;
                default:
                    break;
            }
        }while(op != 0);
    }
}
