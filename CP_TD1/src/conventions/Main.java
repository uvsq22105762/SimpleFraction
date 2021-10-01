package conventions;

public class Main {
	
	private static double add(Fraction f1, Fraction f2) {
		if(f1.getDenominateur() == f2.getDenominateur()) {
			return (double) (f1.getNumerateur() + f2.getNumerateur()) / f1.getDenominateur();
		}
		else {
			return (double) (f1.getNumerateur() * f2.getDenominateur()
					+ f2.getNumerateur() * f1.getDenominateur())
					/ (f1.getDenominateur() * f2.getDenominateur());
					
		}
	}
	
	
	private static boolean fractionEqual(Fraction f1, Fraction f2) {
		int f1den = f1.getDenominateur();
		int f2den = f2.getDenominateur();
		
		f1.setDenominateur(f1den * f2den);
		f1.setNumerateur(f1.getNumerateur() * f2den);
		f2.setDenominateur(f1den * f2den);
		f2.setNumerateur(f2.getNumerateur() * f1den);
		
		if(f1.getNumerateur() == f2.getNumerateur()) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		final Fraction ZERO = new Fraction(0,1);
		final Fraction UN = new Fraction(1,1);
		System.out.println(ZERO.toString());
		System.out.println(ZERO.getResultat());
		
		Fraction a = new Fraction(13, 4);
		Fraction b = new Fraction(26, 2);
		System.out.println(add(a, b));
		System.out.println(fractionEqual(a, b));
		
	}
}
