package gof.abstractfactory.demo.impl;

import gof.abstractfactory.demo.AbstractFactory;
import gof.abstractfactory.demo.Product1;
import gof.abstractfactory.demo.Product2;

public class ConcreteFactory1 implements AbstractFactory {

	@Override
	public Product1 newProduct1() {
		System.out.println("Build Product1");
		return new ConcreteProduct1();
	}

	@Override
	public Product2 newProduct2() {
		System.out.println("Build Product2");
		return new ConcreteProduct2();
	}

}
