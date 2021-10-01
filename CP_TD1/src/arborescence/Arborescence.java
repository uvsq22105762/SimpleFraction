package arborescence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Arborescence {
	
	private HashMap<Dossier, List<Fichier>> repertoires;
	private Dossier racine;

	public Arborescence(Dossier racine) {
		super();
		this.racine = racine;
		this.repertoires = new HashMap<Dossier, List<Fichier>>();
	}
	
	public void put(Dossier dossier, Fichier fichier) {
		if(this.repertoires.containsKey(dossier) && !dossier.equals(fichier)) {
			List<Fichier> fichiers = getFichiers(dossier);
			dossier.setSize(dossier.getSize() + fichier.getSize());
			fichiers.add(fichier);
		}
		else {
			List<Fichier> fichiers = new ArrayList<Fichier>();
			fichiers.add(fichier);
			dossier.setSize(dossier.getSize() + fichier.getSize());
			this.repertoires.put(dossier, fichiers);
		}
	}
	
	public List<Fichier> getFichiers(Dossier dossier){
		return this.repertoires.get(dossier);
	}
	
	public void displayMap() {
		for (Entry<Dossier, List<Fichier>> mapentry : this.repertoires.entrySet()) {
	           System.out.println("le dossier: "+mapentry.getKey() 
	                              + " | contient: " + mapentry.getValue());
	        }
	}
	
	
}



