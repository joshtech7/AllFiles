public class Only{

	public static void main(String[] args){
	
	int division = 100;

	int price = 150;
        
	int discount = 15;
	
	double percentage = (double) ( price * discount ) / division;
 
	double result = price - percentage;

	System.out.printf(" the result is %.1f", result);



}

}