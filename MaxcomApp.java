import java.util.Scanner;
public class MaxcomApp
{
   public static void main (String [] args)
   {
      Scanner scan = new Scanner(System.in);
      
      int duration, category, respond;
      double charge=0;
      CallChargeCalculator callcc = new CallChargeCalculator();
      
      do{
         System.out.println("Enter the call duration (in minutes): ");
         duration = scan.nextInt();
         System.out.println("Enter Rate Category: 1.Daytime 2.Evening 3.Off-Peak");
         category = scan.nextInt();
         charge = callcc.computerCharge(duration, category);
         System.out.printf ("The amount you have to pay is = RM %.2f", charge);
         System.out.println("\nDo you want to continue? 1.Yes 2.No");
         respond = scan.nextInt();
         System.out.println();
      }while (respond != 2);
      
      System.out.println ("Thank you! See you again.");
   }
}

class CallChargeCalculator
{
   double charge;
   
   public double computerCharge(int duration, int category)
   {
      double rate;
      if (category == 1)
         rate = 0.07;
      
      else if (category == 2)
         rate = 0.12;
         
      else
         rate = 0.05;
      
      charge = duration * rate;
      return charge;
   }
}
      