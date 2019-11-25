package gof.prototype.demo1;

public class Test {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Square s1 = new Square();
		
		try {
			Circle c2 = (Circle) c1.clone();
			Square s2 = (Square) s1.clone();
			
			c2.countArea();
			s2.countArea();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
