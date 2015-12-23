public class TwinPrimes 
{	
	public static boolean isPrime(int a)
	{
		boolean isPrime = true;
		for(int i = 2; i < a; i ++)
		{
			if(a%i == 0)
			{
				isPrime = false;
			}
		}
		return isPrime;
	}
	
	public static void main(String[] args)
	{
		for(int i = 1; i < 1000; i++)
		{
			if(isPrime(i) && isPrime(i + 2))
			{
				System.out.println(" (" + i + "," + ( i+2 ) + ")");
			}
		} 
	}
}
