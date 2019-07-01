package main;

import entity.composition.Dog;
import entity.composition.Human;
import entity.polymorphism.Animal;
import entity.polymorphism.Cat;

public class Main {

	public static void main(String[] args) {
		/*Composition example*/
		Human human = new Human("Camilo");
		Dog dog = new Dog("Roger", human);
		System.out.println("Composition: " + dog);
		
		/*Polymorphism example*/
		Animal cloud = new Cat();
		System.out.print("polymorphism: ");
		cloud.eat();
		System.out.print(cloud.lifetime); //Don't override data members
		
		
	}

}
