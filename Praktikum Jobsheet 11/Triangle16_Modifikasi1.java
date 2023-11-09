import java.util.Scanner;
public class Triangle16_Modifikasi1 {

    public static void main(String[] args) {

        Scanner sc16 = new Scanner(System.in);

        System.out.print("Masukkan Nilai N = ");
        int N = sc16.nextInt();
        
        // Perulangan luar untuk mengatur berapa banyak baris segitiga
        for (int i = 1; i <= N; i++) {
            // Perulangan dalam untuk mencetak bintang dalam setiap baris
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Baris baru setelah setiap baris bintang
            System.out.println();
        }
    }
    
}
