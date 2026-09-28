import java.util.Scanner;

public class MatTranspose { 
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] m = new int[n][n];
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) 
            {
                m[i][j] = sc.nextInt();
            }
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                int t = m[i][j];

                m[i][j] = m[j][i];
                m[j][i] = t;
            }
        int diag = 0;
        for (int i = 0; i < n; i++) diag += m[i][i];
        for (int i = 0; i < n; i++) {
            String row = "";

            for (int j = 0; j < n; j++) 
                {
                    row += (j > 0 ? " " : "") + m[i][j];
                }
            System.out.println(row);
        }
        System.out.println("diagonal sum = " + diag);
    }
}