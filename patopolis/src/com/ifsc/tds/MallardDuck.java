package com.ifsc.tds;

public class MallardDuck extends Duck {
	
	MallardDuck(){
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}
	
	public void display(){
		System.out.println("Pato-Real sua versão selvagem tem nas suas penas branco, marrom e verde, mas muitos domésticos apresentam coloração de todas as suas penas em branco");
	}

}
