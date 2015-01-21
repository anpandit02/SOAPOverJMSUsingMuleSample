package com.mulesoft.training.soap;

import java.util.Collection;
import javax.jws.WebService;
import javax.jws.WebParam;
import javax.jws.WebResult;

@WebService
public interface AirportTerminalService {

	@WebResult(name ="response",partName="response")
	public abstract Terminal findTerminalStatus(@WebParam (partName="request", name="request") String terminalNumber);

	@WebResult(name ="response",partName="response")
	public abstract Collection<Terminal> listAllTerminalStatuses();

}