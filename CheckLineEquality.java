
import java.util.Scanner;

public class CheckLineEquality {
	static int[] x=new int[4];
	static int[] y=new int[4];
	//static double length1;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<4;i++) {
			System.out.println("enter x"+(i+1));
			x[i] = s.nextInt();
			System.out.println("enter y"+(i+1));
			y[i] = s.nextInt();
		}
		calculateLength(x,y);	
	}
	
	public static void calculateLength(int[]c, int []d) {
	   double length1 = Math.sqrt(Math.pow(c[1]-c[0],2)+Math.pow(d[1]-d[0],2));
	   double length2 = Math.sqrt(Math.pow(c[2]-c[3],2)+Math.pow(d[2]-d[3],2));
	   System.out.println("Length-1 > "+length1);
	   System.out.println("Length-2 > "+length2);
	
	   if ( length1==length2) {
		   System.out.println("Length is Equal");
	   }else{
		   System.out.println("Length is not Equal");
	   }
	}
}