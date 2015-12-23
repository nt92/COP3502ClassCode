public class Point3D 
{
	//variables for 3d point class
	private double x, y, z;
	
	//constructor for 3d point class
	public Point3D(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	//returns variables for 3d point class
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public double getZ()
	{
		return z;
	}
	
	//calculates the distance of two points
	public double distance(Point3D b)
	{
		double sqTerms = Math.pow(getX() - b.getX(), 2) + Math.pow(getY() - b.getY(), 2) + Math.pow(getZ() - b.getZ(), 2);
		
		//makes sure sqterms isn't negative
		double absSqTerms = Math.abs(sqTerms);
		return Math.pow(absSqTerms, .5 );
	}
	
	//calculates L1 distances through the abs value of all the differing distances
	public double distanceL1(Point3D b)
	{
		return Math.abs(getX() - b.getX()) + Math.abs(getY() - b.getY()) + Math.abs(getZ() - b.getZ());
	}
}
