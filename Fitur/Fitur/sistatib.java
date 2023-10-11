package Fitur;

import java.util.Scanner;

public class sistatib {

    public static void main(String[] args) {
        Scanner tatib = new Scanner(System.in);
        
        String nama, kelas, pelanggaran, prodi, jurusan, message;
        int nim, point, pointsblm, pointssdh;
        pointsblm = 0;

        System.out.println("*****Silahkan masukkan data mahasiswa yang melanggar*****");
        System.out.println("                                                          ");
       
        System.out.print("Masukkan Nama Mahasiswa : ");
        nama = tatib.nextLine();

        System.out.print("Masukkan Kelas : ");
        kelas = tatib.nextLine();

        System.out.print("Masukkan NIM : ");
        nim = tatib.nextInt();
        tatib.nextLine();

        System.out.print("Masukkan Asal Prodi : ");
        prodi = tatib.nextLine();

        System.out.print("Masukkan Asal Jurusan : ");
        jurusan = tatib.nextLine();

        System.out.print("Masukkan Jenis Pelanggaran : ");
        pelanggaran = tatib.nextLine();

        System.out.print("Masukkan Point yang Diterima : ");
        point = tatib.nextInt();
        tatib.close();

        pointssdh = point + pointsblm;

        if (point > 0 && point <= 10) {
            message = "Selamat anda hanya mendapatkan kompensasi";
        } else if (point > 10 && point <= 20) {
            message = "Sayangnya anda mendapatkan hukuman kecil";
        } else if (point > 20 && point <= 30) {
            message = "Sayangnya anda mendapatkan hukuman BESAR";
        } else if (point > 30 && point <= 40) {
            message = "Sayang sekali anda mendapatkan hukuman BERAT";
        } else {
            message = "Waah dikeluarkan, better luck next time";
        }

        System.out.println("Nama        : " + nama);
        System.out.println("Kelas       : " + kelas);
        System.out.println("NIM         : " + nim);
        System.out.println("Prodi       : " + prodi);
        System.out.println("Jurusan     : " + jurusan);
        System.out.println("Pelanggaran : " + pelanggaran);
        System.out.println("Point       : " + pointssdh);
        System.out.println(message);
    }
}
