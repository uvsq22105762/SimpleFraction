package Crypto;

public class Main {
	public static void main(String[] args) {
		ChaineCrypte cc = ChaineCrypte.deCrypte("THEOPHILE SE RALASSE AVEC LA CRYPTOMONNAIE", 13);
		cc.decrypte();
		System.out.println(cc.getChaineClaire());
	}
}
