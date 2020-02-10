import java.util.Date;


public abstract class Karta {

	protected Date pocetniDatum;
	protected int id;
	protected static int trenutniId;
	protected int ukupnoSati;
	protected Date krajnjiDatum;
	
	abstract public String getInfo();
	
	public Date getPocetniDatum() {
		return pocetniDatum;
	}
	
	public int getId() {
		return id;
	}
	public static int getTrenutniId() {
		return trenutniId;
	}
	public int getUkupnoSati() {
		return ukupnoSati;
	}
	public Date getKrajniDatum() {
		return krajnjiDatum;
	}
	@Override
	public String toString() {
		return " [datum izdavanja: " + pocetniDatum + ", id: " + id
				+ ", ukupnoSati: " + ukupnoSati + ", karta validna do: " + krajnjiDatum
				+ "]";
	}
	
	
}
