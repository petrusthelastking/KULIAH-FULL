import java.util.Scanner;

public class RekursifPercobaan2 {

    // Metode untuk menghitung pangkat
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            System.out.print("1");
            return 1;
        } else {
            int hasilPangkatSebelumnya = hitungPangkat(x, y - 1);
            int hasilPangkatSekarang = x * hasilPangkatSebelumnya;
            System.out.print("x" + x);
            return hasilPangkatSekarang;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel bilangan dan pangkat
        int bilangan, pangkat;

        // Input bilangan dan pangkat dari pengguna
        System.out.print("Masukkan bilangan: ");
        bilangan = sc.nextInt();
        System.out.print("Masukkan pangkat: ");
        pangkat = sc.nextInt();

        // Pangkatkan bilangan menggunakan metode hitungPangkat
        System.out.print(bilangan + " pangkat " + pangkat + " adalah: ");
        int hasilPangkat = hitungPangkat(bilangan, pangkat);

        // Cetak hasil
        System.out.println(" = " + hasilPangkat);

        // Tutup Scanner
        sc.close();
    }
}
