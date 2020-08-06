package com.satya.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
  
	
	@AfterReturning(pointcut="args(name)",returning="returnString")
   	public void StringArg(String name,Object returnString) {
   		
    	System.out.println("string is"+name+"Object is"+returnString);
   	}
	
	@AfterThrowing(pointcut="args(name)",throwing="ex")
   	public void After(String name,RuntimeException ex) {
   		
    	System.out.println("After throwing exception is"+name+"Runtime Exception in "+ex);
   	}
    
	@Around("@annotation(com.satya.aspect.Loggable)")
	public Object Around(ProceedingJoinPoint proceedingJoinPoint) {
		Object object=null;
		try {
			System.out.println("Before advice");
			object=proceedingJoinPoint.proceed();
			System.out.println("After advice");
		} catch (Throwable e) {
			System.out.println("when throwable");
		}
		
		System.out.println("after finally");
		return object;
	}
	
	
       @Pointcut("execution(* get*())")
       public void getAll() {
       	
       }
    
    @Pointcut("within(com.satya.dto.Circle)")
    public void getCircle() {
    	
    }
}
