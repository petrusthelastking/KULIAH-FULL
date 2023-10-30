public class Bioskop22 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        // Cetak daftar penonton
        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                System.out.printf("%s \t %s\n", penonton[i][j], penonton[i][j]);
            }
        }

        // Cetak nama penonton pada baris ke-3
        System.out.println("Nama penonton pada baris ke-3: " + penonton[2][0]);

        // Cetak panjang setiap baris
        System.out.println("Panjang setiap baris:");
        for (String[] baris : penonton) {
            System.out.println("Baris ke-" + (baris[0] + 1) + ": " + baris.length);
        }
    }
}
