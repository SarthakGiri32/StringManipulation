package BasicProgramming.BasicIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumBorder {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        while(t > 0) {
            t--;
            String[] arrayDimensions = bufferedReader.readLine().split(" ");
            int n = Integer.parseInt(arrayDimensions[0]);
            int m = Integer.parseInt(arrayDimensions[1]);
            String[][] inputArray = new String[n][m];
            int maxBorder = 0, borderCountRow, borderCountCol;
            for(int i = 0; i < n; i++) {
                String inputArrayRow = bufferedReader.readLine();
                for (int j = 0; j < m; j++) {
                    inputArray[i][j] = String.valueOf(inputArrayRow.charAt(j));
                }
            }
            for(int i = 0; i < n; i++) {
                borderCountRow = 0;
                for(int j = 0; j < m - 1; j++) {
                    if (inputArray[i][j].equals("#")) {
                        if (inputArray[i][j + 1].equals("#")) {
                            borderCountRow++;
                        }
                        else {
                            borderCountRow++;
                            if (borderCountRow > maxBorder) {
                                maxBorder = borderCountRow;
                            }
                            borderCountRow = 0;
                        }
                    }
                }
            }
            for(int j = 0; j < m; j++) {
                borderCountCol = 0;
                for(int i = 0; i < n - 1; i++) {
                    if (inputArray[i][j].equals("#")) {
                        if (inputArray[i + 1][j].equals("#")) {
                            borderCountCol++;
                        }
                        else {
                            borderCountCol++;
                            if (borderCountCol > maxBorder) {
                                maxBorder = borderCountCol;
                            }
                            borderCountCol = 0;
                        }
                    }
                }
            }
            System.out.println(maxBorder);
        }
    }
}
