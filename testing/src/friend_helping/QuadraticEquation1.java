package friend_helping;

public class QuadraticEquation1{   
	
   public static void main(String[] args){
    quadraticEquation q = new quadraticEquation(1, 3, 1);
    int d = q.getDiscriminant();
    System.out.println(d);
    System.out.println(q.getRoot1());
    System.out.println(q.getRoot2());
 }
}