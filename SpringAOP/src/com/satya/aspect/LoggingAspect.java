package com.satya.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
    @Before("execution(public String getName())")
	public void LoggingAdvice() {
		System.out.println("logging advice before getname method ");
	}
}
