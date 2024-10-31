package aula4;

import java.util.Arrays;

public class matriz {
    public static void main(String[] args) {
        int[] [] m = { {1,2,3}, {4,5,6}, {7,8,9} }; //Aqui definimos uma matriz
        System.out.println(Arrays.deepToString(m)); // Para visualizarmos a matriz temos que fazer este sout e dar o import da linha 3



    }
    public static int sum(int[][] m){
        int sum = 0;
        for (int i = 0 ; i != m.length; i++){
            for(int j = 0 ; j !=m[i].length; j++){
                sum += m[i][j];
            }
        }
        return sum;
    }
}
