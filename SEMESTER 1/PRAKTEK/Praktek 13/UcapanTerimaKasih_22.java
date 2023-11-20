import java.util.Scanner;

public class UcapanTerimaKasih_22 {

    // Function UcapanTambahan with a String parameter
    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }

    // Function to get a name from the user
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sidia semangat:");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    // Function to display thank you message
    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + "\nMay the force be with you.");
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}
