import java.util.Scanner;

public class CinemaWithScanner07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, coloumn;
        String name, next;

        String[][] audience = new String[4][2];

        while (true) {
            System.out.print("Enter the name : ");
            name = sc.nextLine();
            System.out.print("Enter the row : ");
            row = sc.nextInt();
            System.out.print("Enter the coloumn : ");
            coloumn = sc.nextInt();
            sc.nextLine();

            audience[row - 1][coloumn - 1] = name;

            System.out.print("Want to enter another audience?(y/n) : ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            } 
        }
    }
}