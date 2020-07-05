package com.wipro.polymorphism;

public class FruitsProgram {
	public static void main(String[] args) {
		new Fruit().eat();
		new Apple().eat();
		new Orange().eat();
	}
}
class Fruit {
	 String name;
	 String taste;
	 int size;
	
	public Fruit() {
		name = "Apple";
		taste = "sweet";
		size = 10;
	}
	
	public void eat () {
		System.out.println(name + " tastes so " + taste);
	}
}
class Apple extends Fruit {
	public void eat() {
		System.out.println("It tastes like Apple");
	}
}
class Orange extends Fruit {
	public void eat() {
		System.out.println("It tastes like Orange");
	}
}