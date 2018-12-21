package co.edureka.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

class Student{
	int roll;
	String name;
	int age;
	
	public String toString(){
		return roll+"\t"+name+"\t"+age;
	}
}

public class DOMReader {

	public static void main(String[] args) {
		try {
			
			File file = new File("/users/ishantkumar/Downloads/data.xml");
			
			// Builder Design Pattern
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(file);
			
			String rootElmName = document.getDocumentElement().getNodeName();  
			System.out.println(">> Root Element is: "+rootElmName);
			
			NodeList nodeList = document.getElementsByTagName("student");
			System.out.println(">> "+nodeList.getLength()+" student elements found in "+file.getName());
			
			for(int i=0;i<nodeList.getLength();i++){
				Node node = nodeList.item(i);
				Element element = (Element)node; // Element extends Node
				
				Student sRef = new Student();
				sRef.roll = Integer.parseInt(element.getElementsByTagName("roll").item(0).getTextContent());
				sRef.name = element.getElementsByTagName("name").item(0).getTextContent();
				sRef.age = Integer.parseInt(element.getElementsByTagName("age").item(0).getTextContent());
				
				System.out.println(sRef); // System.out.println(sRef.toString());
				System.out.println("---------------------");
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}

	}

}
