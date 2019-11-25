package gof.factorymethod.demo;

/**
 * 具体产品类1
 * @author kayi9
 *
 */
public class ConcreteProduct1 implements Product {

	@Override
	public void show() {
		System.out.println("This is product 'ConcreteProduct1'.");
	}

}
