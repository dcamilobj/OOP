/**
 * 
 */
package entity.polymorphism;

/**
 * @author Camilo Bedoya
 *
 */
public class Cat extends Animal{
	
	public int lifetime = 10; //Don't override data members
	
	@Override //It's not necessary, but it's highly recommended
	public void eat() {
		System.out.println("Cat eating...");
	}
}
