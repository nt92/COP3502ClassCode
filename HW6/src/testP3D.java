public class testP3D 
{
	public static void main(String[] args)
	{
		//creates 2 points and prints the distance and L1 distance between them
		Point3D a = new Point3D(2.5, 3.1, 4.2);
		Point3D b = new Point3D(6.3, 2.4, 1.1);
		
		System.out.println("The distance is: " + a.distance(b));
		System.out.println("The L1 distance is: " + a.distanceL1(b));
	}
}
