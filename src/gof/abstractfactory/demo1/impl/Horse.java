package gof.abstractfactory.demo1.impl;

import gof.abstractfactory.demo1.Animal;

public class Horse implements Animal {

	@Override
	public void show() {
		System.out.println("我是马~");
	}

}
