package Fitur;
import java.util.Scanner;

public class Terminallogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctUsername = "Admin";
        String correctPassword = "tifast!";

        System.out.println("Welcome to Sistem Tata Tertib Mahasiswa");

        boolean isLoggedIn = false;

        do {
            System.out.print("Enter username: ");
            String enteredUsername = scanner.nextLine();
            System.out.print("Enter password: ");
            String enteredPassword = scanner.nextLine();
            
            if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
                System.out.println("Login successful. Welcome, " + correctUsername + "!");
                isLoggedIn = true;
            } else {
                System.out.println("Login failed. Invalid username or password. Please try again.");
            }
        } while (!isLoggedIn);
        String nama, kelas;
        System.out.print("Masukkan nama:");
        nama = scanner.nextLine();
        System.out.print("masukkan kelas:");
        kelas = scanner.nextLine();
        System.out.println("Nama anda:"+nama);
        System.out.println("kelas anda:"+kelas);
        scanner.close();
        
    }
}
