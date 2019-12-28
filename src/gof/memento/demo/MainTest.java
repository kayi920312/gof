package gof.memento.demo;

public class MainTest {

	public static void main(String[] args) {
		Originator or = new Originator();
		Caretaker ca = new Caretaker();
		or.setState("s1");
		System.out.println("初始状态：" + or.getState());
		ca.setMemento(or.createMemento());
		or.setState("s2");
		System.out.println("新状态：" + or.getState());
		or.restoreMemento(ca.getMemento());
		System.out.println("恢复状态：" + or.getState());
	}

}
