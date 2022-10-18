package com.ifsc.tds;

public class RedHeadDuck extends Duck implements Quackable, Flyable {

	public void display(){
		System.out.println("Pato conhescido como Zarro Vermelho");
	}

	@Override
	public void fly() {
		System.out.println("Um Zarro Vermelho está voando!");
		
	}

	@Override
	public void quack() {
		System.out.println("Quack Quack");
		
	}

}
