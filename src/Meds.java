import java.util.ArrayList;
import java.util.Scanner;

class Meds {
    static ArrayList<Meds> LoMeds = new ArrayList<>();
    static int selectedMedication;
    public String name;
    int id;
    public static double dosage;
    static User selectedUser;
    static Patient selectedPatient;

    Meds(int id, String name, int dosage) {
        this.name = name;
        Meds.dosage = dosage;
        this.id = id;
    }

    static void addMeds() {
        LoMeds.add(new Meds(1, "Amoxicillin", 500));
        LoMeds.add(new Meds(2, "Ibuprofen", 20));
        LoMeds.add(new Meds(3, "Metformin", 500));
        LoMeds.add(new Meds(4, "Hydroxychloroquine", 200));
        LoMeds.add(new Meds(5, "Diclofenac", 50));
    }

    public static void viewMeds(String departmentName) {
        selectedUser = LoUsers.UserList.get(LoUsers.currentUser);
        selectedPatient = LoPatients.GPList.get(LoPatients.currentPatient);
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int choice;
        while (!exit) {
            System.out.println("Your Department: " + departmentName);
            System.out.println("=".repeat(35));
            System.out.format("Current user: [%d] %s\n", selectedUser.getUserID(), selectedUser.getUserName());
            System.out.format("Current patient:[%d] %s \n", selectedPatient.id, selectedPatient.fullName());
            System.out.println("=".repeat(35));
            System.out.println("List of Meds:        Dosage:");
            System.out.println("=".repeat(35));

            for (Meds meds : LoMeds) {
                System.out.printf("ID [%s] %s %s mg \n", meds.id, meds.name, dosage);
            }
            System.out.println("=".repeat(35));
            System.out.println("Press [0] to return");
            System.out.println("Press Med ID to select.");

            choice = scanner.nextInt();
            if (choice >= 1 && choice <= LoMeds.size()) {
                selectedMedication = choice - 1;
                Administration.clearConsole();
                System.out.println("Gimme a minute. I'm working on it.");
                System.exit(420);
            } else if (choice == 0) {
                Administration.clearConsole();
                exit = true;
            } else {
                Administration.clearConsole();
                System.out.println("Invalid choice, please try again.");
            }
        }
    }

    static void assignMeds(String departmentName) {
        System.out.println("Your Department: " + departmentName);
        System.out.println("=".repeat(35));
        System.out.format("Current user: [%d] %s\n", selectedUser.getUserID(), selectedUser.getUserName());
        System.out.format("Current patient:[%d] %s \n", selectedPatient.id, selectedPatient.fullName());
        System.out.println("=".repeat(35));
        System.out.println("Selected Medication:");
        System.out.println("=".repeat(35));

    }
}


