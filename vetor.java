//Nesta aula vamos dar vetores ou arrays e vamos aprender a como usar-los
package aula4;

import java.util.Arrays;

public class vetor {
    public static void main(String[] args) {

        // double[] d1 = new double[4];aqui estamos a criar um vetor, usamos o []no inicio para dizer que é um vetor e o new para criar
        //d1[1] = 4.5;
        //System.out.println(d1[1]);

        int[] v = {3,6,9};
        int size = v.length;
        int first = v[0];
        int last = v[v.length - 1];
        interacao(v);
        System.out.println(Arrays.toString(v)); // Para visualizarmos o vetor temos que fazer este sout e dar o import da linha 4
    }

    public static void interacao(int[] v) {
        for(int i = 0; i < v.length; i++){
            System.out.println(v[i]);//Aqui dizemos o que definimos no v e usamos o indice para escrever
            //System.out.println(i); Aqui dizemos o que tem dentro do i ou seja 0 1 2 3
        }
    }
}
