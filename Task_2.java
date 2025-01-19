import java.util.Scanner;
public class Task_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your SapId: ");
        int id = scanner.nextInt();
        
        System.out.print("Enter your Maths1 marks out of 100: ");
        int m1 = scanner.nextInt();
        System.out.print("Enter your DSA marks out of 100: ");
        int m2 = scanner.nextInt();
        System.out.print("Enter your DAA marks out of 100: ");
        int m3 = scanner.nextInt();
        System.out.print("Enter your Pyton marks out of 100: ");
        int m4 = scanner.nextInt();
        System.out.print("Enter your Java marks out of 100: ");
        int m5 = scanner.nextInt();

        int marks = m1+m2+m3+m4+m5;
        int percentage = marks / 5; 

        System.out.println("\n======== GRADE SHEET ========");
        System.out.println("Student Name : " + name);
        System.out.println("Sap Id  : " + id);
        System.out.println("Total Marks  : " + marks);
        System.out.println("Percentage   : " + percentage + "%");
        System.out.println("=============================");
    
    }

}