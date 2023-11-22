import java.util.Scanner;

public class NilaiMahasiswa {
    // Deklarasi array 2 dimensi untuk menyimpan nilai mahasiswa
    static int[][] nilaiMahasiswa;
    static String[] namaMahasiswa;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi newline

        // Input jumlah tugas
        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi newline

        // Menginisialisasi array dengan ukuran yang telah ditentukan
        nilaiMahasiswa = new int[jumlahMahasiswa][jumlahTugas];
        namaMahasiswa = new String[jumlahMahasiswa];

        // Input data nilai mahasiswa
        inputDataNilai(scanner);

        // Menampilkan seluruh nilai mahasiswa dalam format tabel
        tampilkanTabelNilaiMahasiswa();

        // Mencari minggu dengan nilai tertinggi
        int mingguTertinggi = cariMingguTertinggi();
        System.out.println("\nMinggu dengan nilai tertinggi adalah minggu ke-" + (mingguTertinggi + 1));

        // Menampilkan mahasiswa dengan nilai tertinggi pada minggu tertentu
        tampilkanMahasiswaTertinggi(mingguTertinggi);

        scanner.close();
    }

    // Fungsi untuk menginputkan data nilai mahasiswa
    public static void inputDataNilai(Scanner scanner) {
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.nextLine();

            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.print("Masukkan nilai tugas minggu ke-" + (j + 1) + " untuk " + namaMahasiswa[i] + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }

            // Mengonsumsi newline setelah input nilai
            scanner.nextLine();
        }
    }

    // Fungsi untuk menampilkan seluruh nilai mahasiswa dalam format tabel
    public static void tampilkanTabelNilaiMahasiswa() {
        int lebarKolomNama = 20;
        int lebarKolomNilai = 15;

        System.out.println("====================================================================================================");
        System.out.printf("| %-" + lebarKolomNama + "s |", "Nama Mahasiswa");
        for (int j = 0; j < nilaiMahasiswa[0].length; j++) {
            System.out.printf(" %-" + lebarKolomNilai + "s |", "Minggu " + (j + 1));
        }
        System.out.println("\n====================================================================================================");

        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.printf("| %-" + lebarKolomNama + "s |", namaMahasiswa[i]);
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.printf(" %-" + lebarKolomNilai + "d |", nilaiMahasiswa[i][j]);
            }
            System.out.println();
        }

        System.out.println("====================================================================================================");
    }

    // Fungsi untuk mencari minggu dengan nilai tertinggi
    public static int cariMingguTertinggi() {
        int mingguTertinggi = 0;
        double nilaiTertinggi = hitungRataRataMinggu(0);

        for (int j = 1; j < nilaiMahasiswa[0].length; j++) {
            double rataRataMinggu = hitungRataRataMinggu(j);
            if (rataRataMinggu > nilaiTertinggi) {
                nilaiTertinggi = rataRataMinggu;
                mingguTertinggi = j;
            }
        }

        return mingguTertinggi;
    }

    // Fungsi untuk menghitung rata-rata nilai pada suatu minggu
    public static double hitungRataRataMinggu(int minggu) {
        double total = 0;
        for (int i = 0; i < namaMahasiswa.length; i++) {
            total += nilaiMahasiswa[i][minggu];
        }
        return total / namaMahasiswa.length;
    }

    // Fungsi untuk menampilkan mahasiswa dengan nilai tertinggi pada minggu tertentu
    public static void tampilkanMahasiswaTertinggi(int minggu) {
        System.out.println("\nMahasiswa dengan nilai tertinggi pada minggu ke-" + (minggu + 1) + ":");
        int nilaiTertinggi = 0;
        int mahasiswaTertinggi = -1;

        for (int i = 0; i < namaMahasiswa.length; i++) {
            if (nilaiMahasiswa[i][minggu] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i][minggu];
                mahasiswaTertinggi = i;
            }
        }

        if (mahasiswaTertinggi != -1) {
            System.out.println("Nama Mahasiswa: " + namaMahasiswa[mahasiswaTertinggi]);
            System.out.println("Nilai pada minggu ke-" + (minggu + 1) + ": " + nilaiMahasiswa[mahasiswaTertinggi][minggu]);
        } else {
            System.out.println("Tidak ada mahasiswa dengan nilai tertinggi pada minggu ke-" + (minggu + 1));
        }
    }
}
