public class testPet 
{
	public static void main(String[] args)
	{
		//initializes 5 pets
		Pet cat = new Pet("Cat", 10, 15);
		Pet dog = new Pet("Dog", 15, 30);
		Pet bird = new Pet("Bird", 4, 5);
		Pet iguana = new Pet("Iguana", 10, 10);
		Pet turtle = new Pet("Turtle", 100, 20);
		
		//creates array and adds pets to them to be cycled through
		Pet[] petArray = new Pet[5];
		
		petArray[0] = cat;
		petArray[1] = dog;
		petArray[2] = bird;
		petArray[3] = iguana;
		petArray[4] = turtle;
		
		//variables for outputting different superlatives for pets
		Pet smallestPet = cat, largestPet = cat, oldestPet = cat, youngestPet = cat;
		int totalAge = 0;
		
		//cycles through array and finds the smallest, largest, oldest, youngest, and avg age of all pets
		for(int i = 0; i < petArray.length; i++)
		{
			if(petArray[i].getWeight() < smallestPet.getWeight())
			{
				smallestPet = petArray[i];
			}
			
			if(petArray[i].getWeight() > largestPet.getWeight())
			{
				largestPet = petArray[i];
			}
			
			if(petArray[i].getAge() < youngestPet.getAge())
			{
				youngestPet = petArray[i];
			}
			
			if(petArray[i].getAge() > smallestPet.getAge())
			{
				oldestPet = petArray[i];
			}
			
			totalAge += petArray[i].getAge();
		}
		
		//print methods for the superlatives
		System.out.println("The smallest pet is " + smallestPet.getName());
		System.out.println("The largest pet is " + largestPet.getName());
		System.out.println("The youngest pet is " + youngestPet.getName());
		System.out.println("The oldest pet is " + oldestPet.getName());
		System.out.println("The average age of the pets is " + totalAge / petArray.length);
	}
}
