package org.albert.observer;
import static org.albert.observer.Switch.isOn;
public abstract class Light{
	public int length = 0;
	public Light(final int delayTime){
		(new Thread(new Runnable(){
			@Override
			public void run(){
				try{
					while(true){
						Thread.sleep(delayTime);
						length++;
						System.out.println(length);
						if(isOn){
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