package co.edureka.xml;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class MyHandler extends DefaultHandler{
	
	// Callbacks -> Executed Automatically !!
	
	public void startDocument() throws org.xml.sax.SAXException {
		System.out.println(">> Document Parsing Started");
	}
	
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		//System.out.print("<"+qName+">");
	}
	
	public void characters(char[] ch, int start, int length) throws SAXException {
		String data = new String(ch,start,length);
		System.out.print(data);
	}
	
	public void endElement(String uri, String localName, String qName) throws SAXException {
		//System.out.println("</"+qName+">");
	}
	
	public void endDocument() throws org.xml.sax.SAXException {
		System.out.println(">> Document Parsing Ended");
	}
	
}

public class SAXDemo {

	public static void main(String[] args) {

		try {
			
			File file = new File("/users/ishantkumar/Downloads/data.xml");
			MyHandler handler = new MyHandler();
			
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			
			parser.parse(file, handler);
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		

	}

}
