package polymorphism;

public class Employee extends Person {

	void display() {
		System.out.println("display() in Employee class");
	}

	protected int getNumber() {// in person class access is default so. same access is allowed or bigger access
		System.out.println("getNumber() in Employee class");
		return 100;
	}

	public boolean getStatus() {// public and protected are bigger than default access .also default can be use
		System.out.println("getStatus() in Employee class");
		return true;
	}

	Employee getObject() { // covariant return type : from jdk 5 we can use child or sub class name.Person getObject() overriding
		System.out.println("getObject() in Employee Class");
		return this; // current class
	}

}

/*covariant return type 
 * The access specifier for an overriding method can allow more, but not less, access than the overridden method. 
 * For example, a protected instance method in the superclass(parent) can be made public, but not private, in the subclass(child)
 *  If you force it to be done, it will cause a compile-time error.(cannot give less access than parent class to child)
 */