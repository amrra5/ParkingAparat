import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;





public class DnevnaKarta extends Karta {

	@SuppressWarnings("deprecation")
	DnevnaKarta(){
		id = trenutniId++;
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		pocetniDatum = new Date();
		df.format(pocetniDatum);
		this.ukupnoSati = 24;
		krajnjiDatum = new Date();
		df.format(krajnjiDatum);
		krajnjiDatum.setHours(pocetniDatum.getHours()+ukupnoSati);
	}

	@Override
	public String getInfo() {
		
		return "I am a daily ticket" + this.toString();
	}
	
	
}
