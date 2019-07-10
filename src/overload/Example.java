package overload;

/**
 * 
 * @author Camilo Bedoya
 *
 */
public class Example {

	public int sum (int a, int b) {
		return a + b;
	}
	
	public int sum (int a, int b, int c) {
		return a + b + c;
	}
	
	public int sum (long a, int b) {
		return (int)a + b;
	}
	
	public int sum (int a, long b) {
		return a + (int)b;
	}
	
	public long sum(long a, long b) {
		return a + b;
	}
	
	/*Invalid, becasuse it has same name and same parameters*/
//	public void sum (int a, int b) {
//		System.out.println("Hi!");
//	}
}
