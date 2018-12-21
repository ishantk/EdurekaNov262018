
public class MutableStrings {

	public static void main(String[] args) {
		
		// Strings are IMMUTABLE !! i.e. they cannot be modified !!
		String str = new String("Hello");
		str.concat(" World");
		System.out.println("str is: "+str);
		
		// StringBuffer is MUTABLE !! i.e. they can be modified !! 	| THREAD-SAFE
		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append(" World");
		System.out.println("buffer is: "+buffer);
		
		// StringBuilder is MUTABLE !! i.e. they can be modified !!	| NOT THREAD-SAFE
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" World");
		System.out.println("builder is: "+builder);

	}

}
