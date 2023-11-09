public class TugasKelompok2_16 {
    public static void main(String[] args) {
        int rows = 10; // Jumlah baris

        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
