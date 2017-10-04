import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(1,5);
		Fraction f3 = new Fraction(2, 10);
		Fraction f2 = new Fraction(1, 10);
		System.out.println(f1+" + "+f2+" = "+Fraction.addition(f1, f2));
		System.out.println(Fraction.equals(f1, f3));
		System.out.println(Fraction.equals(f1, f2));
		System.out.println(f1.getFloat());
		System.out.println(f1.compareTo(f2));
		List<Fraction> list = new ArrayList<Fraction>();
		list.add(f1);
		list.add(f2);
		list.add(f3);
		list.sort(null);
		System.out.println("----- Sort -----");
		for(Fraction f : list)
			System.out.println(f.getFloat());

	}

}
