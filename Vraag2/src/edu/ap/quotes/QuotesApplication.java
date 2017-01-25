package edu.ap.quotes;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class QuotesApplication extends Application {

	    /**
	     * Creates a root Restlet that will receive all incoming calls.
	     */
	   @Override
	   public synchronized Restlet createInboundRoot() {

	       Router router = new Router(getContext());

	       router.attach("/allQuotes", QuotesResource.class);
	       

	       return router;
	   }
}