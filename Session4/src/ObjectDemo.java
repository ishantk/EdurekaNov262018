// Textual Representation of Object !!
// What so ever you are writing in class is basically property of object !!
class User{
	
	// Attributes : Property of Object and Not of Class
	String name;
	private String phone; // Security
	String email;
	char gender;
	private int age;
	String address;
	
	// Methods: Property of Object and Not of Class
	
	// Setter Methods : Writes Data into Object
	void setPhone(String ph){
		phone = ph;
	}
	
	void setAge(int a){
		if(a>=18){
			age = a; // Validate and Set the Data
		}else{
			System.out.println("Sorry !! Invali Age Entered !!");
		}
	}
	
	// Getter Methods : Reads the data from Object
	String getPhone(){
		return phone;
	}
	
	int getAge(){
		return age;
	}
}

// ObjectDemo here us just having the main method for execution !!
public class ObjectDemo {

	// main is something which is executed when program runs !!
	public static void main(String[] args) {
		
		// Object Construction Statement
		User u1 = new User();
		System.out.println("u1 is: "+u1);
		// u1 is a reference variable which contains hashCode of Object
		// new creates an Object i.e. a BOX in the heap area dynamically i.e. at runtime
		
		User u2 = new User();
		System.out.println("u2 is: "+u2);
		
		User u3 = u1; // Reference Copy
		System.out.println("u3 is: "+u3);
		
		// u1 and u3 are two diff ref vars who are referring to the same object !!
		
		// Write Data in Object
		u1.name = "John";
		//u1.phone = "+91 99999 88888";
		u1.setPhone("+91 99999 88888");
		u3.email = "john@example.com";
		//u1.age = 32;
		u1.setAge(30);
		u3.address = "Redwood Shores";
		
		u2.name = "Fionna";
		//u2.phone = "+91 77777 88888";
		u2.setPhone("+91 77777 88888");
		u2.email = "fionna@example.com";
		//u2.age = 30;
		u2.setAge(30);
		u2.address = "Country Homes";
		
		u1.setAge(45);
		
		// Read Data from Object
		//System.out.println(u1.name+" is "+u3.age+" years old and can be called at "+u1.phone);
		//System.out.println(u2.name+" is "+u2.age+" years old and can be called at "+u2.phone);
		
		System.out.println(u1.name+" is "+u3.getAge()+" years old and can be called at "+u1.getPhone());
		System.out.println(u2.name+" is "+u2.getAge()+" years old and can be called at "+u2.getPhone());
	}

}
