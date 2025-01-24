import java.util.Scanner;
public class Task2{
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Enter principle amount: ");
       int p = scanner.nextInt();
       System.out.print("Enter rate(per year): ");
       int r = scanner.nextInt();
       System.out.print("Enter time(in years): ");
       int t = scanner.nextInt();

       int si = (p*r*t)/100;
       System.out.print("Simple Interest: "+si);
   }
}
