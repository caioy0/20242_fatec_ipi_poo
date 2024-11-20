package sobrecarga_de_metodo;

public class Calculadora {
    public int somar(int a, int b){
        return a + b;
    }
    public double somar(double a, double b){
        return a + b;
    }

    public int somar(String a, String b){
        var a1 = Integer.parseInt(a);
        var b1 = Integer.parseInt(b);
        return a1+b1;
    }

    // public double somar(String a, String b){
    //     return Double.parseDouble(a) + Double.parseDouble(b);
    // }

    public int somar(int a, int b, int c){
        return a + b + c;
    }

    public int somar(int a, String b){
    return somar(a, Integer.parseInt(b));
    }

    public int somar (String a, int b){
        return somar(b,a);
    }
}
