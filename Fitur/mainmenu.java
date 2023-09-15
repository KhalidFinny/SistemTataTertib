package Fitur;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * mainmenu
 */
public class mainmenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        while (true) {
            System.out.println("===================================");
            System.out.println("=============Main Menu=============");
            System.out.println("===================================");
            System.out.println("|1. Tambah data Mahsiswa          |");
            System.out.println("|2. List Pelanggaran              |");
            System.out.println("|3. Point Pelanggaran             |");
            System.out.println("|4. List Data                     |");
            System.out.println("|0. Keluar dari program           |");
            System.out.println("===================================");
            System.out.println("Pilih menu yang diinginkan: ");

            pilihan = scanner.nextInt();

            if (pilihan == 1) {
                Scanner sc =new Scanner(System.in);
                String nama, kelas;
                System.out.print("Masukkan nama:");
                nama = sc.nextLine();
                System.out.print("masukkan kelas:");
                kelas = sc.nextLine();
                System.out.println("Nama anda:"+nama);
                System.out.println("kelas anda:"+kelas);
                break;
            }

            else if (pilihan == 2) {
                System.out.println("List pelanggaran.");
                System.out.println("1. Mencuri pisang");
                System.out.println("2. Melawan BEM");
                System.out.println("3. Salto tanpa izin");
                System.out.println("4. Lari dari kenyataan");
                System.out.println("5. Menjadi second choice");
                break;
            }

            else if (pilihan == 3) {
                System.out.println("Point Pelanggaran");
                System.out.println("1-10 = Kompensasi pelanggaran");
                System.out.println("11-20 = Push up 50x");
                System.out.println("21-30 = Sit up 50x");
                System.out.println("31-40 = Lari 6 putaran 12 menit");
                System.out.println("41-50 = Dikeluarkan");
                break;
            }

            if (pilihan == 0) {
                System.out.println("Terimakasih, kembali lagi");
                break;
            } else {
                System.out.println("pilihan anda tidak valid");
            }
            scanner.close();
        }
    }

}
