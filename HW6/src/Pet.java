public class Pet 
{
	//variables for pet class
	private String name;
	private int age, weight;
	
	
	//pet constructor
	public Pet(String name, int age, int weight)
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	//methods for returning pet variables
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public int getWeight()
	{
		return weight;
	}
}
