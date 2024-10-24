import java.util.Random;

public class TesteVetorDinamico {
    public static void main(String[] args) throws Exception{
        //construior um vetor dinamico de tamanho 8
        //use o operdador de inferencia de tipo
        var teste = new VetorDinamico(4);
        var gerador = new Random();
        while (true) { 
            var valor = gerador.nextInt(10)+1;
            var oQueFazer = gerador.nextDouble();
            if(oQueFazer <= 0.5){
                System.out.println("Removendo: ...");
                teste.remover();
            }
            else{
                System.out.println("Adicionando: ...");
                teste.adicionar(valor);
            }
            System.out.println(teste);
            System.out.println("=====================");
            //dormir por 5 segundo
            Thread.sleep(5000);
        }
    }
}
