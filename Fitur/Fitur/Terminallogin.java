package Fitur;
import java.util.Scanner;

public class Terminallogin {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String uname, pw, unamemasuk, pwmasuk;

        uname = "Admin";
        pw = "tifast!";

        System.out.println("Welcome to Sistem Tata Tertib Mahasiswa");

            System.out.print("Enter username: ");
            unamemasuk = sc1.nextLine();
            System.out.print("Enter password: ");
            pwmasuk = sc1.nextLine();
            
            if (unamemasuk.equals (uname) && pwmasuk.equals (pw)) {
                System.out.println("Login successful. Welcome, " + uname + "!");
                 mainmenu.main(args);
             sc1.close();
            } else {
                System.out.println("Login failed. Invalid username or password. Please try again.");
            }
    }    
}
