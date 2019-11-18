package gof.abstractfactory.demo1;

import gof.abstractfactory.demo1.impl.GuangZhouFarm;
import gof.abstractfactory.demo1.impl.ShenZhenFarm;

public class MainTest {

	public static void main(String[] args) {
		Farm f1 = new ShenZhenFarm();
		Farm f2 = new GuangZhouFarm();
		f1.newAnimal();
		f2.newAnimal();
		f1.newPlant();
		f2.newPlant();
	}

}
