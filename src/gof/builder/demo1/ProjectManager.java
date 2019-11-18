package gof.builder.demo1;

public class ProjectManager {

	private Decorator decorator;
	public ProjectManager(Decorator decorator) {
		this.decorator = decorator;
	}
	
	public Parlour decorate() {
		this.decorator.buildSofa();
		this.decorator.buildTV();
		this.decorator.buildWall();
		return this.decorator.getResult();
	}
}
