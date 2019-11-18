package gof.adapter.demo;

/**
 * 适配者类，也就是要被用来适配的来，已有，只是不能直接用
 * @author kayi9
 *
 */
public class Adaptee {
	public void specificRequest() {       
        System.out.println("适配者中的业务代码被调用！");
    }
}
