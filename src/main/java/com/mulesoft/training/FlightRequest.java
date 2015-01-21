package com.mulesoft.training;



import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect
public class FlightRequest implements java.io.Serializable {
	
	String destination;

	public FlightRequest()	{
		
	}
	
	public FlightRequest(String destination)	{
		this.destination = destination;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

}
