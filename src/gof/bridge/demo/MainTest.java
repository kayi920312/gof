package gof.bridge.demo;

import gof.bridge.demo.impl.ConcreteImplementorA;

public class MainTest {

	public static void main(String[] args) {
		Implementor i = new ConcreteImplementorA();
		Abstraction a = new RefinedAbstraction(i);
		a.operation();
	}

}
