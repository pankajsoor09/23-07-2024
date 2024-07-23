package polymorphism;

public class EmployeeTest {

	public static void main(String[] args) {
		Person person = new Person();
		person.display();
		person.getNumber();
		person.getStatus();
		person.getObject();

		System.out.println("---------------------------");

		person = new Employee();
		person.display();
		person.getNumber();
		person.getStatus();
		person.getObject();
	}

}
