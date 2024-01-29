import java.util.Arrays;

public class LargestFunc{
		public static void main(String[] args){

		int maximum = Integer.MIN_VALUE;

		int [] numbers = {100,26,35,40,25,60,70,45,30};

		for(int index = 0; index < numbers.length; index++){
		
		if(numbers[index] > maximum){

		maximum = numbers[index];

		}
          }
System.out.printf("The result for the largest is %d", maximum);
      }
}