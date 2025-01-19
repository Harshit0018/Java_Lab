import java.util.Scanner;
public class Task_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        System.out.println("Name: "+name);
        System.out.println("Address: "+address);

    }
}
