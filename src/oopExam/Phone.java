package oopExam;

/*
 Interface name start with upper case letter. 
 In Interface method are declared. Declared method is abstract in nature.  However, we can write abstract key word before writing the method type, It is not mandatory. 
 \n\tTheir are two exception: Static and default method can be can be implemented.
 Interface can not create an object by itself, but with the help of a concrete class object can be created.
 Interface can't inherit Regular class or Abstract class by extends key word, but an Interface can inherit multiply  Interfaces by extends key word.
 Variable in Interface initialized only with static and final key word.
 Variable can't be declared in Interface.
  Interface can't create constructor.
 */

public interface Phone extends Pager, Wakitoki {

	public static final String name = "Numan";

	/*
	 * Variable can't be declared in Interface. public static final String name;
	 */

	/*
	 * Interface can't create constructor. public Phone() {
	 * 
	 * }
	 */

	public void interfaceInfo();

	public void call();

	public void message();

	public void camera();

	public static void battery() {
		System.out.println("battery is void type static method which is non-abstract form Phone Interface."
				+ " Java 1.8 started to implement static and default type method in the Interface.");
	}

	public default int wireless() {
		System.out.println("wireless is return type default method which is non-abstract from Phone Interface");
		return 0;
	}

}
