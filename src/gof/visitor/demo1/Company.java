package gof.visitor.demo1;


import gof.visitor.demo1.impl.Cuprum;
import gof.visitor.demo1.impl.Paper;

public interface Company {

	String create(Paper element);
	String create(Cuprum element);
}
