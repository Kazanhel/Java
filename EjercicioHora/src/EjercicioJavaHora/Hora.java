package EjercicioJavaHora;

public class Hora {
	private int hora;
	private int minutos;
	private int segundos;
	
	public Hora (){
		this.hora = 0;
		this.minutos = 0;
		this.segundos = 0;
	}
	
	public Hora(int hora, int minutos, int segundos){
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
		if (minutos > 60 || segundos > 60 || hora > 24 || minutos < 0 || 
				segundos < 0 || hora < 0) {
							this.hora = 0;
							this.minutos = 0;
							this.segundos = 0;

		}
	}
	public void setHoras(int hora, int minutos, int segundos){
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	
	public int getHoras(){
		return this.hora;
	}
	
	
	public void setMinutos(int minutos){
		this.minutos = minutos;
	}
	public int getMinutos(){
		return this.minutos;
	}
	
	public void setSegundos(int segundos){
		this.segundos = segundos;
	}
	public int getSegundos(){
		return this.segundos;
	}
}
	


