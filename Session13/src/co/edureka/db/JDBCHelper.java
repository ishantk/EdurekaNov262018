package co.edureka.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import co.edureka.model.User;

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
	public int registerUser(User user){
		int i = 0;
		try {

			String sql = "insert into User values(null, ?, ?, ?)";
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, user.name);
			pStmt.setString(2, user.email);
			pStmt.setString(3, user.password);
			
			i = pStmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		return i;
	}
	
	public boolean loginUser(User user){
		
		boolean result = false;
		try {

			String sql = "select * from user where email = ? and password = ?";
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, user.email);
			pStmt.setString(2, user.password);
			
			ResultSet rs = pStmt.executeQuery();
			
			result = rs.next();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		return result;
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
