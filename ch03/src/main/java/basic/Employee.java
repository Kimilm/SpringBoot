package basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee implements WorkManager {

	@PostConstruct
	public void onCreated() {
		System.out.println("employee 생성");
	}
	
	@PreDestroy
	public void onDestroyed() {
		System.out.println("employee 소멸");
	}
	
	@Override
	public String doit() {
		return "do work";
	}
}
