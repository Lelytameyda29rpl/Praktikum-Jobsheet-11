import java.util.Scanner;

public class NestedLoop_2341720124_Modifikasi1 {

    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);

        double[][] temps = new double[5][7];

        // Mengumpulkan data suhu harian
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = input16.nextDouble();
            }
            System.out.println();
        }

        // Menampilkan data suhu harian menggunakan foreach
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (double temp : temps[i]) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }
}