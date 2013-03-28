package info.manankapadia.trie;

import java.util.Map;
import java.util.Set;

/**
 * 
 * @author manan
 * 
 * @param <T>
 */
public interface Trie<T> {

	/**
	 * Adds key-value pair to Trie
	 * 
	 * @param key
	 * @param value
	 */
	public void put(String key, T value);

	/**
	 * @param key
	 * @return value for given key. If not such key exists, it returns null
	 */
	public T get(String key);

	/**
	 * Removes key from the Trie.
	 * 
	 * @param key
	 */
	public void remove(String key);

	/**
	 * @param prefix
	 * @return all key-value pairs with given prefix
	 */
	public Map<String, T> search(String prefix);

	/**
	 * @return Set of all keys
	 */
	public Set<String> keySet();

	/**
	 * @return number of keys present in Trie
	 */
	public int size();

	/**
	 * Returns true if the key exists, false otherwise
	 * 
	 * @param key
	 * @return true if the key exists
	 */
	public boolean containsKey(String key);
}
