package gestionProduits;

public class Produit {

	private String code;
	private String description;
	private double prix;
	
	public Produit() {}
	
	public Produit(String c, String d, double p) {
		this.code = c;
		this.description = d;
		this.prix = p;
	}

	@Override
	public String toString() {
		return "Produit [code=" + code + ", description=" + description + ", prix=" + prix + "]";
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

}
