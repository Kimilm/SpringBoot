package basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Boss implements WorkManager {

	@PostConstruct
	public void onCreated() {
		System.out.println("boss 생성");
	}
	
	@PreDestroy
	public void onDestroyed() {
		System.out.println("boss 소멸");
	}
	
	@Override
	public String doit() {
		return "do boss";
	}
}
