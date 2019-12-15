package gof.observer.demo1;

import gof.observer.demo1.impl.StuEventListener;
import gof.observer.demo1.impl.TeachEventListener;

public class MainTest {

	public static void main(String[] args) throws InterruptedException {
		BellEventSource bs = new BellEventSource();
		BellEventListener teacher = new TeachEventListener();
		BellEventListener student = new StuEventListener();
		bs.addPersonListener(student);
		bs.addPersonListener(teacher);
		
		for (int i = 0; i < 1; i++) {
			bs.ring(true);
			System.out.println("-------------------------");
			Thread.sleep(5000);
			bs.ring(false);
			System.out.println("-------------------------");
		}
	}

}
