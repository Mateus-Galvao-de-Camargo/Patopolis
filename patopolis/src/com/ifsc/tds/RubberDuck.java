package com.ifsc.tds;

public class RubberDuck extends Duck{
	
	public RubberDuck() {
		setQuackBehavior(new Squeck());
		setFlyBehavior(new FlyNoWay());
	}

	public void display(){
		System.out.println("Pato de borracha, seu corpo é pintado em amarelo, e o bico em laranja");
	}
	
	public void swim(){
		System.out.println("BOIANDO*");
	}
}
