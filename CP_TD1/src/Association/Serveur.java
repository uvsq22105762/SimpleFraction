package Association;

import java.util.ArrayList;
import java.util.List;

public class Serveur {
	
	List<Client> clients;
	
	public Serveur() {
		clients = new ArrayList<Client>();
	}
	
	public boolean connecter(Client client) {
		if(clients.size() < 5) {
			System.out.println("S- Un client peut se connecter");
			clients.add(client);
			return true;
		}
		System.out.println("S- Il n'y a plus de place pour se connecter");
		return false;
	}
	
	public void diffuser(Client envoyeur, Client receveur, String message) {
        if (this.clients.contains(envoyeur) == false) {
            System.out.println("Le client " + envoyeur + "n'est pas connecté au serveur.");
        }

        else {
            System.out.println("Le message : " + message + " de : " + envoyeur.toString() + " à " + receveur
            		+ " a été envoyé");
            receveur.recevoir(message);
        }
    }
}
