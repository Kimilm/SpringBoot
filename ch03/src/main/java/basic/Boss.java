package basic;

public class Boss implements WorkManager {

	public void onCreated() {
		System.out.println("boss 생성");
	}
	
	public void onDestroyed() {
		System.out.println("boss 소멸");
	}
	
	@Override
	public String doit() {
		return "do boss";
	}
}
