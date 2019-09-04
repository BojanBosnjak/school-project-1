package Petak23osmi;

public class PonudjeniOdgovor {
	private String tekstOdgovora;
	private boolean tacnost;
	
	public PonudjeniOdgovor(String tekst, boolean tacnost) {
		tekstOdgovora=tekst;
		this.tacnost=tacnost;
	}
	
	public String getTekst() {
		return tekstOdgovora;
	}
	
	public boolean getTacnost() {
		return tacnost;
	}
	
	public void setTacnost(boolean tacnost) {
		this.tacnost=tacnost;
	}
	
	@Override
	public String toString() {
		return "Tekst: " + tekstOdgovora + getTacnost();
	}

}
