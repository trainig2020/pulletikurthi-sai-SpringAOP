package com.satya.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
    @Before("getCircle()")
   	public void LoggingAdvice(JoinPoint joinpoint) {
   		//System.out.println(joinpoint.toString());
    	//System.out.println(joinpoint.getTarget());
   	}
       
    @Before("args(name)")
   	public void StringArg(String name) {
   		
    	System.out.println("string is"+name);
   	}
       @Pointcut("execution(* get*())")
       public void getAll() {
       	
       }
    
    @Pointcut("within(com.satya.dto.Circle)")
    public void getCircle() {
    	
    }
}
