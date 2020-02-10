
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SatnaKarta extends Karta {

	@SuppressWarnings("deprecation")
	SatnaKarta(int sati){
		this.ukupnoSati = sati;
		this.id = trenutniId++;
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		pocetniDatum = new Date();
		df.format(pocetniDatum);
		krajnjiDatum = new Date();
		df.format(krajnjiDatum);
		krajnjiDatum.setHours(pocetniDatum.getHours()+ukupnoSati);
	}

	@Override
	public String getInfo() {
		
		return "I am a hourly ticket " +this.toString();
	}
	
	
}
