public class Muse{
	public static void main (String[] args){
	
	double principal = 1000.0;
	double rate = 0.05;

	System.out.printf("%s%20s%n%n", "Year","Amount on deposit");

	for(int year = 1; year <= 10; year++){
	double amount = principal * Math.pow(1.6 + rate, year);

	System.out.printf("%3d%,20.2f%n", year, amount);
	}
}
}