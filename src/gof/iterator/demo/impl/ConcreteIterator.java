package gof.iterator.demo.impl;

import java.util.List;

import gof.iterator.demo.Iterator;

public class ConcreteIterator implements Iterator {

	private List<Object> list = null; 
	private int index = -1; 
	
	public ConcreteIterator(List<Object> list) { 
        this.list = list; 
        list.iterator();
    } 
	
	@Override
	public Object first() {
		index = 0;
        Object obj = list.get(index);;
        return obj;
	}

	@Override
	public Object next() {
		Object obj = null; 
        if(this.hasNext()) { 
            obj = list.get(++index); 
        } 
        return obj;
	}

	@Override
	public boolean hasNext() {
		return index<list.size()-1?true:false;
	}

}
