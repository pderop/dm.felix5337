package service.implv1;

import java.util.Properties;

import org.apache.felix.dm.DependencyActivatorBase;
import org.apache.felix.dm.DependencyManager;
import org.osgi.framework.BundleContext;

import service.Service;

public class Activator extends DependencyActivatorBase {

	@Override
	public void init(BundleContext bc, DependencyManager dm) throws Exception {
		Properties props = new Properties();
		props.put("type", "v1");
		
		dm.add(createComponent()
				.setImplementation(ServiceImplV1.class)
				.setInterface(Service.class.getName(), props));
	}

}
