package co.edureka.pack1;

public class App {

	public static void main(String[] args) {
		
		// We can create Objects of any class in any class if they are in the same package
		
		One oRef = new One();
		//oRef.pvtShow(); // For a public class One private method is not accessible. Its visibility is just within the class
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		System.out.println();
		
		Two tRef = new Two();
		//tRef.pvtShow(); // For a default class two private method is not accessible. Its visibility is just within the class
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();
		
		
		

	}

}
