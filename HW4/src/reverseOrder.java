public class reverseOrder 
{	
	public static void main(String[] args)
	{
		int[] forwardList = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = forwardList.length - 1; i >= 0; i--)
		{
			System.out.print(forwardList[i] + " ");
		}
	}
}
