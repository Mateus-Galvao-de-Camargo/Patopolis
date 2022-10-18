package com.ifsc.tds;

public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}

	public void display(){
		System.out.println("Zarro-americano, suas penas em uma variação tem vermelho na cabeça, preto no peito e branco no corpo, mas pode ter seu corpo todo em tons de marrom.");
	}
}
