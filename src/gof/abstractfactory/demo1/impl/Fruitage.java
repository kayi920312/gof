package gof.abstractfactory.demo1.impl;

import gof.abstractfactory.demo1.Plant;

public class Fruitage implements Plant {

	@Override
	public void show() {
		System.out.println("我是水果~");
	}

}
