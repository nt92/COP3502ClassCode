import java.util.*;
public class CreditCard
{
	public static Boolean isValid(long number)
	{
		String num = "" + number;
		if(getSize(number) != 0)
		{
			return false;
		}
		else if (num.substring(0,0) != "4" || num.substring(0,0) != "5" || num.substring(0,0) != "6" || num.substring(0,1) != "37")
		{
			return false;
		}
		return true;
	}

	public static int sumOfDoubleEvenPlace(long number)
	{
		String num = "" + number;
		
		String[] evenPlace = new String[8];
		int j = 0;
		for(int i = 0; i < 16; i += 2)
		{
			evenPlace[j] = num.substring(i,i+1);
			j++;
		}
		
		int[] evenNum = new int[8];
		for(int i = 0; i < 8; i ++)
		{
			evenNum[i] = Integer.parseInt(evenPlace[i]) * 2;
			if(evenNum[i] >= 10)
			{
				evenNum[i] = getDigit(evenNum[i]);
			}
		}
		
		int total = 0;
		for(int i = 0; i < evenNum.length; i++)
		{
			total += evenNum[i];
		}
		return total;
		
	}

	public static int  getDigit(int number)
	{
		String testNum = "" + number;
		int testNum1 = Integer.parseInt(testNum.substring(0,1)) + Integer.parseInt(testNum.substring(1,2));

		return testNum1;
	}

	public static int sumOfOddPlace(long number)
	{
		String num = "" + number;
		
		String[] oddPlace = new String[8];
		int j = 0;
		for(int i = 1; i <= 16; i += 2)
		{
			oddPlace[j] = num.substring(i,i+1);
			j++;
		}
		
		int[] oddNum = new int[8];
		for(int i = 0; i < 8; i ++)
		{
			oddNum[i] = Integer.parseInt(oddPlace[i]);
		}
		
		int total = 0;
		for(int i = 0; i < oddNum.length; i++)
		{
			total += oddNum[i];
		}
		return total;
	}

	public static boolean  prefixMatched(long number, int d)
	{
		if((d == 4 || d == 5 || d == 6 || d == 37) && (getPrefix(number, 1) == 4 || getPrefix(number, 1) == 5 || getPrefix(number, 1) == 6 || getPrefix(number, 2) == 37))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static int getSize(long d)
	{
		String num = "" + d;
		return num.length();
	}

	public static long getPrefix(long number, int k)
	{
		String num = "" + number;
		String prefix = num.substring(0,k);
		return Integer.parseInt(prefix);
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a 16 digit Credit Card number: ");
		long cardNum = in.nextLong();
		
		int numCheck = sumOfOddPlace(cardNum) + sumOfDoubleEvenPlace(cardNum);
		if(numCheck%10 == 0)
		{
			System.out.println("The card is valid!");
		}
		else
		{
			System.out.println("The card is invalid!");
		}
	}
}
