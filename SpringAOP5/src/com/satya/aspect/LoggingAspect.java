package com.satya.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
    @Before("getCircle()")
	public void LoggingAdvice() {
		System.out.println("logging advice before getname method ");
	}
    @Before("getCircle()")
   	public void SecondAdvice() {
   		System.out.println("Second advice before getname method ");
   	}
    
    @Pointcut("within(com.satya.dto.*)")
    public void getCircle() {
    	
    }
}
