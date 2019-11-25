package gof.composite.demo1.impl;

import gof.composite.demo1.Component;

public class Leaf implements Component {

	private String name;
    public Leaf(String name)
    {
        this.name = name;
    }
    public void operation()
    {
        System.out.println("树叶"+name+"：被访问！"); 
    }

}
