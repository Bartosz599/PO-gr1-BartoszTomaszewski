package pl.imiajd.tomaszewski;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
            LinkedList<String> pracownicy = new LinkedList<>();
            pracownicy.add("Lukasz");
            pracownicy.add("Marek");
            pracownicy.add("Jacek");
            pracownicy.add("Wiktor");
            pracownicy.add("Kamil");
            pracownicy.add("Oliwia");
            pracownicy.add("Karolina");
            pracownicy.add("Krzysztof");
            System.out.println(pracownicy);
            z12.redukuj(pracownicy, 3);
            System.out.println(pracownicy);
            LinkedList<Integer> liczby = new LinkedList<>();
            liczby.add(1);
            liczby.add(2);
            liczby.add(3);
            liczby.add(4);
            liczby.add(5);
            liczby.add(6);
            liczby.add(7);
            liczby.add(8);
            liczby.add(9);
            System.out.println(liczby);
            z12.redukuj(liczby, 2);
            System.out.println(liczby);
            z12.odwroc(pracownicy);
            System.out.println(pracownicy);
            z12.odwroc(liczby);
            System.out.println(liczby);
            System.out.println(z12.mistrz_yoda("Ala ma kota. Jej kot lubi myszy."));
            z12.cyfry(2014);
            z12.Erastotenes(100);
            HashSet<LocalDate> daty = new HashSet<>();
            daty.add(LocalDate.of(1999, 2, 5));
            daty.add(LocalDate.of(1999, 3, 3));
            daty.add(LocalDate.of(1999, 5, 6));
            daty.add(LocalDate.of(1999, 7, 4));
            daty.add(LocalDate.of(1999, 5, 14));
            daty.add(LocalDate.of(1999, 11, 11));
            daty.add(LocalDate.of(1999, 2, 1));
            z12.print(liczby);
            z12.print(pracownicy);
            z12.print(daty);
        }
    }

