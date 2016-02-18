package ejercicioFigurasGeometricas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo circulito = new Circulo(3);
		circulito.calcularArea();
		System.out.println(circulito.getArea());
		
		Rectangulo rectangulito = new Rectangulo(4, 5);
		System.out.println(rectangulito.getArea());
		
		Cuadrado cuadradito = new Cuadrado(6);
		System.out.println(cuadradito.getArea());
		
		Elipse elipsita = new Elipse(3, 5);
		System.out.println(elipsita.getArea());

	}

}
