package gof.visitor.demo1.impl;

import gof.visitor.demo1.Company;
import gof.visitor.demo1.Material;

public class Paper implements Material {

	@Override
	public String accept(Company visitor) {
		return visitor.create(this);
	}

	public String getTypeName() {
		return "纸";
	}
}
