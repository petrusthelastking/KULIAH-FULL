import java.util.Scanner;

public class Ucapan_22 {

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Siapa yang semangat:");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Semangat Cantik " + nama + "\nAku selalua ada untuk mu.");
    }
}
