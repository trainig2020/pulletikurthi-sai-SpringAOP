package com.satya.aspect;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
  
	/*@After("args(name)")
   	public void StringArg(String name) {
   		
    	System.out.println("string is"+name);
   	}*/
	
	@AfterReturning("args(name)")
   	public void StringArg(String name) {
   		
    	System.out.println("string is"+name);
   	}
	
	@AfterThrowing("args(name)")
   	public void After(String name) {
   		
    	System.out.println("After throwing exception is"+name);
   	}
    
       @Pointcut("execution(* get*())")
       public void getAll() {
       	
       }
    
    @Pointcut("within(com.satya.dto.Circle)")
    public void getCircle() {
    	
    }
}
