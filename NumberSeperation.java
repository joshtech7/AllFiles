public class NumberSeperation{
	public static void main(String[] args){
	
	int number = 12345;

	int d = number % 10;
	int r = number / 10;
	int e = r % 10;
	int f = r / 10;
	int g = f % 10;
	int h = r / 10;
	int i = h % 100;
	int j = i / 10;
	int k = r % 1000;
	
System.out.printf(" %d%n %d%n %d%n %d%n %d%n", d, e, g, j, k);
        }
    }
  }
}