/**
 * 
 */
package entity.composition;

/**
 * @author Camilo Bedoya
 *
 */
public class Person {

	// Composition has-a relationship
	private Job job;
	
	public Person () {
		this.job = new Job();
		this.job.setSalary(1000);
	}
	
	public long getSalary() {
		return this.job.getSalary();
	}
}
