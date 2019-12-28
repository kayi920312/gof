package gof.visitor.demo.impl;

import gof.visitor.demo.Element;
import gof.visitor.demo.Visitor;

public class ConcreteElementB implements Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String operationA() {
        return "具体元素B的操作。";
    }
}
