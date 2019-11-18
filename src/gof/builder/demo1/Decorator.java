package gof.builder.demo1;

abstract class Decorator {
	protected Parlour parlour = new Parlour();
	public  abstract void buildWall();
    public  abstract void buildTV();
    public  abstract void buildSofa();
    //返回产品对象
    public  Parlour getResult()
    {
        return parlour;
    }
}
