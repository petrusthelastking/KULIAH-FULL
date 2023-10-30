import java.util.Scanner;

public class BioskopWithScanner22Pertanyaan2 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];
        Scanner scanner = new Scanner(System.in);
        String nama, next;
        int baris, kolom;
        
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
                
                penonton[baris - 1][kolom - 1] = nama;
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
}
