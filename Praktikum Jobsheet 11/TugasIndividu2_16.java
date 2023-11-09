import java.util.Scanner;

public class TugasIndividu2_16{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input nilai N
        System.out.print("Masukkan nilai N (minimal 5): ");
        int N = sc.nextInt();

        // Mengecek apakah nilai N minimal 5
        if (N < 5) {
            System.out.println("Nilai N harus minimal 5.");
        } else {
            // Mencetak segitiga bintang
            for (int i = N; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
