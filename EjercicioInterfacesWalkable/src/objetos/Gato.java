package objetos;

import interfaz.Walkable;

public class Gato implements Walkable{
	private String name;
	public Gato(String name) {
		this.name = name;
	}

	public void walk() {
	System.out.println(name + " (un gato) esta caminando.");
	}

}
