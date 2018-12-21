package co.edureka.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		//Set set = new HashSet();
		//HashSet set = new HashSet(); // Saves only unique elements and removes duplicates
		// uses hashing technique to store the data. (Google Up the algorithm) Thats why output shall be unordered.
		// Here hashCodes will be generated in the background to store elements and no indexing here
		
		//HashSet<String> set = new HashSet<String>();   // Shall not sort the data
		TreeSet<String> set = new TreeSet<String>();     // Sort the data (Sorted Version of HashSet)
		set.add("John");
		set.add("Jennie");
		set.add("Sia");
		set.add("John");
		set.add("Fionna");
		set.add("John");
		set.add("Aby");
		set.add("Kim");
		
		System.out.println(set);
		// we cannot get data from set as we do not have indexes here : we dont have get method
		// we shall iterate in the set
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String name = itr.next();
			System.out.println(name);
		}
		
		set.remove("Sia");
		//set.clear();
		
		if(set.contains("Kim")){
			System.out.println("Kim is in the set");
		}

		
		
	}

}
