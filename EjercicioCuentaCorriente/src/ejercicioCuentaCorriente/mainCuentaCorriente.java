package ejercicioCuentaCorriente;

public class mainCuentaCorriente {

	public static void main(String[] args) {

		CuentaCorriente cuenta = new CuentaCorriente();

		cuenta.setNombre("Pepe");
		cuenta.setApellidos("Álvarez");
		cuenta.setDireccion("Palma");
		cuenta.setTelefono("675689365");
		cuenta.setNif("568749632F");
		cuenta.setSaldo(1000);
		cuenta.sacarDinero(200);
		cuenta.consultarCuenta();

		if (cuenta.saldoPositivo()) {
			System.out.println("Tiene dinero en la cuenta");
		} else {
			System.out.println("NO tiene dinero en la cuenta");
		}
	}
}
