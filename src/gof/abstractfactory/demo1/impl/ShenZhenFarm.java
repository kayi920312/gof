package gof.abstractfactory.demo1.impl;

import gof.abstractfactory.demo1.Animal;
import gof.abstractfactory.demo1.Farm;
import gof.abstractfactory.demo1.Plant;

public class ShenZhenFarm implements Farm {

	@Override
	public Animal newAnimal() {
		System.out.println("深圳，产出牛~");
		return new Cattle();
	}

	@Override
	public Plant newPlant() {
		System.out.println("深圳，产出蔬菜~");
		return new Vegetables();
	}

}
