package prob4;

public class Worker {
	private String name;

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

	public Worker(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
