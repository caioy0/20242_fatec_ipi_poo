public class VetorDinamico {
    private int qtde;
    private int cap;
    private int [] elementos;
    private final int CAPACIDADE_MINIMA = 4;
    
    public void adicionar(int e){
        // elementos[qtde] = e;
        // qtde++;

        //Primeiro verifica se o vetor esta cheio se sim 
        //alocar um novo vetor chamando aux com o dobro da capacidade atual
        if (estaCheio() ){
            redimensionar(2);
        }
        elementos[qtde++] = e;
    }

    public boolean estaUmQuartoCheio(){
        return qtde <= cap/4;
    }

    private void redimensionar(double fator){
        int[] aux;
        aux = new int [(int)(cap*fator)];
        for (int i = 0; i < qtde; i++){
            aux [i] = elementos[i];
        }
        cap = (int)(cap*fator);
        elementos = aux;
    }
    
    private void reduzirCapacidade(){
        //declarar um vetor auxiliar
        //copiar todo mundo do elemetos para o aux
        //ajusto elementos para que ele aponte para aux corto o cap pela metade
        int[] aux2;
        aux2 = new int [cap/2];
        for (int x = 0; x < qtde; x++){
            aux2[x] = elementos[x];
        }
        cap = cap/2;
        elementos = aux2;
    }

    private void aumentarCapacidade(){
        int[] aux;
        aux = new int [cap*2];
        for (int i = 0; i < qtde; i++){
            aux[i] = elementos[i];
            }
        cap = cap*2;
        elementos = aux;
    } 
    
    public void remover (){
        if (estaVazio()){
            qtde --;
        }
        if(estaUmQuartoCheio() && cap > CAPACIDADE_MINIMA){
            redimensionar(0.5);
        }
    }

    public boolean estaVazio(){
        return qtde == 0;
    }

    public boolean estaCheio(){
        return qtde == cap;
        // if(qtde == cap)
        //     return true;
        // return false;
    }
    
    public VetorDinamico(int cap){
        if (cap >= 4){
            elementos = new int[cap];
            this.cap = cap;
        }else
            elementos = new int[4];
            this.cap = 4;
        }
        //elementos = cap >= 4 ? new int[cap] : new int[4];

    public String toString(){
        var sb = new StringBuilder(" ");
        sb.append("qtde: ").append(qtde).append(" , cap: ").append(cap).append("\n");
        for(var i = 0; i < qtde; i++)
            sb.append(elementos[i]).append(" ");
        return sb.toString();
    }
}
