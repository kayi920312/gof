package gof.bridge.demo;

public class RefinedAbstraction extends Abstraction {

	protected RefinedAbstraction(Implementor imple) {
		super(imple);
	}

	@Override
	public void operation() {
		 System.out.println("扩展抽象化(Refined Abstraction)角色被访问" );
		 implementor.OperationImpl();
	}

}
