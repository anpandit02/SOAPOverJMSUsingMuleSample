package com.mulesoft.training;



import java.util.Comparator;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect
public class Flight implements java.io.Serializable, Comparable<Flight> {
	String flightCode;
	String airlineName;

	String destination;
	String origination;
	String departuredate;

	double price;
	String planeType;
	int availableSeats;


	public Flight()	{
		
	}
	
	@JsonCreator 
	public Flight(
			@JsonProperty("price") int price,
			@JsonProperty("planeType") String planeType,
			@JsonProperty("code") String flightCode,
			@JsonProperty("destination") String destination)	{
		this.price = price;
		this.planeType = planeType;
		this.flightCode = flightCode;
		this.destination = destination;
	}
	
	public Flight(String flightCode, String destination, double price, String planeType) {
		this.flightCode = flightCode;
		this.destination = destination;
		this.price = price;
		this.planeType = planeType;
	}
	
	public Flight(String flightCode, String airlineName, String destination,
			String origination, String departuredate, double price,
			String planeType, int availableSeats) {
		this.flightCode = flightCode;
		this.airlineName = airlineName;
		this.destination = destination;
		this.origination = origination;
		this.departuredate = departuredate;
		this.price = price;
		this.planeType = planeType;
		this.availableSeats = availableSeats;
	}
	
	public Flight(String flightCode, String airlineName, String destination,
			String origination, String departuredate, double price,
			String planeType) {
		this.flightCode = flightCode;
		this.airlineName = airlineName;
		this.destination = destination;
		this.origination = origination;
		this.departuredate = departuredate;
		this.price = price;
		this.planeType = planeType;
	}
	
	public Flight(String flightCode, String airlineName, String destination,
			String origination, String departuredate, double price,
			int availableSeats) {
		this.flightCode = flightCode;
		this.airlineName = airlineName;
		this.destination = destination;
		this.origination = origination;
		this.departuredate = departuredate;
		this.price = price;
		this.availableSeats = availableSeats;
	}

	public String getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getOrigination() {
		return origination;
	}

	public void setOrigination(String origination) {
		this.origination = origination;
	}

	public String getDeparturedate() {
		return departuredate;
	}

	public void setDeparturedate(String departuredate) {
		this.departuredate = departuredate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	@Override
	public int compareTo(Flight otherFlight) {
		int value = Double.compare(this.getPrice(), otherFlight.getPrice());
		return value;
	}





};
	
	

