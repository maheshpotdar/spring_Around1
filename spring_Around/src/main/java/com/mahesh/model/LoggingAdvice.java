package com.mahesh.model;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAdvice {
	// void m1();
	// void packagename.classname.methodname();
	// * com.mahesh.model.Traingle.getName()
	// setter manaje args(name)
	@Pointcut("execution(* com.*.model.*.getName(..))")
	public void test1() {
		// Empty
	}

	@Around("test1()")
	public Object test2(ProceedingJoinPoint point) {

		Object object = null;
		try {
			System.out.println("Before Method called.");
			object = point.proceed();
			System.out.println("After Method called.");
		} catch (Throwable e) {
			System.out.println("Exception throw.");
		} finally {
			System.out.println("finally called.");
		}
		return object;

	}

	

}
