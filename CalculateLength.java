
import java.util.Scanner;

public class CalculateLength {
	static int[] x=new int[2];
	static int[] y=new int[2];
	 public static void main(String[] args) {
			
		 	Scanner s = new Scanner(System.in);
			for(int i=0;i<2;i++) {
				System.out.println("enter x"+(i+1));
				x[i] = s.nextInt();
				System.out.println("enter y"+(i+1));
				y[i] = s.nextInt();
			}
			 
			double length = Math.sqrt(Math.pow(x[1]-x[0],2)+Math.pow(y[1]-y[0],2));
			System.out.println("Length of the Line: "+length);
	        }

}