package de.fd.mediamanager.impl.aop.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * <p> Title: ParameterAspect               </p>
 * <p> Description:                      </p>
 * <p> Copyright: Copyright (c) 2011     </p>
 * <p> Company: Frank DILLINGER AG       </p>
 *
 * @author fdillinger
 * @date 18 May 2011 13:29:45
 * @projectname 
 * @version $Id: $
 * 
 * <pre>
 * Changes
 * ===========================================================================
 * Date:   Name:        JIRA /Issue Id:       Description:
 * 
 * </pre>
 */
//or  <bean id="parameterAspect" class="de.fd.mediamanager.impl.apo.aspect.ParameterAspect"> </bean> 

@Aspect
@Component
public class ParameterAspect {

	private Log log = LogFactory.getLog(this.getClass());
	//@Poincut(“execution(void set*(*))”)
	// @Pointcut("execution(public * *(..))")
	//@Pointcut("execution(* *.*(..))")
	@Pointcut("execution(* findAll*(..))")
	protected void paremeterCheck() {}

	//@Before("paremeterCheck()")
	//@Before("execution(* *.*(..))")
	//@Before("execution(* de.fd.mediamanager.impl.apo.ArithmeticCalculatorImpl(..))")
	
	@Before("execution(* findAll*(..))")
	public void checkParameterBefore(JoinPoint joinPoint){
		log.info("Join point kind: " + joinPoint.getKind());
		log.info("Signature declaring type: "+ joinPoint.getSignature().getDeclaringTypeName());
		log.info("Signature name: " + joinPoint.getSignature().getName());
		log.info("Target class: "+ joinPoint.getTarget().getClass().getName());
		log.info("This class: " + joinPoint.getThis().getClass().getName());
		Object[] args = joinPoint.getArgs();
		if(args != null){
			for(int i= 0; i<args.length; i++){
				if(args[i] == null){
					throw new RuntimeException("Argument [" + i +"] in signature " +  joinPoint.getSignature().getName() + " can not be NULL");
				}
			}
		}
	}
	
	@AfterReturning(pointcut="paremeterCheck()", returning = "result")
	public void checkParameterAfter(JoinPoint joinPoint, Object result){
		log.info("*****************After *****************************");
		log.info("Exiting from Method :"+joinPoint.getSignature().getName());
		if(result == null){
			throw new RuntimeException("Returned argument from method" +  joinPoint.getSignature().getName() + " can not be NULL");
		}
		log.info("Return value :"+result);
		log.info("******************************************************");
	}
}
