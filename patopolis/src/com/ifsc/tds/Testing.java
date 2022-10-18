package com.ifsc.tds;

public class Testing {

	public static void main(String[] args) {

		Duck patoReal = new MallardDuck();
		Duck zarroVermelho = new RedHeadDuck();
		Duck patoEmborrachado = new RubberDuck();
		Duck patoDeMadeira = new DecoyDuck();

		System.out.println("------------------");

		patoReal.display();
		patoReal.swim();
		patoReal.performFly();
		patoReal.performQuack();

		System.out.println("------------------");

		zarroVermelho.display();
		zarroVermelho.swim();
		zarroVermelho.performFly();
		zarroVermelho.performQuack();

		System.out.println("------------------");

		patoEmborrachado.display();
		patoEmborrachado.swim();
		patoEmborrachado.performFly();
		patoEmborrachado.performQuack();

		System.out.println("------------------");

		patoDeMadeira.display();
		patoDeMadeira.swim();
		patoDeMadeira.performFly();
		patoDeMadeira.performQuack();

	}

}
