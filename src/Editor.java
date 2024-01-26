import java.util.*;
class Editor{
    public static void editData(ArrayList<Patient> departmentList) {
        User selectedUser = LoUsers.UserList.get(LoUsers.currentUser);
        Patient selectedPatient = departmentList.get(LoPatients.currentPatient);
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("=".repeat(35));
                System.out.println("Your department: " + Administration.departmentName);
                System.out.println("=".repeat(35));
                System.out.format("Current user: [%d] %s\n", selectedUser.getUserID(), selectedUser.getUserName());
                System.out.format("%-19s %s\n", "Current patient:", selectedPatient.fullName());
                System.out.println("=".repeat(35));
                System.out.println("Editing Patient Data");
                System.out.println("=".repeat(35));
                System.out.printf("%-19s %s \n", "Name:", selectedPatient.firstName);
                System.out.printf("%-19s %s \n", "Surname:", selectedPatient.surname);
                System.out.format("%-19s %s KG \n", "Weight:", selectedPatient.weight);
                System.out.format("%-19s %s M \n", "Height:", selectedPatient.height);
                System.out.println("=".repeat(35));
                System.out.println("Choose an option:");
                System.out.println("[01] Edit weight.");
                System.out.println("[02] Edit height.");
                System.out.println("[03] Edit name.");
                System.out.println("[04] Edit surname.");
                System.out.println("=".repeat(35));
                System.out.println("[0] Exit without changes.");
                System.out.println("Enter your choice");

                int choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.println("Enter new weight:");
                    int newWeight = scanner.nextInt();
                    selectedPatient.setWeight(newWeight);
                    System.out.println("Weight updated!");
                    exit = true;
                } else if (choice == 2) {
                    System.out.println("Enter new height:");
                    int newHeight = scanner.nextInt();
                    selectedPatient.setHeight(newHeight);
                    System.out.println("Height updated!");
                    exit = true;
                } else if (choice == 3) {
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Enter new name:");
                    String newFirst = scanner1.next();
                    selectedPatient.setFirstName(newFirst);
                    System.out.println("First name updated!");
                    exit = true;
                } else if (choice == 4) {
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Enter new surname:");
                    String newLast = scanner2.next();
                    selectedPatient.setSurname(newLast);
                    System.out.println("Surname updated!");
                    exit = true;
                } else if (choice == 0) {
                    Administration.clearConsole();
                    exit = true;

                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e){
                Administration.clearConsole();
                System.out.println("Invalid input. Please enter a valid digit.");
            }
        }
    }
}