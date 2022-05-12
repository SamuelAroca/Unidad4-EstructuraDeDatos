package arbolBinario;

public class ElMain {
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
            int z = 1;
        } catch (Exception t) {
            System.out.println("Ha ocurrido la excepción: " + t);
        }
    }
}
