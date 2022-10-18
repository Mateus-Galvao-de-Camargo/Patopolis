package com.ifsc.tds;

public class MallardDuck extends Duck implements Quackable, Flyable {

	public void display(){
		System.out.println("Pato-Real sua vers�o selvagem tem nas suas penas branco, marrom e verde, mas muitos dom�sticos apresentam colora��o de todas as suas penas em branco");
	}

	@Override
	public void fly() {
		System.out.println("Um Pato-Real est� voando!");
		
	}

	@Override
	public void quack() {
		System.out.println("Quack Quack");
		
	}

}
