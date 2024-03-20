public class BinarioLogica<E> {
    private ArbolBinario<E> root;

    public BinarioLogica() {
        this.root = null;
    }

    /**
    * Inserta un nodo en la B. D. Tambien de este Clase
    * 
    * @param englishWord - La cual se quiere insertar
    * @param spanishWord - La cual se quiere insert
    */
    public void insert(String englishWord, String spanishWord) {
        Nodo<String, String> newAssociation = new Nodo<>(englishWord, spanishWord);
        // MetodoInsertar el root de datos.
        if (root == null) {
            root = new ArbolBinario<>(newAssociation);
        } else {
            MetodoInsertar(root, newAssociation);
        }
    }

    /**
    * Metodo para insertar un arbol binario en la BD. Los valores correspondientes se encuentra como parametro
    * 
    * @param current - El arbol binario que se desea insertar
    * @param association - El nodo associativo a insertar
    * 
    * @return El arbol binario con el insertado de la BD ( estanda entre 0
    */
    private ArbolBinario<E> MetodoInsertar(ArbolBinario<E> current, Nodo<String, String> association) {
        // Obtiene el archivo de la binarios de la base de datos.
        if (current == null) {
            return new ArbolBinario<>(association);
        }
        // MetodoInsertar el metodo de la partir de la lista de los datos.
        if (association.getKey().compareTo(current.association.getKey()) < 0) {
            current.left = MetodoInsertar(current.left, association);
        // MetodoInsertar el metodo del insertar.
        } else if (association.getKey().compareTo(current.association.getKey()) > 0) {
            current.right = MetodoInsertar(current.right, association);
        }
        return current;
    }

    /**
    * Searches the trie for the word. It is case insensitive to avoid ambiguity in the search.
    * 
    * @param englishWord - The word to search for. If null or empty the search is performed for the root of the trie.
    * 
    * @return The word if found null otherwise. If no word was found null is returned as a result of the search
    */
    public String search(String englishWord) {
        return searchRecursive(root, englishWord.toLowerCase());
    }

    /**
    * Method to search a word in arbol binarizione and return its value. This method is recursive
    * 
    * @param current - ArbolBinario that is searched for
    * @param englishWord - Word that is searched for. It's case insensitive
    * 
    * @return String that contains the word's value or an empty string if not found. The value is a String
    */
    private String searchRecursive(ArbolBinario<E> current, String englishWord) {
        // Returns the word in the current word if there is one.
        if (current == null) {
            return "" + englishWord + ""; // Word not found
        }
        // Returns the value of the association.
        if (englishWord.equals(current.association.getKey().toLowerCase())) {
            return current.association.getValue(); // Word found
        }
        return englishWord.compareTo(current.association.getKey().toLowerCase()) < 0 ?
               searchRecursive(current.left, englishWord) :
               searchRecursive(current.right, englishWord);
    }

    /**
    * Traverses the tree in in order. This is equivalent to calling #inOrder ( Object ) followed by { @link visit ( Object )
    */
    public void inOrderTraversal() {
        inOrder(root);
    }

    /**
    * Metodo que inorder el arbol binario de esta clase. Ejecuta en el estructura de la BD
    * 
    * @param node - estructura de la BD
    */
    private void inOrder(ArbolBinario<E> node) {
        // In order the node s left and right side of the node.
        if (node != null) {
            inOrder(node.left);
            System.out.println("(" + node.association.getKey() + " " + node.association.getValue() + ")");
            inOrder(node.right);
        }
    }
}
