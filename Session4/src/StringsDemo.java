
public class StringsDemo {

	public static void main(String[] args) {
		
		char chr = 'A';
		
		// Interned Way
		String str1 = "HelLO";
		String str2 = "Hello";
		
		// Object Way
		String str3 = new String("Hello");
		String str4 = new String("HelLO");
		
		// Strings are Reference Type !!
		// We see Values i.e. data instead of HashCodes !!
		// Why is it so ?
		
		System.out.println("str1 is: "+str1); // here also toString is getting executed automatically for us by compiler
		System.out.println("str2 is: "+str2);
		System.out.println("str3 is: "+str3);
		System.out.println("str4 is: "+str4);
		
		// Built In Method in Strings which gets executed upon printing of reference variables : toString()
		System.out.println("str1 with toString() is: "+str1.toString());
		System.out.println("str2 with toString() is: "+str2.toString());
		System.out.println("str3 with toString() is: "+str3.toString());
		System.out.println("str4 with toString() is: "+str4.toString());
		
		// Hence we do not see hashCodes rather we see values !!
		
		// How to prove that Strings are reference types? We will compare reference variables !!
		
		if(str1 == str2){
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}
		
		if(str3 == str4){
			System.out.println("str3 == str4");
		}else{
			System.out.println("str3 != str4");
		}
		
		// == operator is comparing references and not the values
		
		// Value or Data Comparison
		
		// This is String Comparison : Content
		//if(str1.equals(str2)){
		if(str1.equalsIgnoreCase(str2)){
			System.out.println("str1 is equal to str2");
		}else{
			System.out.println("str1 is not equal to str2");
		}
		
		
		//if(str3.equals(str4)){
		if(str3.equalsIgnoreCase(str4)){
			System.out.println("str3 is equal to str4");
		}else{
			System.out.println("str3 is not equal to str4");
		}
		
		/*int a1 = 10;
		int a2 = 10;
		
		if(a1 == a2){ // Primitive Comparison : Here a1 and a2 are containing values !!
			
		}*/
		
		//if(str1.compareTo(str2) == 0){
		if(str1.compareToIgnoreCase(str2) == 0){
			System.out.println("str1 compared to str2");
		}else{
			System.out.println("str1 not compared to str2");
		}
		
		//if(str3.compareTo(str4) == 0){
		if(str3.compareToIgnoreCase(str4) == 0){
			System.out.println("str3 compared to str4");
		}else{
			System.out.println("str3 not compared to str4");
		}
		
		// Strings in Java are Reference Types !! :)
		
		
		
	}

}
