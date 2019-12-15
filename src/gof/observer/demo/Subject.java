package gof.observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题
 * @author kaiying.chen
 *
 */
public abstract class Subject {

	// 保存观察者的集合
	protected List<Observer> observers = new ArrayList<Observer>();
	//增加观察者方法
    public void add(Observer observer) {
        observers.add(observer);
    }    
    //删除观察者方法
    public void remove(Observer observer) {
        observers.remove(observer);
    }
    
    public abstract void notifyObserver(); //通知观察者方法
}
