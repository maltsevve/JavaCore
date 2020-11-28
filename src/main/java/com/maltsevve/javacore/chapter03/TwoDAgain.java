package main.java.com.maltsevve.javacore.chapter03;

//Резервирование памяти вручную для массива с разной размерностью второго измерения
public class TwoDAgain {
    public static void main(String[] args) {
        int twoD[][] = new int[4][];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];

        int i, j, k = 0;

        for (i = 0; i < 4; i++){
            for (j = 0; j < i + 1; j++) { //В двухмерном массиве идет равномерное увеличение
                // длины "строк" каждую итерацию на 1, так что это работает.
                twoD[i][j] = k;
                k++;
            }
        }

        for (i = 0; i < 4; i++){
            for (j = 0; j < i + 1; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();

        }
    }
}