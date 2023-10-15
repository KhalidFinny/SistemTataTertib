
import java.util.Scanner;

public class Laporankompen {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        String nama;
        int jam;
        String stts;

        System.out.print("Nama pelanggar: ");
        nama = input18.nextLine();

        nama = "Rizal";

        if (nama.equalsIgnoreCase(nama)) {
            System.out.printf("Apakah %s sedang Kompen? (Y/T) ", nama);
            stts = input18.nextLine();

            if (stts.equalsIgnoreCase("Y")) {
                System.out.print("Berapa lama: ");
                jam = input18.nextInt();

                if (jam >= 2 && jam <= 12) {
                    System.out.printf("%s Status ongoing \n", nama);

                } else if (jam > 12)
                    System.out.printf("%s Status sudah selesai ", nama);
            } else {

                System.out.println("Belum kompen");
            }
            input18.close();
        }
    }
}
