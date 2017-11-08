package com.siemens.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class CustomerBeforeAspect implements MethodBeforeAdvice {

	/**
	 * Simple before aspect
	 * @param methodName The method which is to be called (printName, printURL, etc.)
	 * @param arg1 Parameters of the method called
	 * @param target Object on which the method called
	 */
	@Override
	public void before(Method methodName, Object[] arg1, Object target) throws Throwable {
		System.out.println("CustomerBeforeAspect: before method");

		System.out.println("Calling: " + methodName.getReturnType() + methodName.getName() + "("
				+ methodName.getParameterCount() + ")");

		System.out.println("CustomerBeforeAspect: method end");
	}

}
