
public class Fraction implements Comparable{
	
	public int denominateur;
	public int numerateur;
	
	public final static Fraction ZERO = new Fraction(0,1);
	public final static Fraction UN = new Fraction(1,1);
	
	
	public Fraction(int numerateur, int denominateur) {
		super();
		this.denominateur = denominateur;
		this.numerateur = numerateur;
	}
	
	public Fraction(int numerateur) {
		super();
		this.denominateur = 1;
		this.numerateur = numerateur;
	}
	
	public Fraction(){
		this.denominateur = 1;
		this.numerateur = 0;
	}

	public static Fraction addition(Fraction f1, Fraction f2){
		if(f1.getDenominateur()==f2.getDenominateur())
			return new Fraction(f1.getDenominateur(), f1.getNumerateur()+f2.getNumerateur());
		else
			return new Fraction(f1.getNumerateur()*f2.getDenominateur()+f1.getDenominateur()*f2.getNumerateur(), f1.getDenominateur()*f2.getDenominateur());
	}
	
	public static boolean equals(Fraction f1, Fraction f2){
		return (f1.getFloat() == f2.getFloat());
	}
	
	public static boolean equalsOrdreNaturel(Fraction f1, Fraction f2){
		return true;
	}
	
	public String ToString(){
		return String.valueOf(getFloat());
	}
	
	public float getFloat(){
		return (float)numerateur / (float)denominateur;
	}
	public int getDenominateur() {
		return denominateur;
	}

	public void setDenominateur(int denominateur) {
		this.denominateur = denominateur;
	}

	public int getNumerateur() {
		return numerateur;
	}

	public void setNumerateur(int numerateur) {
		this.numerateur = numerateur;
	}

	@Override
	public String toString() {
		return numerateur+"/"+denominateur;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method
		Fraction frac = (Fraction)o;
		if(frac.getFloat()<getFloat())
			return -1;
		else if(frac.getFloat()==getFloat())
			return 0;
		else
			return 1;
	}
	
	

}
