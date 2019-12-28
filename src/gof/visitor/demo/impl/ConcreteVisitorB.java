package gof.visitor.demo.impl;

import gof.visitor.demo.Visitor;

public class ConcreteVisitorB implements Visitor {

	@Override
	public void visit(ConcreteElementA element) {
		 System.out.println("具体访问者B访问-->"+element.operationA());
	}

	@Override
	public void visit(ConcreteElementB element) {
		System.out.println("具体访问者B访问-->"+element.operationA());
	}

}