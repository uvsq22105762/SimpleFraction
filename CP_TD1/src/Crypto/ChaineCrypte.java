package Crypto;

/**
 * On encrypte et on décrypte une chaîne de caractères, si la chaîne est null un message 
 * le signalant sera affiché.
 * 
 * @author zacharie
 *
 */
public class ChaineCrypte {

	private String chaineClaire;
	private int decalage;
	
	public static ChaineCrypte deCrypte(String chaine, int decalage) {
        return new ChaineCrypte(chaine, decalage);
    }

    public static ChaineCrypte deEnClaCrypte(String chaine, int decalage) {
        return new ChaineCrypte(chaine, decalage);
    }
    
	private ChaineCrypte(String chaineClaire, int decalage) {
		super();
		this.chaineClaire = chaineClaire;
		this.decalage = decalage;
		chaineClaire = crypte();
		System.out.println(chaineClaire);
	}

	private static char decaleCaractere(char c, int decal) {
		return (c < 'A' || c > 'Z')? c : (char)(((c - 'A' + decal) % 26) + 'A');
	}
	
	public String crypte() {
		StringBuilder stringBuilder = new StringBuilder();
		
		if(chaineClaire == null) {
			System.out.println("Attention le message est vide");
		}
		
		for(int i = 0; i < chaineClaire.length(); i++) {
			stringBuilder.append(decaleCaractere(chaineClaire.charAt(i), this.decalage));
		}
		return stringBuilder.toString();
	}
	
	public String decrypte() {
		StringBuilder stringBuilder = new StringBuilder();
		
		for(int i = 0; i < chaineClaire.length(); i++) {
			stringBuilder.append(decaleCaractere(chaineClaire.charAt(i), -this.decalage));
		}
		return stringBuilder.toString();
	}

	public String getChaineClaire() {
		return chaineClaire;
	}

	public void setChaineClaire(String chaineClaire) {
		this.chaineClaire = chaineClaire;
	}

	public int getDecalage() {
		return decalage;
	}

	public void setDecalage(int decalage) {
		this.decalage = decalage;
	}
}
