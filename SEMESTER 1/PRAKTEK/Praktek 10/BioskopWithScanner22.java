import java.util.Scanner;

public class BioskopWithScanner22 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];
        // Membuat objek Scanner
        Scanner scanner = new Scanner(System.in);
        String nama, next; // Declare nama and next variables
        int baris, kolom;  // Declare baris and kolom variables

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = scanner.nextLine(); // Corrected variable name from "sc" to "scanner"
            System.out.print("Masukkan baris: ");
            baris = scanner.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            penonton[baris - 1][kolom - 1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = scanner.nextLine(); // Corrected variable name from "sc" to "scanner"

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }

        // Kode program akan ditulis di sini

        // Menutup Scanner setelah selesai digunakan
        scanner.close();
    }
}
