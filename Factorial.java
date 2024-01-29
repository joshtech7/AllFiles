public class Factorial{
	
	public static void main(String[] args){
	
	Factor();
	
	}

	public static void Factor(){

	int factorial = 1;
	int anyNumber = 5;

	for(int factor =1 ;factor <= anyNumber; factor++){

	factorial *= factor;
	}
 System.out.printf("The result for anyNumber %d is %d",anyNumber, factorial);
	

	}
}