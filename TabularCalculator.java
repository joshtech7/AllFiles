public class TabularCalculator{

	public static void main(String[] Chibuzo){
	
	String N = "N", N2 = "N2", N3 = "N3", N4 = "N4";
	
	

	System.out.printf("%s\t%s\t%s\t%s%n",N,N2,N3,N4);
	for(int n = 1 ;n < 6; n++){
	 int j = n*n;
	 int k = j*n;
	 int l = k*n;
	System.out.printf("%n%d\t%d\t%d\t%d%n",n,j,k,l);
	}

}
}