package arborescence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dossier doss1 = new Dossier("M1 2021 2022");
		
		Arborescence arb = new Arborescence(doss1);
		
		Dossier doss2 = new Dossier("S1 cryptographie");
		Dossier doss3 = new Dossier("S1 Réseau");
		
		FichierNormal fn1 = new FichierNormal("CM 1 cryptologue", 13435);
		FichierNormal fn2 = new FichierNormal("CM 2 choisir un bon algo", 8900);
		FichierNormal fn3 = new FichierNormal("CM 3 hacker la NASA", 1156435);
		
		FichierNormal fni = new FichierNormal("TP 1 brancher le campus", 29000);
		FichierNormal fnf = new FichierNormal("TP 2 surfez dans l'administration", 340005);
				
		arb.put(doss1, doss2);
		arb.put(doss2, fn1);
		arb.put(doss2, fn2);
		arb.put(doss2, fn3);
		
		arb.put(doss1, doss3);
		arb.put(doss3, fni);
		arb.put(doss3, fnf);
		
		arb.displayMap();
	}

}
