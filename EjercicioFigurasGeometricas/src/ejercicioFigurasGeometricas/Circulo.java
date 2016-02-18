package ejercicioFigurasGeometricas;

public class Circulo extends FigurasGeometricas {
	private double radio = 0.0;
	
	public Circulo(double radio){
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	@Override
	public void calcularArea(){
		double areaCirculo = 3.14 * getRadio()*getRadio();
		setArea(areaCirculo);
	}
	public double getArea(){
		calcularArea();
		return getAreaForma();
	}

}
