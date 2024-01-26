import java.time.LocalDate;
import java.util.*;

class Meds {
    static ArrayList<ArrayList<Meds>> MedsList = new ArrayList<>(); // List of all medication lists
    static ArrayList<Meds> ICUMeds = new ArrayList<>(); // List of meds for ICU
    static ArrayList<Meds> PhysMeds = new ArrayList<>(); // List of meds for physiotherapy
    static ArrayList<Meds> GPMeds = new ArrayList<>(); // List of meds for general practitioner
    static ArrayList<Meds> AptMeds = new ArrayList<>(); // List of meds for Apothecary
    static int selectedMedication; // Selected medication (prescription)
    String name; //name of medication
    String application; // Use of meds
    int id; //Medication-ID
    int dosage; //Dose of medication
    static User selectedUser; // Current user of the application
    static Patient selectedPatient; //CurrentPatient

    Meds(int id, String name, int dosage, String application) {
        this.name = name;
        this.dosage = dosage;
        this.id = id;
        this.application = application;

    }

    static int getDosage(Meds meds) {
        return meds.dosage;
    }

    static void addMeds() {
        ICUMeds.add(new Meds(1, "Ibuprofen", 400, "Has an analgesic, anti-inflammatory and fever-reducing effect."));
        ICUMeds.add(new Meds(2, "Morphine", 5, "Used for severe pain after, operations/a heart attack/cancer."));
        ICUMeds.add(new Meds(3, "Heparin\t", 500, "Makes blood less likely to clot."));
        ICUMeds.add(new Meds(4, "Propofol", 200, "Emulsion for injection/infusion."));
        ICUMeds.add(new Meds(5, "Fentanyl", 50, "Opiate with a strong analgesic effect."));

        GPMeds.add(new Meds(1, "Diclofenac (gel)", 1, "Relieves pain, inhibits inflammation and reduces fever."));
        GPMeds.add(new Meds(2, "Lidocaine Patch", 2, "Relieves pain, inhibits inflammation and reduces fever."));
        GPMeds.add(new Meds(3, "Naproxen", 3, "Relieves pain, inhibits inflammation and reduces fever."));
        GPMeds.add(new Meds(4, "Methocarbamol", 4, "Relieves pain, inhibits inflammation and reduces fever."));
        GPMeds.add(new Meds(5, "Tizanidine", 5, "Relieves pain, inhibits inflammation and reduces fever."));

        PhysMeds.add(new Meds(1, "Aspirin", 1, "Relieves pain, inhibits inflammation and reduces fever."));
        PhysMeds.add(new Meds(2, "Amoxicillin", 2, "Relieves pain, inhibits inflammation and reduces fever."));
        PhysMeds.add(new Meds(3, "Losartan", 3, "Relieves pain, inhibits inflammation and reduces fever."));
        PhysMeds.add(new Meds(4, "Simvastatin", 4, "Relieves pain, inhibits inflammation and reduces fever."));
        PhysMeds.add(new Meds(5, "Albuterol", 5, "Relieves pain, inhibits inflammation and reduces fever."));

        AptMeds.add(new Meds(1, "Acetaminophen", 1, "Relieves pain, inhibits inflammation and reduces fever."));
        AptMeds.add(new Meds(2, "Omeprazole", 2, "Relieves pain, inhibits inflammation and reduces fever."));
        AptMeds.add(new Meds(3, "Metformin", 3, "Relieves pain, inhibits inflammation and reduces fever."));
        AptMeds.add(new Meds(4, "Simethicone", 4, "Relieves pain, inhibits inflammation and reduces fever."));
        AptMeds.add(new Meds(5, "Guaifenesin", 5, "Relieves pain, inhibits inflammation and reduces fever."));

        MedsList.add(ICUMeds);
        MedsList.add(GPMeds);
        MedsList.add(PhysMeds);
        MedsList.add(AptMeds);

    }

    /**
     * Makes String.valueOf used in  Meds setter display a String of the selected medication
     */
    @Override
    public String toString() {
        return String.format("%s ", name);
    }

    public static void viewMeds(String departmentName, ArrayList<Patient> departmentList, ArrayList<Meds> departmentMeds) {
        selectedUser = LoUsers.UserList.get(LoUsers.currentUser);
        selectedPatient = departmentList.get(LoPatients.currentPatient);
        List<Meds> selectedMedsList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("=".repeat(100));
            System.out.println("Your Department: " + departmentName);
            System.out.println("=".repeat(100));
            System.out.format("Current user: [%d] %s\n", selectedUser.getUserID(), selectedUser.getUserName());
            System.out.format("Current patient:[%d] %s \n", selectedPatient.id, selectedPatient.fullName());
            System.out.println("=".repeat(100));
            System.out.println("Medication:             Dosage                        Application:");
            System.out.println("=".repeat(100));

            for (Meds meds : departmentMeds) {
                System.out.printf("ID [%s] %s \t\t%s mg \t %s \n", meds.id, meds.name, meds.dosage, meds.application);
            }
            System.out.println("=".repeat(100));
            System.out.println("Press [0] to return");
            System.out.println("Press Med ID to select. Type 'DONE' when finished");

            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("DONE")) {
                Administration.clearConsole();
                selectedPatient.setMeds(selectedMedsList);
                exit = true;
            } else {
                try {
                    int choice = Integer.parseInt(input);
                    if (choice >= 1 && choice <= departmentMeds.size()) {
                        Scanner scanner1 = new Scanner(System.in);
                        selectedMedication = choice - 1;
                        Meds selectedMeds = departmentMeds.get(selectedMedication);
                        selectedMedsList.add(selectedMeds);
                        System.out.println("Assign dosage:");
                        int newDosage = scanner1.nextInt();
                        selectedPatient.setDosage(newDosage);
                        System.out.println("Medication added to prescription!");

                    } else if (choice == 0) {
                        Administration.clearConsole();
                        exit = true;

                    } else {
                        Administration.clearConsole();
                        System.out.println("Invalid choice, please try again.");
                    }
                } catch (InputMismatchException e) {
                        Administration.clearConsole();
                        System.out.println("Invalid input. Please enter a valid digit.");
                        scanner.nextLine();
                    }
                }
            }
        }
    }


