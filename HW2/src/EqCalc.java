import java.util.*;
public class EqCalc 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a value for a: ");
		int a = in.nextInt();
		
		System.out.print("Please enter a value for b: ");
		int b = in.nextInt();
		
		System.out.print("Please enter a value for c: ");
		int c = in.nextInt();
		
		double d = 3*((double)a-10)/5 + (double)b + 10*(double)c/33;
		System.out.println("Your answer is: " + (int)d);
	}
}