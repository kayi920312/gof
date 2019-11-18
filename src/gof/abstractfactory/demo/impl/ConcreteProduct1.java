package gof.abstractfactory.demo.impl;

import gof.abstractfactory.demo.Product1;

public class ConcreteProduct1 implements Product1 {

	@Override
	public void show1() {
		System.out.println("This is ConcreteProduct1.");
	}

}
