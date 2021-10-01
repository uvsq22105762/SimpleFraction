package arborescence;

public class FichierNormal implements Fichier{

	private String name;
	private int size;
	
	public FichierNormal(String name, int size) {
		super();
		this.name = name;
		this.size = size;
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
		return "FichierNormal [name=" + name + ", size=" + size + "]";
	}

}
