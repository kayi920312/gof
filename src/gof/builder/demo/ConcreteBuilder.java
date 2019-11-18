package gof.builder.demo;

public class ConcreteBuilder extends Builder {

	@Override
	public void buildPartA() {
		product.setPartA("build part A");
	}

	@Override
	public void buildPartB() {
		product.setPartB("build part B");
	}

	@Override
	public void buildPartC() {
		product.setPartC("build part C");
	}

}
