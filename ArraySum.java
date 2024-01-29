import java.util.Scanner;

public class ArraySum
{
   public static void main(String[] args)
   {
      final int SIZE = 10;

      // Create an array to hold numbers.
      int[] numbers = new int[SIZE];

      Scanner console = new Scanner(System.in);
      System.out.println("Enter " + SIZE + " numbers.");

      // Get employees' salary.
      for (int i = 0; i < SIZE; i++)
      {
         numbers[i] = console.nextInt();
      }

      int sum = 0;

      // Calculate the sum.
      for (int i = 0; i < SIZE; i++)
      {
         sum += numbers[i];
      }
      
      System.out.println("Sum of numbers: " + sum);
   }
}