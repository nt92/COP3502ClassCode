public class QuadraticEquation 
{
	//variables for the object
	private int a, b, c;
	
	//constructor
	public QuadraticEquation(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	//methods to return the variables
	public int getA()
	{
		return a;
	}
	
	public int getC()
	{
		return c;
	}
	
	public int getB()
	{
		return b;
	}
	
	//method that finds the discriminant of formula b^2 - 4ac
	public double getDiscriminant()
	{
		return Math.pow(b, 2) - (4 * a * c);
	}
	
	//methods to get the roots if the discriminant is greater than 0
	public double getRoot1()
	{
		if(getDiscriminant() < 0)
		{
			//print statement if no roots exist
			System.out.println("The system has no real roots!");
			return 0;
		}
		else
		{
			return (((-1 * b) + getDiscriminant())/2*a);
		}
	}
	
	public double getRoot2()
	{
		if(getDiscriminant() < 0)
		{
			System.out.println("The system has no real roots!");
			return 0;
		}
		else
		{
			return (((-1 * b) - getDiscriminant())/2*a);
		}
	}
}
