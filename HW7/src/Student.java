import java.io.PrintWriter;
public class Student 
{
	//variables and constructor for student class
	private String fName, mName, lName, ID, major, classYear;
	
	public Student()
	{
		fName = "";
		mName = "";
		lName = "";
		ID = "";
		major = "";
		classYear = "";
	}
	
	public void setNames(String name)
	{
		//splits name into 2 or 3 strings with splitString by an empty space
		String[] splitStrings = name.split(" ");
		
		//if middle name exists
		if(splitStrings.length == 3)
		{
			fName = splitStrings[0];
			mName = splitStrings[1];
			lName = splitStrings[2];
		}
		//if middle name isn't there
		else if(splitStrings.length == 2)
		{
			fName = splitStrings[0];
			lName = splitStrings[1];
		}
		//if not in proper format
		else
			System.out.println("Please enter a name with first, optional middle, and last!");
	}
	
	public void setID(String id)
	{
		//checks if length is 9 long
		if(id.length() == 9)
		{
			//checks if it has 2 sets of 4 characters separated by a -
			if(id.substring(4,5).equals("-"))
			{
				ID = id;
			}
		}
		//if not proper format
		else
			System.out.println("Not a valid ID!");
	}
	
	public void setMajor(String m)
	{
		//checks if major is one of the 3 valid ones
		if(m.equals("CIS") || m.equals("CEN") || m.equals("DAS"))
		{
			major = m;
		}
		//if not one of the 3 majors
		else
			System.out.println("Not a valid Major!");
	}
	
	public void setClassYear(String date)
	{
		if(date.length() == 7)
		{
			//parses the string into an integer for further calculation
			int month = Integer.parseInt(date.substring(0,2));
			int year = Integer.parseInt(date.substring(3));
			
			//checks if the graduation date is greater than the current month/year to be valid
			if(year > 2014 && month <=12)
				classYear = date;
			else if(year == 2014 && (month == 11 || month == 12))
				classYear = date;
			else
				//if not a valid date
				System.out.print("Not a valid date!");
		}
		//does same as above, but adds a 0 in front of the month in case it's a single digit month
		else if(date.length() == 6)
		{
			int year = Integer.parseInt(date.substring(2));
			
			if(year > 2014)
				classYear = "0" + date;
			else
				System.out.print("Not a valid date!");
		}
		else
			System.out.println("The date is not in the valid format!");
	}
	
	//getter methods for the variables
	public String getNames()
	{
		return fName + " " + mName + " " + lName;
	}
	
	public String getFirstName() 
	{
		return fName;
	}
	
	public String getLastName()
	{
		return lName;
	}
	
	public String getID()
	{
		return ID;
	}
	
	public String getMajor()
	{
		return major;
	}
	
	public String getClassYear()
	{
		return classYear;
	}
	
	//toString method to return in the correct format
	public String toString()
	{
		String out = "Name: " + lName + ", " + fName + 
				"\nMajor: " + major + 
				"\nID: " + ID + 
				"\nGraduation Date: " + classYear + 
				"\n";
		
		return out;
	}
}
