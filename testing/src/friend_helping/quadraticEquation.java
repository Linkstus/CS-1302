package friend_helping;

		public class quadraticEquation {
		   private int a;
		   private int b;
		   private int c;
		   
		   public quadraticEquation(){
			   a = 1;
			   b = 1;
			   c = 1;
		   }
		   
		   public quadraticEquation (int a, int b, int c) {
		      this.a = a;
		      this.b = b;
		      this.c = c;
		   }
		   
		   public int getA() {
		      return a;
		   }
		   
		   public int getB() {
		      return b;
		   }
		   
		   public int getC() {
		      return c;
		   }
		   
		   public void setA (int a) {
		      this.a = a;
		   }
		   
		   public void setB (int b) {
		      this.b = b;
		   }
		   
		   public void setC (int c) {
		      this.c = c;
		   }
		   public int getDiscriminant() {
		        int d = (b * b) - (4 * (a * c));
		        if(d > 0)
		        	return d;
		        else
		        	return 0;
		   }
		   
		   public double getRoot1 () {
			   double x1 = ((-b + (Math.sqrt((b * b) - (4 * a * c))))/(2*a));
			   return x1;
		   }
		   
		   public double getRoot2 () {
			   double x2 = ((-b - (Math.sqrt((b * b) - (4 * a * c))))/(2*a));
			   return x2;
		   } 
}
