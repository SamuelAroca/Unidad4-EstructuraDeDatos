package punto1;

public class ArbolBinario {
    public Nodo raiz;

	public ArbolBinario() {
		raiz = null;
	}

	public ArbolBinario(Nodo raiz) {
		this.raiz = raiz;
	}

	public Nodo raizArbol() {
		return raiz;
	}

	// Comprueba el estatus del Árbol
	boolean esVacio() {
		return raiz == null;
	}

	// ...
	public static Nodo nuevoArbol(Nodo ramaIzqda, Object dato, Nodo ramaDrcha) {
		return new Nodo(ramaIzqda, dato, ramaDrcha);
	}

	public static void dibujar(String prefijo, boolean esCola, Nodo n) {
		if (n != null) {
			System.out.println(prefijo + (esCola ? "└── " : "├── ") + n.dato);
			dibujar(prefijo + (esCola ? "    " : "│   "), false, n.subarbolIzdo());
			dibujar(prefijo + (esCola ? "    " : "│   "), true, n.subarbolDcho());
		}
	}

	// Recorrido de un árbol binario en preorden
	public static void preorden(Nodo r) {
		if (r != null) {
			r.visitar();
			preorden(r.subarbolIzdo());
			preorden(r.subarbolDcho());
		}
	} 
	
	// Recorrido de un árbol binario en inorden
	public static void inorden(Nodo r) {
		if (r != null) {
			inorden(r.subarbolIzdo());
			r.visitar();
			inorden(r.subarbolDcho());
		}
	} 
	
	// Recorrido de un árbol binario en postorden
	public static void postorden(Nodo r) {
		if (r != null) {
			postorden(r.subarbolIzdo());
			postorden(r.subarbolDcho());
			r.visitar();
		}
	}

	public static int numNodos(Nodo raiz) {
		if (raiz == null)
			return 0;
		else
			return 1 + numNodos(raiz.subarbolIzdo()) + numNodos(raiz.subarbolDcho());
	}
}