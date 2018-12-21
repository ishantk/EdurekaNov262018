package co.edureka.main;

import java.util.ArrayList;

import co.edureka.db.JDBCHelper;
import co.edureka.model.Student;

public class App {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.roll = 0;
		s1.name = "Tania";
		s1.age = 29;
		s1.email = "tania@example.com";
		s1.address = "country Homes";
		
		Student s2 = new Student(8, "Annie Watson", 33, "annie.w@example.com", "Pristine Magnum");
		
		//System.out.println(s1);
		//System.out.println(s2);

		// Objects are created in Heap in RAM. RAM is temporary and data shall be lost whne program is over.
		// we can persist(save) the data of object in Database !! eg: MySQL
		
		// Lets persist the data in DB
		
		//1. Load the Driver
		JDBCHelper helper = new JDBCHelper();
		
		//2. Create Connection
		helper.createConnection();
		
		//3. Write SQL 4. Execute SQL
		//helper.insertStudentInDB(s1);
		//helper.insertStudentInDB(s2);
		
		//helper.updateStudentInDB(s2);
		
		//helper.deleteStudentFromDB(8);
		/*ArrayList<Student> students = helper.fetchStudentsFromDB();
		for(Student sRef : students){
			System.out.println(sRef);
		}*/
		
		//helper.executeProcedure(s1);
		
		helper.processBatch();
		
		//5. Close Connection
		helper.closeConnection();
	}

}
