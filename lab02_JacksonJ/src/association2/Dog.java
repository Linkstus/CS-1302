package association2;

public class Dog {
	String name;
	Person owner;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String walk() {
		return name + " is walking";
	}
	
	public String barkAt(Dog d) {
		return name + " is barking at " + d.getName();
	}
	
	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	
	@Override
	public String toString() {
		return "dog named " + name;
	}
}
