import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter your Height in meters: ");
    double height = in.nextDouble();

    System.out.println("Please enter your Weight in kilograms: ");
    double weight = in.nextDouble();

    double bmi = weight / (height * height);

    System.out.println("Your BMI is: " + bmi);

    in.close();
  }
}
