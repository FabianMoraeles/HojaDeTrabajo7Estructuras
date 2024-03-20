public class Nodo<K, V> {
    K key;
    V value;

    public Nodo(K key, V value) {
        this.key = key;
        this.value = value;
    }

    /**
    * Returns the key associated with this key. This method is useful for subclasses to provide their own key implementation.
    * 
    * 
    * @return the key associated with this key or null if there is no key associated with this key ( for example if the key is an object
    */
    public K getKey() {
        return key;
    }

    /**
    * Returns the value of this parameter. This method is useful for debugging and to avoid having to re - implement #getValue () in a test.
    * 
    * 
    * @return the value of this parameter or null if there is no value associated with this parameter ( for example if the parameter is null
    */
    public V getValue() {
        return value;
    }
}