import java.util.Scanner;

public class BioskopWithScanner22Pertanyaan2 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];
        Scanner scanner = new Scanner(System.in);
        String nama, next;
        int baris, kolom;
        int maxBaris = penonton.length;
        int maxKolom = penonton[0].length;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menuChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            if (menuChoice == 1) {
                System.out.print("Masukkan nama: ");
                nama = scanner.nextLine();
                System.out.print("Masukkan baris: ");
                baris = scanner.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = scanner.nextInt();
                scanner.nextLine();
                
                if (isValidSeat(baris, kolom, maxBaris, maxKolom) && penonton[baris - 1][kolom - 1] == null) {
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil dimasukkan.");
                } else {
                    System.out.println("Nomor baris atau kolom kursi tidak tersedia atau kursi sudah terisi. Silakan coba lagi.");
                }
            } else if (menuChoice == 2) {
                System.out.println("Daftar penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.printf("Baris %d, Kolom %d: %s\n", i + 1, j + 1, penonton[i][j]);
                        }
                    }
                }
            } else if (menuChoice == 3) {
                break; // Keluar dari loop
            } else {
                System.out.println("Pilihan menu tidak valid.");
            }
        }

        // Menutup Scanner setelah selesai digunakan
        scanner.close();
    }
    
    // Fungsi isValidSeat untuk memeriksa validitas nomor baris dan kolom
    public static boolean isValidSeat(int baris, int kolom, int maxBaris, int maxKolom) {
        return (baris >= 1 && baris <= maxBaris && kolom >= 1 && kolom <= maxKolom);
    }
}
