import java.util.Scanner;
public class Square16_Modifikasi2 {

    public static void main(String[] args) {

        Scanner sc16 = new Scanner(System.in);

        System.out.print("Masukkan Nilai N = ");
        int N = sc16.nextInt();

        for (int iOuter=1; iOuter<=N; iOuter++) {
            for (int i=0; i<=N; i++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        

    }
    
}
