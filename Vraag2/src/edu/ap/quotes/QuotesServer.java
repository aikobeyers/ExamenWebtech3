package edu.ap.quotes;

import org.restlet.*;
import org.restlet.data.Protocol;



public class QuotesServer {
public static void main(String[] args) {
		
		try {
			
		    Component component = new Component();
	
		    
		    component.getServers().add(Protocol.HTTP, 8080);
	
		    
		    component.getDefaultHost().attach("/quotes", QuotesResource.class);
		    
		    
			component.start();
		} 
	    catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
