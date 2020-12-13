import java.io.FileNotFoundException;



public class Test {

    public static void main(String[] args) throws FileNotFoundException {

        //PriorityList lista= new PriorityList();

        //lista.wypisz();

        //lista.pisz();

        //lista.wypisz();



        Egzamin po = new Egzamin();

        po.dodaj("Kinga", "db");

        po.dodaj("Maciek","dbd");

        po.dodaj("Ola","dst");

        po.dodaj("Rafal","db+");

        po.wypisz();

        po.usun("Ola");

        po.zmien("Rafal","dst+");

        po.wypisz();



        Egzamin2 po2= new Egzamin2();

        po2.dodaj(new Student("Kinga","Kolakowska",4),"bdb");

        po2.dodaj(new Student("Milosz","Woznicki",3),"db");

        po2.dodaj(new Student("Mikolaj","Kozakowski",1),"dst");

        po2.dodaj(new Student("Krzysztof","Linkiewicz",2),"ndst");

        po2.wypisz();

        po2.usun(3);

        po2.zmien(2,"dst+");

        po2.wypisz();



        FunMieszajaca fm= new FunMieszajaca("plik.txt");

    }

}