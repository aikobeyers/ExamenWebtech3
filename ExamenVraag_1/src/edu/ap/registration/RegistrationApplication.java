package edu.ap.registration;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;



public class RegistrationApplication extends Application{

	@Override
	   public synchronized Restlet createInboundRoot() {

	       Router router = new Router(getContext());

	       router.attach("/registration", RegistrationResource.class);
	       

	       return router;
	   }
}
