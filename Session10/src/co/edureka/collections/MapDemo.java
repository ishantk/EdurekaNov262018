package co.edureka.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		// Polymorphic Statement
		//Map<Integer, String> map = new HashMap<Integer, String>();
		
		// Direct Object Construction
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		//TreeMap<K, V> ? Explore and See the difference (Sorted)
		map.put(101, "John"); // key value pair is known as an Entry Object
		map.put(111, "Jennie");
		map.put(678, "Jim");
		map.put(345, "Jack");
		map.put(231, "Joe");
		map.put(987, "Jennie");
		map.put(454, null);
		map.put(null, "Sia");
		
		//HashMap<String, Employee> map = new HashMap<String, Employee>(); // keys must be unique
		
		// PS: map can have unique keys i.e. keys cannot be duplicated
		//	   map can have duplicate values to unique keys
		// 	   map allows null key and null values
		// 	   map stores data using hashing so output is unordered
		
		System.out.println("===map contents====");
		System.out.println(map);
		
		// Obtain only Single Record
		String name = map.get(231);
		System.out.println("name is: "+name);
		
		System.out.println("map size is: "+map.size());
		map.remove(231);
		System.out.println("map size is: "+map.size());
		
		if(map.containsKey(987)){
			System.out.println("987 key exists");
		}
		
		if(map.containsValue("Sia")){
			System.out.println("Sia exists in map");
		}
		
		Set<Integer> keys = map.keySet(); // Extract all the keys of map and shall return a Set of keys
		System.out.println("===keys in map===");
		System.out.println(keys);
		
		// How we can Iterate on Set. Iterator !!
		System.out.println();
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			String value = map.get(key);
			System.out.println(key+"\t"+value);
		}
		
		System.out.println();
		
		// EntrySet for Iteration
		Set<Entry<Integer, String>> entries = map.entrySet(); // (Set of type Entry)
		Iterator<Entry<Integer, String>> itr1 = entries.iterator();
		while(itr1.hasNext()){
			Entry<Integer, String> entry = itr1.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		

		// Hashtable is THREAD-SAFE i.e. it is SYNCHRONIZED
		// It cannot have null key or null values
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(101, "John"); // key value pair is known as an Entry Object
		table.put(111, "Jennie");
		table.put(678, "Jim");
		table.put(345, "Jack");
		table.put(231, "Joe");
		table.put(987, "Jennie");
		//table.put(454, null);
		//table.put(null, "Sia");
		
		System.out.println(table);
		Set<Integer> keys1 = table.keySet();
		Set<Entry<Integer, String>> entries1 = table.entrySet();
		// You can just explore
		
	}

}
