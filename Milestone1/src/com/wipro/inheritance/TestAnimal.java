package com.wipro.inheritance;

public class TestAnimal {
public static void main(String[] args) {
	Bird b=new Bird();
	b.birdeat();
	b.birdsleep();
	b.birdfly();
	b.eat();
	b.sleep();
}
}
class Animal
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
	void sleep()
	{
		System.out.println("Animal is sleeping");
	}
}
class Bird extends Animal
{
	void birdeat()
	{
		System.out.println("Bird is eating");
	}
	void birdsleep()
	{
		System.out.println("Bird is sleeping");
	}
	void birdfly()
	{
		System.out.println("Bird is flying");
	}
}
