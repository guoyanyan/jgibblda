/**
 * 
 */
package jgibblda;

/**
 * @author thuvh
 * 
 */
public class Pair<K extends Object, V extends Comparable<V>> {
    
    protected K key;
    protected V value;
    
    public Pair (K key, V value){
        this.key = key;
        this.value = value;
    }
}
