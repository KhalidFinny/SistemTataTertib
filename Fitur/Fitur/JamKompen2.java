package cobacoba1;

import java.util.Scanner;

public class JamKompen2 {
    public static void main(String[] args) {
    
   Scanner sc08 = new Scanner(System.in);
        int[][] Pelanggar = new int[8][2];

        System.out.println("Masukan angka pelanggaran setiap tingkat:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Semester " + (i + 1) + ": ");
            Pelanggar[i][0] = sc08.nextInt();
        }

        System.out.println("\nJam Kompensasi:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Pengganti Semester" + (i + 1) + ": ");
            Pelanggar[i][1] = sc08.nextInt();
        }

        System.out.println("\nData Pelanggar:");
        for (int i = 0; i < 8; i++) {
            int totaljamPelanggar = Pelanggar[i][0] * Pelanggar[i][1];
            System.out.println("Semester " + (i + 1) + ": " + Pelanggar[i][0] + " Pelanggaran, " + totaljamPelanggar + " Jam Kompensasi");
        }
    }
}
