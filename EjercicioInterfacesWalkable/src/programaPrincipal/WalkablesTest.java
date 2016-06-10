package programaPrincipal;
import objetos.*;
import interfaz.*;

public class WalkablesTest {

	public static void main(String[] args) {
		Walkable[] w = new Walkable[4];
		w[0] = new Persona("Jack");
		w[1] = new Pato("Mike");
		w[2] = new Persona("Smith");
		w[3] = new Gato("Mittens");
		
		Walkables.letThemWalk(w);
	}

}
