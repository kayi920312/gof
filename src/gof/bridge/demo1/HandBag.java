package gof.bridge.demo1;

public class HandBag extends Bag {

	protected HandBag(Color color) {
		super(color);
	}

	@Override
	public String getName() {
		return color.getColor() + " HandBag";
	}

}
