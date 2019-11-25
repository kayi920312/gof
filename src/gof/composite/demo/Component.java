package gof.composite.demo;

/**
 * 抽象构建声明了树叶和树枝所有的方法
 * @author kayi9
 *
 */
public interface Component {
	void add(Component c);
    void remove(Component c);
    Component getChild(int i);
    void operation();
}
