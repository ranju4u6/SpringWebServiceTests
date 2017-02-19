package spring.ws.test.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import spring.ws.test.generated.RegisterRequest;
import spring.ws.test.generated.RegisterResponse;
import spring.ws.test.generated.RegisterResponseType;

@Endpoint
public class SpringWsTestEndpoint {
	
	@PayloadRoot(localPart="RegisterRequest", namespace="http://spring.ws.study.xsd/Register/")
	public @ResponsePayload RegisterResponse register(@RequestPayload RegisterRequest request){
		
		
		RegisterResponse resposne = new RegisterResponse();
		
		RegisterResponseType respType = new RegisterResponseType();
		respType.setRegisterStatus(1);
		
		resposne.setRegisterResponse(respType);
		
		return resposne;
	}

}
