import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai N = ");
        int N = sc.nextInt();
        
        // Loop to print the top line of asterisks
        for (int i = 1; i <= N; i++) {
            System.out.print("*");
        }
        
        // Loop to print the middle lines of the square
        for (int iOuter = 1; iOuter <= N - 2; iOuter++) {
            System.out.println();
            for (int i = 1; i <= N; i++) {
                System.out.print("*");
            }
        }
        
        // Loop to print the bottom line of asterisks
        System.out.println();
        for (int i = 1; i <= N; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
