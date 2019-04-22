package prob1;

public class Employee {
	private double[] hours;
	private String name;
	private double payRate;
	
	//constructor
	public Employee(String name, double payRate){
		hours = new double[7];
		this.name = name;
		this.payRate = payRate;
	}
	
	//sets hours
	public void setHours(int day, double hours) {
		if(day > 0 && day < 7)
			this.hours[day] = hours;
	}
	
	public double getPayRate() {
		return payRate;
	}
	
	public double getHours(int days) {
		return hours[days];
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumDaysWorked(double[] hours) {
		int count = 0;
		for(double h : hours) {
			if(h > 0)
				count++;
		}
		return count;
	}
	
	public double getPay(double[] hours) {
		double countWeekdayHours = 0.0;
		double countWeekendHours = 0.0;
		double totalPay = 0.0;
				
		for(int i = 0; i < hours.length; i++) {
			if(i >= 0 && i < 6)
				countWeekdayHours += hours[i];
			else
				countWeekendHours += hours[i];
		}
		total
		double timeHalf = payRate / 2;
		if(countWeekdayHours > 40) {
			double temp = countWeekdayHours - 40;
			totalPay  = temp * timeHalf;
		}
		
		
	}
}
