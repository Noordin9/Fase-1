import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Administration {
    ArrayList<Patient> patientList; //List of Patients
    ArrayList<User> userList; //List of Users

    Administration(ArrayList<Patient> patientList, ArrayList<User> userList) {
        this.patientList = patientList;
        this.userList = userList;

    }

    void menu() {
        Scanner scanner = new Scanner(System.in);
        Userlist.showList();
        clearConsole();
        boolean exit = false;
        while (!exit) {
            System.out.println("=".repeat(29));
            System.out.println("Please select your department:");
            System.out.println("=".repeat(29));
            System.out.println("[1] Intensive Care Unit ");
            System.out.println("[2] Oncology ");
            System.out.println("[3] Physiotherapy ");
            System.out.println("[4] Apothecary ");
            System.out.println("=".repeat(29));
            System.out.println("[5] Return to UserList");
            System.out.println("[0] Exit app ");
            System.out.println("=".repeat(29));
            System.out.println("Enter choice#: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Dptmanager("ICU",Userlist.currentUser);
                   /* boolean exitsubmenuICU = false;
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
             /*   boolean exitsubmenuOnc = false;
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
                Dptmanager("Oncology",Userlist.currentUser);
                    break;

                case 3:
              /*      boolean exitsubmenuPhys = false;
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
                    Dptmanager("Physio",Userlist.currentUser);
                    break;

                case 4:
                    Dptmanager("Apothecary",Userlist.currentUser);

                /*    boolean exitsubmenuApo = false;
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
                    break;
                case 5:
                    clearConsole();
                    Userlist.showList();
                    clearConsole();
                break;
                case 0:
                    exit = true;
                    System.out.println("You exited the app.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    //Manages switch case prompts to reduce redundancy
  public static void Dptmanager(String departmentName, int currentUser) {
        Scanner scanner = new Scanner(System.in);
        boolean exitSubmenu = false;
        clearConsole();
        while (!exitSubmenu) {
            System.out.println("Current department: " + departmentName);
            Userlist.showcurrentUser();
            PatientList.viewList();
            int submenuChoice = scanner.nextInt();
            if (submenuChoice == 0) {
                exitSubmenu = true;
                clearConsole();
            } else {
                clearConsole();
                System.out.println("You have returned to your Department's patient list.");
                System.out.println("=".repeat(29));

            }
        }
    }

    public static void clearConsole() {
        // Print a series of empty lines to clear the console
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
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
