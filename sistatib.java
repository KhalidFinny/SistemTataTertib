package SistemTataTertib;

import java.util.Scanner;

/**
 * sistatib
 */
public class sistatib {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String nama, kelas;

        System.out.print("Masukkan nama:");
        nama = scanner.nextLine();
        System.out.print("masukkan kelas:");
        kelas = scanner.nextLine();
        System.out.println("Nama anda:"+nama);
        System.out.printaku("kelas anda:"+kelas);
        scanner.close();//oke
    
    }
}