package Petak23osmi;

public class Pitanje {
	private String tekstPitanja;
	private int brPoena;
	private PonudjeniOdgovor[] odgovori;
	private int brOdgovora;

	public Pitanje(String tekstPitanja, int brPoena) {
		this.tekstPitanja = tekstPitanja;
		this.brPoena = brPoena;
		odgovori = new PonudjeniOdgovor[5];
		this.brOdgovora = 0;
	}

	public String getPitanje() {
		return tekstPitanja;
	}

	public int getBrPoena() {
		return brPoena;
	}

	public void dodajOdgovor(PonudjeniOdgovor po) {
		if (brOdgovora == odgovori.length) {
			// if (brOdgovora==5) { //ovo ce da radi samo prvi put, dok je niz manje od 5
			PonudjeniOdgovor[] privremeno = new PonudjeniOdgovor[odgovori.length * 2]; // napravili smo duplo veci
																						// prazan niz
			// prosti tipovi podataka se prenose po vrednosti y=x i to je ok
			// slozeni tipovi podataka(sve sto potice iz clase object) se prenosi po
			// referenci!
			for (int i = 0; i < odgovori.length; i++) {
				privremeno[i] = odgovori[i]; // prekopirali smo svaki stari element u novi element
			}
			this.odgovori = privremeno; // ovde smo zavrsili sa kopiranjem i sada odgovori referisu na novi niz koji se
										// zove privremeno
		}
		//deo koda ispod proverava da li ima tacnih ili netacnih podataka
		//u prvom ifu preskace nulti element i proverava tacnost ostalih pozivom funkcije iz ponudjenih odgovora
		if (brOdgovora != 0 && po.getTacnost()) {// da bismo preskocili prvi element, jer kada dodajemo, svejedno nam je
													// da li je tacno ili netacno
			for (int i = 0; i < brOdgovora; i++) {//u ovom foru irerira kroz niz po broju odgovora
				if (odgovori[i].getTacnost()) {// da li postoji bilo kakav odgovor koji je tacan i da li je odgovori
												// koji sad dodajemo 'po' tacan
					System.out.println("Vec postoji tacan odgovor ");
					return;
				}
			}
		}

		this.odgovori[brOdgovora] = po; // vraca trenutnu duzinu niza
		brOdgovora++;

	}

	public PonudjeniOdgovor getOdgovor(int redBr) {
		return odgovori[redBr - 1]; // oduzima se jer program trazi index, a index od pitanja 4 je 3
	}

	public int odgovoriNaPitanje(int redBr) {
		if (redBr < 0 || redBr > brOdgovora) {
			return 0;
		}
		PonudjeniOdgovor odg = odgovori[redBr - 1];
		if (odg.getTacnost()) {
			return brPoena;
		}
		else return 0;
	}

	@Override
	public String toString() {
		String metoda=getPitanje() + "(" + getBrPoena() + ")"+ "\n";
		for (int i=0; i<brOdgovora; i++) {
			metoda += i + ". " + odgovori[i] + "\n";
		}
		return metoda;
	}
		
}
