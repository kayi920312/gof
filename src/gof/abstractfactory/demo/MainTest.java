package gof.abstractfactory.demo;

import gof.abstractfactory.demo.impl.ConcreteFactory1;

public class MainTest {

	public static void main(String[] args) {
		AbstractFactory af1 = new ConcreteFactory1();
		Product1 p1 = af1.newProduct1();
		Product2 p2 = af1.newProduct2();
		p1.show1();
		p2.show2();
	}

}
