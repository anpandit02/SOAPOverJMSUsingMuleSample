package com.mulesoft.training.soap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

public class AirportTerminal implements AirportTerminalService {
	
	Map<String, Terminal> terminalMap = new HashMap<String, Terminal>();
	
	public AirportTerminal()	{
		terminalMap.put("1",new Terminal(1, "On Time",0,1,"CLE"));
		terminalMap.put("2",new Terminal(2, "On Time",0,1,"SFO"));
		terminalMap.put("3",new Terminal(3, "On Time",0,1,"LAX"));
		terminalMap.put("4",new Terminal(4, "On Time",0,1,"LAX"));
		terminalMap.put("5",new Terminal(5, "Delayed",124,1,"SFO"));
		terminalMap.put("6",new Terminal(6, "Deplayed",199,1,"CLE"));
	}

	
	/* (non-Javadoc)
	 * @see com.mulesoft.training.soap.AirportTerminalService#findTerminalStatus(java.lang.String)
	 */
	@Override
	public Terminal findTerminalStatus(String terminalNumber) {
		if(this.terminalMap.containsKey(terminalNumber))	{
			return terminalMap.get(terminalNumber);
		}
		return null;
	}
	
	/* (non-Javadoc)
	 * @see com.mulesoft.training.soap.AirportTerminalService#listAllTerminalStatuses()
	 */
	@Override
	public Collection<Terminal> listAllTerminalStatuses()	{
		if(!terminalMap.isEmpty())	{
			Collection<Terminal> listOfTerminals = terminalMap.values();
			return listOfTerminals; 
		}
		return null;
	}
	
	
}
