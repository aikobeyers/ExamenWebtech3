package edu.ap.registration;

import org.restlet.*;
import org.restlet.data.Protocol;



public class RegistrationServer {
public static void main(String[] args) {
		
		try {
			
		    Component component = new Component();
	
		    
		    component.getServers().add(Protocol.HTTP, 8080);
	
		    
		    component.getDefaultHost().attach("/hospital",RegistrationResource.class);
		    
		    
			component.start();
		} 
	    catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
