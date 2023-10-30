import java.util.Scanner;

public class Bank22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jml_tabungan_awal, lama_menabung;
        double jml_tabungan_akir,bunga, prosentase_bunga = 0.02;

        System.out.println("masukan jumlah tabungan awal anda");
        jml_tabungan_awal = input.nextInt();
        System.out.println("Masukkan lama menabung anda");
        lama_menabung = input.nextInt();

        bunga = lama_menabung * prosentase_bunga * jml_tabungan_awal;
        jml_tabungan_akir = bunga + jml_tabungan_awal;
        System.out.println("Jumlah tabungan akir anda adalah " + jml_tabungan_akir);
    }
}