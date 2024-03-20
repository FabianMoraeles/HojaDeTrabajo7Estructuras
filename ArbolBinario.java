// Agrega el conjunto de estados en la tabla arbol binario de cada
public class ArbolBinario<E> {
    Nodo<String, String> association;
    ArbolBinario<E> left;
    ArbolBinario<E> right;

    public ArbolBinario(Nodo<String, String> association) {
        this.association = association;
        this.left = null;
        this.right = null;
    }
}
