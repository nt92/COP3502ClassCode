import java.util.*;
public class testSTD 
{
	public static double mean(double[] x)
	{
		//creates variable total to count total of the x array with a for loop
		double total = 0;
		for(int i = 0; i < x.length; i++)
		{
			total += x[i];
		}
		
		//divides the total by the length of the array (n)
		double mean = total/x.length;
		
		//return the mean
		return mean;
		
	}
	
	public static double deviation(double[] x)
	{
		//calculates the mean through the use of the mean method
		double mean = mean(x);
		
		//creates new array of size x to store the (x-mean)^2 terms for later calculation
		//also used to calculate the total of the (x-mean)^2 terms for calculation
		
		double xMinusTotal = 0;
		double[] xMinusMeanSq = new double[x.length];
		for(int i = 0; i < x.length; i++)
		{
			xMinusMeanSq[i] = Math.pow((x[i]-mean),2);
			xMinusTotal += xMinusMeanSq[i];
		}
		
		//calculates standard deviation by taking square root of the total xMinus values divided by the total minus 1 (n-1)
		double deviation = Math.pow((xMinusTotal/(x.length-1)), .5);
		
		//returns the deviation
		return deviation;
	}
	
	public static void main(String[] args)
	{
		//initialize scanner object
		Scanner in = new Scanner(System.in);
		
		//create new empty array of type double to fill user input
		double[] numList = new double[10];
		System.out.print("Please enter ten numbers separated by spaces: ");
		
		//while loop to add numbers into the array
		int i = 0;
		while(i < 10)
		{
			numList[i] = in.nextDouble();
			i++;
		}
		
		//print statements for the mean and deviation
		System.out.println("The Mean is: " + mean(numList));
		System.out.println("The Standard Deviation is: " + deviation(numList));
		
	}
}
