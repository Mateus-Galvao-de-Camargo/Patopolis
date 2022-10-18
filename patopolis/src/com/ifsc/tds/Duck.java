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
	 * Descreve detalhes da esp�cie e como � o pato.
	 */
	public void display(){}
	
	/**
	 * Descreve o nado com a a��o literal, por exemplo: Nadando*. o asterisco(*) ap�s a frase simboliza que ela se trata de uma a��o.
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
