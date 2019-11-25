package gof.flyweight.demo;
/**
 * 非享元信息
 * @author kayi9
 *
 */
public class UnsharedConcreteFlyweight {
	private String info;
	UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info=info;
    }
}
