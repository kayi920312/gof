package gof.proxy.demo;

public class Proxy implements Subject {

	private RealSubject realSubject = new RealSubject();

	@Override
	public void Request() {
		preRequest();
		realSubject.Request();
		postRequest();
	}

	private void preRequest() {
        System.out.println("访问真实主题之前的预处理。");
    }
	private void postRequest() {
        System.out.println("访问真实主题之后的后续处理。");
    }
}
