package ejercicioSwitch;

import java.util.Scanner;

public class mainSwitch {

	public static void main(String[] args) {
		int dia = 0;
		int mes = 0;
		int year = 0;
		boolean datosCorrectos = true;
		
		// lectura de la entrada de datos est�ndar (consola)
		
		Scanner lector = new Scanner(System.in);
		
		System.out.print("Introduzca un d�a: ");
		dia = lector.nextInt();
		System.out.print("Introduzca un mes: ");
		mes = lector.nextInt();
		System.out.print("Introduzca un a�o: ");
		year = lector.nextInt();

		
		if (year > 0) {

			// switch/case para la mayor�a de casos
			//aqu� se comprueba si el d�a introducido forma parte de los n�meros correspondientes
			//a sus meses m�s abajo
			switch (mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (dia <= 0 || dia > 31) {
					System.out.println("D�a incorrecto. Para este mes el valor+" +
							" tiene que estar comprendido entre 1 y 31");
					datosCorrectos = false;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (dia <= 0 || dia > 30) {
					System.out.println("D�a incorrecto. Para este mes el valor" +
							" tiene que estar comprendido entre 1 y 30");
					datosCorrectos = false;
				}
				break;
			case 2:
				
				/* Calculamos si el a�o es BISIESTO o NO */
				
				if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))  {
					// Bisiesto
					if (dia <= 0 || dia > 29) {
						System.out.println("El d�a introducido es incorrecto."
								+ " ya que el a�o es bisiesto" +
								" Para este mes tiene que poner un valor entre 1 y 29");
						datosCorrectos = false;
					}
					//NO bisiesto
				} else {
					if (dia <= 0 || dia > 28) {
						System.out.println("El d�a introducido es incorrecto. "
								+ " Para este mes tiene que poner" +
								" un valor comprendido entre 1 y 28");
						datosCorrectos = false;
					}
				}
				
				break;
			
			// para el resto de casos
				
			default:
				System.out.println("El mes introducido es incorrecto."
						+ " Debe estar entre 1 y 12");
				datosCorrectos = false;
				break;
			}
			
		} else {
			System.out
					.println("El a�o introducido es negativo, vuelva a intentarlo.");
		}
		
		if (datosCorrectos == true) {
			System.out.println("La fecha es correcta");
		}
	}
}
