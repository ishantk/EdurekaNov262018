// Textual Representation of an Object
class Counter{
	
	// Attribute : Property of Object
	int count;
	
	// Attribute : Property of Class
	static int sCount;
	
	// RULE: Property of Object can Access Property of Class
	
	// Constructor : Property of Object
	Counter(){
		count = 1;
		sCount = 1;
	}
	
	// Methods : Property of Object
	void incrementCount(){
		count++;  // count = count + 1;
		sCount++; // sCount = sCount + 1; 
	}
	
	void showCount(){
		System.out.println("count is: "+count+" and sCount is: "+sCount);
	}
	
	// Method: Property of Class
	static void showSCount(){
		// System.out.println("count is: "+count+" and sCount is: "+sCount);
		// We cannot access count since it is property of Object and not of Class
		System.out.println("sCount is: "+sCount);
	}
}

// Concept: static is property of class
//          non static is property of object
// Both class and object can be containers to hold data !!
// We have only 1 class but multiple objects !!
// Class Container is always 1 in number but objects for it can be multiple !!

// Object's Property can Access Class's Property
// Class's Property Cannot Access Object's Property




public class StaticDemo {

	public static void main(String[] args) {
		
		Counter c1 = new Counter(); // c1 or c3 : count : 1 sCount : 1
		Counter c2 = new Counter();
		Counter c3 = c1;			// c1 or c3 : count : 1 sCOunt : 1
		
		c1.incrementCount();  // c1 or c3 	: count 2   sCount 2
		c2.incrementCount();  // c2  		: count 2  	sCount 3
		c3.incrementCount();  // c1 or c3 	: count 3   sCount 4
		
		c3.incrementCount();  // c1 or c3 	: count 4   sCount 5
		c3.incrementCount();  // c1 or c3 	: count 5	sCount 6
		c2.incrementCount();  // c2  		: count 3	sCount 7
		
		c1.incrementCount();  // c1 or c3 	: count 6	sCount 8
		c3.incrementCount();  // c1 or c3 	: count 7	sCount 9
		c2.incrementCount();  // c2  		: count 4	sCount 10
		
		c1.showCount(); // count is: 7 and sCount is 10
		c2.showCount(); // count is: 4 and sCount is 10
		c3.showCount(); // count is: 7 and sCount is 10

	}

}
