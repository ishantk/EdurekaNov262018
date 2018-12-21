package co.edureka.lang;

public class WrapperDemo {

	public static void main(String[] args) {
	
		// Primitive Types : Single Value Container (They store data i.e. Value)
		int i = 10;
		char ch = 'A';
		double d = 2.2;
		
		// BOXING : Convert Primitive Type into a Reference Type i.e. an Object !!
		//Integer iRef = new Integer(i); 
		//Character cRef = new Character(ch);
		//Double dRef = new Double(d);
		
		// UNBOXING : Extracting Primitive from an Object
		//int j = iRef.intValue();
		//char c = cRef.charValue();
		//double e = dRef.doubleValue();
		
		// AUTOBOXING : The statements are implicit !!
		Integer iRef = i; 				// Compiler shall translate it -> Integer iRef = new Integer(i);
		Character cRef = ch;
		Double dRef = d;

		// AUTO UNBOXING : The statements are implicit !!
		int j = iRef;					// Compiler shall translate it ->  int j = iRef.intValue();
		char c = cRef;
		double e = dRef;
		
		// Pass ing primitives as references to method or usage of primitives anywhere as objects !!
	}

}
