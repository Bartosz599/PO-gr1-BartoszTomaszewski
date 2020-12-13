package pl.imiajd.tomaszewski;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Osoba> listaOsob = new ArrayList<>(5);
        listaOsob.add(new Osoba("Olszak", LocalDate.of(1973, 11, 7)));
        listaOsob.add(new Osoba("Wilinski", LocalDate.of(1989, 2, 6)));
        listaOsob.add(new Osoba("Wilga", LocalDate.of(1998, 12, 4)));
        listaOsob.add(new Osoba("Myslinski", LocalDate.of(1997, 6, 3)));
        listaOsob.add(new Osoba("Kowalski", LocalDate.of(1989, 2, 11)));
        System.out.println(listaOsob.get(0));
        System.out.println(listaOsob.get(0).equals(listaOsob.get(1)));
        System.out.println(listaOsob.get(0).equals(listaOsob.get(4)));

        System.out.println(listaOsob);
        Collections.sort(listaOsob);
        System.out.println(listaOsob);

        //Zadanie 2

        ArrayList<Osoba> listaStudentow = new ArrayList<>(5);
        listaStudentow.add(new Student("Olszak", LocalDate.of(1973, 11, 7),3.05));
        listaStudentow.add(new Student("Wilinski", LocalDate.of(1989, 2, 6),4.6));
        listaStudentow.add(new Student("Wilga", LocalDate.of(1998, 12, 4),5.0));
        listaStudentow.add(new Student("Myslinski", LocalDate.of(1997, 6, 3),3.2));
        listaStudentow.add(new Student("Kowalski", LocalDate.of(1989, 2, 11),4.4));

        System.out.println(listaStudentow);
        Collections.sort(listaStudentow);
        System.out.println(listaStudentow);

        // Zadanie 3
        if (args.length != 0) {
            ArrayList<String> zad3 = new ArrayList<>();
            try {
                File mojPlik = new File(args[0]);
                Scanner zczytywanie = new Scanner(mojPlik);
                while (zczytywanie.hasNextLine()) {
                    zad3.add(zczytywanie.nextLine());
                }
                zczytywanie.close();
            } catch (FileNotFoundException e) {
                System.out.println("Nie ma takiego pliku");
                e.printStackTrace();
            }

            System.out.println(zad3);
            Collections.sort(zad3);
            System.out.println(zad3);
        }
    }
}

