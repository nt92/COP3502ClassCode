public class printTrigValues 
{
	public static void main(String[] args)
	{
		double pi = Math.PI;
		System.out.printf("%-10s%-10s%-10s\n", "Degree","Sin","Cos");
		for(int i = 0; i <= 360; i +=10)
		{
			System.out.printf("%-10d%-10.4f%-10.4f\n", i, Math.sin(i*pi/180), Math.cos(i*pi/180));
		}
	}
}
