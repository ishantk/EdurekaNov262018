package co.edureka.io;

import java.io.BufferedReader;
//API | Application Programming Interfaces : Built in Code : All Built in classes with built in methods
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

// Every Class in Java is child of Object class
class Employee {  // -> class Employee extends Object{
	
	// Attributes
	int eid;
	String name;
	int salary;
	
	// Constructors
	public Employee(){
		
	}
	
	public Employee(int eid, String name, int salary) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString(){
		String str = eid+","+name+","+salary+"\n";
		return str;
	}
	
}

public class FileIO {

	void writeDataInFile(String data){
		try {
			
			// File in Current Directory
			// File file = new File("employeesdata.csv"); // comma separated values (Excel Format)
			
			// File in Specified Directory Directory
			File file = new File("/users/ishantkumar/Downloads/employeesdata.csv");
			//FileOutputStream outputStream = new FileOutputStream(file);
			FileOutputStream outputStream = new FileOutputStream(file, true); // true -> Enable Append Mode !!
			outputStream.write(data.getBytes()); // String is converted into bytes !!
			outputStream.close();				 // release resources from memory -> Important to put in the end !!
			
			System.out.println(">> "+file.getName()+" Written !!");
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	void writeDataInFileAgain(String data){
		try {
			
			
			// File in Specified Directory Directory
			File file = new File("/users/ishantkumar/Downloads/employeesdata1.csv");
			//FileWriter writer = new FileWriter(file);
			FileWriter writer = new FileWriter(file, true); // Append Mode
			writer.write(data);  // String is written as such !!
			writer.close();		 // release resources from memory -> Important to put in the end !!
			
			System.out.println(">> "+file.getName()+" Written !!");
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	void readDataFromFile(){
		try {
			// File in Specified Directory Directory
			File file = new File("/users/ishantkumar/Downloads/employeesdata.csv");
			FileInputStream inputStream = new FileInputStream(file); // Reads in the form of bytes
			
			int i = 0; 
			char ch = ' ';
			while( (i = inputStream.read()) != -1){ // -1 is end of file
				ch = (char)i; // Downcast byte to char
				System.out.print(ch);
			}
			
			inputStream.close(); // Release the memory resources 
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	void readDataFromFileAgain(){
		try {
			// File in Specified Directory Directory
			File file = new File("/users/ishantkumar/Downloads/employeesdata.csv");
			FileReader reader = new FileReader(file); 				// Reads in the form of text
			BufferedReader buffer = new BufferedReader(reader);		// To Read data from file line by line
			
			String line = "";
			while((line = buffer.readLine()) != null){
				System.out.println(line);
				
				//String[] arr = line.split(",");
				//System.out.println(arr[0]+" | "+arr[1]+" | "+arr[2]);
			}
			
			buffer.close();
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	
	public static void main(String[] args) {

		/*Employee emp1 = new Employee();
		emp1.eid = 101;
		emp1.name = "John";
		emp1.salary = 30000;
		
		Employee emp2 = new Employee(201, "Fionna", 40000);
		
		System.out.println(emp1); // System.out.println(emp1.toString());
		System.out.println(emp2); // System.out.println(emp1.toString());*/
		
		// Problem : Data in the Object is temporary as Object is constructed in the heap area
		//			 RAM is volatile. When our program finishes RAM is freed and Object with the data is destroyed !!
		//           In case we wish to save data of Object -> Files
		
		FileIO io = new FileIO();
		
		/*String data = emp1.toString();
		io.writeDataInFileAgain(data);
		data = emp2.toString();
		io.writeDataInFileAgain(data);*/
		
		io.readDataFromFileAgain();
		
	}

}
