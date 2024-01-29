import java.util.Scanner;

public class MaxMinElement
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

      int max = list[0];
      int min = list[0];
      
      for (int i = 1; i < list.length; i++)
      {
         if(list[i] > max)
         {
             max = list[i];
         }
         if(list[i] < min)
         {
             min = list[i];
         }          
      }

      System.out.println("Largest element: " + max 
                          + " Smallest element: " + min);
   }
}