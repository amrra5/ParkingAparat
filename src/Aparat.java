import java.util.ArrayList;


public class Aparat {

	ArrayList<Karta> listaKarti = new ArrayList<>();
	private double cijenaDnevne;
	private double cijenaSatne;
	
	Aparat(){
		cijenaDnevne = 10.0;
		cijenaSatne = 1.0;
	}
	
	public void izdajKartu(int brojKovanica, double iznosKovanice){
		if(brojKovanica <=0 || iznosKovanice <=0){
			System.out.println("Greska, broj kovanica i iznos pojedinacne kovanice mora biti veci od nule!");
		}
		if(iznosKovanice == 0.5 || iznosKovanice == 1.0 || iznosKovanice == 2.0){
			if(cijenaDnevne == (brojKovanica*iznosKovanice)){
				listaKarti.add(new DnevnaKarta());
			}else{
				int sati =(int)((1*brojKovanica*iznosKovanice)/cijenaSatne);
				listaKarti.add(new SatnaKarta(sati));
			}
		}
	}
	
	Karta getKartu(int index) {
		if (index < 0 || index >= listaKarti.size())
			return null;
		return listaKarti.get(index);
	}
	
	public void setDnevna(double cijena){
		if(cijena>0){
			cijenaDnevne = cijena;
		}
	}
	
	public void setSatna(double cijena){
		if(cijena>0){
			cijenaSatne = cijena;
		}
	}
	
	public int getBrojIzdatihKarti(){
		return listaKarti.size();
	}
}
