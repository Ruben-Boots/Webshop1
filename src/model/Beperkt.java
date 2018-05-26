package model;

public class Beperkt extends Product {
	String naam;
	int prijsPerEenheid;
	int eenheid;
	String imageUrl;
	
	public Beperkt(String naam, int prijsPerEenheid, String imageUrl, int eenheid) {
		super(naam, prijsPerEenheid, imageUrl, eenheid);
	}
	
	public Beperkt(String naam, int prijsPerEenheid, String imageUrl) {
		this(naam, prijsPerEenheid, imageUrl, 4);
	}
	
	public String getEenheidNaam() {
		switch (eenheid) {
		case gram: return "gram";
		case kilo: return "kilo";
		case liter: return "liter";
		case stuk: return "stuk(s)";
		case pak: return "pak(ken)";
		}
		return "";
	}
	
	public int getPrijs(int hoeveelheid) {
		if (hoeveelheid < 3) {
			return hoeveelheid*getPrijsPerEenheid();
		}else {
		return 2 * getPrijsPerEenheid();
		}
	}
	
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	public int getPrijsPerEenheid() {
		return prijsPerEenheid;
	}
	public void setPrijsPerEenheid(int prijsPerEenheid) {
		this.prijsPerEenheid = prijsPerEenheid;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	public int getEenheid() {
		return eenheid;
	}
	public void setEenheid(int eenheid) {
		this.eenheid = eenheid;
	}
}
