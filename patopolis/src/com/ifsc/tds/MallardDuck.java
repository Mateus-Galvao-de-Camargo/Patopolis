package com.ifsc.tds;

public class MallardDuck extends Duck {
	
	MallardDuck(){
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}
	
	public void display(){
		System.out.println("Pato-Real sua vers�o selvagem tem nas suas penas branco, marrom e verde, mas muitos dom�sticos apresentam colora��o de todas as suas penas em branco");
	}

}
