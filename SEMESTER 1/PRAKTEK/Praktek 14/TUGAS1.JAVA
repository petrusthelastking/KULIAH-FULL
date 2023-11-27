public class GabunganRekursifIteratif {
    public static void main(String[] args) {
        int n = 5; // Ganti dengan nilai n sesuai yang diinginkan
        System.out.println("Menggunakan Fungsi Rekursif:");
        cetakBilanganRekursif(n);
        System.out.println("\nMenggunakan Fungsi Iteratif:");
        cetakBilanganIteratif(n);
    }

    public static void cetakBilanganRekursif(int n) {
        if (n >= 0) {
            System.out.println(n);
            cetakBilanganRekursif(n - 1);
        }
    }

    public static void cetakBilanganIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
