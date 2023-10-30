import java.util.Scanner;

public class BioskopWithScanner22Pertanyaan3 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];
        Scanner scanner = new Scanner(System.in);
        String nama, next;
        int baris, kolom;

        while (true) {
            System.out.print("Masukkan Nama : ");
            nama = scanner.nextLine();
            System.out.print("Masukkan Baris : ");
            baris = scanner.nextInt();
            System.out.print("Masukkan Kolom : ");
            kolom = scanner.nextInt();
            scanner.nextLine(); // Membuang karakter newline

            if (isValidSeat(penonton, baris, kolom)) {
                if (penonton[baris - 1][kolom - 1] == null) {
                    penonton[baris - 1][kolom - 1] = nama;
                } else {
                    System.out.println("Maaf, kursi tersebut sudah terisi. Silakan pilih kursi lain.");
                }
            } else {
                System.out.println("Kursi tidak tersedia atau tidak valid. Silakan coba lagi.");
            }

            System.out.print("Input penonton lainnya ? (y/n) : ");
            next = scanner.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
        
        // Menutup Scanner setelah selesai digunakan
        scanner.close();
    }

    // Fungsi isValidSeat harus didefinisikan sesuai kebutuhan
    public static boolean isValidSeat(String[][] penonton, int baris, int kolom) {
        // Implementasikan pemeriksaan validitas kursi di sini
        return true;
    }
}
