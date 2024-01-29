import java.util.Scanner;

public class ReverseArray
{
   public static void main(String[] args)
   {
      int size;
      
      Scanner console = new Scanner(System.in);

      System.out.print("Enter the size of the array: ");
      size = console.nextInt();

      int[] list = new int[size];

      System.out.println("Enter " + list.length + " integers.");

      for (int i = 0; i < list.length; i++)
      {
         list[i] = console.nextInt();
      }

      int temp;
      // Reversing elements of the array.
      for (int i = 0; i < list.length / 2; i++)
      {
         temp = list[i];
         list[i] = list[list.length - i - 1];
         list[list.length - i - 1] = temp;      
      }

      System.out.println("Reverse array: ");
      // Display the reverse array.
      for (int i = 0; i < list.length; i++)
      {
         System.out.println(list[i]);
      }
   }
}