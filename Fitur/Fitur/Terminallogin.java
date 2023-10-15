
import java.util.Scanner;

public class Terminallogin {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String uname, pw, unamemasuk, pwmasuk;
        boolean isloggedin = false;
        uname = "Admin";
        pw = "tifast!";

        System.out.println("Welcome to Sistem Tata Tertib Mahasiswa");

        do {
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
                break;
            }
            
        } while (!isloggedin);
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

            pilihan = sc1.nextInt();

            if (pilihan == 1) {
                String nama, kelas, pelanggaran, prodi, jurusan, message;
        int nim, point, pointsblm, pointssdh;
        pointsblm = 0;

        System.out.println("*****Silahkan masukkan data mahasiswa yang melanggar*****");
        System.out.println("                                                          ");
       
        System.out.print("Masukkan Nama Mahasiswa : ");
        nama = sc1.nextLine();

         System.out.print("Masukkan NIM : ");
        nim = sc1.nextInt();
        sc1.nextLine();
    
        System.out.print("Masukkan Kelas : ");
        kelas = sc1.nextLine();

        System.out.print("Masukkan Asal Prodi : ");
        prodi = sc1.nextLine();

        System.out.print("Masukkan Asal Jurusan : ");
        jurusan = sc1.nextLine();

        System.out.print("Masukkan Jenis Pelanggaran : ");
        pelanggaran = sc1.nextLine();

        System.out.print("Masukkan Point yang Diterima : ");
        point = sc1.nextInt();

        pointssdh = point + pointsblm;

        if (point > 0 && point <= 10) {
            message = "Selamat anda hanya mendapatkan kompensasi";
        } else if (point > 10 && point <= 20) {
            message = "Sayangnya anda mendapatkan hukuman kecil";
        } else if (point > 20 && point <= 30) {
            message = "Sayangnya anda mendapatkan hukuman BESAR";
        } else if (point > 30 && point <= 40) {
            message = "Sayang sekali anda mendapatkan hukuman BERAT";
        } else {
            message = "Waah dikeluarkan, better luck next time";
        }

        System.out.println("Nama        : " + nama);
        System.out.println("Kelas       : " + kelas);
        System.out.println("NIM         : " + nim);
        System.out.println("Prodi       : " + prodi);
        System.out.println("Jurusan     : " + jurusan);
        System.out.println("Pelanggaran : " + pelanggaran);
        System.out.println("Point       : " + pointssdh);
        System.out.println(message);
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
    }    
    }
}

    