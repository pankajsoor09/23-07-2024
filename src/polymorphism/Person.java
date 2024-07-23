package polymorphism;//overriding

public class Person {

	void display() {
		System.out.println("display() in Person class");

	}

	int getNumber() {
		System.out.println("getNumber() in person class");
		return 100;
	}

	protected boolean getStatus() {// in employee class boolean needs protected or higher access
		System.out.println("getStatus() in Person class");
		return true;
	}

	Person getObject() {
		System.out.println("getObject() in Person Class");
		return this; // current class
	}

}

