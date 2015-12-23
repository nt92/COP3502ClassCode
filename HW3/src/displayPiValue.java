public class displayPiValue 
{
	public static double computeSeries(int a)
	{
		double sum = 0;
		for(int i = 1; i <= a; i++)
		{
			sum += (Math.pow(-1, i+1))/(2*i-1);
		}
		return sum*4;
	}
	
	public static void main(String[] args)
	{
		System.out.printf("%-10s%-10s\n", "i", "m(i)");
		for(int i = 10; i <= 100; i += 10)
		{
			System.out.printf("%-10d%-10.5f\n", i, computeSeries(i));
		}
	}
}