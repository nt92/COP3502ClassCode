import java.util.*;
public class testQuadEq 
{
	public static void main(String[] args)
	{
		//scanner class
		Scanner in = new Scanner(System.in);
		int a, b, c;
		
		//takes input and puts them into the form of ax^2 + bx + c
		System.out.print("Please enter three integer values for a, b, and c, separated by spaces: ");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
		//new quadraticequation class and prints it
		QuadraticEquation input = new QuadraticEquation(a, b, c);
		
		System.out.println("The roots are: " + input.getRoot1() + " and " + input.getRoot2());
	}
}
