package arborescence;

public class Dossier implements Fichier{

	private String name;
	private int size = 0;
	
	
	public Dossier(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public void setSize(int size) {
		// TODO Auto-generated method stub
		this.size = size;
	}

	@Override
	public String toString() {
		return "Dossier [name=" + name + ", size=" + size + "]";
	}

}
