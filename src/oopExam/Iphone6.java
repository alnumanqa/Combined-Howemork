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

}
