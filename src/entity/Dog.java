package entity;

/**
 * 
 * @author Camilo Bedouya
 *
 */
public class Dog {

	private String name;
	private Human owner;
	
	public Dog(String name, Human owner) {
		this.name = name;
		this.owner = owner;
	}
	
	public String toString() {
		return String.format("My name is: %s, my owner is: %s", name,owner);
	}
}
