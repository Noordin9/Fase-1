class User {
    public String userName;
    public int userID;


    public User(int id, String name) {
        userID = id;
        userName = name;

/*        User user1 = new User(1, "Mart Zanten");
        User user2 = new User(2, "Adam Hawa");
        User user3 = new User(3,"Adnan Ali");
        User user4 = new User(4, "Akram Akkrum");

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);


*/
    }
        public String getUserName() {
            return userName;
        }

        public int getUserID() {
            return userID;
        }
    }


