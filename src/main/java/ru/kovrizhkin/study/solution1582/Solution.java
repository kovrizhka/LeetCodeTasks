package ru.kovrizhkin.study.solution1582;


/**
 * Дана двоичная матрица , возвращаем количество специальных позиций в .m x nmatmat
 * Позиция называется специальной, если и все остальные элементы в строке и столбце являются (строки и столбцы имеют индекс 0).(i, j)mat[i][j] == 1ij0
 */


public class Solution {
    public int numSpecial(int[][] mat) {

        int finalCount = 0;

        for(int i = 0; i < mat.length; i++) {
            boolean canWork = false;
            int positionOfOneNumber = -1;

            for(int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == 1) {
                    if (positionOfOneNumber == -1) {
                        positionOfOneNumber = j;
                        canWork = true;
                    } else {
                        canWork = false;
                    }
                }
            }

            if(canWork) {
                int count = 0;
                for(int k = 0; k < mat.length; k++) {
                    if(mat[k][positionOfOneNumber] == 1 && k != i) {
                        count++;
                    }
                }

                if(count == 0) {
                    finalCount++;
                }
            }

        }
        return finalCount;
    }
}
