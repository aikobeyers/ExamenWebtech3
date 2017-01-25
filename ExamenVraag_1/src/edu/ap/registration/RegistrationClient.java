package edu.ap.registration;
import org.restlet.resource.ClientResource;

public class RegistrationClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
        	ClientResource resource = new ClientResource("http://localhost:8080/ExamenVraag_1/registration");
        	// Post a new race
        	String registration1 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
        	registration1 += "<registration name=\"Patient 1\" date=\"25/01/2017 13:37\" born=\"07/02/1996\" verpleegkundige=\"Nurse Sally\">";
        	registration1 += "<diagnose>Coffee overdose.</diagnose></registration>";
        	
        	String registration2 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
        	registration2 += "<registration name=\"Patient 2\" date=\"25/01/2017 16:24\" born=\"03/05/1992\" verpleegkundige=\"Nurse Holly\">";
        	registration2 += "<diagnose>Energydrink overdose.</diagnose></registration>";
    		
        	resource.post(registration1);
    		resource.post(registration2);
    		// get the response
        	System.out.println(resource.getResponseEntity().getText());
        }
        catch (Exception e) {
            System.out.println("In main : " + e.getMessage());
        }

	}

}
