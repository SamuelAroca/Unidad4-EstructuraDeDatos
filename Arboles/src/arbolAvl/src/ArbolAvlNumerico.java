import java.util.Random;

public class ArbolAvlNumerico {
    static final int TOPEMAX = 999;

    public static void main(String[] a) throws Exception {
        ArbolAvl avl = new ArbolAvl();
        Numero elemento;
        //int numNodos;
        Random random = new Random(3);

        while (ArbolBinario.altura(avl.raizArbol()) < 5) {
            elemento = new Numero((int) (random.nextDouble() * TOPEMAX) + 1);
		/*	elemento = new Numero(5);
			avl.insertar(elemento);
			elemento = new Numero(4);
			avl.insertar(elemento);
			elemento = new Numero(6);
			avl.insertar(elemento);
			elemento = new Numero(1);
			avl.insertar(elemento);
			elemento = new Numero(3);*/
            avl.insertar(elemento);
        }
		/*System.out.print("\n Inorden:  ");
		ArbolBinario.inorden(avl.raizArbol());
		System.out.print("\n Preorden: ");
		ArbolBinario.preorden(avl.raizArbol());
		System.out.print("\n Anchura:  ");
		ArbolBinario.anchura(avl.raizArbol());
		System.out.println("\n Altura: " + altura(avl.raizArbol()));*/
        System.out.println("\n");
        ArbolBinario.dibujar("", true, avl.raizArbol());
    }

    static int visualizar(NodoAvl r) // escribir claves de ï¿½rbol
    {
        if (r != null) {
            int cuantosIzquierda, cuantosDerecha;
            cuantosIzquierda = visualizar((NodoAvl) r.subarbolIzdo());
            System.out.print(r.valorNodo());
            cuantosDerecha = visualizar((NodoAvl) r.subarbolDcho());
            return cuantosIzquierda + cuantosDerecha + 1;
        } else
            return 0;
    }

    static int altura(NodoAvl r) // calcula y devuelve altura
    {
        if (r != null)
            return mayor(altura((NodoAvl) r.subarbolIzdo()), altura((NodoAvl) r.subarbolDcho())) + 1;
        else
            return 0;
    }

    static int mayor(int x, int y) {
        return (x > y ? x : y);
    }
}
