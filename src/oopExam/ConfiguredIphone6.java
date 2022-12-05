package oopExam;

public class ConfiguredIphone6 extends Iphone6 {
	@Override
	public void materials() {
		System.out.println("This is void type method");
	}

	@Override
	public int materials(int ramPrice, int cameraPrice) {
		int total1 = (ramPrice + cameraPrice) * 2; // total1 price will be multiple by 2
		System.out.println("Total1 price: " + total1);
		return total1;
	}

	@Override
	public int materials(int ramPrice, int cameraPrice, String processorPrice) {
		int total2 = (ramPrice + cameraPrice + Integer.parseInt(processorPrice)) / 2;// total2 price will be divide by 2
		System.out.println("Total2 price: " + total2);
		return total2;
	}

	@Override
	public int materials(int ramPrice, int cameraPrice, String processorPrice, int keyboardPrice) {
		int total3 = (ramPrice + cameraPrice + Integer.parseInt(processorPrice) + keyboardPrice) + 100;// add by 100
		System.out.println("Total3 price: " + total3);
		return total3;
	}

	// final and static type method can't be Overridden
	/*
	 * @Override public static int materials(int ramPrice, int cameraPrice, int
	 * keyboardPrice) { int total4 = ramPrice + cameraPrice + keyboardPrice;
	 * System.out.println("Total4 price: " + total4); return total4; }
	 * 
	 * @Override public final int materials(int ramPrice, int cameraPrice, String
	 * processorPrice, float keyboardPrice) { int total5 = ramPrice + cameraPrice +
	 * Integer.parseInt(processorPrice) + (int) keyboardPrice;
	 * System.out.println("Total5 price: " + total5); return total5; }
	 */
}
