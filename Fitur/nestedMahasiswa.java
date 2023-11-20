

import java.util.Scanner;

public class nestedMahasiswa {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);

        String[][] dataMahasiswa;
        String nama, nim;
        int jumlahData,izin, alfa, sakit;
        int[][] tidakMasuk;

        System.out.println("---------------------------------");
        System.out.print("Masukkan jumlah data mahasiswa : ");
        jumlahData = sc25.nextInt();
        sc25.nextLine(); 

        dataMahasiswa = new String[jumlahData][2];
        tidakMasuk = new int[jumlahData][3];

        for (int i = 0; i < jumlahData; i++) {
            System.out.print("\nMasukkan nama mahasiswa ke-"+(i+1)+" : ");
            nama = sc25.nextLine();

            System.out.print("Masukkan NIM mahasiswake-"+(i+1)+" : ");
            nim = sc25.nextLine();

            dataMahasiswa[i][0] = nama;
            dataMahasiswa[i][1] = nim;
        }

        // Menampilkan output nama dan nim yang disimpan di dalam array
        
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("\nNama: " + dataMahasiswa[i][0]);
            System.out.println("NIM : " + dataMahasiswa[i][1]);
            System.out.println("--------------");

            for (int j = 0; j < 1; j++) {
                System.out.print("masukkan total izin mahasiswa : ");
                izin = sc25.nextInt();
                System.out.print("masukkan total alfa mahasiswa : ");
                alfa = sc25.nextInt();
                System.out.print("masukkan total sakit mahasiswa : ");
                sakit = sc25.nextInt();

                tidakMasuk[i][0]=izin;
                tidakMasuk[i][1]=alfa;
                tidakMasuk[i][2]=sakit;
            }
        }
            System.out.println("\nData Mahasiswa yang Disimpan:");
            for (int i = 0; i < jumlahData; i++) {
            System.out.println("Nama: " + dataMahasiswa[i][0]);
            System.out.println("NIM : " + dataMahasiswa[i][1]);
            System.out.println("Izin : "+ tidakMasuk[i][0]);
            System.out.println("Alfa : "+ tidakMasuk[i][1]);
            System.out.println("Sakit : "+ tidakMasuk[i][2]);
            System.out.println("--------------");
        }
    }
}
