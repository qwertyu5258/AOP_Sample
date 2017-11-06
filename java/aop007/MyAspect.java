package aop007;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

public class MyAspect {
	public void before(JoinPoint joinPoint){
		System.out.println("얼굴인식 확인 : 문을 개방한다.");
	}
	public void lockDoor(JoinPoint joinPoint){
		System.out.println("주인이 나감 : 문을 잠궈라.");
	}
}
