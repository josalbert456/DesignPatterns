package org.albert.observer;

public class GreenLight extends Light{
	public GreenLight(int delay){
		super(delay);
	}
	public void shine(){
		System.out.println("Green light is shining!");
	}
}