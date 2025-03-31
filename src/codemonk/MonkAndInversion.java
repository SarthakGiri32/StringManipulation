package codemonk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonkAndInversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        for(int i = 1; i <= t; i++) {
            int n = Integer.parseInt(bufferedReader.readLine());
            int[][] m = new int[n][n];
            for(int j = 0; j < n; j++) {
                String[] s = bufferedReader.readLine().split(" ");
                for(int k = 0; k < n; k++) {
                    m[j][k] = Integer.parseInt(s[k]);
                }
            }
            int inversionCount = 0;
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    for(int l = j; l < n; l++) {
                        for(int p = k; p < n; p++) {
                            if(m[j][k] > m[l][p]) {
                                inversionCount++;
                            }
                        }
                    }
                }
            }
            System.out.println(inversionCount);
        }
    }
}
