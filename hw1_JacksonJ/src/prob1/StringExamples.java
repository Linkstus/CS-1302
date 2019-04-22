package prob1;

public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static boolean isLevel1(String password) {
		int count = 0;
		if(isLongEnough(password) && hasNoSpaces(password)) {
			if(isLowerCase(password))
				count++;
			if(isUpperCase(password))
				count++;
			if(isDigit(password))
				count++;
			if(count >= 2)
				return true;
		}
		return false;
	}
	
	public static boolean isLongEnough(String psw) {
		int count = 0;
		for(int i = 0; i < psw.length(); i++) {
			count += psw.charAt(i);
		}
		if(count >= 6)
			return true;
		return false;
	}
	
	public static boolean hasNoSpaces(String psw) {
		for(int i = 0; i < psw.length(); i++) {
			if(psw.charAt(i) == ' ')
				return false;
		}
		return true;
	}
	
	public static boolean isLowerCase(String psw) {
		int count = 0;
		for(int i = 0; i < psw.length(); i++) {
			if(Character.isLowerCase(psw.charAt(i)))
				count++;
		}
		if(count >= 1)
			return true;
		return false;
	}
	
	public static boolean isUpperCase(String psw) {
		int count = 0;
		for(int i = 0; i < psw.length(); i++) {
			if(Character.isUpperCase(psw.charAt(i)))
				count++;
		}
		if(count >= 1)
			return true;
		return false;
	}
	public static boolean isDigit(String psw) {
		int count = 0;
		for(int i = 0; i < psw.length(); i++) {
			if(Character.isDigit(psw.charAt(i)))
				count++;
		}
		if(count >= 1)
			return true;
		return false;
	}

	public static boolean isLevel2(String password) {
		int count = 0;
		if(isLongEnough(password) && hasNoSpaces(password)) {
			if(isLowerCase(password))
				count++;
			if(isUpperCase(password))
				count++;
			if(isDigit(password))
				count++;
			if(count == 3)
				return true;
		}
		return false;
	}
	
	public static String reverseWords(String wrd) {
		int pos = wrd.lastIndexOf(' ');
		String reverse = "";
		while(pos != -1) {
			reverse += wrd.substring(pos);
			wrd = wrd.substring(0, pos);
			pos = wrd.lastIndexOf(' ');
		}
		reverse += " " + wrd;
		reverse = reverse.trim();
		return reverse;
	}
	
	public static String getUniqueCharsAndDigits(String[] wrds) {
		String temp = combineCheck(wrds);
		String digit = Digit(temp);
		String letter = Letter(temp);
		
		return letter + digit;
	}
	
	//helper method 1
	public static String combineCheck(String[] wrd) {
		String combine = "";
		
		for(int i = 0; i < wrd.length; i++) {
			combine += wrd[i];
		}
		
		String removed = removeExtra(combine);
		
		return removed;
	}
	
	//helper method for combine check
	public static String removeExtra(String comb) {
		String remove = "";
		
		for(int i = 0; i < comb.length(); i++) {
			if(remove.indexOf(comb.charAt(i)) == -1)
				remove += comb.charAt(i);
		}
		
		return remove;
	}
	
	//helper method 2
	public static String Digit(String temp) {
		String D = "";
		for(int i = 0; i < temp.length(); i++) {
			if(Character.isDigit(temp.charAt(i)))
				D += temp.charAt(i);
		}
		return D;
	}
	
	// helper method 3
	public static String Letter(String temp) {
		String L = "";
		for(int i = 0; i < temp.length(); i++) {
			if(Character.isLetter(temp.charAt(i)))
				L += temp.charAt(i);
		}
		return L;
	}
	
	public static String getSmallestSalaryString(String[] names, int[] ages, double[] salaries) {
		String employee = String.format("Smallest salary:$%,.2f, Name:%s, age:%d", findSmallestSalary(salaries), names[findPosition(salaries)], ages[findPosition(salaries)]);
		
		return employee;
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