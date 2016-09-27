package org.albert.observer;

public class BlueLight extends Light{
	public BlueLight(int delay){
		super(delay);
	}
	public void shine(){
		System.out.println("Blue light is shining!");
	}
}