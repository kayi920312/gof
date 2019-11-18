package gof.abstractfactory.demo1.impl;

import gof.abstractfactory.demo1.Plant;

public class Vegetables implements Plant {

	@Override
	public void show() {
		System.out.println("我是蔬菜~");
	}

}
