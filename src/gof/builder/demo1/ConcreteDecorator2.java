package gof.builder.demo1;

public class ConcreteDecorator2 extends Decorator {

	@Override
	public void buildWall() {
		parlour.setWall("刷另一半数量的墙~");
	}

	@Override
	public void buildTV() {
		parlour.setTV("安装另一半数量的TV~");

	}

	@Override
	public void buildSofa() {
		parlour.setSofa("布置另一半数量的沙发~");
	}

}
