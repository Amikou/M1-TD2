
public class ChaineCryptee {

	public String chaine_cryptee;
	public int decalage;
	
	public ChaineCryptee(String chaine, int decalage){
		chaine_cryptee=chaine;
		this.decalage=decalage;
	}
	
	private char decale_char(char c, int decalage){
		return (c < 'A' || c > 'Z')? c : (char) (((c-'A' + decalage ) %26) +'A');
	}
	
	private String decale_string(String s, int decalage){
		String str="";
		for(char c : s.toCharArray()){
			str += decale_char(c, decalage);
		}
		return str;
	}
	
	
	public String decrypte(){
		return decale_string(chaine_cryptee, -decalage);
	}
	
	public String crypte(){
		return chaine_cryptee;
	}
}
