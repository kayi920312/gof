package gof.mediator.demo;

public abstract class Mediator {

	public abstract void register(Colleague colleague); // 注册
    public abstract void relay(Colleague cl); //转发
    
}
