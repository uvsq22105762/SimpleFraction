package Association;

public class Client {
	
	private String name;

	public Client(String name) {
		super();
		this.name = name;
	}
	
	public boolean seConnecter(Serveur serveur) {
		System.out.println("C- On demande au serveur si on peut se connecter");
		return serveur.connecter(this);
	}
	
    public void envoyer(Serveur serveur, Client client, String message) {
        System.out.println(this.name + " envoie : " + message + " à " + client.toString());
        serveur.diffuser(this, client, message);
    }

    public void recevoir(String message) {
        System.out.println("Message reçu : " + message);
    }

	@Override
	public String toString() {
		return "Client [name=" + name + "]";
	}
}
