import java.time.*;

import java.util.*;



public class Test {

    public static void main(String[] args) {

        Osoba[] ludzie = new Osoba[2];



        ludzie[0] = new Pracownik("Kowalski", new String[]{"Jan"}, LocalDate.of(1990,6,7), false, 40000, LocalDate.of(2009,2,3));

        ludzie[1] = new Student("Tomaszewski", new String[]{"Bartosz","Jan"},LocalDate.of(1999,6,11),true, "informatyka",4.5);



        for (Osoba p : ludzie) {

            for ( String i : p.getImiona()){

                System.out.print(i+" ");

            }

            System.out.print(p.getNazwisko() + ": " + p.getOpis()+ " uordzony: "+p.getDataUrodzenia()+", plec: ");

            if(p.isPlec()){

                System.out.println("Kobieta");

            }

            else {

                System.out.println("Mężczyzna");

            }

        }

    }

}