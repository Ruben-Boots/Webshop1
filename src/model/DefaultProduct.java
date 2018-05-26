package model;

public class DefaultProduct extends Product{
	String naam;
	int prijsPerEenheid;
	int eenheid;
	String imageUrl;
	
	public DefaultProduct(String naam, int prijsPerEenheid, String imageUrl, int eenheid) {
		super(naam, prijsPerEenheid, imageUrl, eenheid);
	}
	
	public DefaultProduct(String naam, int prijsPerEenheid, String imageUrl) {
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
	
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	public int getPrijsPerEenheid() {
		return prijsPerEenheid;
	}
	public void setPrijsPerEenheid(int eenheid) {
		this.prijsPerEenheid = eenheid;
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
