import java.util.Scanner;
public class Square16_Modifikasi1 {

    public static void main(String[] args) {

        Scanner sc16 = new Scanner(System.in);

        System.out.print("Masukkan Nilai N = ");
        int N = sc16.nextInt();

        for (int iOuter=0; iOuter<=N; iOuter++) {
            for (int i=1; i<=N; i++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        

    }
    
}
