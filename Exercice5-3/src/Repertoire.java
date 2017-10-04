import java.util.ArrayList;
import java.util.List;

public class Repertoire {

	public String nom;
	
	public List<Fichier> fichiers;
	
	public List<Repertoire> repertoires;

	public Repertoire(String nom, List<Fichier> fichiers, List<Repertoire> repertoires) {
		super();
		this.nom = nom;
		this.fichiers = fichiers;
		this.repertoires = repertoires;
	}

	public Repertoire(String nom ) {
		super();
		this.nom = nom;
		this.fichiers = new ArrayList<Fichier>();
		this.repertoires = new ArrayList<Repertoire>();
	}
	
	public void ajouter_fichier(Fichier f){
		fichiers.add(f);
	}
	
	public boolean ajouter_repertoire(Repertoire r){
		if(r==this){
				return false;
		}
		if(!exist_in_repertoires(r))
			return false;
		repertoires.add(r);
		return true;
	}
	
	public int getTaille(){
		return getTailleRepertoire(this);
	}
	
	private int getTailleRepertoire(Repertoire r){
		int somme=r.getTailleFichiersRepertoire(r);
		for(Repertoire rep : r.repertoires){
			somme = somme +  getTailleRepertoire(rep);
		}
		return somme;
			
	}
	
	private int getTailleFichiersRepertoire(Repertoire r){
		int somme=0;
		for(Fichier f : fichiers){
			somme += f.getTaille();
		}
		return somme;
	}
	
	private boolean exist_in_repertoires(Repertoire r){
		if(r.repertoires.contains(this))
			return false;
		for(Repertoire rep : r.repertoires){
			if(!exist_in_repertoires(rep))
				return false;
		}
		return true;
	}
	
}
