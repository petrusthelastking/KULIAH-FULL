import java.util.Scanner; 
public class Lingkaran22 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int r;
        double keliling, luas;
        System.out.println("Masukkan jari-jari lingkaran");
        r=input.nextInt();
        double phi =3.14;
        keliling= 2*phi*r;
        luas=3.14*r*r;
        System.out.println(keliling);
        System.out.println(luas);
    
    }
}