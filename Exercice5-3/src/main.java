
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fichier f = new Fichier("f", 10);
		Fichier f2 = new Fichier("f2", 11);
		Repertoire r1 = new Repertoire("r1");
		Repertoire r2 = new Repertoire("r2");
		Repertoire r3 = new Repertoire("r3");
		
		r1.ajouter_fichier(f);
		r1.ajouter_fichier(f2);
		
		r2.ajouter_fichier(f);
		r2.ajouter_fichier(f);
		
		r3.ajouter_fichier(f);
		r3.ajouter_fichier(f2);
		
		System.out.println(r1.ajouter_repertoire(r2));
		System.out.println(r1.ajouter_repertoire(r3));
		System.out.println(r3.ajouter_repertoire(r1));
		System.out.println(r1.getTaille());
		System.out.println(r3.getTaille());
	}

}
