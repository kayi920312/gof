package gof.bridge.demo;
/**
 * 抽象化角色
 * @author kayi9
 *
 */
abstract class Abstraction {
	protected Implementor implementor;
	protected Abstraction(Implementor imple) {
		implementor = imple;
    }
    public abstract void operation(); 
}
