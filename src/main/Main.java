package main;

import entity.Dog;
import entity.Human;

public class Main {

	public static void main(String[] args) {
		Human human = new Human("Camilo");
		Dog dog = new Dog("Roger", human);
		System.out.println(dog);
	}

}
