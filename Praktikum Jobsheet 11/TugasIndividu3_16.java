import java.util.Scanner;

public class TugasIndividu3_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input nilai N
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = sc.nextInt();

        // Mengecek apakah nilai N minimal 3
        if (N < 3) {
            System.out.println("Nilai N harus minimal 3.");
        } else {
            // Mencetak persegi angka
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (i == 1 || i == N || j == 1 || j == N) {
                        System.out.print(N + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}
