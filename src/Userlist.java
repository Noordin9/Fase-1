import java.util.ArrayList;
import java.util.Scanner;
public class Userlist {
    static int currentUser = -1;
    static ArrayList<User> ListofUsers = new ArrayList<>();

    void addUser() {
        User user1 = new User(1, "Tamara Borgers");
        User user2 = new User(2, "Adam Hawa");
        User user3 = new User(3, "Adnan Ali");
        User user4 = new User(4, "Jerra van de Laan");

        ListofUsers.add(user1);
        ListofUsers.add(user2);
        ListofUsers.add(user3);
        ListofUsers.add(user4);
    }

    public static void showList() {
        Scanner scanner = new Scanner(System.in);
        boolean exitList = false;
        while (!exitList) {
            System.out.println("=".repeat(27));
            System.out.println("\t\tZonderZorgen");
            System.out.println("=".repeat(27));
            System.out.println("\t\tUser List:");
            System.out.println("=".repeat(27));

            for (User user : ListofUsers) {
                System.out.printf("[%s] %s\n", user.getUserID(), user.getUserName());
            }

            System.out.println("=".repeat(27));
            System.out.println("Enter User ID to continue:");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= ListofUsers.size()) {
                currentUser = choice - 1;
                User selectedUser = ListofUsers.get(currentUser);
                System.out.format("========= USER ID:%d ==========\n", selectedUser.getUserID());
                System.out.println("Current User: " + selectedUser.getUserName());
                exitList = true;
            } else {
                System.out.println("Invalid choice please try again.");
            }
        }
    }

        static void showcurrentUser () {
            User selectedUser = Userlist.ListofUsers.get(Userlist.currentUser);
            System.out.format("Current user: [%d] %s\n", selectedUser.getUserID(), selectedUser.getUserName());
            System.out.println("=".repeat(29));
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

