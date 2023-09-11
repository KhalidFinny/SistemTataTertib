import java.util.Scanner;

//Hanya konsep sementara untuk inspirasi
public class konseppelanggaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Nama Mahasiswa: ");
        number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("Melanggar");
        } else {
            System.out.println("Tidak Melanggar");
        }
    }
}
