package polymorphism;


public class LgTV implements TV {
	public LgTV() {
		System.out.println("===> Create a LgTV object.");
	}
	
	public void powerOn() {
		System.out.println("LgTV---Turn on.");
	}
	
	public void powerOff() {
		System.out.println("LgTV---Turn off.");
	}
	
	public void volumeUp() {
		System.out.println("LgTV---Sound up.");
	}
	
	public void volumeDown() {
		System.out.println("LgTV---Sound down.");
	}
}