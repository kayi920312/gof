package gof.prototype.demo1;

public interface Shape extends Cloneable {

	Object clone() throws CloneNotSupportedException;
	void countArea();
}
