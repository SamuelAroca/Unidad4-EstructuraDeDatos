import java.io.*;

public class ArbolDeFibonacci {
    static final int TOPEMAX = 100;

    public static void main(String[] a) throws Exception {
        ArbolBinario arbolFib;
        int n;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.print("Número de nodos del árbol: ");
            n = Integer.parseInt(entrada.readLine());
        } while (n <= 0);
        arbolFib = new ArbolBinario(arbolFibonacci(n));
        System.out.println("Árbol de Fibonacci de máxima altura:");
        ArbolBinario.dibujar("", false, arbolFib.raizArbol());
		/*System.out.print("In : ");
		ArbolBinario.inorden(arbolFib.raizArbol());
		System.out.print("\nPre: ");
		ArbolBinario.preorden(arbolFib.raizArbol());*/
    }

    // método recursivo que genera el árbol de Fibonacci
    public static Nodo arbolFibonacci(int n) {
        int nodosIz, nodosDr;
        int clave;
        Nodo nuevoRaiz;
        if (n == 0)
            return null;
        else {
            nodosIz = n / 2;
            nodosDr = n - nodosIz - 1;
            // nodo raíz con árbol izquierdo y derecho de Fibonacci
            clave = (int) (Math.random() * TOPEMAX) + 1;
            nuevoRaiz = new Nodo(arbolFibonacci(nodosIz), clave, arbolFibonacci(nodosDr));
            return nuevoRaiz;
        }
    }

    // método de escritura de las claves del árbol
    static void dibujarArbol(Nodo r, int h) {
        /*
         * escribe las claves del arbol de fibonacci; h estable una separacion entre
         * nodos
         */
        int i;
        if (r != null) {
            dibujarArbol(r.subarbolIzdo(), h + 1);
            for (i = 1; i <= h; i++)
                System.out.print(" ");
            System.out.println(r.valorNodo());
            dibujarArbol(r.subarbolDcho(), h + 1);
        }
    }
}
