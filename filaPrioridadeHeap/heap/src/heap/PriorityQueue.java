package heap;

import java.security.InvalidKeyException;
import java.util.Map;

/**
 *
 * @author luca
 */
public interface PriorityQueue<K,V> {
    public int size();
    public boolean isEmpty();
    public Map.Entry<K,V> min() throws RuntimeException;
    public Map.Entry<K,V> insert(K key,V value) throws InvalidKeyException;
    public Map.Entry<K,V> removeMin() throws RuntimeException;
}
