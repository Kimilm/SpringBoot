package basic;

public class Employee implements WorkManager {

	public void onCreated() {
		System.out.println("employee 생성");
	}
	
	public void onDestroyed() {
		System.out.println("employee 소멸");
	}
	
	@Override
	public String doit() {
		return "do work";
	}
}
