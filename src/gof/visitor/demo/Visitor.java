package gof.visitor.demo;

import gof.visitor.demo.impl.ConcreteElementA;
import gof.visitor.demo.impl.ConcreteElementB;

public interface Visitor {
	void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}
