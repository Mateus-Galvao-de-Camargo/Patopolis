package com.ifsc.tds;

public class MallardDuck extends Duck implements Quackable, Flyable {

	public void display(){
		System.out.println("Pato-Real sua versão selvagem tem nas suas penas branco, marrom e verde, mas muitos domésticos apresentam coloração de todas as suas penas em branco");
	}

	@Override
	public void fly() {
		System.out.println("Um Pato-Real está voando!");
		
	}

	@Override
	public void quack() {
		System.out.println("Quack Quack");
		
	}

}
