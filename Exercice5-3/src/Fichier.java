
public class Fichier {
	
	public String nom;
	
	public int taille;

	public Fichier(String nom, int taille) {
		super();
		this.nom = nom;
		this.taille = taille;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	@Override
	public String toString() {
		return "Fichier [nom=" + nom + ", taille=" + taille + "]";
	}
	
	

}
