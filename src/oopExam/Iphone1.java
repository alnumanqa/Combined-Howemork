package oopExam;

/*
 Regular class name start with upper case and it can follow camel case.
 Regular class can have variable declared and initialized.
 Regular class can create default and parameterized constructor.
 Method are implemented only in Regular class which are non-abstract.
 Regular class can have static method.
 Regular class can create an object by itself.
 Regular class can inherit one Regular class and one Abstract class by extends key word.
 Regular class can't inherit an Interface by extends key word, but it can inherit multiple interface by implements key word.
 */

public class Iphone1 extends AppleWatch implements Phone {
	private int price;
	private String info;
	private char user;
	private boolean madeInUSA;
	public String name;

	public Iphone1() {
		System.out.println("This default constructor from Iphone class");
	}

	public Iphone1(int price, String info, char user, boolean madeInUSA) {
		super();
		this.price = price;
		this.info = info;
		this.user = user;
		this.madeInUSA = madeInUSA;
		System.out.println(
				"Iphone price: " + price + ", Brand: " + info + ", User sex: " + user + "Made in USA: " + madeInUSA);
	}

	public void regularClassInfo() {
		System.out.println("Regular class name start with upper case and it can follow camel case."
				+ "\nRegular class can have variable declared and initialized."
				+ "\nRegular class can create default and parameterized constructor."
				+ "\nMethod are implemented only in Regular class which are non-abstract."
				+ "\nRegular class also can have static method." + "\nRegular class can create an object by itself."
				+ "\nRegular class can inherit one Regular class and one Abstract class by extends key word."
				+ "\nRegular class can't inherit an Interface by extends key word, "
				+ "\nbut it can inherit multiple interface by implements key word.");

	}

	public static void youtube() {
		System.out.println("One of the founder of Youtube is Jawwed Karim who is Bangladeshi decent.");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public char getUser() {
		return user;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public boolean getMadeInUSA() {
		return madeInUSA;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}

	@Override
	public void pager() {
		// TODO Auto-generated method stub

	}

	@Override
	public void interfaceInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void call() {
		// TODO Auto-generated method stub

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub

	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub

	}

	@Override
	public void watch() {
		// TODO Auto-generated method stub

	}

	@Override
	public void appleWatchInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void degitalWatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public void wakitoki() {
		// TODO Auto-generated method stub

	}

	/*
	 * Write a method inside them related to one of the features like youtube and
	 * print out related info.
	 */

}
