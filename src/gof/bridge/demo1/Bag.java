package gof.bridge.demo1;

abstract class Bag {

	protected Color color;
	protected Bag(Color color) {
		this.color = color;
	}
	public abstract String getName();
}
