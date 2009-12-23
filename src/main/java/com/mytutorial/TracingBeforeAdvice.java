package com.mytutorial;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;;

public class TracingBeforeAdvice implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Before Call");
		Object returnValue = invocation.proceed();
		System.out.println("After Call");
		return returnValue;
	}

}
