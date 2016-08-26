package catchall.withapi;

import java.util.Map;

import org.apache.felix.dm.DependencyActivatorBase;
import org.apache.felix.dm.DependencyManager;
import org.osgi.framework.BundleContext;

public class Activator extends DependencyActivatorBase {

	@Override
	public void init(BundleContext bc, DependencyManager dm) throws Exception {
		dm.add(createComponent()
				.setImplementation(CatchAll.class)
				.add(createServiceDependency().setService("(objectClass=*)").setRequired(false).setCallbacks("addService", null)));
	}
	
}
