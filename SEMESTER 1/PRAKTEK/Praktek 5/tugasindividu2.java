import java.util.Scanner;

public class tugasindividu2 {
    // Data pengguna yang tersimpan di dalam system
    private static final String USERNAME = "pengguna";
    private static final String PASSWORD = "password123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input username dan password dari pengguna
        System.out.print("Username: ");
        String usernameInput = scanner.nextLine();
        System.out.print("Password: ");
        String passwordInput = scanner.nextLine();

        // Memeriksa apakah username dan password sesuai
        if (usernameInput.equals(USERNAME) && passwordInput.equals(PASSWORD)) {
            System.out.println("Selamat datang, " + USERNAME + "!");
        } else {
            System.out.println("Username dan password salah. Coba lagi.");
        }

        // Menutup scanner
        scanner.close();
    }
}
