public class testPentagonalNumber 
{
	public static int getPentagonalNumber(int n)
	{
		int pentNum = n *(3 * n - 1) / 2;
		return pentNum;
				
	}
	
	public static void main(String[] args)
	{
		int countPent = 0;
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				countPent++;
				System.out.print(getPentagonalNumber(countPent) + " ");
			}
			System.out.println();
		}
	}

}
