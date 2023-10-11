package Fitur;

import java.util.Scanner;

public class multipengguna {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);

        String pengguna,unameAdmin1,unameAdmin2,unameMhs,unameMhs1,unameMhs2,unameMhs3,
               pwordAdmin1,pwordAdmin2,pwordMhs,pwordMhs1,pwordMhs2,pwordMhs3;
        boolean isPengguna = false;
        
            System.out.println("login sebagai (Mahasiswa/Admin) :");
            pengguna = sc25.nextLine();
            if (pengguna.equalsIgnoreCase("mahasiswa")) {
                System.out.println("-----Anda login sebagai mahasiswa-----\n");
                
                System.out.print(" masukkan username mahasiswa : ");
                unameMhs = sc25.nextLine();
                System.out.print(" masukkan password mahasiswa : ");
                pwordMhs = sc25.nextLine();
                
                if (unameMhs.equalsIgnoreCase("agil")&&pwordMhs.equalsIgnoreCase("agilganteng")) {
                    System.out.println("selamat "+unameMhs+" telah berhasil login");
                    isPengguna = true;
                }
                if (unameMhs.equalsIgnoreCase("zeva")&&pwordMhs.equalsIgnoreCase("zevaganteng")) {
                    System.out.println("selamat "+unameMhs+" telah berhasil login");
                    isPengguna = true;
                }
                if (unameMhs.equalsIgnoreCase("jidan")&&pwordMhs.equalsIgnoreCase("jidanganteng")) {
                    System.out.println("selamat "+unameMhs+" telah berhasil login");
                    isPengguna = true;
                }
                if (!isPengguna){
                    System.out.println("password atau username salah ");
                }//else {
                    //System.out.println("username atau password");
                

            }    
            if (pengguna.equalsIgnoreCase("Admin")){
                System.out.println("-----Anda login sebagai Admin-----\n");
            }

            
         

    }
    
}
