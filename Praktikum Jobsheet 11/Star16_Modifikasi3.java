import java.util.Scanner;
public class Star16_Modifikasi3 {

    public static void main(String[] args) {

        Scanner sc16 = new Scanner(System.in);

        System.out.print("Masukkan Nilai N = ");
        int N = sc16.nextInt();

        for (int i=1; i<=N; i--) {
            System.out.print("*");
        }
    }
    
}
