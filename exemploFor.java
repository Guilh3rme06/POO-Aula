//Para repetições podemos usar o for e o while
// i = i +1 ou i++
// i = i -1 ou i--
// s = s + i ou s += i

//O for vai ser pode esta ordem: onde começa (int i = 0) ; onde acaba (i < 10); e quando incrementa (i++)

package aula3;

public class exemploFor {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){ //Começa em 0, acaba em 9, incrementa de 1 em 1
            System.out.println("O valor de i é: " + i);
        }
        System.out.println("Fim do ciclo");
    }
}
