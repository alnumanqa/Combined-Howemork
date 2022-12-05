package oopExam;

public class Iphone2 extends Iphone1 {

	public char userOfIphone2;

	public Iphone2() {
		super();
		super.name = "Numan";// variable is initialized here by super key word
		System.out.println("Name: " + name);
		System.out.println("This defaut constructor from class of Iphone2");
	}

	public Iphone2(char userOfIphone) {
		super(750, "Apple", 'M', false);
		super.regularClassInfo();
		this.userOfIphone2 = userOfIphone;
		System.out.println("User of Iphone: " + userOfIphone);
	}

	public void iphone2Info() {
		super.youtube();
		super.pager();
		System.out.println();

	}

	public void iphone2Info(char userOfIphone) {
		this.userOfIphone2 = userOfIphone;
		super.call();
		super.abstractClassInfo();
		super.appleWatchInfo();
		super.appleWatchSeris();
		super.camera();
		super.degitalWatch();
		System.out.println("User of Iphone: " + userOfIphone);
	}

	public static void dropbox() {
		System.out.println("Dropbox is a home for all your work.");
	}

}
