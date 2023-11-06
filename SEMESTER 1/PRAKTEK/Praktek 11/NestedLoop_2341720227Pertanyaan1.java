import java.util.Scanner;

public class NestedLoop_2341720227Pertanyaan1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            for (int j = 0; j < temps[i].length; j++) {
                System.out.print("Masukkan suhu ke-" + (j + 1) + ": ");
                temps[i][j] = input.nextDouble();
            }
            System.out.println();
        }

        // Menampilkan array dengan foreach
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (double suhu : temps[i]) {
                System.out.print(suhu + " ");
            }
            System.out.println();
        }
    }
}
