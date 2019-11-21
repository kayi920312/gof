package gof.flyweight.demo;

import java.util.HashMap;
import java.util.Map;

import gof.flyweight.demo.impl.ConcreteFlyweight;

public class FlyweightFactory {
	private Map<String, Flyweight> flyweights = new HashMap<>();
	
	public Flyweight getFlyweight(String key) {
        Flyweight flyweight=(Flyweight)flyweights.get(key);
        if(flyweight!=null) {
            System.out.println("具体享元"+key+"已经存在，被成功获取！");
        }
        else {
            flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}
