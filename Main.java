package Petak23osmi;

import java.util.Scanner;

public class Main {

	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        

	        Test t1 = kreirajTest();
	        System.out.println(t1.toString());

	        System.out.println("-------------------------------------------------------------------------------");

	        for(int i = 0;  i<t1.getBrPitanja(); i++){
	            System.out.print("Unesite vas odgovor na pitanje " + (i+1) + " :");
	            int odgovor = sc.nextInt();
	            System.out.print("");
	            t1.odgovoriNaPitanje(i, odgovor);
	        }

	        System.out.println("-------------------------------------------------------------------------------");
	        System.out.println("Vas skor na testu je: " + t1.getUkupanBrojPoenaOstvarenNaTestu() + " od mogucih " + t1.getUkupanBrojPoenaKojiNosiTest());

	        if(t1.getUkupanBrojPoenaOstvarenNaTestu() >= t1.getUkupanBrojPoenaKojiNosiTest() * Test.procenatPotrebanZaPolaganje){
	            System.out.println("Cestitamo polozili ste test!");
	        }
	        else{
	            System.out.println("Nazalost, pali ste test");
	        }
	    }


	    public static Test kreirajTest(){
	        Test t1 = new Test("Test iz objektnog programiranja");

	        Pitanje p1 = new Pitanje("U objektno orijentisanom programiranju klasa je:", 2);
	        p1.dodajOdgovor(new PonudjeniOdgovor("Vrsta objekta", false));
	        p1.dodajOdgovor(new PonudjeniOdgovor("Skup promenljivih koje čine stanje objekta", false));
	        p1.dodajOdgovor(new PonudjeniOdgovor("Šablon za kreiranje objekata iste vrste", true));
	        p1.dodajOdgovor(new PonudjeniOdgovor("Koncept koji omogućava kreiranje hijerarhije tipova podataka", false));
	        t1.dodajPitanje(p1);

	        Pitanje p2 = new Pitanje("Koncept nasleđivanja u objektno orijentisanom programiranju omogućava:", 2);
	        p2.dodajOdgovor(new PonudjeniOdgovor(" Kopiranje stanja postojećeg objekta prilikom kreiranja novog", false));
	        p2.dodajOdgovor(new PonudjeniOdgovor("Definisanje nove klase na osnovu definicije već postojeće", true));
	        p2.dodajOdgovor(new PonudjeniOdgovor("Kreiranje nove biblioteke koja uključuje sve funkcije neke postojeće", false));
	        p2.dodajOdgovor(new PonudjeniOdgovor("Definisanje hijerarhije paketa u programskom sklopu", false));
	        t1.dodajPitanje(p2);

	        Pitanje p3 = new Pitanje("U objektno orijentisanim programskim jezicima kao što su Java, C++ ili C# modifikator pristupa protected omogućava pristup članovima klase:", 3);
	        p3.dodajOdgovor(new PonudjeniOdgovor("Samo autorizovanim korisnicima programa", false));
	        p3.dodajOdgovor(new PonudjeniOdgovor("Samo u toj istoj klasi", false));
	        p3.dodajOdgovor(new PonudjeniOdgovor("Samo u toj klasi i klasama koje je proširuju", true));
	        p3.dodajOdgovor(new PonudjeniOdgovor("Samo u klasama koje je proširuju", false));
	        p3.dodajOdgovor(new PonudjeniOdgovor("U svim klasama", false));
	        p3.dodajOdgovor(new PonudjeniOdgovor("Samo u klasama koje su u istom paketu", false));
	        t1.dodajPitanje(p3);

	        Pitanje p4 = new Pitanje("U objektno orijentisanom programiranju sledeći iskaz je istinit:", 3);
	        p4.dodajOdgovor(new PonudjeniOdgovor("Apstraktna klasa je klasa u kojoj je definisano samo ponašanje a ne i stanje", false));
	        p4.dodajOdgovor(new PonudjeniOdgovor("Apstraktna klasa se ne može instancirati", true));
	        p4.dodajOdgovor(new PonudjeniOdgovor("Apstraktna klasa ne postoji u objektno orijentisanim programskim jezicima, koristi se samo u fazi OOP analize i dizajna", false));
	        p4.dodajOdgovor(new PonudjeniOdgovor("Apstraktna klasa je vrsta objekta čije ponašanje se može redefinisati u apstraktnoj klasi", false));
	        t1.dodajPitanje(p4);

	        Pitanje p5 = new Pitanje("Ako je u Javi klasa B izvedena iz klase A onda je istinit sledeći iskaz:", 4);
	        p5.dodajOdgovor(new PonudjeniOdgovor("Na mestu gde se očekuje instanca klase A može se pojaviti instanca klase B", true));
	        p5.dodajOdgovor(new PonudjeniOdgovor("Na mestu gde se očekuje instanca klase B može se pojaviti instanca klase A", false));
	        p5.dodajOdgovor(new PonudjeniOdgovor("Klasa je obavezno apstraktna", false));
	        p5.dodajOdgovor(new PonudjeniOdgovor("Svaka instanca klase B sadrži jednu istu zajedničku instancu klase A", false));
	        t1.dodajPitanje(p5);

	        Pitanje p6 = new Pitanje("Ispaljeni izuzetak u Javi može biti uhvaćen:", 4);
	        p6.dodajOdgovor(new PonudjeniOdgovor("Samo u metodi u kojoj je bačen", false));
	        p6.dodajOdgovor(new PonudjeniOdgovor("U bilo kojoj metodi klase kojoj pripada i metoda iz koje je izuzetak bačen", false));
	        p6.dodajOdgovor(new PonudjeniOdgovor("U bilo kojoj metodi u programu", false));
	        p6.dodajOdgovor(new PonudjeniOdgovor("U bilo kojoj metodi na steku poziva", true));
	        t1.dodajPitanje(p6);

	        return t1;
	    }
}
