package pl.imiajd.tomaszewski;

public class Main {

    public static void main(String[] args) {
        Adres ad1 = new Adres("Sikorskiego", "1", "10-088", "Olsztyn");
        Adres ad2 = new Adres("Sikorskiego", "1", "18", "10-088", "Olsztyn");
        Adres ad3 = new Adres("Sikorskiego", "1", "18", "10-088", "Olsztyn");
        ad1.pokaz();
        ad2.pokaz();
        System.out.println(ad1.przed(ad2));
        System.out.println(ad1.przed(ad3));
        Osoba Krzysztof = new Osoba("Klich", 1999);
        Student Zbigniew = new Student("Miodnicki", 1997, "Informatyka");
        Nauczyciel Lesław = new Nauczyciel("mazur", 1982, 2700);
        System.out.println(Krzysztof);
        System.out.println(Zbigniew);
        System.out.println(Lesław);
        System.out.println(Zbigniew.getKierunek());
        System.out.println(Zbigniew.getNazwisko());
        System.out.println(Zbigniew.getRokUrodzenia());
        System.out.println(Lesław.getPensja());
        BetterRectangle prostokat = new BetterRectangle(1, 1, 4, 3);
        System.out.println(prostokat.getArea());
        System.out.println(prostokat.getPerimeter());
    }
}
