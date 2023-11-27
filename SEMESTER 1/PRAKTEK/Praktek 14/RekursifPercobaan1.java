public class RekursifPercobaan1 {

    // Metode rekursif untuk menghitung faktorial
    static int faktorialRekursif(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * faktorialRekursif(n - 1);
        }
    }

    // Metode iteratif untuk menghitung faktorial
    static int faktorialIteratif(int n) {
        int faktor = 1;
        for (int i = n; i >= 1; i--) {
            faktor *= i;
        }
        return faktor;
    }

    // Main method untuk menguji kedua metode
    public static void main(String[] args) {
        int bilangan = 5;
        System.out.println("Faktorial (Rekursif) dari " + bilangan + " adalah: " + faktorialRekursif(bilangan));
        System.out.println("Faktorial (Iteratif) dari " + bilangan + " adalah: " + faktorialIteratif(bilangan));
    }
}
