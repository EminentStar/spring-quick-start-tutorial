package polymorphism;


public class SamsungTV implements TV {
	public SamsungTV() {
		System.out.println("===> Create a SamsungTV object.");
	}
	
	public void initMethod() {
		System.out.println("The object Initialization.....");
	}
	
	public void destroyMethod() {
		System.out.println("Logics that should be run before deleting the object.");
	}
	
	public void powerOn() {
		System.out.println("SamsungTV---Power on.");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV---Power off.");
	}
	
	public void volumeUp() {
		System.out.println("SamsungTV---Volume up.");
	}
	
	public void volumeDown() {
		System.out.println("SamsungTV---Volume down.");
	}
}