package src;

public class Imobil {

	//variabile globale clasei
	private String adresa;
	private double pret;
	private int nrCamere;
	private int comfort;
	
	//constructor
	public Imobil() 
	{		
		adresa = "";
		pret = 0.0;
		nrCamere = 0;
		comfort = 0;
	}
	
	public Imobil(String adresa, double p) 
	{		
		this.adresa = adresa;
		pret = p;
		nrCamere = 1;
		comfort = 1;	
	}
	
	//creaza un constructor cu 4 parametri
	
	
	//metode set si get 
	
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	
	public String getAdresa() {
		return adresa;
	}
	//se fault ptr celelalte variabile globare metode set si get
	
	//metoda
	public String toString() {
		return"Adresa:" + adresa + "\nPret:" + pret + "\nNumarul camerelor: " + nrCamere + "\nComfort: " + comfort;
	}
	}


