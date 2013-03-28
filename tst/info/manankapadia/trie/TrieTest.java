package info.manankapadia.trie;

import info.manankapadia.trie.impl.TrieImpl;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import junit.framework.Assert;

import org.junit.Test;

public class TrieTest {

	@Test
	public void testTrie() {
		Trie<String> t = new TrieImpl<String>();

		// Test put and get operations
		t.put("key1", "value1");
		Assert.assertEquals("value1", t.get("key1"));
		Assert.assertEquals(1, t.size());

		t.put("key1", "value12");
		Assert.assertEquals("value12", t.get("key1"));
		Assert.assertEquals(1, t.size());

		t.put("key2", "value2");
		Assert.assertEquals("value2", t.get("key2"));
		Assert.assertEquals(2, t.size());

		t.put("21", "somevalue");
		Assert.assertEquals("somevalue", t.get("21"));
		Assert.assertNull(t.get("2"));
		
		// Test size
		Assert.assertEquals(3, t.size());

		// Test containsKey operation
		Assert.assertTrue(t.containsKey("21"));
		Assert.assertFalse(t.containsKey("42"));
		Assert.assertFalse(t.containsKey("2"));

		// Test search operation
		Map<String, String> expectedResults = new TreeMap<String, String>();
		expectedResults.put("key1", "value12");
		expectedResults.put("key2", "value2");
		Assert.assertEquals(expectedResults, t.search("key"));

		// Test keySet operation
		Set<String> expectedKeySet = new TreeSet<String>();
		expectedKeySet.add("key1");
		expectedKeySet.add("21");
		expectedKeySet.add("key2");
		Assert.assertEquals(expectedKeySet, t.keySet());

	}
}
