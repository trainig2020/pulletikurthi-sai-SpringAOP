package com.satya.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
    @Before("getAll() && getCircle()")
   	public void LoggingAdvice() {
   		System.out.println("logging advice before getname method ");
   	}
       @Before("getAll()")
      	public void SecondAdvice() {
      		System.out.println("Second advice before getname method ");
      	}
       @Pointcut("execution(public * get*())")
       public void getAll() {
       	
       }
    
    @Pointcut("within(com.satya.dto.Circle)")
    public void getCircle() {
    	
    }
}
