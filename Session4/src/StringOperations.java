
public class StringOperations {

	public static void main(String[] args) {
		
		// Strings are IMMUTABLE i.e. they cannot be changed !!
		// If we perform any manipulation operation on Strings we get a new String !!
		
		String str1 = "Its an Awesome Day !!";
		String str2 = str1.toUpperCase(); // toUpperCase converts the String into Upper Case
		
		System.out.println("str1 is: "+str1);
		System.out.println("str2 is: "+str2);

		String saluatation = "Mr.";
		String fname = "John";
		String lname = "Watson";
		
		//String name = saluatation.concat(" ").concat(fname).concat(" ").concat(lname);
		String name = saluatation+" "+fname+" "+lname;
		System.out.println("Name is: "+name);
		
		// API's in Strings : API is Application Programming Interfaces. We will be having some built in methods to explore
		
		String names = "John, Jennie, Jack, Jim, Joe";
		String newNames = names.replace('J', 'K');
		
		System.out.println("Names are : "+names);
		System.out.println("newNames are : "+newNames);
		
		char[] chArr = names.toCharArray();
		int count = 0;
		for(char ch : chArr){
			System.out.print(ch+" ");
			if(ch=='J'){
				count++;
			}
		}
		System.out.println();
		System.out.println("J occurs "+count+" times");
		
		//String str3 = names.substring(5);
		String str3 = names.substring(6,12); // 6 inclusive and 12 not inclusive
		System.out.println("str3 is: "+str3);
		
		int idx = names.indexOf('J');
		System.out.println("idx of J is: "+idx);
		
		idx = names.lastIndexOf('J');
		System.out.println("Last Index of J is: "+idx);
		
		int l = names.length();
		System.out.println("Length of String is: "+l);
		
		idx = names.indexOf("Jennie");
		System.out.println("Index of Jennie is: "+idx);
		
		char ch = names.charAt(7);
		System.out.println("char at index 7 is: "+ch);
		
		if(names.contains("Jennie")){
			System.out.println("Jennie is in the names");
		}
		
		String songName = "SomeSong.mp3";
		String domainName = "https://edureka.co";
		
		if(songName.endsWith(".mp3")){
			System.out.println("Its a Song Name");
		}
		
		if(domainName.startsWith("https://") && domainName.endsWith(".co")){
			System.out.println("Its a Valid Domain !!");
		}
		
		String[] allNames = names.split(",");
		for(String s : allNames){
			System.out.println(s.trim());
		}
		
		String alphaNumeric = "Password@123";
	}

}
