import java.util.Random;

public class JogoV2 {
    public static void main(String[] args) {
        var cacador = new Personagem();
        cacador.nome = "Herobrine";
        var soneca = new Personagem(2,4,10);
        soneca.nome = "Ursinho Pooh";
        var fominha = new Personagem(6,10,2);
        fominha.nome = "Scooby";
        var gerador = new Random();

        while(true){
            var acaoDoCacador = gerador.nextInt(3) +1; // (0,3) 
            switch(acaoDoCacador){
                case 1:
                    cacador.cacar();
                    break;
                case 2:
                    cacador.comer();
                    break;
                case 3:
                    cacador.dormir();
                    break;
            }
            System.out.println(cacador);
            System.out.println("------------");
            var acaoDoSoneca = gerador.nextInt(3) + 1;
            if(acaoDoSoneca == 1){
                soneca.cacar();
                break;
            }
            else if(acaoDoSoneca == 2){
                soneca.comer();
                break;
            }
            else{
                soneca.dormir();
                break;
            }
            System.out.println(soneca);
            System.out.println("------------");
            switch(gerador.nextInt(3 +1)){
                case 1:
                    fominha.cacar();
                    break;
                case 2:
                    fominha.comer();
                    break;
                case 3:
                    fominha.dormir();
                    break;
            }
            System.out.println(fominha);
            System.out.println("------------");
            Thread.sleep(5000);
        }
    }
}
