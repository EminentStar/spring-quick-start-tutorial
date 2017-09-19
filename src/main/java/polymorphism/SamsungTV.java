package polymorphism;


public class SamsungTV implements TV {
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