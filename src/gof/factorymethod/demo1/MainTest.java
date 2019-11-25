package gof.factorymethod.demo1;

import gof.factorymethod.demo1.impl.CattleFarm;
import gof.factorymethod.demo1.impl.HorseFarm;

public class MainTest {

	public static void main(String[] args) {
		HorseFarm hf = new HorseFarm();
		CattleFarm cf = new CattleFarm();
		
		hf.animalBirth().show();
		cf.animalBirth().show();
	}

}
