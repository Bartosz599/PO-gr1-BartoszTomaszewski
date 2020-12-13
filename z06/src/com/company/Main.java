package com.company;

public class Main {

    public static void main(String[] args) {
	RachunekBankowy saver1 = new RachunekBankowy();
	RachunekBankowy saver2 = new RachunekBankowy();

	saver1.obliczMiesieczneOdsetki(5000,0.07);
	saver2.obliczMiesieczneOdsetki(900,0.04);

    }
}
