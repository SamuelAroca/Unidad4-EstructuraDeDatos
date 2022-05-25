public class Numero implements Comparador{
    int valor;

    public Numero(int n) {
        valor = n;
        System.out.print(" -> " + valor);
    }

    public String toString() {
        return " " + valor;
    }

    public boolean igualQue(Object op2) {
        Numero p2 = (Numero) op2;
        return valor == p2.valor;
    }

    public boolean menorQue(Object op2) {
        Numero p2 = (Numero) op2;
        return valor < p2.valor;
    }

    public boolean menorIgualQue(Object op2) {
        Numero p2 = (Numero) op2;
        return valor <= p2.valor;
    }

    public boolean mayorQue(Object op2) {
        Numero p2 = (Numero) op2;
        return valor > p2.valor;
    }

    public boolean mayorIgualQue(Object op2) {
        Numero p2 = (Numero) op2;
        return valor >= p2.valor;
    }
}
