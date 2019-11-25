package gof.prototype.demo1;

public class Circle implements Shape {

	@Override
	public Object clone() throws CloneNotSupportedException {
		return (Circle) super.clone();
	}

	@Override
	public void countArea() {
		int r=20;
        System.out.print("这是一个圆，圆的半径：" + r);
        System.out.println("该圆的面积="+3.1415*r*r+"\n");
	}

}
