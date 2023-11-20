
import java.util.Scanner;

public class SistemTataTertib {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        String tipePengguna;
        String mahasiswa[][] = {
                { "mahasiswa1", "mahasiswa2", "mahasiswa3" },
                { "password1", "password2", "password3" } };
        String admin[][] = {
                { "admin1", "admin2", "admin3" },
                { "password1", "password2", "password3" }
        };

        boolean isPengguna = false;

        // input memilih login sebagai mahasiswa/admin
        do {
            System.out.print("login sebagai (Mahasiswa/Admin) :");
            tipePengguna = sc25.nextLine();
            // pemilihan mahasiswa atau admin
            if (tipePengguna.equalsIgnoreCase("mahasiswa")) {
                System.out.println("-----Anda login sebagai mahasiswa-----\n");
                // memasukkan username dan password mahasiswa
                System.out.print(" masukkan username mahasiswa : ");
                String inputUsername = sc25.next();
                System.out.print(" masukkan password mahasiswa : ");
                String inputPassword = sc25.next();

                for (int i = 0; i < mahasiswa.length; i++) {
                    if (inputUsername.equals(mahasiswa[0][i]) && inputPassword.equals(mahasiswa[1][i])) {
                        System.out.println("\nselamat " + inputUsername + " telah berhasil login\n");
                        isPengguna = true;
                        break;
                    } else {
                        System.out.println("password atau username salah ");
                        continue;
                    }
                }

            } else if (tipePengguna.equalsIgnoreCase("admin")) {
                // memasukkan username dan password mahasiswa
                System.out.println("-----Anda login sebagai Admin-----\n");
                System.out.print(" masukkan username admin : ");
                String inputUsername = sc25.next();
                System.out.print(" masukkan password admin : ");
                String inputPassword = sc25.next();

                for (int i = 0; i < admin.length; i++) {
                    if (inputUsername.equals(admin[0][i])&&inputPassword.equals(admin[1][i])) {
                        System.out.println("\nselamat " + inputUsername + " telah berhasil login\n");
                        isPengguna = true;
                        break;
                    }
                    if (!isPengguna) {
                        System.out.println("password atau username salah ");
                    } else {
                        System.out.println("Pengguna tidak ditemukan");
                    }
                }
            }
            while (!isPengguna)
                ;

        } while (!isPengguna);

        Scanner sc = new Scanner(System.in);
        Scanner strtatib = new Scanner(System.in);
        Scanner intgtatib = new Scanner(System.in);

        int jumlahPelanggar;
        int pilihan, jumlahBiodata = 0;
        String dataPelanggar[][] = new String[100][100];
        int dataPelanggarint[][] = new int[100][100];

        // String nama[] = new String[] [100];
        // String kelas[] = new String[100];
        // String nim[] = new String[100];
        // String jurusan[] = new String[100];
        // String prodi[] = new String[100];
        // String pelanggaran[] = new String[100];
        // String tingkat[] = new String[100];
        // int jam[] = new int[100];

        while (true) {
            System.out.println("===================================");
            System.out.println("============ Main Menu ============");
            System.out.println("===================================");
            System.out.println("|1. Tambah data Mahsiswa          |");
            System.out.println("|2. Daftar Pelanggaran            |");
            System.out.println("|3. Tutorial jika telat           |");
            System.out.println("|4. Riwayat pelanggar             |");
            System.out.println("|5. Status Tugas                  |");
            System.out.println("|6. Daftar tugas kompen           |");
            System.out.println("|0. Keluar dari program           |");
            System.out.println("===================================");
            System.out.print("Pilih menu yang diinginkan: ");

            pilihan = sc.nextInt();

            if (pilihan == 1) {
                boolean isValid = false;
                while (!isValid) {
                    System.out.println("*****Silahkan masukkan data mahasiswa yang melanggar*****");
                    System.out.println("                                                          ");

                    System.out.print("Masukkan banyak pelanggar: ");
                    jumlahPelanggar = intgtatib.nextInt();

                    for (int i = 0; i < jumlahPelanggar; i++) {

                        System.out.println("Pelanggar ke- " + (i + 1));

                        System.out.print("Nama        : ");
                        dataPelanggar[0][jumlahBiodata] = strtatib.next();

                        System.out.print("Kelas       : ");
                        dataPelanggar[1][jumlahBiodata] = strtatib.next();

                        System.out.print("NIM         : ");
                        dataPelanggar[2][jumlahBiodata] = strtatib.next();

                        System.out.print("Prodi       : ");
                        dataPelanggar[3][jumlahBiodata] = strtatib.next();

                        System.out.print("Jurusan     : ");
                        dataPelanggar[4][jumlahBiodata] = strtatib.next();

                        System.out.print("Pelanggaran : ");
                        dataPelanggar[5][jumlahBiodata] = strtatib.next();

                        if (dataPelanggar[5][jumlahBiodata].equalsIgnoreCase("Telat")) {

                            System.out.print("Berapa jam? ");
                            dataPelanggarint[6][jumlahBiodata] = intgtatib.nextInt();

                        } else {
                            System.out.print("Tingkat  : ");
                            dataPelanggar[6][jumlahBiodata] = strtatib.next();
                        }

                        System.out.println("Apakah ingin dicetak? (y/n)");
                        String pemilihan = strtatib.next();

                        int totaljam = dataPelanggarint[6][jumlahBiodata] * 2;

                        if (pemilihan.equalsIgnoreCase("Y")) {
                            System.out.println("Data telah ditambahkan!");
                            System.out.println("                       ");
                            System.out.println("Pelanggar ke- " + (i + 1));
                            System.out.println("Nama        : " + dataPelanggar[0][jumlahBiodata]);
                            System.out.println("kelas       : " + dataPelanggar[1][jumlahBiodata]);
                            System.out.println("NIM         : " + dataPelanggar[2][jumlahBiodata]);
                            System.out.println("Prodi       : " + dataPelanggar[3][jumlahBiodata]);
                            System.out.println("Jurusan     : " + dataPelanggar[4][jumlahBiodata]);
                            System.out.println("Pelanggaran : " + dataPelanggar[5][jumlahBiodata]);

                            if (dataPelanggar[5][jumlahBiodata].equalsIgnoreCase("Telat")) {
                                System.out.println("Hukuman kompen jam : " + totaljam);
                                System.out.println("                               ");

                            } else {
                                System.out.println("Tingkat berapa: " + dataPelanggar[6][jumlahBiodata]);

                                if (dataPelanggar[6][jumlahBiodata].equalsIgnoreCase("V")
                                        || dataPelanggar[6][jumlahBiodata].equalsIgnoreCase("5")) {
                                    System.out.println(
                                            "Anda mendapatkan teguran lisan dan harus membuat surat pernyataan tidak mengulangi perbuatan\r\n"
                                                    + //
                                                    "menggunakan materai dan di TTD anda dan Dosen DPA\r\n");

                                } else if (dataPelanggar[6][jumlahBiodata].equalsIgnoreCase("IV")
                                        || dataPelanggar[6][jumlahBiodata].equalsIgnoreCase("4")) {
                                    System.out.println(
                                            "Anda mendapatkan teguran  dan harus membuat surat pernyataan tidak mengulangi perbuatan\r\n"
                                                    + //
                                                    "menggunakan materai dan di TTD anda dan Dosen DPA\r\n");

                                } else if (dataPelanggar[6][jumlahBiodata].equalsIgnoreCase("III")
                                        || dataPelanggar[6][jumlahBiodata].equalsIgnoreCase("3")) {
                                    System.out.println(
                                            "1. Membuat surat pernyataan menggunakan materai dan di TTD anda dan dosen DPA\r\n"
                                                    + //
                                                    "2. Melakukan tugas khusus\r\n");

                                } else if (dataPelanggar[6][jumlahBiodata].equalsIgnoreCase("II")
                                        || dataPelanggar[6][jumlahBiodata].equalsIgnoreCase("2")) {
                                    System.out.println("1. Anda harus melakukan penggantian kerugian \r\n" + //
                                            "2. Anda harus melakukan tugas pelayanan sosial\r\n" + //
                                            "3. Anda akan dikenakan nilai D pada matkul terkait");
                                } else {
                                    System.out.println("Data telah ditambahkan!");
                                    break;
                                }
                            }
                        }
                        jumlahBiodata++;
                    }
                    System.out.println("Apakah ingin kembali ke Menu Utama? (y/n)");
                    String kembaliMenu = strtatib.next();
                    if (kembaliMenu.equalsIgnoreCase("y")) {
                        break;
                    } else {
                        continue;
                    }
                }
                continue;
            } else if (pilihan == 2) {
                boolean isList = false;
                while (!isList) {
                    System.out.println("List pelanggaran.");
                    System.out.println("1. Berkomunikasi dengan tidak sopan, baik tertulis atau tidak tertulis\r\n" + //
                            "kepada mahasiswa, dosen, karyawan, atau orang lain | tingkat: V");
                    System.out.println("                                                           ");
                    System.out.println("2. Berbusana tidak sopan dan tidak rapi. Yaitu antara lain adalah:\r\n" + //
                            "berpakaian ketat, transparan, memakai t-shirt (baju kaos tidakberkerah), tank top, hipster,\r\n"
                            + //
                            "you can see, rok mini, backless, celana\r\n" + //
                            "pendek, celana tiga per empat, legging, model celana atau baju koyak, sandal, sepatu sandal di lingkungan kampus \r\n"
                            + //
                            "|Tingkat: IV");
                    System.out.println("3. Mahasiswa Iaki-laki berambut tidak rapi, gondrong yaitu panjang\r\n" + //
                            "rambutnya melewati batas alis mata di bagian depan, telinga di\r\n" + //
                            "bagian samping atau menyentuh kerah baju di bagian leher | Tingkat: IV");
                    System.out.println("4. Mahasiswa berarnbut dengan model punk, dicat selain hitam dan/\r\n" + //
                            "atau skinned. | Tingkat : IV");

                    System.out.print("Kembali ke menu utam?(y/n): ");
                    String balik = strtatib.next();

                    if (balik.equalsIgnoreCase("y")) {
                        break;

                    } else {
                        continue;
                    }

                }
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
                boolean isHistori = false;
                while (!isHistori) {
                    System.out.println("History Pelanggar: ");
                    if (jumlahBiodata == 0) {
                        System.out.println("Belum ada data pelanggar");
                    } else {
                        for (int i = 0; i < jumlahBiodata; i++) {
                            System.out.println("                       ");
                            System.out.println("Pelanggar ke- " + (i + 1));
                            System.out.println("Nama        : " + dataPelanggar[0][i]);
                            System.out.println("kelas       : " + dataPelanggar[1][i]);
                            System.out.println("NIM         : " + dataPelanggar[2][i]);
                            System.out.println("Prodi       : " + dataPelanggar[3][i]);
                            System.out.println("Jurusan     : " + dataPelanggar[4][i]);
                            System.out.println("Pelanggaran : " + dataPelanggar[5][i]);

                        }
                    }
                    System.out.println("Apakah ingin kembali ke Menu Utama? (y/n)");
                    String kembaliMenu = strtatib.next();
                    if (kembaliMenu.equalsIgnoreCase("y")) {
                        break;
                    } else {
                        continue;
                    }

                }
                continue;

            } else if (pilihan == 0) { // digabung dengan yang atas agar jadi 1 IF
                System.out.println("Terimakasih, kembali lagi");
                break;
            } else {
                System.out.println("pilihan anda tidak valid");
                continue; // continue agar kembali ke display menu
            }
        }
        return;

    }

}
