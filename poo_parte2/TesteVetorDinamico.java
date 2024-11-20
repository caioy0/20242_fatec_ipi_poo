import java.util.Random;

public class TesteVetorDinamico {
    public static void main(String[] args) throws Exception{
        //construior um vetor dinamico de tamanho 8
        //use o operdador de inferencia de tipo
        var teste = new VetorDinamico(8);
        var gerador = new Random();
        while (true) { 
            var valor = gerador.nextInt(10)+1;
            int a;
            //adicionar 
            teste.adicionar(valor);
            System.out.println(teste);
            System.out.println("=====================");
            //dormir por 5 segundo
            Thread.sleep(5000);
        }
    }
}
