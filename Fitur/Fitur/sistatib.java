import java.util.Scanner;

public class sistatib {

    public static void main(String[] args) {
        Scanner strtatib = new Scanner(System.in);
        Scanner intgtatib = new Scanner(System.in);

        int jumlahPelanggar;

        System.out.println("*****Silahkan masukkan data mahasiswa yang melanggar*****");
        System.out.println("                                                          ");

        System.out.print("Masukkan banyak pelanggar: ");
        jumlahPelanggar = intgtatib.nextInt();

        String nama[] = new String[jumlahPelanggar];
        String kelas[] = new String[jumlahPelanggar];
        String nim[] = new String[jumlahPelanggar];
        String jurusan[] = new String[jumlahPelanggar];
        String prodi[] = new String[jumlahPelanggar];
        String pelanggaran[] = new String[jumlahPelanggar];
        String tingkat[] = new String[jumlahPelanggar];
        int jam[] = new int[jumlahPelanggar];

        for (int i = 0; i < jumlahPelanggar; i++) {

            System.out.println("Pelanggar ke- " + (i + 1));

            System.out.print("Nama        : ");
            nama[i] = strtatib.next();

            System.out.print("Kelas       : ");
            kelas[i] = strtatib.next();

            System.out.print("NIM         : ");
            nim[i] = strtatib.next();

            System.out.print("Prodi       : ");
            prodi[i] = strtatib.next();

            System.out.print("Jurusan     : ");
            jurusan[i] = strtatib.next();

            System.out.print("Pelanggaran : ");
            pelanggaran[i] = strtatib.next();

            if (pelanggaran[i].equalsIgnoreCase("Telat")) {

                System.out.print("Berapa jam? ");
                jam[i] = intgtatib.nextInt();

            } else {
                System.out.print("Tingkat  : ");
                tingkat[i] = strtatib.next();
            }

            System.out.println("Apakah ingin dicetak? (y/n)");
            String pemilihan = strtatib.next();

            if (pemilihan.equalsIgnoreCase("Y")) {
                System.out.println("Data telah ditambahkan!");
                System.out.println("                       ");
                System.out.println("Pelanggar ke- " + (i + 1));
                System.out.println("Nama        : " + nama[i]);
                System.out.println("kelas       : " + kelas[i]);
                System.out.println("NIM         : " + nim[i]);
                System.out.println("Prodi       : " + prodi[i]);
                System.out.println("Jurusan     : " + jurusan[i]);
                System.out.println("Pelanggaran : " + pelanggaran[i]);

                if (pelanggaran[i].equalsIgnoreCase("Telat")) {
                    System.out.println("Berapa jam : " + jam[i]);
                } else {
                    System.out.println("Tingkat berapa: " + tingkat[i]);

                    if (tingkat[i].equalsIgnoreCase("V") || tingkat[i].equalsIgnoreCase("5")) {
                        System.out.println("Anda mendapatkan teguran lisan dan harus membuat surat pernyataan tidak mengulangi perbuatan\r\n" + //
                                "menggunakan materai dan di TTD anda dan Dosen DPA\r\n");

                    } else if (tingkat[i].equalsIgnoreCase("IV") || tingkat[i].equalsIgnoreCase("4")) {
                        System.out.println("Anda mendapatkan teguran  dan harus membuat surat pernyataan tidak mengulangi perbuatan\r\n" + //
                                "menggunakan materai dan di TTD anda dan Dosen DPA\r\n");

                    } else if (tingkat[i].equalsIgnoreCase("III") || tingkat[i].equalsIgnoreCase("3")) {
                        System.out.println("1. Membuat surat pernyataan menggunakan materai dan di TTD anda dan dosen DPA\r\n" + //
                                "2. Melakukan tugas khusus\r\n");

                    } else if (tingkat[i].equalsIgnoreCase("II") || tingkat[i].equalsIgnoreCase("2")) {
                        System.out.println("1. Anda harus melakukan penggantian kerugian \r\n" + //
                                "2. Anda harus melakukan tugas pelayanan sosial\r\n" + //
                                "3. Anda akan dikenakan nilai D pada matkul terkait");
                    }
                }
            } else {
                System.out.println("Data telah ditambahkan!");
                break;
            }
        }
        strtatib.close();
        intgtatib.close();
    }
}
