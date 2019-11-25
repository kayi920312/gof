package gof.factorymethod.demo1.impl;

import gof.factorymethod.demo1.Animal;

public class Horse implements Animal {

	@Override
	public void show() {
		System.out.println("I am a horse!");
	}

}
