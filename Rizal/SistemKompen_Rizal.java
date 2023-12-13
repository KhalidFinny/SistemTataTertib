import java.util.Scanner;

public class SistemKompen_Rizal {
    static Scanner sc25 = new Scanner(System.in);
    static String MahasiswaLogin[][] = {
            { "rangga", "khalid", "damar", "austriech", "rizal", null, null, null }, // nama mahasiswa
            { "password1", "password2", "password3", "password4", "password5", null, null, null } // Password mahasiswa
    };
    static String DataMahasiswa[][] = {
            { "2341720001", "2341720002", "2341720003", "2341720004", "2341720005", null, null, null }, // NIM
            { "1C", "1C", "1C", "1C", "1C", null, null, null }, // Kelas
            { "Teknik Informatika", "Teknik Informatika", "Teknik Informatika", "Teknik Informatika",
                    "Teknik Informatika", null, null, null } // Prodi
    };

    static String dataPelanggaran[][] = {
            { null, "terlambat", null, null, null, null, null, null }, // jenis pelanggaran
            { null, "Membantu Admin", null, null, null, null, null, null }, // tugas pelanggaran
            { null, "aktif", null, null, null, null, null, null }//status tugas
    };
    static int waktuPelanggaran[] = { 0, 2, 0, 0, 0, 0, 0, 0 };// jam terlambat

    static String AdminLogin[][] = {
            { "admin1", "admin2", "admin3", "admin4", null, null,  null, null }, // username admin
            { "password1", "password2", "password3", "password4", null, null, null, null }// username admin
    };
    static int indeksMahasiswa = 0;
    
    public static void main(String[] args) {
        String pilihan;
        
            System.out.print("\nAdmin/Mahasiswa :");
            pilihan = sc25.nextLine();

            if (pilihan.equalsIgnoreCase("Mahasiswa")) {
            boolean isLogin = LoginMahasiswa();

                if (isLogin) {
                System.out.println("\nLogin berhasil!");
                MenuMahasiswa();

                } else {
                System.out.println("\nLogin gagal");
                LoginMahasiswa();
                }

            } else if (pilihan.equalsIgnoreCase("Admin")) {

            } else {
            System.out.println("Pilihan tidak valid");
            main(args);
            }
               
    }

    static boolean LoginMahasiswa() {
        System.out.println("\n<================================>");
        System.out.print("Masukkan username: ");
        String inputUsername = sc25.next();
        System.out.print("Masukkan password: ");
        String inputPassword = sc25.next();

        for (int i = 0; i < MahasiswaLogin[0].length; i++) {
            if (inputUsername.equalsIgnoreCase(MahasiswaLogin[0][i]) && inputPassword.equals(MahasiswaLogin[1][i])) {
                indeksMahasiswa=i;
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
                System.out.println("NAMA  : " + MahasiswaLogin[0][indeksMahasiswa]);
                System.out.println("NIM   : " + DataMahasiswa[0][indeksMahasiswa]);
                System.out.println("KELAS : " + DataMahasiswa[1][indeksMahasiswa]);
                System.out.println("PRODI : " + DataMahasiswa[2][indeksMahasiswa]);
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
                if (dataPelanggaran[0][indeksMahasiswa] == null) {
                    System.out.println("tidak ada riwayat pelanggaran");
                } else if (dataPelanggaran[0][indeksMahasiswa].equalsIgnoreCase("terlambat")
                        || dataPelanggaran[0][indeksMahasiswa].equalsIgnoreCase("telat")) {
                    System.out.println("mahasiswa pernah : " + dataPelanggaran[0][indeksMahasiswa]);
                    System.out.println("selama           : " + waktuPelanggaran[indeksMahasiswa] + " jam");
                } else {
                    System.out.println("Mahasiswa Pernah : " + dataPelanggaran[0][indeksMahasiswa]);
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
                if (dataPelanggaran[0][indeksMahasiswa] == null) {
                    System.out.println("tidak ada tugas aktif");
                } else if (dataPelanggaran[2][indeksMahasiswa].equalsIgnoreCase("selesai")) {
                    System.out.println("status tugas : telah selesai");
                } else if (dataPelanggaran[2][indeksMahasiswa].equalsIgnoreCase("aktif")) {
                    System.out.println("pelanggaran  : " + dataPelanggaran[0][indeksMahasiswa]);
                    System.out.println("tugas        : " + dataPelanggaran[1][indeksMahasiswa]);
                    if (dataPelanggaran[0][indeksMahasiswa].equalsIgnoreCase("telat")
                            || dataPelanggaran[0][indeksMahasiswa].equalsIgnoreCase("terlambat")) {
                        System.out.println("lama kompen  : " + waktuPelanggaran[indeksMahasiswa] + " jam");

                    }
                    System.out.println("Status tugas : " + dataPelanggaran[2][indeksMahasiswa]);

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
                System.out.println("|1.  Ganti Password                  |");
                System.out.println("|2.                                  |");
                System.out.println("|3.                                  |");
                System.out.println("|4.                                  |");
                System.out.println("|0.                                  |");
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
                        MahasiswaLogin[1][indeksMahasiswa] = sc25.nextLine();                        
                        System.out.println("\n=======password berhasil diganti=======\n");
                        System.out.println("==> kembali (Y)");
                        opsiKeluar = sc25.nextLine();
                        if (opsiKeluar.equalsIgnoreCase("y")) {
                            MenuMahasiswa();
                        }
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
        int selectMenuADMN;
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
        selectMenuADMN = sc25.nextInt();

        switch (selectMenuADMN) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 0:

                break;

            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }

}
