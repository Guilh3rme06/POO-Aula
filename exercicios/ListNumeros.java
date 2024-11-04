import java.util.ArrayList;

public class ListNumeros {
    public static ArrayList<Integer> numeros() {
        ArrayList<Integer> numerosList = new ArrayList<>();

        numerosList.add(1);
        numerosList.add(2);
        numerosList.add(3);
        numerosList.add(4);
        numerosList.add(5);

        numerosList.remove(3);

        return numerosList;
    }
}