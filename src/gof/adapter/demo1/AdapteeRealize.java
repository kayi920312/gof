package gof.adapter.demo1;

public class AdapteeRealize implements TwoWayAdaptee {

	@Override
	public void specificRequest() {
		System.out.println("适配者代码被调用！");
	}

}
