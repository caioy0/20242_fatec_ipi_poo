public class Personagem{
    //Variavel de instancia
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;

    //Construtor padrao
    Personagem(int energia, int fome, int sono){
        //shadowing (sombreamento)
        if (energia >= 0 && energia <= 10)
            this.energia = energia;
        if (fome >= 0 && fome <= 10)
            this.fome = fome;
        if (sono >= 0 && sono <= 10)
            this.sono = sono;
        System.out.println("Construindo um objeto...");
    }

    void cacar(){
        if(energia >= 2){
            System.out.printf("%s caçando \n", nome);
            energia -= 2; // energia = energia -2
        }
        else{
            System.out.printf(
                "%s sem energia para cacar\n",
                nome
            );
            if(fome<10);
            fome = fome +1; // fome +=1 ou fome++ ou ++fome
            //if (fome <10); fome = fome +1;
            //sono = sono +1 >10 ? sono : sono +1;
            //sono = sono == 1 ? sono : sono +1;
            sono = Math.min(sono +1, 10);
            System.out.println(obterEstado());
        }
    }
        
    void comer(){
        if(fome >= 1){
            System.out.println(nome + " comendo");
            energia = Math.min (energia + 1, 10);
            fome--;
        }
        else{
            System.out.println(nome+" sem fome");
            System.out.println(obterEstado());
        }
    }
    
    void dormir(){
        if(sono >= 1){
            System.out.print(nome + " dormindo\n");
            energia = energia == 10 ? energia : energia + 1;
            sono -= 1;
        }
        else{ 
            System.out.print(nome + " sem sono\n");
            System.out.println(obterEstado());
        }
    }
    public String toString(){
        //nome: e5, f4, s:8
        return String.format(
            "%s: e(%d), f(%d), s(%d)",
            nome, energia, fome, sono
        );
    }
}