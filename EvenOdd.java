import java.util.*;
public class EvenOdd{
	public static void main(String[] args){

	
	

	int [] numbers ={1,2,3,4,5,6,7,8,9,10};
	for(int count = 1 ;count <= numbers.length; count++){
	if(count%2 == 0){
	numbers[count];
	}
	if(count%3 ==0){
	numbers[count];
	}
	}
System.out.printf(Array.toString(numbers[count]));
	}
}