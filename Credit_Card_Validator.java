import java.util.Scanner;

public class Credit_Card_Validator {
   
   public static void main(String[] args) {

	Scanner console = new Scanner(System.in);

	System.out.print("Enter credit card for validation: ");
	long 
      long cardNumber = 4440967484181607L;
      System.out.println(cardNumber + " is " + (validityCheck(cardNumber) ? "valid" : "invalid"));
   }
   
   public static boolean validityCheck(long cardNumber) {
      return (size(cardNumber) >= 13 && size(cardNumber) <= 16) && (prefixMatch(cardNumber, 4) || prefixMatch(cardNumber, 5) || prefixMatch(cardNumber, 37) || prefixMatch(cardNumber, 6)) && ((sumDoubleEven(cardNumber) + sumOdd(cardNumber)) % 10 == 0);
   }
   
   public static int sumDoubleEven(long cardNumber) {
      int sum = 0;
      String num = cardNumber + "";
      for (int i = size(cardNumber) - 2; i >= 0; i -= 2)
         sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
      return sum;
   }
  
 
   public static int getDigit(int cardNumber) {
      if (cardNumber < 9)
         return cardNumber;
      return cardNumber / 10 + cardNumber % 10;
   }
public static int oddPositions(long cardNumber) {
      int sum = 0;
      String num = cardNumber + "";
      for (int i = thesize(cardNumber) - 1; i >= 0; i -= 2)
         sum += Integer.parseInt(num.charAt(i) + "");
      return sum;
   }

   public static boolean prefixmatch(long cardNumber, int d) {
      return getprefx(cardNumber, thesize(d)) == d;
   }
   public static int thesize(long d) {
      String num = d + "";
      return num.length();
   }
   public static long getprefx(long cardNumber, int k) {
      if (thesize(cardNumber) > k) {
         String num = cardNumber + "";
         return Long.parseLong(num.subString(0, k));
      }
      return cardNumber;
   }
}