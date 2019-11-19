package gof.bridge.demo1;

import gof.bridge.demo1.impl.Red;
import gof.bridge.demo1.impl.Yellow;

public class MainTest {
	public static void main(String[] args) {
		Bag b1 = new HandBag(new Yellow());
		Bag b2 = new HandBag(new Red());
		System.out.println(b1.getName());
		System.out.println(b2.getName());
	}
}
