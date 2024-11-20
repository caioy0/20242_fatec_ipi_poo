public class TesteGenerics {
    public static void main(String[] args) {
        VetorDinamico <Integer> inteiros = new VetorDinamico<Integer>(8);
        inteiros.adicionar(1);
        VetorDinamico <String> strings = new VetorDinamico<String>(8);
        strings.adicionar("string qualquer");
        //strings.adicionar(1);
        var reais = new VetorDinamico<Double>(4);
        // Vetor dinamico <Musica> musicas = new VetorDInamico<Musica>(4);
        reais.adicionar(2.0);
        // reais.adicionar(new.Music("One"));
    }
}