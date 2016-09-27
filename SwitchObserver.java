
package org.albert.observer;
import java.io.IOException;

import org.albert.observer.Switch;
public class SwitchObserver{
	public static void main(String[] args){
		Switch s = new Switch();
		s.switchOn();
		while(true){
			try{
				Thread.sleep(10000);
				s.switchOff();
			}catch(InterruptedException ie){
			}
		}
	}
}