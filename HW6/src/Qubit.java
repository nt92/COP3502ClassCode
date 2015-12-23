public class Qubit 
{
	//variables and construct for qubit in the form of |a+bi|
	double a, b;
	
	public Qubit(double a, double b)
	{
		this.a = a;
		this.b = b;
	}
	
	//returner methods for qubit class
	public double getA()
	{
		return a;
	}
	
	public double getB()
	{
		return b;
	}
	
	public boolean observe()
	{
		//calculates a normalized, which is a value between 0 and 1
		double a_norm = a / (Math.sqrt(a * a + b * b));
		double b_norm = b / (Math.sqrt(a * a + b * b));
		
		double rand = Math.random();
		
		//if the random is less than the a_norm, then it is a qubit
		if(rand <= a_norm)
			return true;
		
		else
			return false;
	}
}
