//Para repetições podemos usar o for e o while
// i = i +1 ou i++
// i = i -1 ou i--
// s = s + i ou s += i

package aula3;

public class exemploWhile {
    public static void main(String[] args) {

        int contador = 1;
        int soma = 0;

        while (contador <= 10) { // O ciclo so para quando o contador for maior ou igual que 10
            soma += contador; // soma = soma + contador
            contador++; // contador = contador + 1
        }

        System.out.println("A soma é:" + soma); // A soma tem que ser 55

    }
}
