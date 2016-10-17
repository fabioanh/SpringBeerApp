package com.adneom;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PartyAuditor {
	private Long initialTime;

	@Before("execution(void throwParty())")
	public void statusBeforeParty() {
		System.out.println("It seems like it'll be a good party");
		initialTime = System.currentTimeMillis();
	}

	@After("execution(void throwParty())")
	public void statusAfterParty() {
		System.out.println("Well, with good beer it couldn't be bad! Lots of happy people after: "
				+ (System.currentTimeMillis() - initialTime) + " miliseconds");
	}
}
