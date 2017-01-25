package edu.ap.xml;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.xml.sax.InputSource;

import java.io.*;

public class XMLParser {
	
	private String INPUTFILE = "/Users/aikobeyers/Desktop/ExamenWebtech3/ExamenVraag_1/WebContentl/Registrations.xml";
	
	
	public void addRegistration(String xml) {
		File inputFile = new File(INPUTFILE);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        // set validating false to enable copying
        // node from one document to another
        dbFactory.setValidating(false);
        DocumentBuilder dBuilder;
        
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc1 = dBuilder.parse(inputFile);
	        Document doc2 = dBuilder.parse(new InputSource(new StringReader(xml)));
	        Element element = (Element) doc2.getDocumentElement();
	        // imports a node from doc2 document to doc1, without altering
	        // or removing the source node from the original document
	        Node copiedNode = doc1.importNode(element, true);
	        // adds the node to the end of the list of children of this node
	        doc1.getDocumentElement().appendChild(copiedNode);
	        
	        /*FileWriter fw = new FileWriter(INPUTFILE);
	        fw.write(doc1.toString());
	        fw.close();*/
	        // write the new document to file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc1);
			StreamResult result = new StreamResult(new File("/Users/aikobeyers/Desktop/races.xml"));
			transformer.transform(source, result);
	        
	        
		} 
		catch (Exception e) {
		System.out.println(e.getMessage());
		}
	}

	
}
