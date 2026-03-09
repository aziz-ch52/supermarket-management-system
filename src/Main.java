import java.util.Scanner;
import controllers.CreateEmployee;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CreateEmployee employeeController = new CreateEmployee();

        int choice;

        do {
            System.out.println("\n===== Supermarket Management System =====");
            System.out.println("1. Create Employee");
            System.out.println("2. Read Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    employeeController.create();
                    break;

                case 2:
                    employeeController.read();
                    break;

                case 3:
                    employeeController.update();
                    break;

                case 4:
                    employeeController.delete();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
