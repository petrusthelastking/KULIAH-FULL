import java.util.Arrays;

public class Numbers22PPertanyaan1 {
    public static void main(String[] args) {
        int[][] mynumbers = new int[3][];
        mynumbers[0] = new int[5];
        mynumbers[1] = new int[3];
        mynumbers[2] = new int[1];
        for (int i = 0; i < mynumbers.length; i++) {
            System.out.println(Arrays.toString(mynumbers[i]));
        }
        
        for (int j = 0; j < mynumbers.length; j++) {
            System.out.println("Panjang baris ke-" + (j + 1) + ": " + mynumbers[j].length);
        }
    }
}
