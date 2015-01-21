package com.mulesoft.training.soap;

public class Terminal implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5655933813054007504L;
	int terminalNumber;
	String statusCode;
	int delayTime;
	int active;
	String currentFlight;
	
	public Terminal(int terminalNumber, String statusCode, int delayTime,
			int active, String currentFlight) {
		this.terminalNumber = terminalNumber;
		this.statusCode = statusCode;
		this.delayTime = delayTime;
		this.active = active;
		this.currentFlight = currentFlight;
	}
	
	public Terminal()	{
		
	}
	
	public int getTerminalNumber() {
		return terminalNumber;
	}
	public void setTerminalNumber(int terminalNumber) {
		this.terminalNumber = terminalNumber;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public int getDelayTime() {
		return delayTime;
	}
	public void setDelayTime(int delayTime) {
		this.delayTime = delayTime;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public String getCurrentFlight() {
		return currentFlight;
	}
	public void setCurrentFlight(String currentFlight) {
		this.currentFlight = currentFlight;
	}

	@Override
	public String toString()	{
		String constructedString = "Terminal Number: " + this.terminalNumber + "\n\n" +
								 "Status Code: " + this.statusCode + "\n\n" +
								 "Delay Time: " + this.delayTime + "\n\n" +
								 "Active: " + this.active + "\n\n" +
								 "Current Flight: " + this.currentFlight + "\n\n";					 		
		return constructedString;
		
	}
}
