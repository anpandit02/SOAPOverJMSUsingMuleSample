import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.mule.api.MuleMessage;
import org.mule.api.client.MuleClient;
import org.mule.tck.junit4.FunctionalTestCase;




public class testAnypointfour extends FunctionalTestCase {
	
	@Test
	public void testUnited() throws Exception{
		
		MuleClient client = muleContext.getClient();
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("http.method", "GET");
		MuleMessage response =client.send("http://localhost:8083/united","",headers,5000);
		
		assertNotNull(response);
		assertNotNull(response.getPayload());
		String result = response.getPayloadAsString();
		System.out.println(result);
		
		  
		
	}
	@Override
	protected String getConfigFile(){
		
		return "src/main/app/04-anypointessentials.xml";
		
	}
	

}
