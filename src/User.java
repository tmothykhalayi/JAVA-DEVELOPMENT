public class User {
    String username;
    String emailadress;
    int age;

    // Constructor to initialize User object
    User(String username, String emailadress, int age) {
        this.username = username;
        this.emailadress = emailadress;
        this.age = age;
    }

    // Override toString() method to display user info in a cleaner format
    @Override
    public String toString() {
        return "Username: " + username + "\nEmail: " + emailadress + "\nAge: " + age;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of User

        // Print user details using the toString method
        boolean User = false;
        System.out.println(User);
    }
}
