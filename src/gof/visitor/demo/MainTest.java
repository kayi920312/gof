package gof.visitor.demo;

import gof.visitor.demo.impl.ConcreteElementA;
import gof.visitor.demo.impl.ConcreteElementB;
import gof.visitor.demo.impl.ConcreteVisitorA;
import gof.visitor.demo.impl.ConcreteVisitorB;

public class MainTest {

	public static void main(String[] args) {
		ObjectStructure os = new ObjectStructure();
		os.add(new ConcreteElementA());
		os.add(new ConcreteElementB());
		
		Visitor va = new ConcreteVisitorA();
		Visitor vb = new ConcreteVisitorB();
		
		os.accept(va);
		os.accept(vb);
	}

}
