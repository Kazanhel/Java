package ejercicioFigurasGeometricas;

public class Cuadrado extends FigurasGeometricas {
	private double lado = 0;
	
	public Cuadrado (double lado){
		this.lado = lado;
	}
	
	//GETTERS Y SETTERS
	
	public double getLado(){
		return this.lado;
	}
	public void setLado(double costado){
		this.lado = costado;
	}
	@Override
	//FUNCION calcularArea y getArea
	public void calcularArea(){
		double area = getLado() * getLado();
		setArea(area);
	}
	public double getArea(){
		calcularArea();
		return getAreaForma();
	}
	
}
