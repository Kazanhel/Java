package interfaz;

public class Walkables {
	public static void letThemWalk(Walkable[] list){
	for(Walkable w : list){
		w.walk();
	}

	}
}
