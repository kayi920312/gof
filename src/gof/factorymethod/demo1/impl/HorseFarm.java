package gof.factorymethod.demo1.impl;

import gof.factorymethod.demo1.Animal;
import gof.factorymethod.demo1.AnimalFarm;

public class HorseFarm implements AnimalFarm {

	@Override
	public Animal animalBirth() {
		System.out.println("小马出生。。。");
		return new Horse();
	}

}
