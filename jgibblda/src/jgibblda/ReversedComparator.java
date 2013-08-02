/**
 * 
 */
package jgibblda;

import java.util.Comparator;

/**
 * @author thuvh
 * 
 */
public class ReversedComparator<K extends Object, V extends Comparable<V>>
        implements Comparator<Pair<K, V>> {

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    @Override
    public int compare(Pair<K, V> o1, Pair<K, V> o2) {
        // TODO Auto-generated method stub
        return -1 * o1.value.compareTo(o2.value);
    }

}
