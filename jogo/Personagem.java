import math;

public class Personagem{
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;

    void cacar(){
        if(energia >= 2){
            System.out.printf("%s caçando", nome);
            energia -= 2; // energia = energia -2
        }else{
            System.out.printf(
                "%s sem energia para cacar\n",
                nome
            );
            if(fome<10);
            fome = fome +1; // fome +=1 ou fome++ ou ++fome
            if (fome <10); fome = fome +1;
            //sono = sono +1 >10 ? sono : sono +1;
            sono = sono == 1 ? sono : sono +1;
        }
    }
        
    void comer(){
        if(fome >= 1){
            System.out.println(nome + " comendo");
            energia = Math.min (energia + 1, 10);
            fome--;
        }else{
            System.out.println(nome+" sem fome");
        }
    }
    
    void dormir(){
        if(sono >= 1){
            System.out.print(nome + " dormindo\n");
            energia = energia == 10 ? energia : energia + 1;
            sono -= 1;
        }else{ 
            System.out.print(nome + " sem sono\n");
        }
    }
}