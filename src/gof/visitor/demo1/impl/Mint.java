package gof.visitor.demo1.impl;

import gof.visitor.demo1.Company;

public class Mint implements Company {

	@Override
	public String create(Paper element) {
		 return "造币公司使用" + element.getTypeName();
	}

	@Override
	public String create(Cuprum element) {
		return "造币公司使用" + element.getTypeName();
	}

}
