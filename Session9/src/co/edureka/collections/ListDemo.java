package co.edureka.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

class Product{
	int pid;
	int price;
	
	public String toString(){
		String data = pid+" | \u20b9"+price;
		return data;
	}
}

public class ListDemo {

	public static void main(String[] args) {

		int[] arr = new int[5];					// Here we can have only 5 elements
		
		//List list1 = new ArrayList(); 		// Polymorphic Statement
		ArrayList list1 = new ArrayList();		// Direct Object Construction 
		ArrayList<String> list2 = new ArrayList<String>();		
		ArrayList<Product> list3 = new ArrayList<Product>();
		
		Product p1 = new Product();
		p1.pid = 101;
		p1.price = 15000;
		
		Product p2 = new Product();
		p2.pid = 201;
		p2.price = 17000;
		
		// 1. Add Data in ArrayList !!
		list1.add("John");		//list1.add(0,"John");
		list1.add("Fionna");
		list1.add(100); // -> list1.add(new Integer(100)); | AUTO-BOX
		list1.add('A');
		list1.add(2.2);
		list1.add(p1);
		list1.add("John"); // Duplicacy Supported
		
		list2.add("John");
		list2.add("Jennie");
		list2.add("Jim");
		list2.add("Jack");
		list2.add("John");
		list2.add("Joe");
		list2.add("John");
		//list2.add('A');    err
		//list2.add(2.2);    err
		//list2.add(p1);     err
		
		list3.add(p1);
		list3.add(p2);
		//list3.add("John"); err
		//list3.add(2.2);    err
		
		// 2. Data in the Lists
		System.out.println("====list1 contents====");
		System.out.println(list1);
		System.out.println();
		
		System.out.println("====list2 contents====");
		System.out.println(list2);
		System.out.println();
		
		System.out.println("====list3 contents====");
		System.out.println(list3);
		System.out.println();
		
		// 3. Read Single Element
		Object o = list1.get(1); 	// list1 has no type specified and shall have data of various types. But Object is parent to all hence, Polymorphism !
		String str = list2.get(3);
		Product p = list3.get(0);
		
		System.out.println(o);
		System.out.println(str);
		System.out.println(p);
		
		// 4. Update Operation
		list2.set(1, "KIM");
		System.out.println(list2);

		// 5. Remove Operation
		list2.remove(1);
		System.out.println(list2);
		
		// 6. Remove All
		//list2.clear();
		
		// 7. Sizes of list
		System.out.println(list1.size());
		System.out.println(list2.size());
		System.out.println(list3.size());
		
		// 8. Read All Elements
		System.out.println("====1. For Loop====");
		for(int i=0;i<list1.size();i++){
			System.out.println(list1.get(i));
		}
		System.out.println();
		for(int i=0;i<list2.size();i++){
			System.out.println(list2.get(i));
		}
		System.out.println();
		for(int i=0;i<list3.size();i++){
			System.out.println(list3.get(i));
		}
		
		System.out.println("====2. Enhanced For Loop===="); // For-Each loop
		for(Object o1 : list1){
			System.out.println(o1);
		}
		
		System.out.println();
		for(String s : list2){
			System.out.println(s);
		}
		
		System.out.println();
		for(Product pr : list3){
			System.out.println(pr);
		}
		
		System.out.println("====3. Iterator====");
		// Iterates only in forward direction
		Iterator<String> itr = list2.iterator();
		/*System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());*/
		System.out.println(list2);
		while(itr.hasNext()){ // checks do we have next element available in the list ??
			String s = itr.next();
			System.out.println(s);
			if(s.equals("Jack")){ // checking if the element is equal to Jack, than remove it !!
				itr.remove(); // remove will be done from list2
			}
		}
		System.out.println(list2);
		
		System.out.println("====4. ListIterator====");
		// can iterates in both forward and backward direction
		ListIterator<String> listItr = list2.listIterator();
		while(listItr.hasNext()){
			String s = listItr.next();
			System.out.println(s);
		}
		System.out.println("----");
		while(listItr.hasPrevious()){
			String s = listItr.previous();
			System.out.println(s);
		}
		
		System.out.println("====5. Enumeration====");
		// reads elements from list
		Enumeration<String> enm = Collections.enumeration(list2);
		while(enm.hasMoreElements()){
			String s = enm.nextElement();
			System.out.println(s);
		}
		
		// 9. Sorting Data in List
		Collections.sort(list2);
		System.out.println(list2);
		
		// 10. Validating data in list
		if(list2.contains("John")){
			System.out.println("John is in the list");
		}else{
			System.out.println("John is not in the list");
		}
		
		// 11. Get Index of Elements
		int idx = list2.indexOf("John");
		idx = list2.lastIndexOf("John");
		System.out.println("John's index is: "+idx);
		
		// 12. Merge ArrayLists
		ArrayList<String> names = new ArrayList<String>();
		names.add("Fionna");
		names.add("Sia");
		names.add("George");
		names.add("Harry");
		
		list2.addAll(names);
		System.out.println(names);
		System.out.println(list2);
		
		// Vector : Thread-Safe Version of List (Synchronized)
		Vector<String> vector = new Vector<String>();
		vector.add("Fionna");
		vector.add("Sia");
		vector.add("George");
		vector.add("Harry");
		System.out.println("vector is: "+vector);
		
		for(String s : vector){
			System.out.println(s);
		}
		
		System.out.println("size of vector is: "+vector.size());
		vector.set(1, "Louis");
		System.out.println(vector);
	}

}
