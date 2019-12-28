package gof.iterator.demo.impl;

import java.util.ArrayList;
import java.util.List;

import gof.iterator.demo.Aggregate;
import gof.iterator.demo.Iterator;

public class ConcreteAggregate implements Aggregate {

	private List<Object> list = new ArrayList<Object>(); 
	
	@Override
	public void add(Object obj) {
		list.add(obj);
	}

	@Override
	public void remove(Object obj) {
		list.remove(obj); 
	}

	@Override
	public Iterator getIterator() {
		return(new ConcreteIterator(list)); 
	}

}
