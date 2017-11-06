package aop006;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class MyAspect {
	
	@Pointcut("execution(* runSomething())")
	private void impl(){}	//공통사용 ID
	
	
	@Before("impl()")
	public void before(JoinPoint joinPoint){
		System.out.println("얼굴인식 확인 : 문을 개방한다.");
	}
	
	@After("impl()")
	public void lockDoor(JoinPoint joinPoint){
		System.out.println("주인이 나감 : 문을 잠궈라.");
	}
}
