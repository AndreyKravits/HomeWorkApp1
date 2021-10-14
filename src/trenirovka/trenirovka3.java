package trenirovka;


import java.util.Arrays;

public class trenirovka3 {
    public static void main(String[] args) {

            int[][] matrix = new int[10][10];
            for (int i = 0; i < 10; i++) {
                matrix[i][i] = 1;
                matrix[i][10 - i - 1] = 1;
            }
            //System.out.println(Arrays.deepToString(matrix));
            for (int i = 0; i < 10; i++)
                System.out.println(Arrays.toString(matrix[i]));
        }

    }







