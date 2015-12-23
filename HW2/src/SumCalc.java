import java.util.Scanner;
public class SumCalc
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
       
        double rand1 = Math.random();
        double rand2 = Math.random();
       
        while(rand1 <= .50 || rand1 >= .99)
        {
            rand1 = Math.random();
        }
        while(rand2 <= .50 || rand2 >= .99)
        {
            rand2 = Math.random();
        }
       
        int num1 = (int)(rand1 * 100) + 1;
        int num2 = (int)(rand2 * 100) + 1;
        int sum = num1 + num2;
       
        System.out.print("Please enter the sum of " + num1 + " and " + num2 + ": ");
        int userSum = in.nextInt();
       
        if(sum == userSum)
        {
            System.out.println("Correct!");
        }
        else
        {
            System.out.println("Wrong. The correct answer is " + sum);
        }
               
    }

}