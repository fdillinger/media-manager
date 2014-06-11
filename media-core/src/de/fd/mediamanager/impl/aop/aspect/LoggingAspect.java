package de.fd.mediamanager.impl.aop.aspect;

import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

// @Aspect
@Component
public class LoggingAspect
{
	private Log log = LogFactory.getLog(this.getClass());
	
	@Pointcut("execution(* *.*(..))")
	protected void loggingOperation() {}
	
	@Before("loggingOperation()")
	@Order(1)
	public void logJoinPoint(JoinPoint joinPoint)
	{
		log.info("Join point kind : " + joinPoint.getKind());
		log.info("Signature declaring type : "+ joinPoint.getSignature().getDeclaringTypeName());
		log.info("Signature name : " + joinPoint.getSignature().getName());
		log.info("Arguments : " + Arrays.toString(joinPoint.getArgs()));
		log.info("Target class : "+ joinPoint.getTarget().getClass().getName());
		log.info("This class : " + joinPoint.getThis().getClass().getName());
	}
	
	@Before("execution(* *.*(..))")
	@Order(2)
	public void logBefore(JoinPoint joinPoint)
	{
		log.info("*****************logBefore*****************************");
		log.info("Entered into Method :"+joinPoint.getSignature().getName());
		log.info("Method Arguments are :"+Arrays.asList(joinPoint.getArgs()));
		log.info("******************************************************");
	}
	
	@AfterReturning(pointcut="loggingOperation()", returning = "result")
	@Order(3)
	public void logAfter(JoinPoint joinPoint, Object result)
	{
		log.info("*****************logAfter*****************************");
		log.info("Exiting from Method :"+joinPoint.getSignature().getName());
		log.info("Return value :"+result);
		log.info("******************************************************");
	}
	
	@AfterThrowing(pointcut="execution(* *.*(..))", throwing = "e")
	@Order(4)
	public void logAfterThrowing(JoinPoint joinPoint, Throwable e)
	{
		log.info("*****************logAfterThrowing*****************************");
		log.error("An exception has been thrown in "+ joinPoint.getSignature().getName() + "()");
		log.error("Cause :"+e.getCause());
		log.info("******************************************************");
	}
	
	@Around("execution(* *.*(..))")
	@Order(5)
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable
	{
		log.info("*****************logAround*****************************");
		log.info("The method " + joinPoint.getSignature().getName()
				+ "() begins with " + Arrays.toString(joinPoint.getArgs()));
		try
		{
			Object result = joinPoint.proceed();
			log.info("The method " + joinPoint.getSignature().getName()
					+ "() ends with " + result);
			log.info("******************************************************");
			return result;
		} catch (IllegalArgumentException e)
		{
			log.error("Illegal argument "
					+ Arrays.toString(joinPoint.getArgs()) + " in "
					+ joinPoint.getSignature().getName() + "()");
			throw e;
		}
		
	}
	
}