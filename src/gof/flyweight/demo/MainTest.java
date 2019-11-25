package gof.flyweight.demo;

public class MainTest {

	public static void main(String[] args) {
		FlyweightFactory ff = new FlyweightFactory();
		Flyweight f1 = ff.getFlyweight("f1");
		Flyweight f2 = ff.getFlyweight("f2");
		Flyweight f11 = ff.getFlyweight("f1");
		
		f1.operation(new UnsharedConcreteFlyweight("第一次调用f1"));
		f11.operation(new UnsharedConcreteFlyweight("第一次调用f11"));
		f2.operation(new UnsharedConcreteFlyweight("第一次调用f2"));
	}

}
