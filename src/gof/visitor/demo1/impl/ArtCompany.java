package gof.visitor.demo1.impl;

import gof.visitor.demo1.Company;

public class ArtCompany implements Company {

	@Override
	public String create(Paper element) {
		return "艺术公司使用" + element.getTypeName();
	}

	@Override
	public String create(Cuprum element) {
		return "艺术公司使用" + element.getTypeName();
	}

}
