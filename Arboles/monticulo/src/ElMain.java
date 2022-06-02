public class ElMain {
    public static void main(String[] args) {
        Numero[] a = {new Numero(151), new Numero(21), new Numero(39), new Numero(80), new Numero(36)};
        Monticulo.ordenacionMonticulo(a, a.length);
        for (Numero numero : a) {
            System.out.print(" " + numero);
        }
    }
}
