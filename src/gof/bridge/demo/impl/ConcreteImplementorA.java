package gof.bridge.demo.impl;

import gof.bridge.demo.Implementor;

public class ConcreteImplementorA implements Implementor {

	@Override
	public void OperationImpl() {
		System.out.println("具体实现化 ConcreteImplementorA 角色被访问" );
	}

}
