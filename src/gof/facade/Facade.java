package gof.facade;

public class Facade {
	private SubSystem01 obj1=new SubSystem01();
    private SubSystem02 obj2=new SubSystem02();
    public void method()
    {
        obj1.method();
        obj2.method();
    }
}
