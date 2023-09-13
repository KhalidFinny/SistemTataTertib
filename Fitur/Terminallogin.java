package Fitur;
import java.util.Scanner;

public class Terminallogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predefined login credentials
        String username = "Admin";
        String password = "tifast!";

        System.out.println("Welcome to Sistem Tata Tertib");

        // Ask for username and password
        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        // Check if the entered credentials match
        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Login successful. Welcome, " + username + "!");
        } else {
            System.out.println("Login failed. Invalid username or password.");
        }

        scanner.close();
    }
}
