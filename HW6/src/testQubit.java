public class testQubit 
{
	public static void main(String[] args)
	{
		//initialized a qubit to be printed 
		Qubit test = new Qubit(3.5, 3);
		
		System.out.println("The qubit is: " + test.observe());
	}
}
