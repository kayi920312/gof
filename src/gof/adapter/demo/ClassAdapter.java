package gof.adapter.demo;

public class ClassAdapter extends Adaptee implements Target {

	@Override
	public void request() {
		super.specificRequest();
	}

}
