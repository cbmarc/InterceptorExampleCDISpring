package org.smallpawn.cdi.plugin.strategies;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;

import org.smallpawn.cdi.plugin.model.InterceptorInfo;

/**
 * Strategy to resolve available interceptors in the bean factory.
 * 
 * @author Niklas Schlimm
 *
 */
public interface InterceptorResolutionStrategy {

	/**
	 * Resolve the available interceptors.
	 * 
	 * @param beanFactory the factory that contains the interceptor {@link BeanDefinition}s
	 * 
	 * @return the resolved interceptors
	 */
	List<InterceptorInfo> resolveRegisteredInterceptors(BeanFactory beanFactory);
	
}
