package co.edureka.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import co.edureka.model.Student;

/*
 
 SQL  : Structured Query Language
MySQL: Database (OpenSource)
JDBC : Java Data Base Connectivity

class Student{
	// Attributes
	int roll;
	String name;
	int age;
	String email;
	String address;
}

Table: Student
-------------------------------------------------------------
roll	|	name	|	age		|	email	|	address 	| Columns Names (Fields)
------------------------------------------------------------- 
101		|	John	|	20		| john@ex.. |	Redwood S...| Record or Row (Data in Object)
-------------------------------------------------------------

-------------------------------------------------------------

SQL Commands:

//1. Create Table Command
create table Student(
	roll integer primary key auto_increment,
	String varchar(256),
	age integer,
	email varchar(256),
	address varchar(256)
)

//2. insert into table
insert into Student values(null,'John',30,'john@example.com','Redwood Shores')

//3. Update operation
update Student set name = 'John Watson', age = 33 where roll = 1

//4. Delete Operation
delete from Student where roll = 1

//5. Select Operation (To fetch the data from DB's Table)
select * from Student
select name, age from Stduent
select name from Student where roll > 2


DB Vendor eg: Oracle o Micrososft:
	They shall give us a library. library is .jar(java archive: collection of bytecodes) file which contains defintions to interfeces of JDBC.



JDBC Procedure:
	1. Load the Driver
		1.1 Donwload .jar file by DB vendor (Type-4)
		1.2 Link jar file in eclipse Project
		1.3 Use Class.forname API to load the Driver

	2. Create Connection
		2.1 URL to the DB
		2.2 Username and Password
		2.3 Use Connection and DriverManager API to create connection

	3. Write SQL Statement		
		String sql = "insert into Student values(null,'John',30,'john@example.com','Redwood Shores')";

	4. Execute SQL Statement
		Use Statement or PreparedStatement API to execute SQL Statements

	5. Close Connection
		Execute close() method on Connection Object		


 */

// This shall have JDBC Procedure
public class JDBCHelper {
	
	Connection con;
	
	Statement stmt;
	PreparedStatement pStmt;
	
	CallableStatement cStmt;

	//1. Load the Driver
	public JDBCHelper() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(">> Driver Loaded");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	//2. Create Connection with DB
	public void createConnection(){
		try {
			
			String url = "jdbc:mysql://localhost/EdurekaNov26";
			String user = "root";
			String password = "";
			
			con = DriverManager.getConnection(url, user, password);
			
			System.out.println(">> Connection Created");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	//3. Write SQL Statement
	//4. Execute SQL Statement
	public void insertStudentInDB(Student sRef){
		try {
			
			//3. Write SQL Statement
			// Substitute Data in SQL Statement (Appending or Concatenating)
			//String sql = "insert into Student values(null,'"+sRef.name+"',"+sRef.age+",'"+sRef.email+"','"+sRef.address+"')";
			
			//4. Execute SQL Statement
			//stmt = con.createStatement(); 			// Creating a Statement object on Connection
			//int i = stmt.executeUpdate(sql); 		//executeUpdate -> insert/update/delete operations
			
			String sql = "insert into Student values(null, ?, ?, ?, ?)";
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, sRef.name);
			pStmt.setInt(2, sRef.age);
			pStmt.setString(3, sRef.email);
			pStmt.setString(4, sRef.address);
			
			int i = pStmt.executeUpdate();
			
			if(i>0){
				System.out.println(">> "+sRef.name+" Inserted !!");
			}else{
				System.out.println(">> "+sRef.name+" Not Inserted !!");
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public void updateStudentInDB(Student sRef){
		try {
			
			String sql = "update Student set name = ?, age = ?, email = ?, address = ? where roll = ?";
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, sRef.name);
			pStmt.setInt(2, sRef.age);
			pStmt.setString(3, sRef.email);
			pStmt.setString(4, sRef.address);
			pStmt.setInt(5, sRef.roll);
			
			int i = pStmt.executeUpdate();
			
			if(i>0){
				System.out.println(">> "+sRef.name+" Updated !!");
			}else{
				System.out.println(">> "+sRef.name+" Not Updated !!");
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public void deleteStudentFromDB(int roll){
		try {
			
			String sql = "delete from Student where roll = ?";
			pStmt = con.prepareStatement(sql);
			pStmt.setInt(1, roll);
			
			int i = pStmt.executeUpdate(); // Insert/Update/Delete Operations !!
			
			if(i>0){
				System.out.println(">> Roll #"+roll+" Deleted !!");
			}else{
				System.out.println(">> Roll #"+roll+" Not Deleted !!");
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	//public void fetchStudentFromDB(int roll){
	public ArrayList<Student> fetchStudentsFromDB(){
		ArrayList<Student> students = new ArrayList<Student>(); // Representing All the Student Object retrieved from Table as Rows
		try {
			
			String sql = "select * from Student";
			//String sql = "select * from Student where roll = ?";
			pStmt = con.prepareStatement(sql);
			//pStmt.setInt(1, roll);
			
			ResultSet rs = pStmt.executeQuery(); // Retrieve Operation
			while(rs.next()){
				Student sRef = new Student();
				sRef.roll = rs.getInt(1);
				sRef.name = rs.getString(2);
				sRef.age = rs.getInt(3);
				sRef.email = rs.getString(4);
				sRef.address = rs.getString(5);
				//System.out.println(sRef);
				students.add(sRef);
			}
			
			rs.close();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		return students;
	}
	
	public void executeProcedure(Student sRef){
		try{
			
			String sql = "{ call insertStudent(?, ?, ?, ?) }";
			cStmt = con.prepareCall(sql);
			cStmt.setString(1, sRef.name);
			cStmt.setInt(2, sRef.age);
			cStmt.setString(3, sRef.email);
			cStmt.setString(4, sRef.address);
			
			cStmt.execute();
			
			//cStmt.getResultSet();
			//.. Iterate in the ResultSet
			
			System.out.println(">> Procedure Executed");
			
		}catch (SQLException e) {
			System.out.println("Some Exception: "+e);
			//System.out.println(e.getErrorCode());
			//System.out.println(e.getMessage());
		}
	}
	
	public void processBatch(){
		try{
			
			String sql1 = "update Student set name = 'Sia Watson', age = 40 where roll = 3";
			String sql2 = "delete from Student where roll = 5"; // SQL Query Fails Due to wrong Column Name
			
			stmt = con.createStatement();
			con.setAutoCommit(false); // We will see when to commit or when to rollback. We are managing transaction !!
			
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			
			stmt.executeBatch();
			con.commit(); 			  // Ensuring all SQL Statements in the batch must be executed as a transaction !!
			
			System.out.println(">> Transaction Commited");
			
		}catch (SQLException e) {
			System.out.println("Some Exception: "+e);
			
			try {
				System.out.println(">> Rolling Back Transaction");
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			//System.out.println(e.getErrorCode());
			//System.out.println(e.getMessage());
		}
	}
	
	
	
	public void closeConnection(){
		try {
			con.close();
			System.out.println(">> Connection Closed");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
	}

}
