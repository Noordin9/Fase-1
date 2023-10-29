import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.Period;

class LoPatients {
    static ArrayList<ArrayList<Patient>> PatientList = new ArrayList<>();
    static int currentPatient;
    static LocalDate currentDate = LocalDate.now();
    static ArrayList<Patient> GPList = new ArrayList<>();
    static ArrayList<Patient> PhysioList = new ArrayList<>();
    static ArrayList<Patient> ICUList = new ArrayList<>();
    static ArrayList<Patient> ApothecaryList = new ArrayList<>();
    static User selectedUser;

    void addPatient() {
        GPList.add(new Patient(1, "Sabene", "Letizia", LocalDate.of(1956, 2, 29), 50, 1.62,"Amoxicillin"));
        GPList.add(new Patient(2, "Habib ", "Kamil", LocalDate.of(2004, 9, 15), 65, 1.81,"Amoxicillin"));
        GPList.add(new Patient(3, "Van der Vaart ", "Jaap", LocalDate.of(1985, 4, 6), 78, 1.76,"Amoxicillin"));
        GPList.add(new Patient(4, "Helen ", "Elen", LocalDate.of(1962, 6, 12), 98, 1.80,"Amoxicillin"));
        GPList.add(new Patient(5, "Nasib", "Jamal", LocalDate.of(1998, 2, 24), 45, 1.90,"Amoxicillin"));

        PhysioList.add(new Patient(1,"Timmermans","Richard",LocalDate.of(2001, 3, 17),77,1.82,"Ibuprofen"));
        PhysioList.add(new Patient(2,"van Der Berg","Luna",LocalDate.of(1999, 9, 27),67,1.95,"Ibuprofen"));
        PhysioList.add(new Patient(3,"Jansen","Patrick",LocalDate.of(1995,11, 7),63,1.64,"Ibuprofen"));
        PhysioList.add(new Patient(4,"Butrageno","Emilio",LocalDate.of(2002, 8, 9),65,1.62,"Ibuprofen"));
        PhysioList.add(new Patient(5,"Ibrahim","Hamza",LocalDate.of(1958, 2, 13),87,1.75,"Ibuprofen"));

        ICUList.add(new Patient(1,"de Jong","Layla",LocalDate.of(1984,10,17),64,1.67,"Metformin"));
        ICUList.add(new Patient(2,"Mohamed","Miriam",LocalDate.of(1997,12,6),71,1.76,"Metformin"));
        ICUList.add(new Patient(3,"Chand","Puja",LocalDate.of(1978,8,5),90,1.65,"Metformin"));
        ICUList.add(new Patient(4,"di Natale","Giovanni",LocalDate.of(1995,4,11),75,1.78,"Metformin"));
        ICUList.add(new Patient(5,"Onana","Andre",LocalDate.of(1996,4,2),93,1.90,"Metformin"));

        ApothecaryList.add(new Patient(1,"Bumont","Kishan",LocalDate.of(2008, 6, 22),59,1.69,"Hydroxychloroquine"));
        ApothecaryList.add(new Patient(2,"Gichui","Gemairo",LocalDate.of(1981, 5, 15),89,1.82,"Hydroxychloroquine"));
        ApothecaryList.add(new Patient(3,"Arrizabalaga","Kepa",LocalDate.of(1997, 3, 31),70,1.65,"Hydroxychloroquine"));
        ApothecaryList.add(new Patient(4,"Walker","Jane",LocalDate.of(1990, 7, 24),65,1.75,"Hydroxychloroquine"));
        ApothecaryList.add(new Patient(5,"di Pasquale","Chiara",LocalDate.of(2022, 1, 9),9,0.75,"Paracetamol"));

        PatientList.add(ApothecaryList);
        PatientList.add(ICUList);
        PatientList.add(GPList);
        PatientList.add(PhysioList);


    }

    public static void viewList(String departmentName, ArrayList<Patient>departmentList) {
        selectedUser = LoUsers.UserList.get(LoUsers.currentUser);
        Scanner scanner = new Scanner(System.in);
        boolean exit2 = false;
        int choice=-1;
        while (!exit2) {
            System.out.println("=".repeat(35));
            System.out.println("Your department: " + departmentName);
            System.out.println("=".repeat(35));
            System.out.format("Current user: [%d] %s\n", selectedUser.getUserID(), selectedUser.getUserName());
            System.out.println("=".repeat(35));
            System.out.println("List of patients (LOP):");
            System.out.format("%s\n", "=".repeat(35));

            for (Patient patient : departmentList) {
                System.out.printf("ID [%s] %s \n", patient.id, patient.fullName());
            }

            System.out.println("=".repeat(35));
            System.out.println("Press [0] to return to Main menu.");
            System.out.println("Enter patient ID to view.");
            choice = scanner.nextInt();
            if (choice >= 1 && choice <= departmentList.size()) {
                currentPatient = choice - 1;
                Administration.clearConsole();
                viewData(departmentName,departmentList);
                exit2 = true;
            } else if (choice == 0) {
                Administration.clearConsole();
                Administration.menu();
                exit2= true;
            } else {
                Administration.clearConsole();
                System.out.println("Invalid choice, please try again.");
            }
        }
    }

    /**
     * Display patient data.
     */
    static void viewData(String departmentName,ArrayList<Patient> departmentList) {
        Scanner scanner2 = new Scanner(System.in);
        Patient selectedPatient = departmentList.get(currentPatient);
        selectedUser = LoUsers.UserList.get(LoUsers.currentUser);
        boolean exit3= false;
        while (!exit3) {
            System.out.println("=".repeat(35));
            System.out.println("Your Department: " + departmentName);
            System.out.println("=".repeat(35));
            System.out.format("Current user: [%d] %s\n", selectedUser.getUserID(), selectedUser.getUserName());
            System.out.format("Current patient:[%d] %s \n", selectedPatient.id, selectedPatient.fullName());
            System.out.println("=".repeat(35));
            System.out.println("Patient Data:");
            System.out.println("=".repeat(35));
            System.out.format("%-19s %s\n", "First Name:", selectedPatient.firstName);
            System.out.format("%-19s %s\n", "Surname:", selectedPatient.surname);
            System.out.format("%-19s %s\n ", "(YY/MM/DD):", selectedPatient.dateOfBirth);
            System.out.format("%-18s %s Years old \n", "Age:", Period.between(selectedPatient.dateOfBirth, currentDate).getYears());
            System.out.format("%-19s %s KG \n", "Weight:", selectedPatient.weight);
            System.out.format("%-19s %s M \n", "Height:", selectedPatient.height);
            System.out.printf("%-19s %s KG/M2 \n", "BMI:", selectedPatient.getBMI());
            System.out.printf("%-19s %s \n", "Medication:", selectedPatient.currentMeds);
            System.out.printf("%-19s %s mg \n", "Dose:", Meds.dosage);
            System.out.println("=".repeat(35));
            System.out.println("[0] Return to your department's LOP.");
            System.out.println("[1] Prescribe Medication.");
            System.out.println("[2] Edit patient data.");
            System.out.println("[3] View previous consults.");

            int choice = scanner2.nextInt();
            if (choice == 0) {
                Administration.clearConsole();
                viewList(departmentName,departmentList);
                exit3 = true;
            } else if (choice==1) {
                Administration.clearConsole();
                Meds.viewMeds(departmentName);
            } else if (choice==2) {
                Administration.clearConsole();
                System.out.println("Gimme a minute. I'm working on it.");
                System.exit(0);
            } else if (choice==3) {
                Administration.clearConsole();
                System.out.println("Gimme a minute. I'm working on it.");
                System.exit(0);
           } else {
                Administration.clearConsole();
                System.out.println("Invalid choice, please try again.");
            }
        }
    }



            //    currentPatient

            //     System.out.format("============ Patient ID:%d ==============\n", Patient.id);
            //     System.out.format("%-17s %s\n", "Surname:", Patient.SURNAME);
            //     System.out.format("%-17s %s\n", "First Name:", Patient.FIRSTNAME);
            //     System.out.format("%-17s %s\n", "Date of birth:", Patient.DATEOFBIRTH);
        }


//  Patient patient1 = new Patient(1, "Sabene ", "Letizia", LocalDate.of(1956, 2, 29),50,150, );
//    Patient patient2 = new Patient(2, "Habib ", "Kamil", LocalDate.of(2004, 9, 15), 65, 160,);
//    Patient patient3 = new Patient(3, "Van der Vaart ", "Jaap", LocalDate.of(1985, 4, 6), 78,170,);
//   Patient patient4 = new Patient(4, "Helen ", "Elen", LocalDate.of(1962, 6, 12),98,180,);
//    Patient patient5 = new Patient(5, "Nasib", "Jamal", LocalDate.of(1998, 2, 24), 45,190,); /*          if(choice == 0) {
//                    System.out.println("Exiting...");
//                    break;
//                }
//
//                if (isValid(choice)) {
//                    currentPatient = choice - 1;
//                        Patient currentPatient = getCurrentPatient();
//                    System.out.format("Current patient: %s\n", currentPatient.fullName());
//                } else {
//                    System.out.println("Invalid ID. Please enter a valid ID.");
//                }
//            } while (true);
//
//            scanner.close();*/
//      else {
//    //         System.out.println("Invalid choice, please try again:");