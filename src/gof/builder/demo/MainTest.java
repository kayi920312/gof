package gof.builder.demo;

public class MainTest {

	public static void main(String[] args) {
		Builder b = new ConcreteBuilder();
		Director d = new Director(b);
		System.out.println(d.construct().show());
	}

}
