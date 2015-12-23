public class countNum 
{
	public static void main(String[] args)
	{
		//initializes a new array of type int with 100 spots for random integers between 1 and 10
		int[] intList = new int[100];
		
		for(int i = 0; i < intList.length; i++)
		{
			//Generates a random number between 1 and 10 for each space in intList
			intList[i] = (int)(Math.random()*10) + 1;
		}
		
		//initializes the counters for each of values of the random num generator
		int oneCount  = 0, twoCount = 0, threeCount = 0, fourCount = 0, fiveCount = 0, sixCount = 0, sevenCount = 0,
			eightCount = 0, nineCount = 0, tenCount = 0;
		
		//cycles through each value in intList and adds to counter for respective integer
		for(int i = 0; i < intList.length; i++)
		{
			if(intList[i] == 1)
			{
				oneCount++;
			}
			else if(intList[i] == 2)
			{
				twoCount++;
			}
			else if(intList[i] == 3)
			{
				threeCount++;
			}
			else if(intList[i] == 4)
			{
				fourCount++;
			}
			else if(intList[i] == 5)
			{
				fiveCount++;
			}
			else if(intList[i] == 6)
			{
				sixCount++;
			}
			else if(intList[i] == 7)
			{
				sevenCount++;
			}
			else if(intList[i] == 8)
			{
				eightCount++;
			}
			else if(intList[i] == 9)
			{
				nineCount++;
			}
			else if(intList[i] == 10)
			{
				tenCount++;
			}
		}
		
		//Print statements for occurrence of each integer
		//if statements provided to differentiate between singular and multiple counts		
		if(oneCount == 1)
		{
			System.out.println("One occurs " + oneCount + " time.");
		}
		else
		{
			System.out.println("One occurs " + oneCount + " times.");
		}
		
		if(twoCount == 1)
		{
			System.out.println("Two occurs " + twoCount + " time.");
		}
		else
		{
			System.out.println("Two occurs " + twoCount + " times.");
		}
		
		if(threeCount == 1)
		{
			System.out.println("Three occurs " + threeCount + " time.");
		}
		else
		{
			System.out.println("Three occurs " + oneCount + " times.");
		}
		
		if(fourCount == 1)
		{
			System.out.println("Four occurs " + fourCount + " time.");
		}
		else
		{
			System.out.println("Four occurs " + fourCount + " times.");
		}
		
		if(fiveCount == 1)
		{
			System.out.println("Five occurs " + fiveCount + " time.");
		}
		else
		{
			System.out.println("Five occurs " + fiveCount + " times.");
		}
		
		if(sixCount == 1)
		{
			System.out.println("Six occurs " + sixCount + " time.");
		}
		else
		{
			System.out.println("Six occurs " + sixCount + " times.");
		}
		
		if(sevenCount == 1)
		{
			System.out.println("Seven occurs " + sevenCount + " time.");
		}
		else
		{
			System.out.println("Seven occurs " + sevenCount + " times.");
		}
		
		if(eightCount == 1)
		{
			System.out.println("Eight occurs " + eightCount + " time.");
		}
		else
		{
			System.out.println("Eight occurs " + eightCount + " times.");
		}
		
		if(nineCount == 1)
		{
			System.out.println("Nine occurs " + nineCount + " time.");
		}
		else
		{
			System.out.println("Nine occurs " + nineCount + " times.");
		}
		
		if(tenCount == 1)
		{
			System.out.println("Ten occurs " + tenCount + " time.");
		}
		else
		{
			System.out.println("Ten occurs " + tenCount + " times.");
		}
	}
}
