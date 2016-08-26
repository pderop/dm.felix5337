package service.implv2;

import java.util.Properties;

import org.apache.felix.dm.DependencyActivatorBase;
import org.apache.felix.dm.DependencyManager;
import org.osgi.framework.BundleContext;

import service.Service;

public class Activator extends DependencyActivatorBase {

	@Override
	public void init(BundleContext bc, DependencyManager dm) throws Exception {
		Properties props = new Properties();
		props.put("type", "v2");
		
		dm.add(createComponent()
				.setImplementation(ServiceImplV2.class)
				.setInterface(Service.class.getName(), props));
	}

}
