import java.util.Scanner;
public class Latihan1Individu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jarak : ");
        int jarak = input.nextInt();

        if (jarak <= 5) {
            System.out.println("Jarak: " + jarak + " meter");
            System.out.println("Weapon Type: Melee Weapon");
            System.out.println("Keterangan: Pertarungan jarak dekat");
        } else if (jarak > 5 && jarak <= 1000) {
            System.out.println("Jarak: " + jarak + " meter");
            System.out.println("Weapon Type: Ranged Weapon");
            System.out.println("Keterangan: Pertarungan jarak jauh");
        } else {
            System.out.println("Jarak: " + jarak + " meter");
            System.out.println("Keterangan: Jarak tidak sesuai dengan penggunaan senjata");
        }
    }
}