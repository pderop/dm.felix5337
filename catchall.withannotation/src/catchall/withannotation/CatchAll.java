package catchall.withannotation;

import java.util.Map;

import org.apache.felix.dm.annotation.api.Component;
import org.apache.felix.dm.annotation.api.ServiceDependency;

@Component
public class CatchAll {
	
	@ServiceDependency(filter="(objectClass=*)", required = false) 
	void addService(Object service, Map<String, String> properties) {
		System.out.println("Got service " + service + " with properties: " + properties);
	}

}
