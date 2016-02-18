package ejercicioFigurasGeometricas;

public class Rectangulo extends FigurasGeometricas {
	private double ladoMayor = 0.0;
	private double ladoMenor = 0.0;
	
	public Rectangulo(double ladoMayor, double ladoMenor){
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
	}
	
	// GETTERS Y SETTERS LadoMayor
	public double getLadoMayor(){
		return this.ladoMayor;
	}
	public void setLadoMayor(double lado){
		this.ladoMayor = lado;
	}
	// GETTERS Y SETTERS LadoMenor
	public double getLadoMenor(){
		return this.ladoMenor;
	}
	public void setLadoMenor(double lado){
		this.ladoMenor = lado;
	}
	// FUNCION CalcularArea y getArea
	@Override
	public void calcularArea(){
		double area = getLadoMenor() * getLadoMayor();
		setArea(area);
	}
	public double getArea(){
		calcularArea();
		return getAreaForma();
	}
	
}
