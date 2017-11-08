package com.siemens.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class CustomerAfterAspect implements AfterReturningAdvice {

	/**
	 * Simple after aspect
	 * @param returnValue the value returned by the method, if any
	 * @param method method being invoked
	 * @param args arguments to the method
	 * @param target target of the method invocation. May be null.
	 */
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("CustomerAfterAspect: before method");

		System.out.println("Calling: " + method.getReturnType() + method.getName() + "("
				+ method.getParameterCount() + ")");

		System.out.println("CustomerAfterAspect: method end");
	}

}
