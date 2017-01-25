package edu.ap.registration;
import org.restlet.resource.ClientResource;

public class RegistrationClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
        	ClientResource resource = new ClientResource("http://127.0.0.1:8080/hospital/registration");
        	// Post a new race
        	String registration1 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
        	registration1 += "<registration name=\"Patient 3\" date=\"25/01/2017 13:67\" born=\"07/07/1991\" verpleegkundige=\"Nurse Mustang\">";
        	registration1 += "<diagnose>Coffee overdose.</diagnose></registration>";
        	
        	String registration2 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
        	registration2 += "<registration name=\"Patient 4\" date=\"25/01/2017 11:24\" born=\"06/05/1997\" verpleegkundige=\"Nurse Charlie\">";
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
