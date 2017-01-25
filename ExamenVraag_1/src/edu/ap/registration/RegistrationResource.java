package edu.ap.registration;

import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;
import edu.ap.xml.XMLParser;

public class RegistrationResource extends ServerResource{
	
	@Get
	public String getRegistration(){
		return "Get successful.";
	}
	@Post
	public void addRegistration(String registration){
		XMLParser parser = new XMLParser();
		parser.addRegistration(registration);
	}
}
