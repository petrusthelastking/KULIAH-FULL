import java.util.Scanner;

public class RekursifPercobaan3 {

    // Fungsi rekursif untuk menghitung laba
    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return saldo;
        } else {
            return 1.11 * hitungLaba(saldo, tahun - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel saldoAwal dan tahun
        double saldoAwal;
        int tahun;

        System.out.print("Jumlah saldo awal : ");
        saldoAwal = sc.nextDouble();
        System.out.print("Lamanya investasi (tahun) : ");
        tahun = sc.nextInt();

        // Hitung laba dengan fungsi hitungLaba
        double saldoAkhir = hitungLaba(saldoAwal, tahun);

        // Cetak hasil
        System.out.println("Jumlah saldo setelah " + tahun + " tahun: " + saldoAkhir);

        // Tutup Scanner
        sc.close();
    }
}
