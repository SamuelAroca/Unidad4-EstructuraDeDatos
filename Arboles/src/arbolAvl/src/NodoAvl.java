public class NodoAvl extends Nodo{
    int fe;

    public NodoAvl(Object valor) {
        super(valor);
        fe = 0;
    }

    public NodoAvl(Object valor, NodoAvl ramaIzdo, NodoAvl ramaDcho) {
        super (ramaIzdo, valor, ramaDcho);
        fe = 0;
    }
}
