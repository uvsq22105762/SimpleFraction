package Association;

public class Main {
	public static void main(String[] args) {
		Client c1 = new Client("JC");
		Client c2 = new Client("Théophile");
		Serveur s = new Serveur();
		
		c1.seConnecter(s);
		c2.seConnecter(s);
		
		Client c3 = new Client("Quentin");
		
		c3.seConnecter(s);
		
		c1.envoyer(s, c3, "Bonjour");
		
	}
}
