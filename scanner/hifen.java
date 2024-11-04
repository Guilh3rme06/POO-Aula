import java.util.Scanner;

public class hifen {
    public static void hifen(){
    Scanner espaco = new Scanner(System.in);

    System.out.println("Escreva uma frase:");
    String frase = espaco.nextLine();

    espaco.close();
    
    System.out.println("Frase: " + frase.replace(" ", "-"));
    }
}
