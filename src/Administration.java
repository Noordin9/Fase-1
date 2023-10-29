import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Administration {
    public static String departmentName; //DPT name
    static ArrayList<Meds>LoMeds; //List of Medication
    ArrayList<User> userList; //List of Users
    static Map<String, ArrayList<Patient>> dptPatientList = new HashMap<>(); // Hashmap to connect departments with specific patient data


    Administration(ArrayList<Patient> GPList, ArrayList<Patient>PhysioList,ArrayList<Patient>ICUList,ArrayList<Patient>ApothecaryList, ArrayList<User> userList, ArrayList<Meds> LoMeds) {
        dptPatientList.put("ICU",ICUList);
        dptPatientList.put("G.P",GPList);
        dptPatientList.put("Physio",PhysioList);
        dptPatientList.put("Apothecary",ApothecaryList);
        this.userList = userList;
        this.LoMeds = LoMeds;

    }
        public static void menu() {
        LoUsers.viewList();
        clearConsole();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            User selectedUser = LoUsers.UserList.get(LoUsers.currentUser);
            System.out.format("========= USER ID:%d ==========\n", selectedUser.getUserID());
            System.out.println("Current User: " + selectedUser.getUserName());
            System.out.println("=".repeat(35));
            System.out.println("Please select your department:");
            System.out.println("=".repeat(35));
            System.out.println("[1] Intensive Care Unit ");
            System.out.println("[2] General Practicioner ");
            System.out.println("[3] Physiotherapy ");
            System.out.println("[4] Apothecary ");
            System.out.println("=".repeat(35));
            System.out.println("[5] Return to UserList");
            System.out.println("[0] Exit app ");
            System.out.println("=".repeat(35));
            System.out.println("Enter choice#: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    departmentName = "ICU";

                    Dptmanager("ICU", LoUsers.currentUser);
                    exit = true;
                   /* old code to mark my progression
                   boolean exitsubmenuICU = false;
                    while (!exitsubmenuICU) {

                        Userlist.showcurrentUser();
                        PatientList.viewList();

                        int submenuChoice1 = scanner.nextInt();

                        if (submenuChoice1 == 0) {
                            exitsubmenuICU = true;
                            }
                        else {
                                System.out.println("You have returned to your LOP.");
                            }
                        }*/
                    break;

            case 2:
             /*  old code to mark my own progression
              boolean exitsubmenuOnc = false;
                while (!exitsubmenuOnc) {
                    Userlist.showcurrentUser();
                    PatientList.viewList();
                    int submenuChoice2 = scanner.nextInt();
                    if (submenuChoice2 == 0) {
                        exitsubmenuOnc = true;
                    }
                    else {
                        System.out.println("You have returned to your LOP.");
                    }
                }*/
                    departmentName = "G.P";
                    Dptmanager("G.P", LoUsers.currentUser);
                    exit = true;
                    break;

                case 3:
              /*      old code to mark my progression
              boolean exitsubmenuPhys = false;
                    while (!exitsubmenuPhys) {

                        Userlist.showcurrentUser();
                        PatientList.viewList();
                        int submenuChoice3 = scanner.nextInt();
                        if (submenuChoice3 == 0) {
                            exitsubmenuPhys = true;
                        } else {
                                System.out.println("You have returned to your LOP.");
                        }
                    }*/
                    departmentName = "Physio";
                    Dptmanager("Physio", LoUsers.currentUser);
                    exit = true;
                    break;

                case 4:
                    departmentName = "Apothecary";
                    Dptmanager("Apothecary", LoUsers.currentUser);
                    exit = true;
                    break;
                /*    old code to mark my progression
                boolean exitsubmenuApo = false;
                    while (!exitsubmenuApo) {
                        Userlist.showcurrentUser();
                        PatientList.viewList();
                        int submenuChoice4 = scanner.nextInt();
                        if (submenuChoice4 == 0) {
                            exitsubmenuApo = true;
                        }else {
                            System.out.println("You have returned to your LOP.");
                        }
                    }*/
                case 5:
                    clearConsole();
                    LoUsers.viewList();
                    exit = true;
                    clearConsole();
                break;
                case 0:
                    exit = true;
                    System.out.println("You exited the app.");
                    System.exit(420);
                    break;
                default:
                    clearConsole();
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    //Manages switch case prompts to reduce repitition
        public static void Dptmanager(String departmentName, int currentUser) {
        clearConsole();
        ArrayList<Patient> departmentList = dptPatientList.get(departmentName);
        LoPatients.currentPatient = 0;
        LoPatients.viewList(departmentName, departmentList);
        Meds.viewMeds(departmentName);
    }

    // Print a series of empty lines to clear the console
        public static void clearConsole() {
        for (int i = 0; i < 45; i++) {
            System.out.println();
        }
    }
}

/*    Scanner scanner = new Scanner(System.in);
        boolean exitSubmenu = false;
      ArrayList<Patient> departmentList = dptPatientList.get(departmentName);

        while (!exitSubmenu) {
            int submenuChoice = -1;
            submenuChoice = scanner.nextInt();

            if (submenuChoice == 0) {
                exitSubmenu = true;
           } else if (submenuChoice >= 1 && submenuChoice <= LoPatients.PatientList.get(0).size()) {
                LoPatients.currentPatient = submenuChoice -1;
                departmentName = departmentName;
                LoPatients.viewList(departmentName,departmentList);
                Meds.viewMeds(departmentName);*/
/*     } else {
                clearConsole();
                System.out.println("You have returned to your Department's patient list.");
                System.out.println("=".repeat(29));*/
//   Userlist.showList();
//      System.out.format("Current user: [%d] %s\n", selectedUser.getUserID(), selectedUser.getUserName());
/*   selectedUser = userList.get(Userlist.currentUser);
                    System.out.println("=".repeat(23));
                    System.out.format("Current user: [%d] %s\n", selectedUser.getUserID(), selectedUser.getUserName());
                    System.out.println("=".repeat(23));*/
//      Userlist.getcurrentUser();
//       selectedUser = new User(3, "Adnan Ali");
//        System.out.format("Current user: [%d] %s\n", selectedUser.getUserID(), selectedUser.getUserName());
/*   selectedUser = userList.get(Userlist.currentUser);
                        System.out.println("=".repeat(23));
                        System.out.format("Current user: [%d] %s\n", selectedUser.getUserID(), selectedUser.getUserName());
                        System.out.println("=".repeat(23));*/
//   Userlist.getcurrentUser();
//        selectedUser = new User(4, "Bart Zanten");
//        System.out.format("Current user: [%d] %s\n", selectedUser.getUserID(), selectedUser.getUserName());
//            Userlist.getcurrentUser();
//       selectedUser = new User(1, "Bart Zanten");
/*  selectedUser = userList.get(Userlist.currentUser);
                        System.out.println("=".repeat(23));
                        System.out.format("Current user: [%d] %s\n", selectedUser.getUserID(), selectedUser.getUserName());
                        System.out.println("=".repeat(23));*/
//     selectedUser = new User(2, "Adam Hawa");
//     System.out.format("Current user: [%d] %s\n", selectedUser.getUserID(), selectedUser.getUserName());
/*                break;
            case 2:
                selectedUser = new User(2, "Adam Hawa");
                System.out.format("Current user: [%d] %s\n", selectedUser.getUserID(), selectedUser.getUserName());
                break;
            case 3:
                selectedUser = new User(3, "Adnan Ali");
                System.out.format("Current user: [%d] %s\n", selectedUser.getUserID(), selectedUser.getUserName());
                break;
            case 4:
                selectedUser = new User(4, "Akram Akkrum");
                System.out.format("Current user: [%d] %s\n", selectedUser.getUserID(), selectedUser.getUserName());
                break;

            default:
                System.out.println("Invalid choice, please try again");
        }
    }


// [%d] %s\n", selectedUser.getUserID(), selectedUser.getUserName());
        }


//   var scanner = new Scanner(System.in);  // User input via this scanner.

 /*       boolean nextCycle = true;
        while (nextCycle) {

            System.out.format("%s\n", "=".repeat(50));

            System.out.format("%d:  STOP\n", STOP);
            System.out.format("%d:  View patient data\n", VIEW);

            System.out.print("enter #choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case STOP: // interrupt the loop
                    nextCycle = false;
                    break;

                case VIEW:
                    currentPatient.viewData();
                    break;

                default:
                    System.out.println("Please enter a *valid* digit");
                    break;
            }
        }
    }
} */
/*   selectedUser = userList.get(Userlist.currentUser);
                        System.out.println("=".repeat(23));
                        System.out.format("Current user: [%d] %s\n", selectedUser.getUserID(), selectedUser.getUserName());
                        System.out.println("=".repeat(23));*/  // System.out.format("Current patient: %s\n", currentPatient.fullName());*/
