import java.util.Scanner;
public class Gaji22 {
    public static void main(String[] args) {
        Scanner Input =new Scanner(System.in);
        
        int jmlmasuk, jmltdkMasuk, TotGaji;
        int gaji=40000, potGaji=25000;
        System.out.println("Masukakn Jumlah Hari Masuk Kerja Anda ");
        jmlmasuk=Input.nextInt();
        System.out.println("Masukakn Jumlah Hari Tidak Masuk Kerja Anda ");
        jmltdkMasuk=Input.nextInt();
        TotGaji=(jmlmasuk*gaji)-(jmltdkMasuk*potGaji);
        System.out.println("gaji yang anda terima adalah " +TotGaji);
    }
}