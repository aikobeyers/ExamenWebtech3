package edu.ap.quotes;

import org.restlet.resource.Get;

import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;
public class QuotesResource extends ServerResource {
	
	@Get
	public String allQuotes(){
		/*Methode om alle quotes op te halen.*/
		return "Success";
	}
	@Post
	public String searchQuote(String query)
	{
		/*Methode om de Quote te zoeken die de query bevat.*/
		return "Searchquery";
	}
	
	

}
