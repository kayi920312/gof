package gof.decorator.demo;

abstract class Decorator implements Component {

	protected Component component;
	protected Decorator(Component component) {
		this.component = component;
	}
	
	@Override
	public void operation() {
		component.operation();
	}

}
