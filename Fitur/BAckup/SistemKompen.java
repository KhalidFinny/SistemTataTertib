package BAckup;

import java.util.Scanner;

public class SistemKompen {
    public static void main(String[] args) {
        Scanner strTatib = new Scanner(System.in);
        Scanner intTatib = new Scanner(System.in);
        SistemKompen sistemKompen = new SistemKompen();
        int pilihanMahasiswa;
        boolean multiLevel = true;

        System.out.print("=======WELCOME TO KELOMPOK 1 KOMPEN SYSTEM=======\n");
        System.out.println("                                               ");

        while (multiLevel) {
            System.out.println("===================================");
            System.out.print("Login sebagai (Mahasiswa/Admin): ");
            System.out.println("                                                 ");
            String loginMulti = strTatib.next();

            if (loginMulti.equalsIgnoreCase("mahasiswa")) {
                if (true) {
                    do {
                        sistemKompen.loginMahasiswa(strTatib);
                        pilihanMahasiswa = showMahasiswaMenu(intTatib);
                        switch (pilihanMahasiswa) {
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                            case 4:

                                break;

                            case 0:
                                System.out.println("Terima kasih telah menggunakan sistem kami");
                                System.out.println("");
                                continue;
                            default:
                                break;
                        }
                    } while (!true);

                }

            }
            if (loginMulti.equalsIgnoreCase("admin")) {
                if (true) {
                    do {
                        sistemKompen.loginAdmin(strTatib);
                        int pilihanAdmin = showAdminMenu(intTatib);
                        switch (pilihanAdmin) {
                            case 1:
                                sistemKompen.cariProfil(strTatib);
                                break;
                            case 2:
                                SistemKompen.showListPelanggaran();
                                break;
                            case 3:
                                sistemKompen.statusTugas(strTatib);
                                break;
                            case 4:
                                sistemKompen.opsi(strTatib, intTatib);

                        }
                    } while (!true);
                }
            }
        }

    }

    static private String[][] mahasiswa = {
            { "Rangga", "Khalid", "Nero", "Damar", "Agil", "Austriech", "Rizal" }, // nama/username Mahasiswa
            { "password1", "password2", "password3", "password4", "password5", "password6", "password7" }, // password
                                                                                                           // mahasiswa
            { "23720001", "23720002", "23720003", "23720004", "23720005", "23720006", "23720007" }, // NIM
            { "1C", "1C", "1C", "1C", "1C", "1C", "1C" }, // kelas
            { "Teknik informatika", "Teknik informatika", "Teknik informatika", "Teknik informatika",
                    "Teknik informatika", "Teknik informatika", "Teknik informatika", }, // prodi
            { "3", "4", "10", "0", "7", "10", "2" }, // alfa

    };

    static private String[][] admin = {
            { "admin1", "admin2", "admin3" },
            { "password1", "password2", "password3" }
    };

    static private String[][] pelanggaran = {
            { "Menggunakan barang-barang psikotropika dan zat-zat Adiktif lainnya (I)                                                     |" },
            { "Melakukan kegiatan politik praktis di dalam kampus (II)                                                                    |" },
            { "Merokok di luar area kawasan merokok (III)                                                                                 |" },
            { "Makan, atau minum di dalam ruang kuliah/ laboratorium/ bengkel. (IV)                                                       |" },
            { "Berkomunikasi dengan tidak sopan, baik tertulis atau tidak tertulis kepada mahasiswa, dosen, karyawan, atau orang lain (V) |" },
    };

    public String[][] getMahasiswaData() {
        return mahasiswa;
    }

    public String[][] getAdminData() {
        return admin;
    }

    public String[][] getPelanggaran() {
        return pelanggaran;
    }

    public boolean loginMahasiswa(Scanner strTatib) {
        String usernamemhs, passwordmhs;

        System.out.println("===============MAHASISWA==============");
        System.out.println("Anda masuk sebagai mahasiswa");
        System.out.println("                                  ");
        System.out.print("Masukkan username: ");
        usernamemhs = strTatib.next();

        System.out.print("Masukkan Password: ");
        passwordmhs = strTatib.next();

        for (int i = 0; i < mahasiswa[0].length; i++) {
            if (usernamemhs.equals(mahasiswa[0][i]) && passwordmhs.equals(mahasiswa[1][i])) {
                System.out.println("\nSelamat datang, " + usernamemhs + " silahkan di cek kompennya!\n");
                return true; // Login berhasil
            }
        }

        System.out.println("\nUsername atau password salah. Silakan coba lagi.\n");
        return false; // Login gagal
    }

    public static int showMahasiswaMenu(Scanner intTatib) {
        int pilihan;
        while (true) {
            System.out.println("======================================");
            System.out.println("============MENU MAHASISWA============");
            System.out.println("======================================");
            System.out.println("|1. Lihat profile                    |");
            System.out.println("|2. Riwayat pelanggar                |");
            System.out.println("|3. Status Tugas                     |");
            System.out.println("|4. opsi                             |");
            System.out.println("|0. logout                           |");
            System.out.println("======================================");
            System.out.print("Pilih menu yang diinginkan: ");
            pilihan = intTatib.nextInt();
            intTatib.nextLine();

            if (pilihan >= 0 && pilihan <= 4) {
                break; // Keluar dari loop jika pilihan menu valid
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
        }
        return pilihan;
    }

    public void cariProfil(Scanner strTatib) {
        System.out.println("==================================================");
        System.out.println("===============CEK PROFIL MAHASISWA===============");
        System.out.println("==================================================");
        System.out.print("Masukkan nama yang ingin dicari: ");
        String namamhs = strTatib.next();

        for (int i = 0; i < mahasiswa[0].length; i++) {
            if (namamhs.equalsIgnoreCase(mahasiswa[0][i])) {
                System.out.println("Data mahasiswa: ");
                System.out.println("Nama : " + mahasiswa[0][i]);
                System.out.println("NIM  : " + mahasiswa[2][i]);
                System.out.println("Kelas: " + mahasiswa[3][i]);
                System.out.println("Prodi: " + mahasiswa[4][i]);
                System.out.println("Alfa : " + mahasiswa[5][i]);

            } else {
                System.out.println("Mahasiswa dengan nama '" + namamhs + "' tidak ditemukan.");
                return;
            }

            System.out.print("Kembali ke menu utama? (y/n): ");
            String kembali = strTatib.next();
            if (kembali.equalsIgnoreCase("y")) {
                showMahasiswaMenu(strTatib);
            }

        }

    }

    public static void historiPelanggaran(Scanner strTatib) {
        System.out.println("======================================");
        System.out.println("==========RIWAYAT PELANGGARAN=========");
        System.out.println("======================================");

        // mengambil dari data master

        System.out.println("kembali ke menu : (y)");
        String kembali = strTatib.nextLine();

        if (kembali.equalsIgnoreCase("y")) {
            showMahasiswaMenu(strTatib);
        }

    }

    public static void statusTugas(Scanner strTatib) {
        System.out.println("======================================");
        System.out.println("==============STATUS TUGAS============");
        System.out.println("======================================");

        // mengambil dari data master

        System.out.println("kembali ke menu : (y)");
        String kembali = strTatib.nextLine();

        if (kembali.equalsIgnoreCase("y")) {
            showMahasiswaMenu(strTatib);
        }
    }

    public static void opsi(Scanner strTatib, Scanner intTatib) {
        System.out.println("======================================");
        System.out.println("==================OPSI================");
        System.out.println("======================================");
        System.out.println("|1.  Ganti Password                  |");
        System.out.println("|2.                                  |");
        System.out.println("|3.                                  |");
        System.out.println("|4.                                  |");
        System.out.println("|0.                                  |");
        System.out.println("======================================");
        System.out.println("Pilih opsi yang diinginkan: ");
        int opsiMahasiswa = strTatib.nextInt();
    }

    public boolean loginAdmin(Scanner strTatib) {
        String usernamemhs, passwordmhs;

        System.out.println("===============ADMIN==============");
        System.out.println("Anda masuk sebagai admin");
        System.out.println("                                  ");
        System.out.print("Masukkan username: ");
        usernamemhs = strTatib.next();

        System.out.print("Masukkan Password: ");
        passwordmhs = strTatib.next();

        for (int i = 0; i < mahasiswa[0].length; i++) {
            if (usernamemhs.equals(mahasiswa[0][i]) && passwordmhs.equals(mahasiswa[1][i])) {
                System.out.println("\nSelamat datang, " + usernamemhs + " siapakah yang nakal hari ini?\n");
                return true; // Login berhasil
            }
        }

        System.out.println("\nUsername atau password salah. Silakan coba lagi.\n");
        return false; // Login gagal
    }

    public static int showAdminMenu(Scanner intTatib) {
        int pilihan;
        while (true) {
            System.out.println("===================================");
            System.out.println("============ Main Menu ============");
            System.out.println("===================================");
            System.out.println("|1. Tambah data Mahsiswa          |");
            System.out.println("|2. Daftar Pelanggaran            |");
            System.out.println("|3. Tutorial jika telat           |");
            System.out.println("|4. Riwayat pelanggar             |");
            System.out.println("|5. Status Tugas                  |");
            System.out.println("|6. Data kehadiran                |");
            System.out.println("|0. Keluar dari program           |");
            System.out.println("===================================");
            System.out.print("Pilih menu yang diinginkan: ");
            pilihan = intTatib.nextInt();
            if (pilihan >= 0 && pilihan <= 4) {
                break; // Keluar dari loop jika pilihan menu valid
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
        }
        return pilihan;
    }
    public static void showListPelanggaran() {
        System.out.println("=================================================================================================================================");
        System.out.println("=================================================LIST PELANGGARAN================================================================");
        System.out.println("=================================================================================================================================");

        for (int i = 0; i < pelanggaran[0].length; i++) {
            System.out.println("| " + (i + 1) + ". " + pelanggaran[0][i]);
            System.out.println("| " + (i + 2) + ". " + pelanggaran[1][i]);
            System.out.println("| " + (i + 3) + ". " + pelanggaran[2][i]);
            System.out.println("| " + (i + 4) + ". " + pelanggaran[3][i]);
            System.out.println("| " + (i + 5) + ". " + pelanggaran[4][i]);
        }

        System.out.println("==================================================================================================================================");
        System.out.println("==================================================================================================================================");
        System.out.println("");
        
    }
    public static String tambahPelanggaran(Scanner strTatib) {

        System.out.println("==================================================");
        System.out.println("================TAMBAH PELANGGARAN================");
        System.out.println("==================================================");
        System.out.println("");

        System.out.println("Masukkan ada berapa pelanggar: ");
        String banyakPelanggar = strTatib.next();

        for (int i = 0; i < banyakPelanggar; i++) {

            System.out.print("Masukkan nama Pelanggar: ");
            String pelanggar = strTatib.next();

            System.out.println("Pelanggar ke " +( i+1 ));

            for (int j = 0; j < mahasiswa[0].length; j++) {
            if (pelanggar.equalsIgnoreCase(mahasiswa[0][j])) {
                System.out.println("Data mahasiswa: ");
                System.out.println("Nama : " + mahasiswa[0][j]);
                System.out.println("NIM  : " + mahasiswa[2][j]);
                System.out.println("Kelas: " + mahasiswa[3][j]);
                System.out.println("Prodi: " + mahasiswa[4][j]);
                System.out.println("Alfa : " + mahasiswa[5][j]);
                System.out.print();

            } else {
                System.out.println("Mahasiswa dengan nama '" + pelanggar + "' tidak ditemukan.");
                return null;
            }
            
            
        }


        
        
    }

}
}
