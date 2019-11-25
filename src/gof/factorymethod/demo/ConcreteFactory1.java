package gof.factorymethod.demo;

public class ConcreteFactory1 implements AbstractFactory {

	@Override
	public Product newProduct() {
		return new ConcreteProduct1();
	}

}
