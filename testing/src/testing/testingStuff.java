package testing;

public class testingStuff {

	
	public static void main(String[] args) {
		String[] names = {"Jed", "Keisha", "Jaylen"};
		int[] ages = {22, 33, 44};
		double[] salaries = {68992.9243, 48339.23423, 121042.04328};

		String employee = String.format("Smallest salary: $%,.2f, Name: %s, age: %d", findSmallestSalary(salaries), names[findPosition(salaries)], ages[findPosition(salaries)]);
		
		System.out.print(employee);
	}
	
	//helper method 1
	public static double findSmallestSalary(double[] money) {
		double Min = money[0];
		
		for(int i = 0; i < money.length; i++) {
			if(Min > money[i])
				Min = money[i];
		}
		
		return Min;
	}
	
	//helper method 2
	public static int findPosition(double[] money) {
		double Min = money[0];
		int pos = 0;
		
		for(int i = 0; i < money.length; i++) {
			if(Min > money[i]) {
				Min = money[i];
				pos = i;
			}
		}
		
		return pos;
		
	}

}
