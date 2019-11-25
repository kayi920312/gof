package gof.factorymethod.demo;

public class Test {

	public static void main(String[] args) {
		ConcreteProduct1 cf1 = (ConcreteProduct1) new ConcreteFactory1().newProduct();
		ConcreteProduct2 cf2 = (ConcreteProduct2) new ConcreteFactory2().newProduct();
		cf1.show();
		cf2.show();
	}

}
