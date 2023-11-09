import java.util.Scanner;
import java.util.Random;

public class Quiz16_Modifikasi2 {

    public static void main(String[] args) {
        Random random16 = new Random();
        Scanner input16 = new Scanner(System.in);

        char menu;

        do {
            int number = random16.nextInt(10) + 1;
            boolean success = false;

            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input16.nextInt();

                if (answer < number) {
                    System.out.println("Lebih kecil dari jawaban.");
                } else if (answer > number) {
                    System.out.println("Lebih besar dari jawaban.");
                } else {
                    success = true;
                }
            } while (!success);

            System.out.print("Apakah Anda Ingin Mengulang Permintaan (Y/N)? ");
            menu = input16.next().charAt(0);
        } while (menu == 'y' || menu == 'Y');
    }
}
