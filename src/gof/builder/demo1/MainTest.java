package gof.builder.demo1;

public class MainTest {

	public static void main(String[] args) {
		Decorator d2 = new ConcreteDecorator2();
		ProjectManager pm = new ProjectManager(d2);
		System.out.println(pm.decorate().show());
	}

}
