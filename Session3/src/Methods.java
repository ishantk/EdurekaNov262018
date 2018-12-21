import java.util.Scanner;

public class Methods {
	
	// Non Static Method -> to execute it we need an object
	void areaOfRectangle(int l, int b){
		int area = l * b;
		System.out.println("Area of Rectangle is: "+area);
	}

	public static void main(String[] args) {
		
		// We will be able to read data from console
		Scanner scanner = new Scanner(System.in); // Object Construction for Scanner Class (Built In)
	
		System.out.println("Enter Length: ");
		int l = scanner.nextInt();
		System.out.println("Enter Breadth: ");
		int b = scanner.nextInt();
		
		Methods m = new Methods();
		m.areaOfRectangle(l, b); // here control jumps to the method frame
		
		System.out.println("This is main's last statement"); // this statement will be on hold till areaofRectangle is not finished with execution
	}

}
