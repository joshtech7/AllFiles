public class DescendingArray{
	public static void main(String[] args){
	
	int [] numbers = {1,2,3,4,5,6,7,8,9,10};
	
	int [] myList = new myList[10]

	for(int index = 1; index <= numbers.length; index--){
	   for(int count = 0; count > index; count++){
		myList[count] += numbers[index];
	   }
	}

System.out.print(Array.toString(myList))
	}
}