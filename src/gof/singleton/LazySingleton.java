package gof.singleton;
/**
 * 懒汉加载 
 * @author kayi9
 */
public class LazySingleton {

	private static volatile LazySingleton intence;
	private LazySingleton(){}
	
	public static synchronized LazySingleton getIntence() {
		if (intence == null) {
			intence = new LazySingleton();
		}
		return intence;
	}
}
