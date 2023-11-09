import java.util.Scanner;
public class Triangle16 {

    public static void main(String[] args) {

        Scanner sc16 = new Scanner(System.in);

        System.out.print("Masukkan Nilai N = ");
        int N = sc16.nextInt();
        int i = 0;
        while (i<=N) {
            int j = 0;
            while (j<i) {
                System.out.print("*");
                j++;
            }

            i++;
        }
    }
    
}
