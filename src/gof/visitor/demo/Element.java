package gof.visitor.demo;

public interface Element {
	void accept(Visitor visitor);
}
