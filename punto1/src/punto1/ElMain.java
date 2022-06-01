package punto1;

public class ElMain {
    public static void main(String[] args) {
        try {
            ArbolBinario arbol;
            Nodo a1, a2, a3, a4, a, b, c;
            
            a1 = ArbolBinario.nuevoArbol(null, "G", null);
            a2 = ArbolBinario.nuevoArbol(null, "K", null);
            a3 = ArbolBinario.nuevoArbol(null, "H", a2);
            a = ArbolBinario.nuevoArbol(a1, "F", a3);
            
            a1 = ArbolBinario.nuevoArbol(null, "L", null);
            b = ArbolBinario.nuevoArbol(a, "D", a1);

            a1 = ArbolBinario.nuevoArbol(null, "Z", null);
            a2 = ArbolBinario.nuevoArbol(null, "W", null);
            a3 = ArbolBinario.nuevoArbol(a2, "R", null);
            a4 = ArbolBinario.nuevoArbol(a3, "Q", null);
            c = ArbolBinario.nuevoArbol(a4, "P", a1);
            

            a = ArbolBinario.nuevoArbol(b, "A", c);
            arbol = new ArbolBinario(a);
            ArbolBinario.dibujar("",false, arbol.raiz);
            System.out.println("Recorrido PreOrden: ");
            ArbolBinario.preorden(arbol.raiz);
            System.out.println("\nRecorrido EnOrden: ");
            ArbolBinario.inorden(arbol.raiz);
            System.out.println("\nRecorrido PostOrden: ");
            ArbolBinario.postorden(arbol.raiz);
            System.out.println("\nNúmero de nodos: "+ ArbolBinario.numNodos(arbol.raiz));
        } catch (Exception t) {
            System.out.println("Ha ocurrido la excepción: " + t);
        }
    }
}
