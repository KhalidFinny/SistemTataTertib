package cobacoba1;
import java.util.Scanner;
    public class LK {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        System.out.print("Masukan jam yang harus dikerjakan :");
        int Jamtotal = sc08.nextInt();

        System.out.print("Masukkan jumlah jam yang sudah dikerjakan : ");
        int KompensasiJam= sc08.nextInt();

        HitungKompen(Jamtotal, KompensasiJam);
    }

    public static void HitungKompen(int Jamtotal, int KompensasiJam) {
        int JamSisa = Jamtotal;
        int KompenWaktu = 0;

        while (JamSisa >= KompensasiJam) {
            JamSisa -= KompensasiJam;
            KompenWaktu++;
        }

        // Menentukan status jam yang tersisa
        if (JamSisa == 0) {
            System.out.println("Status: Semua jam kompensasi selesai");
        } else if (JamSisa == Jamtotal) {
            System.out.println("Status: Kompensasi belum dimulai.");
        } else {
            System.out.println("status: Kompensasi sedang berlangsung. Jam yang tersisa:" + JamSisa);
        }
    }
}