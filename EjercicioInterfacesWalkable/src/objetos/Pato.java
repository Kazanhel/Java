package objetos;
import interfaz.Walkable;


public class Pato implements Walkable{
	private String name;
	public Pato(String name) {
		this.name = name;
	}

	public void walk() {
	System.out.println(name + " (un pato) esta caminando.");
	}
}
