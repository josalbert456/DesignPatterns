package org.albert.observer;

public class RedLight extends Light{
	public RedLight(int delay){
		super(delay);
	}
	public void shine(){
		System.out.println("Red light is shining!");
	}
}