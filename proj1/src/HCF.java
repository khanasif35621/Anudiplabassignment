public class HCF {
   public static void main(String args[]){
      int a, b, i, hcf = 0;
      //Scanner sc = new Scanner(System.in);
     // System.out.println("Enter first number :: ");
      a =60;
      //System.out.println("Enter second number :: ");
      b = 36;

      for(i = 1; i <= a || i <= b; i++) {
         if( a%i == 0 && b%i == 0 )
         hcf = i;
      }
      System.out.println("HCF of given two numbers is ::"+hcf);
   }
}
