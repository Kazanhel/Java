package ejercicioFigurasGeometricas;

public class Elipse extends FigurasGeometricas{
	private double radioMayor = 0;
	private double radioMenor = 0;
	
	public Elipse(double radioMayor, double radioMenor){
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
	}
	// GETTERS Y SETTERS de radioMayor
	public double getRadioMayor(){
		return this.radioMayor;
	}
	public void setRadioMayor(double radio){
		this.radioMayor = radio;
	}
	//GETTERS Y SETTERS de radioMenor
	public double getRadioMenor(){
		return this.radioMenor;
	}
	public void setRadioMenor(double radio){
		this.radioMenor = radio;
	}
	//FUNCION calcularArea y getArea
	@Override
	public void calcularArea(){
		double area = getRadioMayor() * getRadioMenor() * 2;
		setArea(area);
	}
	public double getArea(){
		calcularArea();
		return getAreaForma();
	}
	
}
