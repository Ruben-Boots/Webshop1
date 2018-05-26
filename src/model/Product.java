package model;

public abstract class Product {
	static final int gram = 1;
	static final int kilo = 2;
	static final int liter = 3;
	static final int stuk = 4;
	static final int pak = 5;
	
	public Product(String naam, int prijsPerEenheid, String imageUrl, int eenheid) {
		setNaam(naam);
		setPrijsPerEenheid(prijsPerEenheid);
		setImageUrl(imageUrl);
		setEenheid(eenheid);
	}
	
	public Product(String naam, int prijspereenheid, String imageUrl) {
		this(naam, prijspereenheid, imageUrl, 0);
	}
	
	public String toString() {
		return getNaam() + ", " + getEenheidNaam() + ", " + getPrijsPerEenheid();
	}
	
	public int getPrijs(int hoeveelheid) {
		return getPrijsPerEenheid() * hoeveelheid;
	}
	
	abstract public String getNaam();
	abstract public void setNaam(String naam);
	
	abstract public int getPrijsPerEenheid();
	abstract public void setPrijsPerEenheid(int eenheid);
	
	abstract public String getImageUrl();
	abstract public void setImageUrl(String imageUrl);
	
	abstract public int getEenheid();
	abstract public void setEenheid(int eenheid);
	
	abstract public String getEenheidNaam();
	
}
