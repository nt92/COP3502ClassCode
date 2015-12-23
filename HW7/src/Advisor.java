import java.util.*;
import java.io.*;
public class Advisor 
{
	//static method of outputting to the text file because toString will not work properly with text output
	public static void toStringTextOutput(Student[] a, PrintWriter out)
	{
		//cycles through array a and outputs to out
		for(int i = 0; i < a.length; i++)
		{
			out.println("Name: " + a[i].getLastName() + ", " + a[i].getFirstName());
			out.println("Major: " + a[i].getMajor());
			out.println("ID: " + a[i].getID());
			out.println("\nGraduation Date: " + a[i].getClassYear());
			out.println();
		}
	}
	public static void main(String[] args) throws IOException
	{
		//initializes a new file and scanner object to read text
		File studentList = new File("Students.txt");
		Scanner in = new Scanner(studentList);
		
		//creates a new Student array of length of the first digit in the text file
		Student[] students = new Student[Integer.parseInt(in.nextLine())];
		
		//for loop to create a new student for the array and then set the variables to be whatever is in the text file
		for(int i = 0; i < students.length; i++)
		{
			students[i] = new Student();
			students[i].setNames(in.nextLine());
			students[i].setID(in.nextLine());
			students[i].setMajor(in.nextLine());
			students[i].setClassYear(in.nextLine());
		}
		//closes input to release the data
		in.close();
		
		//new array for the output 
		Student[] outputArray = new Student[students.length];
		//initializes length of array to be created, those graduating in 2015
		int newArrayCount = 0;
		
		//for loop to check if the student in each part of the array is graduating in 2015
		for(int i = 0, j = 0; i < students.length; i++)
		{
			//i and j exist to make sure that there are no null entries in the array
			String year = students[i].getClassYear().substring(3);
			int yearNum = Integer.parseInt(year);
			
			//if year is 2015, then the outputArray gets the corresponding student object
			if(yearNum == 2015)
			{
				outputArray[j] = students[i];
				j++;
				newArrayCount++;
			}
		}
		
		//initializes a new array of new length, those graduating in 2015
		Student[] outputArray1 = new Student[newArrayCount];
		
		//for loop to make sure that there's no null entries in the array
		for(int i = 0, j = 0; i < outputArray1.length; i++, j++)
		{
			while(outputArray[i].getLastName().equals(""))
			{
				//if the entry is null, advances i and continues until it reaches a value to add to outputArray1
				i++;
			}
			outputArray1[j] = outputArray[i];
		}
		
		//creates another student array and then one for the last names to alphabetize them
		Student[] outputArray2 = new Student[newArrayCount];
		String[] lastNames = new String[newArrayCount];
		
		//fills in lastNames with the last names of the students in the outputarray1 array
		for(int i = 0; i < newArrayCount; i++)
		{
			lastNames[i] = outputArray1[i].getLastName();
		}
		
		//sorts the last names by alphabetical order with the .sort command of the Arrays package
		Arrays.sort(lastNames);
			
		//for loop to put the students in the correct order in outputArray2
		for(int i = 0; i < outputArray2.length; i++)
		{
			//nested loop that checks goes by order to insert the correct objects
			for(int j = 0; j < outputArray.length; j++)
			{
				if(lastNames[i].equals(outputArray1[j].getLastName()))
				{
					outputArray2[i] = outputArray[j];
					//breaks when it finds a match
					break;
				}
			}
		}

		//initializes a new PrintWriter object for output named output.txt
		PrintWriter output = new PrintWriter("output.txt");

		//for loop to output the toString of the students in alphabetical order to both the console
		for(int i = 0; i < outputArray2.length; i++)
		{
			System.out.println(outputArray2[i]);
			//I've commented this out for you to try yourself, in case it works. If you try this out, comment out the
			//code below with the method toStringTextOutput(...)
			
			//output.println(outputArray2[i]);
		}
		
		//I tried doing a simple toString in the loop and outputting to the text file that way, but the formatting was off
		//therefore, I had to create a new static method in the Advisor file to achieve this
		//I think it's an glitch that windows has because I've consulted other with the question and they're having the same issue
		toStringTextOutput(outputArray2, output);
		
		//closes output to release data
		output.close();
		
	}
}
