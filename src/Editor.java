import java.util.ArrayList;
import java.util.Scanner;

 /*public class Editor {

    public static void editData( ArrayList<Patient> departmentList) {
        Patient selectedPatient = departmentList.get(LoPatients.currentPatient);
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Editing Patient Data");
        System.out.println("=".repeat(35));
        System.out.format("%-19s %s\n", "Current patient:", selectedPatient.fullName());
        System.out.format("%-19s %s KG \n", "Weight:", selectedPatient.weight);
        System.out.format("%-19s %s M \n", "Height:", selectedPatient.height);
        System.out.println("Choose an option:");
        System.out.println("[01] Edit weight.");
        System.out.println("[02] Edit height.");
        System.out.println("[0] Exit without changes.");
        System.out.println("Enter your choice");

        int choice = scanner.nextInt();

        if (choice == 1){
        System.out.println("Enter new weight:");
        String newWeight =  scanner.next();
        selectedPatient.setweight(newWeight);
        System.out.println("Weight updated!")





    }

}
  static void editData() {
        Scanner scanner = new Scanner(System.in);
        Patient selectedPatient = patientList.get(currentPatient);

        System.out.println("Editing Patient Data");
        System.out.println("=".repeat(35));

        // Input new data
        System.out.print("Enter new First Name: ");
        String newFirstName = scanner.nextLine();
        selectedPatient.setFirstName(newFirstName);

        System.out.print("Enter new Surname: ");
        String newSurname = scanner.nextLine();
        selectedPatient.setSurname(newSurname);

        // Continue with other data fields...

        System.out.println("Patient data updated.");
        }
        }
        Then, in your viewData method:

        java
        Copy code
static void viewData(String departmentName) {
        // ...

        int choice = scanner2.nextInt();
        if (choice == 0) {
        Administration.clearConsole();
        exit3 = true;
        } else if (choice == 1) {
        Administration.clearConsole();
        System.out.println("Gimme a minute. I'm working on it.");
        System.exit(0);
        } else if (choice == 2) {
        Administration.clearConsole();
        LoPatients.editData(); // Call the editData() method
        System.out.println("Data updated.");
        } else {
        Administration.clearConsole();
        System.out.println("Invalid choice, please try again.");
        }
        }
        With these changes, when the user selects the option to edit patient data, they will be prompted to enter new data for the selected patient, and the patient's information will be updated in the list of patients.





*/