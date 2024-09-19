import java.util.Random;

public class JogoV2 {
    public static void main(String[] args) {
        var cacador = new Personagem();
        cacador.nome = "Herobrine";
        var soneca = new Personagem(2,4,10);
        soneca.nome = "Ursinho Pooh";
        var fominha = new Personagem(6,10,2);
        fominha.nome = "Scooby";
        var gerdaor new Random();
        while(true){
            var acaoDoCacador = gerdaor.next(3) +1;        
        }
    }
}
