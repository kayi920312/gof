package gof.factorymethod.demo;

public class ConcreteFactory2 implements AbstractFactory {

	@Override
	public Product newProduct() {
		return new ConcreteProduct2();
	}

}
