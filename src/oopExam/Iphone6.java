package oopExam;

/*
In 2004, Iphone6 come into the market which inherits Iphone5. Implement it. 
*/
public class Iphone6 extends Iphone5 {

	public void compass() {
		System.out.println("Compass is used  to find location");
	}
	// Inheritance concept is used to relate to Iphone1 to Iphone6.

	/*
	 * 1) When there are multiple method with same name but with different parameter
	 * is called method overloading. 2) When there are multiple method with same
	 * name and with the same parameter but logics are different is called method
	 * Overridden. Method overridden occur in child class.
	 */

	public void materials() {
		System.out.println("This is void type method");
	}

	public int materials(int ramPrice, int cameraPrice) {
		int total1 = ramPrice + cameraPrice;
		System.out.println("Total1 price: " + total1);
		return total1;
	}

	public int materials(int ramPrice, int cameraPrice, String processorPrice) {
		int total2 = ramPrice + cameraPrice + Integer.parseInt(processorPrice);
		System.out.println("Total2 price: " + total2);
		return total2;
	}

	public int materials(int ramPrice, int cameraPrice, String processorPrice, int keyboardPrice) {
		int total3 = ramPrice + cameraPrice + Integer.parseInt(processorPrice) + keyboardPrice;
		System.out.println("Total3 price: " + total3);
		return total3;
	}

	public static int materials(int ramPrice, int cameraPrice, int keyboardPrice) {
		int total4 = ramPrice + cameraPrice + keyboardPrice;
		System.out.println("Total4 price: " + total4);
		return total4;
	}

	public final int materials(int ramPrice, int cameraPrice, String processorPrice, float keyboardPrice) {
		int total5 = ramPrice + cameraPrice + Integer.parseInt(processorPrice) + (int) keyboardPrice;
		System.out.println("Total5 price: " + total5);
		return total5;
	}

	/*
	 * First write about method over loading and method overriding with multiple
	 * line comments here Now, Think about Iphone6. It also has 6 methods with the
	 * same name as materials(). For example -- They are return type parameterized
	 * method (int ramPrice, int cameraPrice), another one return type parameterized
	 * method (int ramPrice, int cameraPrice, String ProcessorPrice), etc. Can you
	 * use the void, parameterized(return type), final (return type), or static
	 * (return type) method here as the same method name? if yes, create them and
	 * take more int variable of your own. What kind of concept you can use?
	 * [points: 70]. Instantiate the class in TestPhone and initialize those
	 * methods. [points: 70]. Now think about a regular class Name ConfiguredIphone6
	 * which extends Iphone6. Override those methods of Iphone6 and change the logic
	 * at your own to show the changes. [points: 50]. Show the output in TestPhone
	 * (how many methods is possible to extends). [points: 50].
	 * 
	 * Please make sure you organize the code in every class
	 * 
	 * Paste the github link for the package below
	 * 
	 */
}
