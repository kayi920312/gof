package gof.bridge.demo1;

public class Wallet extends Bag {

	protected Wallet(Color color) {
		super(color);
	}

	@Override
	public String getName() {
		return color.getColor() + " Wallet";
	}

}
