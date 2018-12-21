package co.edureka.xml;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

class Student{
	int roll;
	String name;
	int age;
}

public class DOMWritrDemo {

	public static void main(String[] args) {
		
		try {
			
			Student s = new Student();
			s.roll = 111;
			s.name = "Fionna";
			s.age = 30;
			
			// Builder Design Pattern
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument(); // XML Document
			
			Element elmRoot = document.createElement("students");
			Element elmStudent = document.createElement("student");
			Element elmRoll = document.createElement("roll");
			Element elmName = document.createElement("name");
			Element elmAge = document.createElement("age");
			
			Text txtRoll = document.createTextNode(String.valueOf(s.roll));
			Text txtName = document.createTextNode(s.name);
			Text txtAge = document.createTextNode(String.valueOf(s.age));
			
			elmRoll.appendChild(txtRoll);
			elmName.appendChild(txtName);
			elmAge.appendChild(txtAge);
			
			elmStudent.appendChild(elmRoll);
			elmStudent.appendChild(elmName);
			elmStudent.appendChild(elmAge);
			
			elmRoot.appendChild(elmStudent);
			
			document.appendChild(elmRoot);
			
			// Source which must be transformed to an XML File !!
			DOMSource source = new DOMSource(document);
			
			File file = new File("/users/ishantkumar/Downloads/data.xml");
			FileOutputStream outputStream = new FileOutputStream(file);
			
			// StreamResult is the final result !!
			StreamResult result = new StreamResult(outputStream);
			
			// Transformer API : transforms DOMSource into the StreamResult !!
			TransformerFactory tFactory = TransformerFactory.newInstance();
			Transformer transformer = tFactory.newTransformer();
			
			transformer.transform(source, result);
			System.out.println(file.getName()+" Created !!");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}

	}

}
