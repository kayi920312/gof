package gof.observer.demo1.impl;

import gof.observer.demo1.BellEventListener;
import gof.observer.demo1.RingEvent;

public class StuEventListener implements BellEventListener {

	@Override
	public void heardBell(RingEvent e) {
		if(e.getSound()) {
            System.out.println("同学们，上课了...");           
        } else {
            System.out.println("同学们，下课了...");   
        }   
	}

}
