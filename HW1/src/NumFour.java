
public class NumFour 
{
	public static void main(String[] args)
	{
		int currentPop = 318764823, yearConstant = 60*60*24*365;
		double birthRate = 7, deathRate = 13, immigrateRate = 40;
		
		int oneYearPop = (int)(currentPop + (yearConstant/birthRate) - (yearConstant/deathRate) + (yearConstant/immigrateRate));
		System.out.println("The population in one year will be " + oneYearPop);
		
		int twoYearPop = (int)(oneYearPop + (yearConstant/birthRate) - (yearConstant/deathRate) + (yearConstant/immigrateRate));
		System.out.println("The population in two years will be " + twoYearPop);
		//Casting was used to truncate the population numbers, therefore there are no calculation errors.
	}
}
