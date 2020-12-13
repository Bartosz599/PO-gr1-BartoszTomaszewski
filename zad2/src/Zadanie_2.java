import java.util.Random;

public class Zadanie_2 {

    public static void generuj(int tab[], int n , int minWartosc, int maxWartosc)
    {
        Random lotto = new Random();
        tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = lotto.nextInt(1999) - 1000;
        }

    }
}
