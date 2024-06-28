import java.util.Scanner;
import java.lang.Math;
  
 public class Example {
 public static void main(String[] args) {
    int x;
    Scanner sc = new Scanner(System.in);
    x = sc.nextInt();
    is_armstrong(x);
 }
  
  public static void is_armstrong(int x)
{
   double count = 0;
   double sum = 0;
   int y = x;
   int z = x;
   int i;
   while (x > 0) {
    x = x / 10;
    count++;
   }
    for (i = 0; i < count; i++)
    {
     double j = (double) y % 10;
     sum += Math.pow(j, count);
     y = y / 10;
    }
  if (sum == z)
       System.out.println("Armstrong number");
  else
       System.out.println("Not a Armstrong number");
  }
}
 
