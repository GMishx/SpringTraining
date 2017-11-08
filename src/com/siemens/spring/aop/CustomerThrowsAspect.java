package com.siemens.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class CustomerThrowsAspect implements ThrowsAdvice {

	public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
		System.out.println("Exception by: " + method.getName());
		System.out.println("Args: " + args.length);
		System.out.println("Target: " + target);
		System.out.println("Exceptions: " + ex);
	}

}
