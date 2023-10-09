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
            
            if (unamemasuk.equals (uname)) {
                if (pwmasuk.equals (pw)) {
                System.out.println("Login successful. Welcome, " + uname + "!");
                System.out.println("===================================");
                System.out.println("============ Main Menu ============");
                System.out.println("===================================");
                System.out.println("|1. Tambah data Mahsiswa          |");
                System.out.println("|2. List Pelanggaran              |");
                System.out.println("|3. Point Pelanggaran             |");
                System.out.println("|4. List Data                     |");
                System.out.println("|0. Keluar dari program           |");
                System.out.println("===================================");
                System.out.println("Pilih menu yang diinginkan: "); 
            } else {
                System.out.println("Login failed. Invalid username or password. Please try again.");
            }
    }  }  
}
