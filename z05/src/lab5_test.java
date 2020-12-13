
import java.util.ArrayList;
import java.util.Arrays;



public class lab5_test {

    public static void main(String[] args) {

        ArrayList<Integer> listaA= new ArrayList<>(Arrays.asList(1, 3, 5, 7, 8));

        ArrayList<Integer> listaB= new ArrayList<>(Arrays.asList(1, 4, 5, 5, 6));

        System.out.println(listaA);

        System.out.println(listaB);

        System.out.println(lab5.append(listaA,listaB));

        System.out.println(lab5.merge(listaA,listaB));

        System.out.println(lab5.mergeSorted(listaA,listaB));

        System.out.println(lab5.reversed(listaA));

        lab5.reverse(listaB);

        System.out.println(listaB);

    }

}