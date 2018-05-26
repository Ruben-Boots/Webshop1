package bestel;

import java.util.ArrayList;

import model.*;

public class Winkelwagen {
	private ArrayList<ProductBestelling> wagen = new ArrayList<ProductBestelling>();
	
	public void bestel(Product p, int hoeveelheid) {
		wagen.add(new ProductBestelling(hoeveelheid, p));
	}
	
	public String toString() {
		String str = "";
		for (ProductBestelling be:wagen) {
			str += "<p>" + be;
		}
		return str;
	}
	
	public int getLength() {
		return wagen.size();
	}
	
	public int getTotaalprijs() {
		int totaal = 0;
		for (ProductBestelling pb:wagen) {
			totaal += pb.getPrijs();
		}
		return totaal;
	}

}
