package oopExam;

/*
 Abstract class name start with upper case, it can follow camel case.
 Abstract class can have variable declared and initialized.
 Abstract class can create default and parameterized constructor.
 Non-abstract Method are implemented inside Abstract class.
 Abstract method are declared inside Abstract class.
 abstract keyword is mandatory to create abstract method.
 Abstract class can not create an object by itself, but with the help of a concrete class object can be created.
 Abstract class can have static method.
 Abstract class can inherit one Regular class and one Abstract class by extends key word.
 Abstract class can't inherit an Interface by extends key word, but it can inherit multiple interface by implements 
 key word.
 */

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch {

	public String name = "Nazif";
	public int age;

	public AppleWatch() {
		System.out.println("This default constructor is from abstract class AppleWatch");
	}

	public void abstractClassInfo() {
		System.out.println("Abstract class name start with upper case, it can follow camel case."
				+ "\nAbstract class can have variable declared and initialized. "
				+ "\nAbstract class can create default and parameterized constructor. "
				+ "\nNon-abstract Method are implemented inside Abstract class."
				+ "\nAbstract method are declared inside Abstract class."
				+ "\nabstract keyword is mandatory to create abstract method."
				+ "\nAbstract class can not create an object by itself, but with the help of a concrete class object can be created."
				+ "\nAbstract class can have static method."
				+ "\nAbstract class can inherit one Regular class and one Abstract class by extends key word."
				+ "\nAbstract class can't inherit an Interface by extends key word, but it can inherit multiple interface by implements"
				+ " key word.");
	}

	public abstract void appleWatchInfo();

}
