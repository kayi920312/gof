package gof.prototype.demo1;

public class Square implements Shape {

	@Override
	public Object clone() throws CloneNotSupportedException {
		return (Square) super.clone();
	}
	
	@Override
	public void countArea() {
		int a=20;
        System.out.print("这是一个正方形，它的边长：" + a);
        System.out.println("该正方形的面积="+a*a+"\n");
	}

}
