import java.util.Arrays;

public class LargestElement{
	public static void main(String[] args){

	int maximum = Integer.MIN_VALUE;

		int [] number = {10,2,3,4,5,6,7,8,9}; 

		for(int index = 0 ;index < number.length; index++){
		if(number[index] > maximum){
		 maximum = number[index];
		}
	}
System.out.printf("The result for maximum is %d ",maximum);
    }
}