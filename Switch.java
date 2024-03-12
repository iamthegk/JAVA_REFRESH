import java.util.Scanner;

public class Switch {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter number");
        int n=sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
            System.out.println("Tuesday");
                break;
            case 3:
            System.out.println("Holiday");
            default:
            System.out.println("Invalid option");
                break;
        }
    }
}
