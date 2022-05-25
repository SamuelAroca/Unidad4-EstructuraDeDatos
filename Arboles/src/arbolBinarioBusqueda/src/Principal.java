public class Principal {
    public static void main(String[] args) {
        try {
            ArbolBinario arbol;
            Nodo a1, a2, a, b;
            //PilaVector pila = new PilaVector();
            a1 = ArbolBinario.nuevoArbol(null, "Maria", null);
            a2 = ArbolBinario.nuevoArbol(null, "Rodrigo", null);
            a = ArbolBinario.nuevoArbol(a1, "Esperanza2", a2);
            //pila.insertar(a);
            a1 = ArbolBinario.nuevoArbol(null, "Anyora", null);
            a2 = ArbolBinario.nuevoArbol(null, "Abel", null);
            b = ArbolBinario.nuevoArbol(a1, "M Jesus", a2);
            //pila.insertar(a);
            //a2 = (Nodo) pila.quitar();
            //a1 = (Nodo) pila.quitar();
            a = ArbolBinario.nuevoArbol(a, "Esperanza1", b);
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
