
import java.util.Scanner;

public class mainmenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner strtatib = new Scanner(System.in);
        Scanner intgtatib = new Scanner(System.in);

        int jumlahPelanggar;
        int pilihan, jumlahBiodata = 0;

        String nama[] = new String[100];
        String kelas[] = new String[100];
        String nim[] = new String[100];
        String jurusan[] = new String[100];
        String prodi[] = new String[100];
        String pelanggaran[] = new String[100];
        String tingkat[] = new String[100];
        int jam[] = new int[100];

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
                boolean isValid = false; // tambah variable untuk looping
                while (!isValid) { // looping untuk kembali ke line 41
                    System.out.println("*****Silahkan masukkan data mahasiswa yang melanggar*****");
                    System.out.println("                                                          ");

                    System.out.print("Masukkan banyak pelanggar: ");
                    jumlahPelanggar = intgtatib.nextInt();

                    for (int i = 0; i < jumlahPelanggar; i++) {

                        System.out.println("Pelanggar ke- " + (i + 1));

                        System.out.print("Nama        : ");
                        nama[jumlahBiodata] = strtatib.next();

                        System.out.print("Kelas       : ");
                        kelas[jumlahBiodata] = strtatib.next();

                        System.out.print("NIM         : ");
                        nim[jumlahBiodata] = strtatib.next();

                        System.out.print("Prodi       : ");
                        prodi[jumlahBiodata] = strtatib.next();

                        System.out.print("Jurusan     : ");
                        jurusan[jumlahBiodata] = strtatib.next();

                        System.out.print("Pelanggaran : ");
                        pelanggaran[jumlahBiodata] = strtatib.next();

                        if (pelanggaran[jumlahBiodata].equalsIgnoreCase("Telat")) {

                            System.out.print("Berapa jam? ");
                            jam[jumlahBiodata] = intgtatib.nextInt();

                        } else {
                            System.out.print("Tingkat  : ");
                            tingkat[jumlahBiodata] = strtatib.next();
                        }

                        System.out.println("Apakah ingin dicetak? (y/n)");
                        String pemilihan = strtatib.next();

                        int totaljam = jam[jumlahBiodata] * 2;

                        if (pemilihan.equalsIgnoreCase("Y")) {
                            System.out.println("Data telah ditambahkan!");
                            System.out.println("                       ");
                            System.out.println("Pelanggar ke- " + (i + 1));
                            System.out.println("Nama        : " + nama[jumlahBiodata]);
                            System.out.println("kelas       : " + kelas[jumlahBiodata]);
                            System.out.println("NIM         : " + nim[jumlahBiodata]);
                            System.out.println("Prodi       : " + prodi[jumlahBiodata]);
                            System.out.println("Jurusan     : " + jurusan[jumlahBiodata]);
                            System.out.println("Pelanggaran : " + pelanggaran[jumlahBiodata]);

                            if (pelanggaran[jumlahBiodata].equalsIgnoreCase("Telat")) {
                                System.out.println("Hukuman kompen jam : " + totaljam);
                                System.out.println("                               ");

                            } else {
                                System.out.println("Tingkat berapa: " + tingkat[jumlahBiodata]);

                                if (tingkat[jumlahBiodata].equalsIgnoreCase("V")
                                        || tingkat[jumlahBiodata].equalsIgnoreCase("5")) {
                                    System.out.println(
                                            "Anda mendapatkan teguran lisan dan harus membuat surat pernyataan tidak mengulangi perbuatan\r\n"
                                                    + //
                                                    "menggunakan materai dan di TTD anda dan Dosen DPA\r\n");

                                } else if (tingkat[jumlahBiodata].equalsIgnoreCase("IV")
                                        || tingkat[jumlahBiodata].equalsIgnoreCase("4")) {
                                    System.out.println(
                                            "Anda mendapatkan teguran  dan harus membuat surat pernyataan tidak mengulangi perbuatan\r\n"
                                                    + //
                                                    "menggunakan materai dan di TTD anda dan Dosen DPA\r\n");

                                } else if (tingkat[jumlahBiodata].equalsIgnoreCase("III")
                                        || tingkat[jumlahBiodata].equalsIgnoreCase("3")) {
                                    System.out.println(
                                            "1. Membuat surat pernyataan menggunakan materai dan di TTD anda dan dosen DPA\r\n"
                                                    + //
                                                    "2. Melakukan tugas khusus\r\n");

                                } else if (tingkat[jumlahBiodata].equalsIgnoreCase("II")
                                        || tingkat[jumlahBiodata].equalsIgnoreCase("2")) {
                                    System.out.println("1. Anda harus melakukan penggantian kerugian \r\n" + //
                                            "2. Anda harus melakukan tugas pelayanan sosial\r\n" + //
                                            "3. Anda akan dikenakan nilai D pada matkul terkait");
                                } else {
                                    System.out.println("Data telah ditambahkan!");
                                    break;
                                }
                            }
                        }
                        jumlahBiodata++; // variable di ++ agar bertambah untuk menambah data baru dan menampilkan
                                         // histori
                    }
                    System.out.println("Apakah ingin kembali ke Menu Utama? (y/n)"); // dipindah di dalam looping while
                                                                                     // isValid
                    String kembaliMenu = strtatib.next();
                    if (kembaliMenu.equalsIgnoreCase("y")) {
                        break;
                    } else {
                        continue;
                    }
                }
                continue;
            } else if (pilihan == 2) {
                System.out.println("List pelanggaran.");
                System.out.println("1. Berkomunikasi dengan tidak sopan, baik tertulis atau tidak tertulis\r\n" + //
                        "kepada mahasiswa, dosen, karyawan, atau orang lain | tingkat: V");
                System.out.println("                                                           ");
                System.out.println("2. Berbusana tidak sopan dan tidak rapi. Yaitu antara lain adalah:\r\n" + //
                        "berpakaian ketat, transparan, memakai t-shirt (baju kaos tidakberkerah), tank top, hipster,\r\n"
                        + //
                        "you can see, rok mini, backless, celana\r\n" + //
                        "pendek, celana tiga per empat, legging, model celana atau baju koyak, sandal, sepatu sandal di lingkungan kampus \r\n" + //
                        "|Tingkat: IV");
                System.out.println("3. Mahasiswa Iaki-laki berambut tidak rapi, gondrong yaitu panjang\r\n" +//
                                    "rambutnya melewati batas alis mata di bagian depan, telinga di\r\n"+//
                                    "bagian samping atau menyentuh kerah baju di bagian leher | Tingkat: IV");
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
                boolean isHistori = false;
                while (!isHistori) {
                    System.out.println("History Pelanggar: ");
                    System.out.println("Data telah ditambahkan!");
                    if (jumlahBiodata == 0) {
                        System.out.println("Belum ada data pelanggar");
                    } else {
                        for (int i = 0; i < jumlahBiodata; i++) {
                            System.out.println("                       ");
                            System.out.println("Pelanggar ke- " + (i + 1));
                            System.out.println("Nama        : " + nama[i]);
                            System.out.println("kelas       : " + kelas[i]);
                            System.out.println("NIM         : " + nim[i]);
                            System.out.println("Prodi       : " + prodi[i]);
                            System.out.println("Jurusan     : " + jurusan[i]);
                            System.out.println("Pelanggaran : " + pelanggaran[i]);

                        }
                    }
                    System.out.println("Apakah ingin kembali ke Menu Utama? (y/n)"); // dipindah di dalam looping while
                                                                                     // isValid
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
