public class LoginSystem {

    public static void main(String[] args) {

        String correctUsername = "admin";
        String correctPassword = "123";

        System.console().printf("Enter username: ");
        String username = System.console().readLine();

        System.console().printf("Enter password: ");
        String password = System.console().readLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {

            System.out.println("Login successful! Welcome, " + username + "!");

        } else {

            System.out.println("Incorrect username or password.");
        }
    }
}
