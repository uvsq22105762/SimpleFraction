package TD1;

public class Fraction {

	private int numerateur;
	private int denominateur;
	
	public Fraction(int numerateur, int denominateur) {
		super();
		this.numerateur = numerateur;
		this.denominateur = denominateur;
	}
	
	public float value() {
		if(denominateur != 0) {
			return numerateur / denominateur;
		}
		return 0;
	}
	
	public boolean arePrimeBetweenThem() {
		boolean primeBetweenThem = true;
		if(numerateur % denominateur == 0) {
			primeBetweenThem = false;
		}
		if(denominateur % numerateur == 0) {
			primeBetweenThem = false;
		}
		return primeBetweenThem;
	}

	@Override
	public String toString() {
		return "Fraction [numerateur=" + numerateur + ", denominateur=" + denominateur + "]";
	}
}
