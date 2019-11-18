package gof.adapter.demo;

public class MainTest {

	public static void main(String[] args) {
		Target t = new ClassAdapter();
		Target tt = new ObjectAdapter();
//		t.request();
		tt.request();
	}

}
