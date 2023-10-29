import java.util.ArrayList;
import java.util.Scanner;
public class LoUsers {
    static int currentUser;
    static ArrayList<User> UserList = new ArrayList<>();

    void addUser() {
        UserList.add(new User(1,"Tamara Borgers"));
        UserList.add(new User(2,"Adam Hawa"));
        UserList.add(new User(3,"Adnan Ali"));
        UserList.add(new User(4,"Jerra van de Laan"));
        UserList.add(new User(5,"Tano Khamsa"));
    }

    public static void viewList() {
        Scanner scanner = new Scanner(System.in);
        boolean exitList = false;
        while (!exitList) {
            System.out.println("=".repeat(35));
            System.out.println("\t\tZonderZorgen");
            System.out.println("=".repeat(35));
            System.out.println("\t\tUser List:");
            System.out.println("=".repeat(35));

            for (User user : UserList) {
                System.out.printf("[%s] %s\n", user.getUserID(), user.getUserName());
            }

            System.out.println("=".repeat(35));
            System.out.println("Enter User ID to continue:");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= UserList.size()) {

                currentUser = choice - 1;
                exitList = true;
        } else {
                Administration.clearConsole();
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

        static void displayUser() {
            User selectedUser = LoUsers.UserList.get(LoUsers.currentUser);
            System.out.format("User: [%d] %s\n", selectedUser.getUserID(), selectedUser.getUserName());
            System.out.println("=".repeat(35));
        }
    }



/*
    public static User selectUser() {
        Scanner scanner = new Scanner(System.in);
        showList();

        System.out.println("Enter User ID to continue:");
        int choice = scanner.nextInt();
        if (choice >= 1 && choice <= userList.size()) {
            currentUser = choice - 1;
            User selectedUser = userList.get(currentUser);
            System.out.format("============ USER ID:%d ==============\n", selectedUser.userID);
            return selectedUser;
        } else if (choice == 0) {
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
        return null;
    }
*/

