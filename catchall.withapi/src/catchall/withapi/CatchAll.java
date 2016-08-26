package catchall.withapi;

import java.util.Map;

public class CatchAll {
	
	void addService(Object service, Map<String, String> properties) {
		System.out.println("Got service " + service + " with properties: " + properties);
	}

}
