public class VetorDinamico {
    private int qtde;
    private int cap;
    private int [] elementos;
    
    public void adicionar(int e){
        elementos[qtde] = e;
        qtde++;
    }
    
    public VetorDinamico(int cap){
        if (cap >= 4){
            elementos = new int[cap];
            this.cap = cap;
        }else
            elementos = new int[4];
            this.cap = 8;
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
