package oopExam;

public class TestPhone {

	public static void main(String[] args) {
		System.out.println("\nIphone class is instantiate here\n");

		Iphone1 iphone1 = new Iphone1();

		System.out.println("\n-------------------- method is called here-------------------\n");
		iphone1.regularClassInfo();
		iphone1.pager();
		Iphone1.youtube();// static method
		iphone1.interfaceInfo();
		iphone1.call();
		iphone1.message();
		iphone1.camera();
		iphone1.watch();
		iphone1.appleWatchInfo();
		iphone1.degitalWatch();
		iphone1.abstractClassInfo();
		iphone1.appleWatchSeris();
		iphone1.watch();
		iphone1.degitalWatch();
		iphone1.wireless();
		iphone1.wakitoki();

		System.out.println("\n--------------------getter and setter method is called here-------------------\n");
		iphone1.setPrice(750);
		iphone1.setInfo("Apple");
		iphone1.setUser('M');
		iphone1.setMadeInUSA(false);
		System.out.println("Price of the Iphone: " + iphone1.getPrice() + ", Brand: " + iphone1.getInfo() + ", User; "
				+ iphone1.getUser() + ", Made in USA: " + iphone1.getMadeInUSA());

		System.out.println("\nAppleWatch is instatiate here\n");

		AppleWatch appleWatch = new Iphone1();
		appleWatch.abstractClassInfo();
		appleWatch.appleWatchInfo();
		appleWatch.appleWatchSeris();
		appleWatch.degitalWatch();
		appleWatch.watch();

		System.out.println("\nPhone is instatiate here\n");

		Phone phone = new Iphone1();
		phone.call();
		phone.camera();
		phone.interfaceInfo();
		phone.message();
		phone.pager();
		Phone.battery();// static method
		phone.wireless();
		phone.wakitoki();

		System.out.println("\nClass IPhone2 is instatiate here\n");
		Iphone2 iphone2 = new Iphone2();// default constructor initialized here
		iphone2.iphone2Info();
		Iphone2.dropbox();// static method
		iphone2.pager();
		iphone2.interfaceInfo();
		iphone2.call();
		iphone2.message();
		iphone2.camera();
		iphone2.watch();
		iphone2.appleWatchInfo();
		iphone2.degitalWatch();
		iphone2.abstractClassInfo();
		iphone2.appleWatchSeris();
		iphone2.watch();
		iphone2.degitalWatch();
		iphone2.wireless();
		iphone2.wakitoki();

		System.out.println("\nClass IPhone2 is instatiate here\n");
		Iphone2 iphone3 = new Iphone2('M');// parameterized constructor initialized here
		iphone3.iphone2Info('M');
		iphone3.setPrice(750);
		iphone3.setInfo("Apple");
		iphone3.setUser('M');
		iphone3.setMadeInUSA(false);
		System.out.println("Price of the Iphone: " + iphone3.getPrice() + ", Brand: " + iphone3.getInfo() + ", User; "
				+ iphone3.getUser() + ", Made in USA: " + iphone3.getMadeInUSA());

		System.out.println("\nClass IPhone6 is instatiate here\n");
		Iphone6 iphone6 = new Iphone6();
		iphone6.compass();
		iphone6.email();
		iphone6.photos();
		iphone6.iphone2Info();
		Iphone6.dropbox(); // static method
		iphone6.pager();
		iphone6.interfaceInfo();
		iphone6.call();
		iphone6.message();
		iphone6.camera();
		iphone6.watch();
		iphone6.appleWatchInfo();
		iphone6.degitalWatch();
		iphone6.abstractClassInfo();
		iphone6.appleWatchSeris();
		iphone6.watch();
		iphone6.degitalWatch();
		iphone6.wireless();
		iphone6.wakitoki();
		Iphone6.youtube();// static method

		System.out.println("\n--------------------getter and setter method is called here-------------------\n");
		iphone6.setPrice(750);
		iphone6.setInfo("Apple");
		iphone6.setUser('M');
		iphone6.setMadeInUSA(false);
		System.out.println("Price of the Iphone: " + iphone6.getPrice() + ", Brand: " + iphone6.getInfo() + ", User; "
				+ iphone6.getUser() + ", Made in USA: " + iphone6.getMadeInUSA());

		// Iphone6 inherit Iphone5 is Single Inheritance.
		// Iphone6 inherit Iphone5, then Iphone5 inherit Iphone4 is called Multi-level
		// Inheritance.
		// Iphone2 inherit Iphone1, and Iphone3 also inherit Iphone1 is called
		// Hierarchical Inheritance.

		System.out.println("\n--------------------Overloading method are called here-------------------\n");
		iphone6.materials();
		iphone6.materials(500, 700);
		iphone6.materials(550, 300, "800");
		iphone6.materials(700, 100, "40", 80);
		iphone6.materials(200, 500, "75", 50f);
		Iphone6.materials(800, 300, 80);// Static method

		System.out.println("\n--------------------ConfiguredIphone calles instatite here-------------------\n");
		ConfiguredIphone6 cn = new ConfiguredIphone6();

		System.out.println("\n--------------------Overridden method are called here-------------------\n");
		cn.materials();
		cn.materials(500, 700);
		cn.materials(550, 300, "800");
		cn.materials(700, 100, "40", 80);

		System.out
				.println("\n--------------------Overloading method from Iphone6 are called here-------------------\n");
		ConfiguredIphone6.materials(800, 300, 80); // static method from Iphone6
		cn.materials();
		cn.materials(500, 700);
		cn.materials(550, 300, "800");
		cn.materials(700, 100, "40", 80);
		cn.materials(200, 500, "75", 50f);

		// Iphone6 inherit Iphone5 is Single Inheritance.
		// Iphone6 inherit Iphone5, then Iphone5 inherit Iphone4 is called Multi-level
		// Inheritance.
		// Iphone2 inherit Iphone1, and Iphone3 also inherit Iphone1 is called
		// Hierarchical Inheritance.

	}

}
