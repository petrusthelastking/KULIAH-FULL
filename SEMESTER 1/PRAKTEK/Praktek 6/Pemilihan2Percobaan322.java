import java.util.Scanner;

public class Pemilihan2Percobaan322 {
    public static void main(String[] args) {
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk mengambil input dari pengguna

        System.out.print("Masukkan Kategori : ");
        kategori = input.nextLine(); // Menggunakan objek Scanner untuk membaca inputan kategori

        System.out.print("Masukkan Besarnya Penghasilan : ");
        penghasilan = input.nextInt(); // Menggunakan objek Scanner untuk membaca inputan penghasilan

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasil Bersih : " + gajiBersih);
        } else if (kategori.equals("PEMBISNIS")) {
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasil Bersih : " + gajiBersih);
        } else
            System.out.println("Masukkan Kategori Salah ");

        input.close(); // Jangan lupa untuk menutup objek Scanner setelah menggunakannya.
    }
}
