import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("");
    double height = in.nextDouble();

    System.out.print("");
    double weight = in.nextDouble();

    double bmi = weight / (height * height);

    System.out.println(bmi);

    in.close();
  }
}
