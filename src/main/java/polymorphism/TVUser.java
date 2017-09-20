package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		// 1. Operate Spring Container
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
		// 2. Lookup the object we need towards Spring Container
		TV tv = (TV)factory.getBean("tv");
		TV tv1 = (TV)factory.getBean("tv");
		TV tv2 = (TV)factory.getBean("tv");
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	
		// Lazy-initialzation and not singleton creation.(prototype)
		TV lazyInitializedTv1 = (TV)factory.getBean("lazyTv");
		TV lazyInitializedTv2 = (TV)factory.getBean("lazyTv");
		TV lazyInitializedTv3 = (TV)factory.getBean("lazyTv");
		
		// 3. Close Spring Container
		factory.close();
	}
}