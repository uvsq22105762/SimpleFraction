package conventions;

public class Fraction {

	private int numerateur;
	private int denominateur;

	public Fraction(int numerateur, int denominateur) {
		super();
		this.numerateur = numerateur;
		this.denominateur = denominateur;
	}
	
	public Fraction(int numerateur) {
		this.numerateur = numerateur;
		this.denominateur = 1;
	}
	
	public Fraction() {
		this.numerateur = 0;
		this.denominateur = 1;
	}

	public float value() {
		if (denominateur != 0) {
			return numerateur / denominateur;
		}
		return 0;
	}

	public boolean arePrimeBetweenThem() {
		boolean primeBetweenThem = true;
		if (numerateur % denominateur == 0) {
			primeBetweenThem = false;
		}
		if (denominateur % numerateur == 0) {
			primeBetweenThem = false;
		}
		return primeBetweenThem;
	}

	public double getResultat() {
		return (double) this.numerateur / this.denominateur;
	}
	
	public int getNumerateur() {
		return numerateur;
	}

	public int getDenominateur() {
		return denominateur;
	}
	
	public void setNumerateur(int numerateur) {
		this.numerateur = numerateur;
	}

	public void setDenominateur(int denominateur) {
		this.denominateur = denominateur;
	}

	@Override
	public String toString() {
		return "Fraction [numerateur=" + numerateur + ", denominateur=" + denominateur + "]";
	}
}
