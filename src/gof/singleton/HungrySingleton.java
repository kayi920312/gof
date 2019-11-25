package gof.singleton;

/**
 * 饿汉加载
 * @author kayi9
 *
 */
public class HungrySingleton {

	private static final HungrySingleton INTENCE = new HungrySingleton();
	private HungrySingleton(){}
	public static HungrySingleton getIntence() {
		return INTENCE;
	}
}
