package ejercicioConjuntos;
import java.util.TreeSet;
public class MainConjuntos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "dabale arroz a la zorra el abad";
		TreeSet<Character> conjunto = new TreeSet<Character>();
		for (int i = 0; i < cadena.length(); i++){
			conjunto.add(cadena.charAt(i));
		}
		System.out.print(conjunto);
	}

}
