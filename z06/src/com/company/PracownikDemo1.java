package com.company;

import java.time.LocalDate;
import java.util.*;

public class PracownikDemo1 {

    public static void main(String[] args) {
        Pracownik[] personel = new Pracownik[3];


        personel[0] = new Pracownik("Jan Kowalski", 70000, 2000, 10, 12);
        personel[1] = new Pracownik("Julian Kluczyk", 50000, 2001, 9, 2);
        personel[2] = new Pracownik("Izabela Lecka", 10000, 2000, 3, 15);


        for (Pracownik e : personel) {
            e.zwiekszPobory(20);
        }


        for (Pracownik e : personel) {
            System.out.print("nazwisko = " + e.nazwisko() + "\tid = " + e.id());
            System.out.print("\tpobory = " + e.pobory());
            System.out.printf("\tdataZatrudnienia = %tF\n", e.dataZatrudnienia());
        }
        System.out.println();

        int n = Pracownik.getNextId(); // wywołanie metody statycznej
        System.out.println("Następny dostępny id = " + n);

    }
}

class Pracownik {

    public Pracownik(String nazwisko, double pobory, int year, int month, int day) {
        this.nazwisko = nazwisko;
        this.pobory = pobory;

        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        dataZatrudnienia = LocalDate.now();

        id = nextId;
        ++nextId;
    }

    public String nazwisko() {
        return nazwisko;
    }

    public double pobory() {
        return pobory;
    }

    public LocalDate dataZatrudnienia() {
        return (LocalDate) dataZatrudnienia;
    }

    public void zwiekszPobory(double procent) {
        double podwyżka = pobory * procent / 100;
        pobory += podwyżka;
    }

    public int id() {
        return id;
    }

    public void setId() {
        id = nextId;
        ++nextId;
    }

    public static int getNextId() {
        return nextId;
    }

    private String nazwisko;
    private double pobory;
    private LocalDate dataZatrudnienia;

    private int id;
    private static int nextId = 1;
}

