
import java.util.Scanner;

public class SistemKompenFix {

    static Scanner sc25 = new Scanner(System.in);
    static Scanner intTatib = new Scanner(System.in);
    static Scanner strTatib = new Scanner(System.in);

    static String MahasiswaLogin[][] = new String[100][2];
    static {
        MahasiswaLogin[0] = new String[] { "rangga", "password1" }; // Data mahasiswa 1
        MahasiswaLogin[1] = new String[] { "khalid", "password2" }; // Data mahasiswa 2
        MahasiswaLogin[2] = new String[] { "damar", "password3" }; // Data mahasiswa 3
        MahasiswaLogin[3] = new String[] { "austriech", "password4" };// Data mahasiswa 4
        MahasiswaLogin[4] = new String[] { "rizal", "password5" }; // Data mahasiswa 4
    }

    static String DataMahasiswa[][] = new String[100][3];
    static {
        DataMahasiswa[0] = new String[] { "2341720001", "1C", "Teknik Informatika" }; // Data mahasiswa 1
        DataMahasiswa[1] = new String[] { "2341720002", "1C", "Teknik Informatika" }; // Data mahasiswa 2
        DataMahasiswa[2] = new String[] { "2341720003", "1C", "Teknik Informatika" }; // Data mahasiswa 3
        DataMahasiswa[3] = new String[] { "2341720004", "1C", "Teknik Informatika" }; // Data mahasiswa 4
        DataMahasiswa[4] = new String[] { "2341720005", "1C", "Teknik Informatika" }; // Data mahasiswa 5
    }

    static int alfa[] = { 1, 10, 50, 104, 205, 0, 0, 0 };

    static String dataPelanggaran[][] = {
            // pelanggaran 1
            { "merusak komputer lab", "terlambat", null, null, null, null, null, null }, // jenis pelanggaran 1
            { "mengganti", "Membantu Admin", null, null, null, null, null, null }, // tugas pelanggaran 1
            { "selesai", "selesai", null, null, null, null, null, null }, // status tugas 1
            // pelanggaran 2
            { null, "telat", null, null, null, null, null, null }, // jenis pelanggaran 2
            { null, "membantu admin", null, null, null, null, null, null }, // tugas pelanggaran 2
            { null, "aktif", null, null, null, null, null, null }, // status tugas 2
            // pelanggaran 3
            { null, "terlambat", null, null, null, null, null, null }, // jenis pelanggaran 3
            { null, "membantu admin", null, null, null, null, null, null }, // tugas pelanggaran 3
            { null, "selesai", null, null, null, null, null, null } // status tugas 3
    };

    static int waktuPelanggaran[][] = {
            { 0, 2, 0, 0, 0, 0, 0, 0 }, // jam terlambat 1
            { 0, 3, 0, 0, 0, 0, 0, 0 }, // jam terlambat 2
            { 0, 4, 0, 0, 0, 0, 0, 0 } // jam terlambat 3
    };

    static String AdminLogin[][] = new String[100][2];
    static {
        AdminLogin[0] = new String[] { "admin1", "password1" }; // Admin 1
        AdminLogin[1] = new String[] { "admin2", "password2" }; // Admin 2
        AdminLogin[2] = new String[] { "admin3", "password3" }; // Admin 3
        AdminLogin[3] = new String[] { "admin4", "password4" }; // Admin 4
    }

    // indeks
    static int indeksMahasiswa = 0;
    static int indeksAdmin = 0;

    static private String[] pelanggaran = {
            "Menggunakan barang-barang psikotropika dan zat-zat Adiktif lainnya.", // 1
            "Melakukan kegiatan politik praktis di dalam kampus.", // 2
            "Merokok di luar area kawasan merokok.", // 3
            "Makan, atau minum di dalam ruang kuliah/ laboratorium/ bengkel.", // 4
            "Berkomunikasi dengan tidak sopan, baik tertulis atau tidak tertulis kepada mahasiswa, dosen, karyawan, atau orang lain.", // 5
            "Terlambat/Alfa." // 6
    };

    static private String[] listKompen = {
            "Anda mendapatkan teguran lisan dan harus membuat surat pernyataan tidak mengulangi perbuatan dengan menggunakan materai dan di TTD anda dan Dosen DPA", // golongan
                                                                                                                                                                     // V
            "Anda mendapatkan teguran  dan harus membuat surat pernyataan tidak mengulangi perbuatan dengan menggunakan materai dan di TTD anda dan Dosen DPA", // golongan
                                                                                                                                                                // IV
            "1. Membuat surat pernyataan menggunakan materai dan di TTD anda dan dosen DPA\r\n" + //
                    "2. Melakukan tugas khusus", // golongan III
            "1. Anda harus melakukan penggantian kerugian \r\n" + //
                    "2. Anda harus melakukan tugas pelayanan sosial\r\n" + //
                    "3. Anda akan dikenakan nilai D pada matkul terkait", // golongan II
            "1. Dinonaktifkan (Cuti Akademik/ Terminal) selama dua semester\r\n" + //
                    "2. Diberhentikan sebagai mahasiswa" // golongan I
    };

    static private String[] ListKompenJam = {
            "1. Membantu admin ",
            "2. Membeli kertas A4 1 Rim",
            "3. Menginput nilai ujian",
            "4. Membuat banner kampus untuk event",
            "5. Membantu teknisi dalam melakukan tugas",
    };

    public static void main(String[] args) {
        String pilihan;
        System.out.println("===================================================================");
        System.out.println("=============== WELCOME TO SYSTEM KOMPEN KELOMPOK 1 ===============");
        System.out.println("===================================================================");

        System.out.println("| 1. admin                                                         |");
        System.out.println("| 2. mahasiswa                                                     |");
        System.out.println("| 3. exit                                                          |");

        System.out.println("===================================================================");
        System.out.println("");
        System.out.print(" Masukkan pilihan: ");
        pilihan = sc25.next();

        if (pilihan.equalsIgnoreCase("2")) {
            boolean isLogin = LoginMahasiswa();

            if (isLogin) {
                System.out.println("\nLogin berhasil!");
                MenuMahasiswa();

            } else {
                System.out.println("\nLogin gagal");
                LoginMahasiswa();
            }

        } else if (pilihan.equalsIgnoreCase("1")) {
            boolean isLogin = loginAdmin();

            if (isLogin) {
                MenuAdmin();
            }

        } else if (pilihan.equalsIgnoreCase("3")) {

            System.out.println("Program selesai");
            System.exit(0);

        } else {
            System.out.println("Pilihan tidak valid");
            main(args);
        }

    }

    static boolean LoginMahasiswa() {
        System.out.println("\n<=============== MAHASISWA ==================>");
        System.out.println("Anda masuk sebagai mahasiswa");
        System.out.println("                                                    ");
        System.out.print("Masukkan username: ");
        String inputUsername = sc25.next();
        System.out.print("Masukkan password: ");
        String inputPassword = sc25.next();

        for (int i = 0; i < MahasiswaLogin[0].length; i++) {
            if (inputUsername.equalsIgnoreCase(MahasiswaLogin[i][0]) && inputPassword.equals(MahasiswaLogin[i][1])) {
                indeksMahasiswa = i;
                return true;
            }

        }
        return false;
    }

    static void MenuMahasiswa() {
        int selectMenuMHS;
        String choiceMHS;
        System.out.println("\n======================================");
        System.out.println("============MENU MAHASISWA============");
        System.out.println("======================================");
        System.out.println("|1. Lihat profile                    |");
        System.out.println("|2. Riwayat pelanggar                |");
        System.out.println("|3. Status Tugas                     |");
        System.out.println("|4. opsi                             |");
        System.out.println("|0. logout                           |");
        System.out.println("======================================");
        System.out.print("Pilih menu yang diinginkan: ");
        selectMenuMHS = sc25.nextInt();
        sc25.nextLine();
        switch (selectMenuMHS) {
            case 1:
                System.out.println("\n======================================");
                System.out.println("===========PROFIL MAHASISWA===========");
                System.out.println("======================================");
                System.out.println("NAMA  : " + MahasiswaLogin[indeksMahasiswa][0]);
                System.out.println("NIM   : " + DataMahasiswa[indeksMahasiswa][0]);
                System.out.println("KELAS : " + DataMahasiswa[indeksMahasiswa][1]);
                System.out.println("PRODI : " + DataMahasiswa[indeksMahasiswa][2]);
                System.out.println("\n==> kembali : (Y)");
                choiceMHS = sc25.nextLine();

                if (choiceMHS.equalsIgnoreCase("y")) {
                    MenuMahasiswa();
                }
                break;

            case 2:
                System.out.println("\n======================================");
                System.out.println("==========RIWAYAT PELANGGARAN=========");
                System.out.println("======================================");

                int totalPelanggaran = 0;

                for (int i = 0; i < dataPelanggaran.length; i += 3) {
                    if (dataPelanggaran[i][indeksMahasiswa] != null) {
                        totalPelanggaran++;
                    }
                }

                if (totalPelanggaran > 0) {
                    System.out.println("Riwayat Pelanggaran Mahasiswa " + MahasiswaLogin[indeksMahasiswa][0] + ":");

                    for (int i = 0; i < dataPelanggaran.length; i += 3) {
                        if (dataPelanggaran[i][indeksMahasiswa] != null) {
                            System.out.println(
                                    "Pelanggaran ke-" + ((i / 3) + 1) + ": " + dataPelanggaran[i][indeksMahasiswa]);

                            if (dataPelanggaran[i][indeksMahasiswa].equalsIgnoreCase("terlambat")
                                    || dataPelanggaran[i][indeksMahasiswa].equalsIgnoreCase("telat")) {
                                System.out
                                        .println("Jam Terlambat: " + waktuPelanggaran[i / 3][indeksMahasiswa]
                                                + " jam\n");
                            }
                        }
                    }
                } else {
                    System.out.println(
                            "Mahasiswa " + MahasiswaLogin[indeksMahasiswa][0] + " tidak memiliki riwayat pelanggaran.");
                }

                System.out.println("\n==> kembali : (Y)");
                choiceMHS = sc25.nextLine();
                if (choiceMHS.equalsIgnoreCase("y")) {
                    MenuMahasiswa();
                }
                break;

            case 3:
                System.out.println("\n======================================");
                System.out.println("==============STATUS TUGAS============");
                System.out.println("======================================");

                boolean riwayatTugas = false; // Flag untuk mengecek apakah ada riwayat tugas

                for (int i = 0, j = 0, k = 1, l = 2; i < dataPelanggaran[0].length; i += 3, j++) {

                    if (dataPelanggaran[i][indeksMahasiswa] != null) {
                        System.out.println("Pelanggaran ke-" + (j + 1) + ": " + dataPelanggaran[i][indeksMahasiswa]);
                        System.out.println("Tugas: " + dataPelanggaran[k][indeksMahasiswa]);

                        // Cek apakah pelanggaran termasuk telat atau terlambat
                        if (dataPelanggaran[i][indeksMahasiswa].equalsIgnoreCase("telat")
                                || dataPelanggaran[i][indeksMahasiswa].equalsIgnoreCase("terlambat")) {
                            System.out.println("Jam Terlambat: " + waktuPelanggaran[j][indeksMahasiswa] + " jam");
                            System.out.println("Status : " + dataPelanggaran[l][indeksMahasiswa]);
                        } else {
                            System.out.println("Status: " + dataPelanggaran[l][indeksMahasiswa]);
                        }

                        System.out.println(); // Baris kosong antara pelanggaran
                        riwayatTugas = true; // Set flag menjadi true karena ada riwayat tugas
                    }
                    k += 3;
                    l += 3;
                }

                // Menampilkan pesan jika mahasiswa tidak memiliki riwayat pelanggaran
                if (!riwayatTugas) {
                    System.out.println("Mahasiswa tidak memiliki riwayat pelanggaran.");
                }

                System.out.println("\n==> kembali : (Y)");
                choiceMHS = sc25.nextLine();
                if (choiceMHS.equalsIgnoreCase("y")) {
                    MenuMahasiswa();
                }
                break;
            case 4:
                int pilihanOpsi;
                System.out.println("======================================");
                System.out.println("==================OPSI================");
                System.out.println("======================================");
                System.out.println("|1. Ganti Password                   |");
                System.out.println("|2.                                  |");
                System.out.println("|3.                                  |");
                System.out.println("|4.                                  |");
                System.out.println("|0. Kembali                          |");
                System.out.println("======================================");
                System.out.println("Pilih opsi yang diinginkan: ");
                pilihanOpsi = sc25.nextInt();
                sc25.nextLine();
                switch (pilihanOpsi) {
                    case 1:
                        String opsiKeluar;
                        System.out.println("\n======================================");
                        System.out.println("============ganti password============");
                        System.out.println("======================================\n");
                        System.out.print("masukkan password baru : ");
                        MahasiswaLogin[indeksMahasiswa][1] = sc25.nextLine();
                        System.out.println("\n=======password berhasil diganti=======\n");
                        System.out.println("==> kembali (Y)");
                        opsiKeluar = sc25.nextLine();
                        if (opsiKeluar.equalsIgnoreCase("y")) {
                            MenuMahasiswa();
                        }
                        break;

                    case 0:
                        MenuMahasiswa();
                        break;
                    default:
                        break;
                }
                break;

            case 0:
                main(null);
                break;
            default:
                break;
        }
    }

    static void MenuAdmin() {
        String jenisPelanggaran = "1";
        int selectMenuADMN;
        int angka;
        int jamTelat = 0;
        System.out.println("|===================================|");
        System.out.println("|============ Main Menu ============|");
        System.out.println("|===================================|");
        System.out.println("|1. Update Pelanggar                |");
        System.out.println("|2. Daftar Pelanggaran              |");
        System.out.println("|3. List tugas kompen               |");
        System.out.println("|4. Riwayat pelanggar               |");
        System.out.println("|5. Cek alfa                        |");
        System.out.println("|0. Keluar dari program             |");
        System.out.println("|===================================|");
        System.out.print("Pilih menu yang diinginkan: ");
        selectMenuADMN = intTatib.nextInt();

        switch (selectMenuADMN) {
            case 1:

                System.out.println("\n==================================================");
                System.out.println("================UPDATE PELANGGARAN================");
                System.out.println("==================================================\n");

                System.out.print("Masukkan nama Pelanggar: ");
                String pelanggar = strTatib.next();
                boolean found = false; // Track if the student is found
                for (int k = 0; k < MahasiswaLogin.length; k++) {
                    if (pelanggar.equalsIgnoreCase(MahasiswaLogin[k][0])) {
                        indeksMahasiswa = k;
                        int pilih = 0;
                        System.out.println("Data mahasiswa: ");
                        System.out.println("Nama : " + MahasiswaLogin[indeksMahasiswa][0]);
                        System.out.println("NIM  : " + DataMahasiswa[indeksMahasiswa][0]);
                        System.out.println("Kelas: " + DataMahasiswa[indeksMahasiswa][1]);
                        System.out.println("Prodi: " + DataMahasiswa[indeksMahasiswa][2]);
                        found = true;
                        if (dataPelanggaran[0][indeksMahasiswa] == null) {
                            System.out.println("tidak ada riwayat pelanggaran ");
                        } else {
                            for (int i = 0; i < dataPelanggaran[0].length; i += 3) {
                                if (dataPelanggaran[i][indeksMahasiswa] != null) {
                                    System.out
                                            .println("Pelanggaran Mahasiswa : " + dataPelanggaran[i][indeksMahasiswa]);
                                }
                            }
                        }
                        System.out.println("\n1. edit pelanggaran");
                        System.out.println("2. Tambah pelanggaran");
                        System.out.println("pilih : ");
                        pilih = sc25.nextInt();

                        switch (pilih) {
                            case 1:
                                int choicePelanggaran = 0;
                                System.out.println("1. edit status tugas");
                                System.out.println("2. hapus tugas");
                                choicePelanggaran = sc25.nextInt();
                                switch (choicePelanggaran) {
                                    case 1:
                                        boolean EditStatus = false;
                                        int penghitung = 0;
                                        System.out.println("=====Edit status tugas=====");
                                        for (int i = 0, j = 0, l = 2; i < dataPelanggaran.length; i += 3, l += 3) {
                                            if (dataPelanggaran[i][indeksMahasiswa] == null) {

                                                found = true;
                                            } else {
                                                System.out.println("pelanggaran ke-" + (j + 1) + " "
                                                        + dataPelanggaran[i][indeksMahasiswa]);
                                                if (dataPelanggaran[i][indeksMahasiswa].equalsIgnoreCase("telat")
                                                        || dataPelanggaran[i][indeksMahasiswa]
                                                                .equalsIgnoreCase("terlambat")) {
                                                    System.out.println(
                                                            "Lama terlambat : " + waktuPelanggaran[j][indeksMahasiswa]);
                                                }
                                                System.out.println(
                                                        "Status : " + dataPelanggaran[l][indeksMahasiswa] + "\n");
                                                penghitung++;
                                                j++;
                                                EditStatus = true;
                                            }
                                        }
                                        if (EditStatus) {
                                            int Pilihedit = 0;
                                            System.out.println("pilih Status pelanggaran untuk di edit ");
                                            Pilihedit = sc25.nextInt();
                                            sc25.nextLine();

                                            if (Pilihedit == 1) {
                                                System.out.print("Status menjadi :");
                                                dataPelanggaran[2][indeksMahasiswa] = sc25.nextLine();
                                            } else if (Pilihedit == 2) {
                                                System.out.print("Status menjadi :");
                                                dataPelanggaran[5][indeksMahasiswa] = sc25.nextLine();
                                            } else if (Pilihedit == 3) {
                                                System.out.print("Status menjadi :");
                                                dataPelanggaran[8][indeksMahasiswa] = sc25.nextLine();
                                            } else {
                                                System.out.println("riwayat pelanggaran tidak tersedia");
                                            }
                                        }
                                        break;
                                    case 2:

                                        break;
                                    default:
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("| " + "1. " + pelanggaran[0]
                                        + " (I)                                                     |");
                                System.out.println("| " + "2. " + pelanggaran[1]
                                        + " (II)                                                                    |");
                                System.out.println("| " + "3. " + pelanggaran[2]
                                        + " (III)                                                                                 |");
                                System.out.println("| " + "4. " + pelanggaran[3]
                                        + " (IV)                                                        |");
                                System.out.println("| " + "5. " + pelanggaran[4] + " (V) |");
                                System.out.println("| " + "6. " + pelanggaran[5]
                                        + "                                                                                                             |");
                                System.out.print("pilih jenis Pelanggaran: ");
                                jenisPelanggaran = strTatib.next();

                                if (jenisPelanggaran.equals("1")) {
                                    System.out.println("| " + pelanggaran[0]
                                            + " (I)                                                     |");
                                    found = true;
                                } else if (jenisPelanggaran.equals("2")) {
                                    System.out.println("| " + pelanggaran[1]
                                            + " (II)                                                                    |");
                                    found = true;
                                } else if (jenisPelanggaran.equals("3")) {
                                    System.out.println("| " + pelanggaran[2]
                                            + " (III)                                                                                 |");
                                    found = true;
                                } else if (jenisPelanggaran.equals("4")) {
                                    System.out.println("| " + pelanggaran[3]
                                            + " (IV)                                                        |");
                                    found = true;
                                } else if (jenisPelanggaran.equals("5")) {
                                    System.out.println("| " + pelanggaran[4] + " (V) |");
                                    found = true;

                                    System.out.println("Golongan V");
                                    System.out.println(listKompen[0]);
                                    System.out.println("");
                                    System.out.println("Golongan IV");
                                    System.out.println(listKompen[1]);
                                    System.out.println("");
                                    System.out.println("Golongan III");
                                    System.out.println(listKompen[2]);
                                    System.out.println("");
                                    System.out.println("Golongan II");
                                    System.out.println(listKompen[3]);
                                    System.out.println("");
                                    System.out.println("Golongan I");
                                    System.out.println(listKompen[4]);
                                    System.out.println("");
                                    System.out.print("Pilih hukuman: ");
                                    String hukuman = strTatib.next();

                                    if (hukuman.equalsIgnoreCase("5") && hukuman.equalsIgnoreCase("V")) {
                                        System.out.println();
                                        System.out.println("Golongan V");
                                        System.out.println(listKompen[0]);
                                    } else if (hukuman.equalsIgnoreCase("4") && hukuman.equalsIgnoreCase("IV")) {
                                        System.out.println("Golongan IV");
                                        System.out.println(listKompen[1]);
                                    } else if (hukuman.equalsIgnoreCase("3") && hukuman.equalsIgnoreCase("III")) {
                                        System.out.println("Golongan III");
                                        System.out.println(listKompen[2]);
                                    } else if (hukuman.equalsIgnoreCase("2") && hukuman.equalsIgnoreCase("II")) {
                                        System.out.println("Golongan II");
                                        System.out.println(listKompen[3]);
                                    } else if (hukuman.equalsIgnoreCase("1") && hukuman.equalsIgnoreCase("I")) {
                                        System.out.println("Golongan I");
                                        System.out.println(listKompen[4]);

                                    }

                                } else if (jenisPelanggaran.equals("6")) {
                                    System.out.println("| " + pelanggaran[5]
                                            + "                                                                                                             |");
                                    System.out.print("Berapa jam: ");
                                    jamTelat = strTatib.nextInt();

                                    System.out.println("Kompen telat");
                                    System.out.println(ListKompenJam[0]);
                                    System.out.println(ListKompenJam[1]);
                                    System.out.println(ListKompenJam[2]);
                                    System.out.println(ListKompenJam[3]);
                                    System.out.println(ListKompenJam[4]);

                                    System.out.print("Pilih tugas kompen: ");
                                    String tugas = strTatib.next();


                                    if (waktuPelanggaran[0][indeksMahasiswa] == 0) {
                                        waktuPelanggaran[0][indeksMahasiswa] = jamTelat;

                                    } else if (waktuPelanggaran[1][indeksMahasiswa] == 0) {
                                        waktuPelanggaran[1][indeksMahasiswa] = jamTelat;

                                    } else {
                                        waktuPelanggaran[2][indeksMahasiswa] = jamTelat;
                                    }

                                    found = true;

                                    System.out.print("Konfirmasi pelanggaran? (y/n): ");
                                    String cetak = strTatib.next();

                                    if (cetak.equalsIgnoreCase("y")) {

                                        angka = Integer.parseInt(jenisPelanggaran);
                                        if (dataPelanggaran[0][indeksMahasiswa] == null) {
                                            dataPelanggaran[0][indeksMahasiswa] = pelanggaran[angka - 1];
                                        } else if (dataPelanggaran[3][indeksMahasiswa] == null) {
                                            dataPelanggaran[3][indeksMahasiswa] = pelanggaran[angka - 1];
                                        } else {
                                            dataPelanggaran[6][indeksMahasiswa] = pelanggaran[angka - 1];
                                        }

                                        System.out.println("\nPelanggaran telah ditambahkan!\n");
                                        System.out.println("Data mahasiswa: ");
                                        System.out.println("Nama : " + MahasiswaLogin[indeksMahasiswa][0]);
                                        System.out.println("NIM  : " + DataMahasiswa[indeksMahasiswa][0]);
                                        System.out.println("Kelas: " + DataMahasiswa[indeksMahasiswa][1]);
                                        System.out.println("Prodi: " + DataMahasiswa[indeksMahasiswa][2]);
                                        System.out.println("Jenis Pelanggaran: " + jenisPelanggaran);
                                       

                                        if (jenisPelanggaran.equals("6")) {
                                            System.out.println("Pelanggaran " + pelanggaran[5]);
                                            System.out.println("selama : " + jamTelat);
                                            int jumlahJamTelat = jamTelat * alfa[angka - 1];
                                            System.out.println("Jumlah jam telat: " + jumlahJamTelat);
                                            if (tugas.equalsIgnoreCase("1")) {
                                                System.out.println("tugas:"+ ListKompenJam[0]);   
                                            } else if (tugas.equalsIgnoreCase("2")) {
                                                 System.out.println("tugas: "+ ListKompenJam[1]);  
                                            }  else if (tugas.equalsIgnoreCase("3")) {
                                                 System.out.println("tugas: "+ ListKompenJam[2]);
                                            }  else if (tugas.equalsIgnoreCase("4")) {
                                             System.out.println("tugas: "+ ListKompenJam[3]);
                                            }  else if (tugas.equalsIgnoreCase("5")) {
                                                 System.out.println("tugas: "+ ListKompenJam[4]);
                                            }
                                        } else {
                                            angka = Integer.parseInt(jenisPelanggaran);
                                            System.out.println("pelanggaran : " + pelanggaran[angka - 1]);
                                             System.out.println("Hukuman: " + listKompen[indeksMahasiswa]);
                                        }

                                    } else {
                                        System.out.println("Data tidak ditambahkan!");
                                    }
                                    break;

                                } else {

                                    break;
                                }
                                break;

                            default:
                                break;
                        }
                        if (!found) {
                            System.out.println("Mahasiswa dengan nama '" + pelanggar + "' tidak ditemukan.");
                            System.out.println(MahasiswaLogin[k][0]);
                        }

                        System.out.print("\nKembali ke menu utama? (y/n) ");
                        String kembali = strTatib.next();

                        if (kembali.equalsIgnoreCase("y")) {
                            MenuAdmin();
                        }

                    }

                }

                break;
            case 2:
                System.out.println(
                        "=================================================================================================================================");
                System.out.println(
                        "<=================================================== LIST PELANGGARAN ===========================================================>");
                System.out.println(
                        "=================================================================================================================================");

                System.out.println("| " + pelanggaran[0]);
                System.out.println("| " + pelanggaran[1]);
                System.out.println("| " + pelanggaran[2]);
                System.out.println("| " + pelanggaran[3]);
                System.out.println("| " + pelanggaran[4]);

                System.out.println(
                        "==================================================================================================================================");
                System.out.println(
                        "==================================================================================================================================");
                System.out.println("");

                System.out.println("Kembali ke menu utama (y): ");
                String kembali = strTatib.next();

                if (kembali.equalsIgnoreCase("y")) {
                    MenuAdmin();

                }

                break;
            case 3:
                System.out.println(
                        "=================================================================================================================================");
                System.out.println(
                        "<=================================================== LIST TUGAS KOMPENSASI ===========================================================>");
                System.out.println(
                        "=================================================================================================================================");

                System.out.println("Golongan V");
                System.out.println(listKompen[0]);
                System.out.println("");
                System.out.println("Golongan IV");
                System.out.println(listKompen[1]);
                System.out.println("");
                System.out.println("Golongan III");
                System.out.println(listKompen[2]);
                System.out.println("");
                System.out.println("Golongan II");
                System.out.println(listKompen[3]);
                System.out.println("");
                System.out.println("Golongan I");
                System.out.println(listKompen[4]);
                System.out.println("");
                System.out.println("Kompen telat");
                System.out.println(ListKompenJam[0]);
                System.out.println(ListKompenJam[1]);
                System.out.println(ListKompenJam[2]);
                System.out.println(ListKompenJam[3]);
                System.out.println(ListKompenJam[4]);

                System.out.println(
                        "==================================================================================================================================");
                System.out.println(
                        "==================================================================================================================================");
                System.out.println("");

                System.out.println("Kembali ke menu utama (y): ");
                kembali = strTatib.next();

                if (kembali.equalsIgnoreCase("y")) {
                    MenuAdmin();

                }

                break;
            case 4:
                System.out.println("=================Data History Pelanggaran =====================");
                System.out.println("");
                System.out.print("Cari nama mahasiswa : ");
                pelanggar = strTatib.next();

                angka = 0;
                if (pelanggar.equalsIgnoreCase(MahasiswaLogin[indeksMahasiswa][0])) {
                    System.out.println("Data mahasiswa: ");
                    System.out.println("Nama : " + MahasiswaLogin[indeksMahasiswa][0]);
                    System.out.println("NIM  : " + DataMahasiswa[indeksMahasiswa][0]);
                    System.out.println("Kelas: " + DataMahasiswa[indeksMahasiswa][1]);
                    System.out.println("Prodi: " + DataMahasiswa[indeksMahasiswa][2]);
                    if (jenisPelanggaran.equals("6")) {
                        System.out.println("Pelanggaran " + pelanggaran[5]);
                        System.out.println("selama : " + jamTelat);
                        int jumlahJamTelat = jamTelat * alfa[angka - 1];
                        System.out.println("Jumlah jam telat: " + jumlahJamTelat);
                    } else {
                        angka = Integer.parseInt(jenisPelanggaran);
                        System.out.println("pelanggaran : " + pelanggaran[angka - 1]);
                    }

                }
                System.out.print("Kembali ke menu utama(y): ");
                kembali = strTatib.next();
                if (kembali.equalsIgnoreCase("y")) {
                    MenuAdmin();

                }

                break;
            case 5:
                System.out.println("================= Cek Alfa ===============");
                System.out.println("");
                System.out.print("Cari nama mahasiswa: ");
                String namaAlfa = strTatib.next();
                angka = 0;
                if (namaAlfa.equalsIgnoreCase(MahasiswaLogin[indeksMahasiswa][0])) {
                    System.out.println("Data mahasiswa: ");
                    System.out.println("Nama : " + MahasiswaLogin[indeksMahasiswa][0]);
                    System.out.println("NIM  : " + DataMahasiswa[indeksMahasiswa][0]);
                    System.out.println("Kelas: " + DataMahasiswa[indeksMahasiswa][1]);
                    System.out.println("Prodi: " + DataMahasiswa[indeksMahasiswa][2]);
                    System.out.println("Alfa yang ada: " + alfa[indeksMahasiswa]);
                    int jumlahJamTelat = jamTelat * alfa[angka];
                    System.out.println("Total jam kompen: " + jumlahJamTelat);

                }
                System.out.print("Kembali ke menu utama(y): ");
                kembali = strTatib.next();
                if (kembali.equalsIgnoreCase("y")) {
                    MenuAdmin();
                }

                break;
            case 0:
                main(null);
                break;

            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }

    public static boolean loginAdmin() {
        String usernameadm, passwordadm;

        System.out.println("\n<=============== ADMIN ==============>");
        System.out.println("Anda masuk sebagai admin");
        System.out.println("                                  ");
        System.out.print("Masukkan username: ");
        usernameadm = strTatib.next();

        System.out.print("Masukkan Password: ");
        passwordadm = strTatib.next();

        for (int i = 0; i < AdminLogin[0].length; i++) {
            if (usernameadm.equals(AdminLogin[i][0]) && passwordadm.equals(AdminLogin[i][1])) {
                System.out.println("\nSelamat datang, " + usernameadm + " siapakah yang nakal hari ini?\n");
                indeksAdmin = i;
                return true; // Login berhasil
            }
        }

        System.out.println("\nUsername atau password salah. Silakan coba lagi.\n");
        return false; // Login gagal
    }

}
