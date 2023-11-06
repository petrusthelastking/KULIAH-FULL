import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai N = ");
        int N = sc.nextInt();
        int i = 1; // Mulai dari baris pertama

        while (i <= N) {
            int j = 1; // Mulai dari kolom pertama
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // Baris baru setelah setiap baris bintang
            i++;
        }
    }
}
