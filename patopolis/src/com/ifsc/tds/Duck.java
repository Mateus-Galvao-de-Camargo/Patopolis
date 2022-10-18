package com.ifsc.tds;

public abstract class Duck {

	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	/**
	 * Descreve detalhes da espécie e como é o pato.
	 */
	public void display(){}
	
	/**
	 * Descreve o nado com a ação literal, por exemplo: Nadando*. o asterisco(*) após a frase simboliza que ela se trata de uma ação.
	 */
	public void swim(){
		System.out.println("Nadando*");
	}

	/**
	 * Descreve com onomatopeias o grasnado de determinado pato
	 */
	public void performQuack() {
		this.quackBehavior.quack();
	}
	
	/**
	 * Descreve com onomatopeias o voo de determinado pato
	 */
	public void performFly() {
		this.flyBehavior.fly();
	}
}
