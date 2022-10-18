package com.ifsc.tds;

public class RubberDuck extends Duck implements Quackable{

	public void display(){
		System.out.println("Pato de borracha");
	}
	
	public void swim(){
		System.out.println("BOIANDO*");
	}
	
	@Override
	public void quack() {
		System.out.println("Squick Squick");
		
	}

}
