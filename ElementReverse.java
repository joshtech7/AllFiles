import java.util.*;
public class ElementReverse{
	public static void main(String[] args){
		
	int indexCount = 0;
	
	int [] list = {1,2,3,4,5};
	int [] reverse = new int [list.length];

	for(int index = list.length-1 ;index >= 0; index--){
	reverse[indexCount] = list[index];
	indexCount++;
	}
System.out.print(Arrays.toString(reverse));
    }
}