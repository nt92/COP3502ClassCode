import java.util.*;
public class CalBMI
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
       
        System.out.print("Please enter your weight in kilograms: ");
        double weight = in.nextDouble();
       
        System.out.print("Please enter your height in meters: ");
        double height = in.nextDouble();
       
        double BMI = weight / (Math.pow(height, 2));
        System.out.println("Your calculated BMI is: " + BMI);
       
    }

}