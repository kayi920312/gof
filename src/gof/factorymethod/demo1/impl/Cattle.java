package gof.factorymethod.demo1.impl;

import gof.factorymethod.demo1.Animal;

public class Cattle implements Animal {

	@Override
	public void show() {
		System.out.println("I am a cattle!");
	}

}
