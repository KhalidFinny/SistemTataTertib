
import java.util.Scanner;

public class SistemKompenFix {

    static Scanner sc25 = new Scanner(System.in);
    static Scanner intTatib = new Scanner(System.in);
    static Scanner strTatib = new Scanner(System.in);

    static String MahasiswaLogin[][] = new String[102][2];
    static {
        MahasiswaLogin[0] = new String[] { "rangga", "password1" }; // Data mahasiswa 1
        MahasiswaLogin[1] = new String[] { "khalid", "password2" }; // Data mahasiswa 2
        MahasiswaLogin[2] = new String[] { "damar", "password3" }; // Data mahasiswa 3
        MahasiswaLogin[3] = new String[] { "austriech", "password4" };// Data mahasiswa 4
        MahasiswaLogin[4] = new String[] { "rizal", "password5" }; // Data mahasiswa 4
    }

    static String DataMahasiswa[][] = new String[102][3];
    static {
        DataMahasiswa[0] = new String[] { "2341720001", "1C", "Teknik Informatika" }; // Data mahasiswa 1
        DataMahasiswa[1] = new String[] { "2341720002", "1C", "Teknik Informatika" }; // Data mahasiswa 2
        DataMahasiswa[2] = new String[] { "2341720003", "1C", "Teknik Informatika" }; // Data mahasiswa 3
        DataMahasiswa[3] = new String[] { "2341720004", "1C", "Teknik Informatika" }; // Data mahasiswa 4
        DataMahasiswa[4] = new String[] { "2341720005", "1C", "Teknik Informatika" }; // Data mahasiswa 5
    }

    static String dataPelanggaran[][] = new String[102][8];
    static {
        // Set data untuk contoh lima pelanggaran
        dataPelanggaran[0] = new String[] { "merusak komputer lab", "terlambat", null, null, null, null, null, null };
        dataPelanggaran[1] = new String[] { "mengganti", "Membantu Admin", null, null, null, null, null, null };
        dataPelanggaran[2] = new String[] { "selesai", "selesai", null, null, null, null, null, null };

        dataPelanggaran[3] = new String[] { null, "telat", null, null, null, null, null, null };
        dataPelanggaran[4] = new String[] { null, "membantu admin", null, null, null, null, null, null };
        dataPelanggaran[5] = new String[] { null, "aktif", null, null, null, null, null, null };

        dataPelanggaran[6] = new String[] { null, "alfa", null, null, null, null, null, null };
        dataPelanggaran[7] = new String[] { null, "membantu admin", null, null, null, null, null, null };
        dataPelanggaran[8] = new String[] { null, "aktif", null, null, null, null, null, null };
    }

    static int waktuPelanggaran[][] = new int[102][8];
    static {
        waktuPelanggaran[0] = new int[] { 0, 2, 0, 0, 0, 0, 0, 0 };
        waktuPelanggaran[1] = new int[] { 0, 3, 0, 0, 0, 0, 0, 0 };
        waktuPelanggaran[2] = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
    }

    static int alfa[] = { 1, 10, 50, 104, 205, 0, 0, 0 };
    static int hasilBayar[] = { 0, 0, 0, 0, 0, 0, 0, 0 };

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

    static private String[] listKompen = { // golongan
            "1. Dinonaktifkan (Cuti Akademik/ Terminal) selama dua semester\r\n" + //
                    "2. Diberhentikan sebagai mahasiswa", // golongan I // V
            "1. Anda harus melakukan penggantian kerugian \r\n" + //
                    "2. Anda harus melakukan tugas pelayanan sosial\r\n" + //
                    "3. Anda akan dikenakan nilai D pada matkul terkait", // golongan II
            "1. Membuat surat pernyataan menggunakan materai dan di TTD anda dan dosen DPA\r\n" + //
                    "2. Melakukan tugas khusus", // golongan III
            "Anda mendapatkan teguran  dan harus membuat surat pernyataan tidak mengulangi perbuatan\r\n " + //
                    "dengan menggunakan materai dan di TTD anda dan Dosen DPA", // golongan // IV
            "Anda mendapatkan teguran lisan dan harus membuat surat pernyataan tidak mengulangi perbuatan dengan\r\n" + //
                    "menggunakan materai dan di TTD anda dan Dosen DPA" // golongan V

    };

    static private String[] ListKompenJam = {
            "Membantu admin ",
            "Membeli kertas A4 1 Rim",
            "Menginput nilai ujian",
            "Membuat banner kampus untuk event",
            "Membantu teknisi dalam melakukan tugas",
    };
    static int jumlahJam[] = new int[100];

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
        System.out.print("Masukkan pilihan: ");
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
            System.out.println("**Program selesai**");
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
                MenuMahasiswa();
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
                } else {
                    ruangTungguMahasiswa();
                }
                break;

            case 2:
                System.out.println("\n======================================");
                System.out.println("==========RIWAYAT PELANGGARAN=========");
                System.out.println("======================================");

                int totalPelanggaran = 0;
                int HitungSmntr = 0;
                for (int i = 0; i < dataPelanggaran.length; i += 3) {
                    if (dataPelanggaran[i][indeksMahasiswa] != null) {
                        totalPelanggaran++;
                    }
                }

                if (totalPelanggaran > 0) {
                    System.out.println("Riwayat Pelanggaran Mahasiswa " + MahasiswaLogin[indeksMahasiswa][0] + ":");

                    for (int i = 0, j = 0, q = 2; i < dataPelanggaran.length; i += 3) {
                        if (dataPelanggaran[i][indeksMahasiswa] != null) {
                            System.out.println(
                                    "\nPelanggaran ke-" + ((i / 3) + 1) + ": " + dataPelanggaran[i][indeksMahasiswa]);

                            if (dataPelanggaran[i][indeksMahasiswa].equalsIgnoreCase("terlambat")
                                    || dataPelanggaran[i][indeksMahasiswa].equalsIgnoreCase("telat")) {
                                System.out
                                        .println("Jam Terlambat: " + waktuPelanggaran[j][indeksMahasiswa] + " jam");
                                if (dataPelanggaran[q][indeksMahasiswa].equalsIgnoreCase("aktif")) {
                                    HitungSmntr += waktuPelanggaran[j][indeksMahasiswa];
                                }
                                j++;
                            }
                            if (dataPelanggaran[i][indeksMahasiswa].equalsIgnoreCase("alfa")) {
                                System.out.println("Jam alfa: " + alfa[indeksMahasiswa] + " jam");
                                if (dataPelanggaran[q][indeksMahasiswa].equalsIgnoreCase("aktif")) {
                                    HitungSmntr += alfa[indeksMahasiswa];
                                }
                                j++;
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
                } else {
                    ruangTungguMahasiswa();
                }
                break;

            case 3:
                System.out.println("\n======================================");
                System.out.println("==============STATUS TUGAS============");
                System.out.println("======================================");

                boolean riwayatTugas = false; // Flag untuk mengecek apakah ada riwayat tugas
                int nilaiSementara = 0;

                for (int i = 0, j = 0, k = 1, l = 2, m = 0; i < dataPelanggaran.length; i += 3, j++, m++) {
                    if (dataPelanggaran[i][indeksMahasiswa] != null) {
                        System.out.println("Pelanggaran ke-" + (j + 1) + ": " + dataPelanggaran[i][indeksMahasiswa]);
                        System.out.println("Status: " + dataPelanggaran[l][indeksMahasiswa]);

                        if (dataPelanggaran[i][indeksMahasiswa].equalsIgnoreCase("telat")
                                || dataPelanggaran[i][indeksMahasiswa].equalsIgnoreCase("terlambat")) {
                            if (dataPelanggaran[l][indeksMahasiswa].equalsIgnoreCase("aktif")) {
                                nilaiSementara += waktuPelanggaran[m][indeksMahasiswa];

                            }
                        }
                        if (dataPelanggaran[i][indeksMahasiswa].equalsIgnoreCase("alfa")) {
                            if (dataPelanggaran[l][indeksMahasiswa].equalsIgnoreCase("aktif")) {
                                nilaiSementara += alfa[indeksMahasiswa];
                            }
                        }
                        // Cek apakah pelanggaran termasuk telat atau terlambat
                        if (dataPelanggaran[i][indeksMahasiswa].equalsIgnoreCase(ListKompenJam[indeksMahasiswa])) {
                            System.out.println("Jam Terlambat: " + jumlahJam[indeksMahasiswa] + " jam");
                            System.out.println("Tugas: " + listKompen[indeksMahasiswa]);

                        }

                        System.out.println(); // Baris kosong antara pelanggaran
                        riwayatTugas = true; // Set flag menjadi true karena ada riwayat tugas
                    }

                    k += 3;
                    l += 3;
                }

                System.out.println("total jam terlambat / alfa : " + jumlahJam[indeksMahasiswa] + " jam");
                // Menampilkan pesan jika mahasiswa tidak memiliki riwayat pelanggaran
                if (!riwayatTugas) {
                    System.out.println("Mahasiswa tidak memiliki riwayat pelanggaran.");
                }

                System.out.println("\n==> kembali : (Y)");
                choiceMHS = sc25.nextLine();
                if (choiceMHS.equalsIgnoreCase("y")) {
                    MenuMahasiswa();
                } else {
                    ruangTungguMahasiswa();
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
                        } else {
                            ruangTungguMahasiswa();
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

    static int jumlahBayar = 0;

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
                boolean loop = true;
                while (loop) {
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
                            System.out.println("Prodi: " + DataMahasiswa[indeksMahasiswa][2] + "\n");
                            found = true;
                            if (dataPelanggaran[0][indeksMahasiswa] == null) {
                                System.out.println("tidak ada riwayat pelanggaran ");
                            } else {
                                for (int i = 0; i < dataPelanggaran[0].length; i += 3) {
                                    if (dataPelanggaran[i][indeksMahasiswa] != null) {
                                        System.out
                                                .println("Pelanggaran Mahasiswa : "
                                                        + dataPelanggaran[i][indeksMahasiswa]);
                                    }
                                }
                            }
                            System.out.println("\n=====================");
                            System.out.println("1. edit pelanggaran");
                            System.out.println("2. Tambah pelanggaran");
                            System.out.print("pilih menu : ");
                            pilih = sc25.nextInt();
                            sc25.nextLine();
                            switch (pilih) {
                                case 1:
                                    int choicePelanggaran = 0;
                                    System.out.println("\n====================");
                                    System.out.println("1. edit status tugas");
                                    System.out.println("2. bayar kerja kompen");
                                    System.out.print("\npilih menu : ");
                                    choicePelanggaran = sc25.nextInt();
                                    sc25.nextLine();

                                    switch (choicePelanggaran) {
                                        case 1:
                                            boolean EditStatus = false;
                                            int penghitung = 0;
                                            int jumlahLama = 0;
                                            System.out.println("\n===========================");
                                            System.out.println("=====Edit status tugas=====");
                                            System.out.println("===========================\n");

                                            for (int i = 0, j = 0, l = 2,
                                                    m = 1; i < dataPelanggaran.length; i += 3, l += 3, m += 3) {
                                                if (dataPelanggaran[i][indeksMahasiswa] == null) {

                                                    found = true;
                                                } else {
                                                    System.out.println("pelanggaran ke-" + (j + 1) + " "
                                                            + dataPelanggaran[i][indeksMahasiswa]);
                                                    if (dataPelanggaran[i][indeksMahasiswa].equalsIgnoreCase("telat")
                                                            || dataPelanggaran[i][indeksMahasiswa]
                                                                    .equalsIgnoreCase("terlambat")) {
                                                        penghitung += waktuPelanggaran[j][indeksMahasiswa];
                                                        jumlahLama = i;
                                                        System.out.println(
                                                                "Lama terlambat : "
                                                                        + waktuPelanggaran[j][indeksMahasiswa]
                                                                        + " jam");
                                                    }
                                                    if (dataPelanggaran[i][indeksMahasiswa].equalsIgnoreCase("alfa")) {
                                                        penghitung += alfa[indeksMahasiswa];
                                                        System.out.println(
                                                                "Lama terlambat : " + alfa[indeksMahasiswa] + " jam");
                                                    }
                                                    System.out.println(
                                                            "Status : " + dataPelanggaran[l][indeksMahasiswa] + "\n");
                                                    j++;
                                                    EditStatus = true;
                                                }
                                            }
                                            if (dataPelanggaran[jumlahLama][indeksMahasiswa].equalsIgnoreCase("telat")
                                                    || dataPelanggaran[jumlahLama][indeksMahasiswa]
                                                            .equalsIgnoreCase("terlambat")) {
                                                System.out.println("total lama terlambat : " + penghitung * 2);
                                            }
                                            if (EditStatus) {
                                                int Pilihedit = 0;
                                                System.out.println("pilih Status pelanggaran untuk di edit ");
                                                Pilihedit = sc25.nextInt();
                                                sc25.nextLine();

                                                editStatusPelanggaran(Pilihedit, indeksMahasiswa, dataPelanggaran);

                                                System.out.println("Kembali ke menu : (y)");
                                                String milih = sc25.next();
                                                if (milih.equalsIgnoreCase("y")) {
                                                    MenuAdmin();
                                                } else {
                                                    ruangTungguAdmin();
                                                }
                                            }

                                            break;
                                        case 2:
                                            System.out.println("\n===========================");
                                            System.out.println("======== Bayar kompen =======");
                                            System.out.println("===========================\n");

                                            System.out.println("Selamat datang di bayar kompen");
                                            System.out.println();
                                            System.out.println("Jenis Pelanggaran: " + jenisPelanggaran);
                                            System.out.println("Total jam kompen: " + jumlahJam[indeksMahasiswa]);
                                            System.out
                                                    .println("===================Kompen telat=======================");
                                            System.out.println(" ");
                                            System.out.println("1. " + ListKompenJam[0]);
                                            System.out.println("2. " + ListKompenJam[1]);
                                            System.out.println("3. " + ListKompenJam[2]);
                                            System.out.println("4. " + ListKompenJam[3]);
                                            System.out.println("5. " + ListKompenJam[4]);
                                            System.out.println(
                                                    "=========================================================");

                                            System.out.print("Pilih tugas kompen: ");
                                            int tugasIndex = Integer.parseInt(strTatib.next());

                                            if (tugasIndex >= 1 && tugasIndex <= 5) {
                                                System.out.println(" ");
                                                System.out.println("Tugas: " + ListKompenJam[tugasIndex - 1]);

                                                System.out.print("Berapa jam yang akan dibayar:");
                                                int bayar = sc25.nextInt();
                                                sc25.nextLine();
                                                jumlahJam[indeksMahasiswa] = jumlahJam[indeksMahasiswa] - bayar;
                                                if (jumlahJam[indeksMahasiswa] > 0) {
                                                    System.out.println(
                                                            "\nSisa kompen yang harus dibayar:"
                                                                    + jumlahJam[indeksMahasiswa]);
                                                } else if (jumlahJam[indeksMahasiswa] == 0) {
                                                    System.out.println("Kompen sudah lunas");
                                                } else {
                                                    System.out.println("Kompen belum lunas");
                                                }
                                                System.out.println("Kembali ke menu : (y)");
                                                String milih = sc25.nextLine();
                                                if (milih.equalsIgnoreCase("y")) {
                                                    MenuAdmin();
                                                } else {
                                                    ruangTungguAdmin();
                                                }
                                                break;
                                            }
                                        default:
                                            break;
                                    }
                                    break;
                                case 2:
                                    System.out.println(" ");
                                    System.out.println(
                                            "==================================================================================================================================");
                                    System.out.println(
                                            "====================================================== Tambah Pelanggaran mahasiswa ==============================================");
                                    System.out.println(
                                            "==================================================================================================================================");

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
                                        System.out.println("Hukuman Golongan I");
                                        System.out.println(listKompen[0]);
                                    } else if (jenisPelanggaran.equals("2")) {
                                        System.out.println("| " + pelanggaran[1]
                                                + " (II)                                                                    |");
                                        System.out.println("Hukuman Golongan II");
                                        System.out.println(listKompen[1]);
                                    } else if (jenisPelanggaran.equals("3")) {
                                        System.out.println("| " + pelanggaran[2]
                                                + " (III)                                                                                 |");
                                        System.out.println("Hukuman Golongan III");
                                        System.out.println(listKompen[2]);

                                    } else if (jenisPelanggaran.equals("4")) {
                                        System.out.println("| " + pelanggaran[3]
                                                + " (IV)                                                        |");
                                        System.out.println("Hukuman Golongan IV");
                                        System.out.println(listKompen[3]);

                                    } else if (jenisPelanggaran.equals("5")) {
                                        System.out.println("| " + pelanggaran[4] + " (V) |");
                                        System.out.println("Hukuman Golongan V");
                                        System.out.println(listKompen[4]);

                                    } else if (jenisPelanggaran.equals("6")) {
                                        jamTelat = 0;
                                        System.out.println(" ");
                                        System.out.println("===========================");
                                        System.out.println("| " + pelanggaran[5] + " |");
                                        System.out.print("Berapa jam: ");
                                        jamTelat = intTatib.nextInt();

                                        boolean updated = false;
                                        for (int i = 0; i < waktuPelanggaran.length;) {
                                            for (int j = 0; j < waktuPelanggaran[i].length; j++) {
                                                if (waktuPelanggaran[i][j] == 0) {
                                                    waktuPelanggaran[i][j] = jamTelat + alfa[i];
                                                    updated = true;
                                                    break;
                                                }
                                            }
                                            if (updated) {
                                                break;
                                            }

                                            if (updated) {
                                                System.out.println("Jam kompen telah diupdate");
                                            }
                                        }

                                    }
                                    System.out.print("Konfirmasi pelanggaran? (y/n): ");
                                    String cetak = strTatib.next();

                                    if (cetak.equalsIgnoreCase("y")) {

                                        angka = Integer.parseInt(jenisPelanggaran);
                                        int jumlahPelanggaran = 0;
                                        for (int i = 0; i < dataPelanggaran.length; i += 3) {
                                            if (dataPelanggaran[i][indeksMahasiswa] != null) {
                                                jumlahPelanggaran += i;
                                            }
                                        }
                                        for (int i = 0, j = 2; i < jumlahPelanggaran + 4; i += 3, j += 3) {

                                            if (dataPelanggaran[i][indeksMahasiswa] == null) {
                                                dataPelanggaran[i][indeksMahasiswa] = pelanggaran[angka - 1];
                                                dataPelanggaran[j][indeksMahasiswa] = "aktif";
                                            }

                                        }
                                        System.out.println("\n---------------------------------");
                                        System.out.println("|     Pelanggaran Ditambahkan!     |");
                                        System.out.println("---------------------------------\n");

                                        System.out.println("Data Mahasiswa:");
                                        System.out.println("╭─────────────────────────────╮");
                                        System.out.println(
                                                "│ Nama  : " + MahasiswaLogin[indeksMahasiswa][0] + "              │");
                                        System.out.println(
                                                "│ NIM   : " + DataMahasiswa[indeksMahasiswa][0] + "          │");
                                        System.out.println("│ Kelas : " + DataMahasiswa[indeksMahasiswa][1]
                                                + "                  │");
                                        System.out.println("│ Prodi : " + DataMahasiswa[indeksMahasiswa][2] + "  │");
                                        System.out.println("│ Jenis Pelanggaran: " + jenisPelanggaran + "        │");
                                        System.out.println("╰─────────────────────────────╯");

                                        if (jenisPelanggaran.equals("6")) {

                                            angka = Integer.parseInt(jenisPelanggaran);
                                            int jumlahJamTelat = (jamTelat + alfa[indeksMahasiswa]);
                                            jumlahJam[indeksMahasiswa] = jumlahJamTelat * 2;
                                            System.out.println("╠══════════════════════════════╣");
                                            System.out.println("║ Pelanggaran: " + pelanggaran[5]);
                                            System.out.println("║ Durasi Telat: " + jamTelat + " jam");
                                            System.out.println(
                                                    "║ Jumlah Jam Kompen: " + jumlahJam[indeksMahasiswa] + " jam");
                                            System.out.println("╚══════════════════════════════╝");

                                        } else if (jenisPelanggaran.matches("[1-5]")) {
                                            angka = Integer.parseInt(jenisPelanggaran);
                                            System.out.println("\nPelanggaran: " + pelanggaran[angka - 1]);
                                            System.out.println("Hukuman: \n" + listKompen[indeksMahasiswa]);
                                            found = true;

                                        } else {
                                            System.out.println("Data tidak ditambahkan!");
                                        }
                                        for (int i = 0, j = 2; i < jumlahPelanggaran + 4; i += 3, j += 3) {

                                            if (dataPelanggaran[i][indeksMahasiswa] == null) {
                                                dataPelanggaran[i][indeksMahasiswa] = pelanggaran[angka - 1];
                                                dataPelanggaran[j][indeksMahasiswa] = "aktif";
                                            }

                                            if (!found) {
                                                System.out.println(
                                                        "Mahasiswa dengan nama '" + pelanggar + "' tidak ditemukan.");
                                                System.out.println(MahasiswaLogin[k][0]);
                                            }

                                            System.out.println("\n-------------------------------");
                                            System.out.print(" Kembali ke Menu? (y/n): ");
                                            String choice = sc25.next();
                                            if (choice.equalsIgnoreCase("n")) {
                                                loop = true;
                                            } else {
                                                MenuAdmin();

                                            }
                                        }
                                    }
                            }
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

                } else {
                    ruangTungguAdmin();
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

                } else {
                    ruangTungguAdmin();
                }

                break;
            case 4:
                System.out.println("=================Data History Pelanggaran =====================");
                System.out.println("");
                System.out.print("Cari nama mahasiswa : ");
                String pelanggar = strTatib.next();

                angka = 0;
                if (pelanggar.equalsIgnoreCase(MahasiswaLogin[indeksMahasiswa][0])) {
                    System.out.println("Data mahasiswa: ");
                    System.out.println("Nama : " + MahasiswaLogin[indeksMahasiswa][0]);
                    System.out.println("NIM  : " + DataMahasiswa[indeksMahasiswa][0]);
                    System.out.println("Kelas: " + DataMahasiswa[indeksMahasiswa][1]);
                    System.out.println("Prodi: " + DataMahasiswa[indeksMahasiswa][2]);
                    int totalPelanggaran = 0;

                    for (int i = 0; i < dataPelanggaran.length; i += 3) {
                        if (dataPelanggaran[i][indeksMahasiswa] != null) {
                            totalPelanggaran++;
                        }
                    }

                    if (totalPelanggaran > 0) {

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
                                "Mahasiswa " + MahasiswaLogin[indeksMahasiswa][0]
                                        + " tidak memiliki riwayat pelanggaran.");
                    }

                }
                System.out.print("Kembali ke menu utama(y): ");
                kembali = strTatib.next();
                if (kembali.equalsIgnoreCase("y")) {
                    MenuAdmin();

                } else {
                    ruangTungguAdmin();
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
                    System.out.println("Total jam kompen: " + jumlahJam[indeksMahasiswa] + " jam");

                } else {
                    System.out.println("data tidak ditemukan");
                }
                System.out.print("Kembali ke menu utama(y): ");
                kembali = strTatib.next();
                if (kembali.equalsIgnoreCase("y")) {
                    MenuAdmin();
                } else {
                    ruangTungguAdmin();
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

    static void ruangTungguAdmin() {
        System.out.println("     __");
        System.out.println("    /  \\");
        System.out.println("   /    \\");
        System.out.println("  /      \\");
        System.out.println(" /        \\");
        System.out.println("/__________\\");
        System.out.println("|  Ruang   |");
        System.out.println("|          |");
        System.out.println("|  tunggu  |");
        System.out.println("|__________|");
        System.out.println("ulang : (Y)");
        String kembali = sc25.nextLine();

        if (kembali.equalsIgnoreCase("y")) {
            MenuAdmin();
        } else {
            ruangTungguAdmin();
        }
    }

    static void ruangTungguMahasiswa() {
        System.out.println("     __");
        System.out.println("    /  \\");
        System.out.println("   /    \\");
        System.out.println("  /      \\");
        System.out.println(" /        \\");
        System.out.println("/__________\\");
        System.out.println("|  Ruang   |");
        System.out.println("|          |");
        System.out.println("|  tunggu  |");
        System.out.println("|__________|");
        System.out.println("ulang : (Y)");
        String kembali = sc25.nextLine();

        if (kembali.equalsIgnoreCase("y")) {
            MenuMahasiswa();
        } else {
            ruangTungguMahasiswa();
        }
    }

    static void editStatusPelanggaran(int pilihEdit, int indeksMahasiswa, String[][] dataPelanggaran) {
        int dataIndex = 2 + (pilihEdit - 1) * 3; // Menghitung indeks dataPelanggaran yang akan diubah

        if (dataIndex < dataPelanggaran.length) {
            System.out.print("Status menjadi: ");
            dataPelanggaran[dataIndex][indeksMahasiswa] = sc25.nextLine();
        } else {
            System.out.println("Riwayat pelanggaran tidak tersedia");
        }
    }

    static void tambahPelanggaran(int indeksMahasiswa, int angka, String[][] dataPelanggaran, String[] pelanggaran) {
        int dataIndex;

        if (angka >= 1 && angka <= 5) {
            dataIndex = (angka - 1) * 3;
        } else {
            dataIndex = -1;
        }
        if (dataIndex >= 0 && dataIndex < dataPelanggaran.length) {
            if (dataPelanggaran[dataIndex][indeksMahasiswa] == null) {
                dataPelanggaran[dataIndex][indeksMahasiswa] = pelanggaran[angka - 1];
            }
        }
    }

}