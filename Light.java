package org.albert.observer;
import static org.albert.observer.Switch.isOn;
public abstract class Light{
	public Light(final int delayTime){
		(new Thread(new Runnable(){
			@Override
			public void run(){
				try{
					while(true){
						Thread.sleep(delayTime);
						if(isOn){
							System.out.println();
							shine();
						}
					}
				}catch(InterruptedException ie){

				}	
			}
		})).start();
		
	}
	abstract void shine();
}