import java.util.*;
public class DispAscii 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter an integer between 33 and 125 to be converted: ");
		int intConv = in.nextInt();
		
		if(intConv >= 33 && intConv <= 125)
		{
			System.out.println("The corresponding ASCII character is " + (char)intConv);
		}
		else
		{
			System.out.println("Your input integer is not within the parameters. Please run and try again.");
		}
	}
}