package gof.iterator.demo;

/**
 * 抽象聚合，定义存储，添加，删除聚合对象等方法的接口
 * @author kaiying.chen
 *
 */
public interface Aggregate {
	void add(Object obj); 
	void remove(Object obj); 
	Iterator getIterator(); 
}
