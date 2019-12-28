package gof.iterator.demo;

/**
 * 抽象迭代器
 * @author kaiying.chen
 *
 */
public interface Iterator {
	Object first();
    Object next();
    boolean hasNext();
}
