package EjercicioJavaHora;


public class casosTest {

	public static void main(String[] args) {
		Hora cualquiera = new Hora();
		cualquiera.setHoras(69,6,8);
		System.out.println("La hora actual es: " + cualquiera.getHoras() 
		+ cualquiera.getMinutos() + cualquiera.getSegundos());
		System.out.println(cualquiera.getHoras());

	}

}
