package com.ifsc.tds;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack quack!");
	}

}
