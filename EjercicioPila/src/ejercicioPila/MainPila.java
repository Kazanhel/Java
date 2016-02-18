package ejercicioPila;
import java.util.Stack;

public class MainPila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "hola que tal";
		Stack<Character> pila = new Stack<Character>();
		for (int i = 0; i < cadena.length(); i++){
			pila.add(cadena.charAt(i));
			}
		
		while (!pila.isEmpty()){
			System.out.print(pila.pop());
		}

	}

}
