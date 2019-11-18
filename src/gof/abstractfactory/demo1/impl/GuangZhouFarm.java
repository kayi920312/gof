package gof.abstractfactory.demo1.impl;

import gof.abstractfactory.demo1.Animal;
import gof.abstractfactory.demo1.Farm;
import gof.abstractfactory.demo1.Plant;

public class GuangZhouFarm implements Farm {

	@Override
	public Animal newAnimal() {
		System.out.println("广州，产出马~");
		return new Horse();
	}

	@Override
	public Plant newPlant() {
		System.out.println("广州，产出水果~");
		return new Fruitage();
	}

}
