
public class Dog {

	private String name;
	private int age;

	Dog(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public void setName(String name) {
		name = this.name;
	}

	public void setAge(int age) {
		age = this.age;
	}

	public String getName() {
		return name;
	}

	public int age() {
		return age;

	}

	public void dogData() {

		System.out.println("この犬は" + this.name + "で年齢は" + this.age + "です");

	}
}
