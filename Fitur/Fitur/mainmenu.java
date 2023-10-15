

import java.util.Scanner;

/**
 * mainmenu
 */
public class mainmenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        while (true) {
            System.out.println("===================================");
            System.out.println("============ Main Menu ============");
            System.out.println("===================================");
            System.out.println("|1. Tambah data Mahsiswa          |");
            System.out.println("|2. Daftar Pelanggaran            |");
            System.out.println("|3. Point Pelanggaran             |");
            System.out.println("|4. Rieayat pelanggar             |");
            System.out.println("|5. Status Tugas                  |");
            System.out.println("|6. Daftar tugas kompen           |");
            System.out.println("|0. Keluar dari program           |");
            System.out.println("===================================");
            System.out.println("Pilih menu yang diinginkan: ");

            pilihan = sc.nextInt();

            if (pilihan == 1) {
                sistatib.main(args);
                break;

            }

            else if (pilihan == 2) {
                System.out.println("List pelanggaran.");
                System.out.println("1. Mencuri pisang = 2");
                System.out.println("2. Melawan BEM = 5");
                System.out.println("3. Salto tanpa izin = 10");
                System.out.println("4. Lari dari kenyataan = 25");
                System.out.println("5. Menjadi second choice = 50");
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

            else if (pilihan == 4) {
                System.out.println("History Pelanggar: ");

            }

            if (pilihan == 0) {
                System.out.println("Terimakasih, kembali lagi");
                break;
            } else {
                System.out.println("pilihan anda tidak valid");
            }
            sc.close();
        }
        return;
    }

}
