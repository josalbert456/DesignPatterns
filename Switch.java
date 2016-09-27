package org.albert.observer;

public class Switch{
	public static boolean isOn;
	public Switch(){
		RedLight red = new RedLight(1000);
		BlueLight blue = new BlueLight(1500);
		GreenLight green = new GreenLight(2000);
	}
	public void switchOn(){
		isOn = true;
	}
	public void switchOff(){
		isOn = false;
	}
}