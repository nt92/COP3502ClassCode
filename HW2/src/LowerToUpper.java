import java.util.*;
public class LowerToUpper 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a lowercase letter to be converted to uppercase: ");
		String s = in.next();
		char lower = s.charAt(0);
		char upper = lower -= 32;
		System.out.println(upper);
		
	}
}
