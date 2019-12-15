package gof.observer.demo1.impl;

import gof.observer.demo1.BellEventListener;
import gof.observer.demo1.RingEvent;

public class TeachEventListener implements BellEventListener {

	@Override
	public void heardBell(RingEvent e) {
		if(e.getSound()) {
            System.out.println("老师上课了...");           
        } else {
            System.out.println("老师下课了...");   
        }       
	}
}
