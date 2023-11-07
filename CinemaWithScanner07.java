import java.util.Scanner;

public class CinemaWithScanner07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, column;
        String name, next;

        String[][] audience = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");

            System.out.print("Choose a menu (1/2/3): ");
            int menuChoice = sc.nextInt();
            sc.nextLine(); // Read the newline

            switch (menuChoice) {
                case 1:
                    // Code for inputting audience data
                    System.out.print("Enter the name: ");
                    name = sc.nextLine();
                    System.out.print("Enter the row: ");
                    row = sc.nextInt();
                    System.out.print("Enter the column: ");
                    column = sc.nextInt();
                    sc.nextLine(); // Read the newline

                    if (row >= 1 && row <= 4 && column >= 1 && column <= 2) {
                        if (audience[row - 1][column - 1] == null) {
                            audience[row - 1][column - 1] = name;
                            System.out.println("Audience " + name + " has been seated in row " + row + " column " + column);
                        } else {
                            System.out.println("The seat is already occupied by another audience. Please choose another seat.");
                        }
                    } else {
                        System.out.println("Invalid row/column number. Please select a valid number!");
                    }
                    break;

                case 2:
                    // Code to display the audience list
                    for (int i = 0; i < audience.length; i++) {
                        for (int j = 0; j < audience[i].length; j++) {
                            if (audience[i][j] == null) {
                                System.out.print("***\t");
                            } else {
                                System.out.print(audience[i][j] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    // Exit the program
                    System.out.println("Thank you! Exiting the program.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid menu choice.");
            }

            System.out.print("Do you want to go back to the main menu? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
