package com.satya.aspect;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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
    
       @Pointcut("execution(* get*())")
       public void getAll() {
       	
       }
    
    @Pointcut("within(com.satya.dto.Circle)")
    public void getCircle() {
    	
    }
}
