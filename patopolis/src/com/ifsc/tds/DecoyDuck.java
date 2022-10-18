package com.ifsc.tds;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}

	public void display(){
		System.out.println("Pato de madeira, é uma estátua de pato esculpida em madeira, ao ser posto na água pode se creer que ele flutua, mas pouco a pouco, enquanto se encharca, vai ás profundezas");
	}
	
	public void swim(){
		System.out.println("AFUNDANDO LENTAMENTE*");
	}
}
