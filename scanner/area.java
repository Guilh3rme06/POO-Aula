import java.util.Scanner;

public class area {

    public static void area (){
        Scanner calcular = new Scanner(System.in);

        System.out.println("Insira a altura do retangulo: ");
        double altura = calcular.nextDouble();
        System.out.println("Insira a largura do retangulo: ");
        double largura = calcular.nextDouble();

        calcular.close();
        System.out.println("A area do retangulo é: " + (altura * largura));
    }
}
