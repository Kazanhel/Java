package estacion;

import java.util.concurrent.ThreadLocalRandom;


import bicicleta.Bicicleta;
import tarjetaUsuario.TarjetaUsuario;

public class Estacion {
	private int id = 0;
	private String direccion = null;
	private int numeroAnclajes = 0;
	private Bicicleta[] anclajes;

	//CONSTRUCTOR
	public Estacion(int id, String direccion, int numeroAnclajes){
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes = numeroAnclajes;
		anclajes = new Bicicleta[numeroAnclajes];
	}
	
	//GETTERS Y SETTERS 
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	
	public String getDireccion(){
		return this.direccion;
	}
	public void setDireccion(String direccion){
		this.direccion = direccion;
	}
	
	public int getNumeroAnclajes(){
		return this.numeroAnclajes;
	}
	public void setNumeroAnclajes(int numeroAnclajes){
		this.numeroAnclajes = numeroAnclajes;
	}
	
	public Bicicleta[] getAnclajes() {
		return anclajes;
	}
	
	//METODO consultarEstacion
	public String consultarEstacion(){
		return "ID: " + "" + this.getId() + "\n" 
				+ "Direccion: " + "" + this.getDireccion() + "\n"
				+ "Número de anclajes: " + "" + this.getNumeroAnclajes();
	}
	
	//METODO anclajesLibres
	public int anclajesLibres(){
		int anclajesLibres = 0;
		for(int anclaje = 0; anclaje < getAnclajes().length; anclaje++){
			if(getAnclajes()[anclaje] == null){
				anclajesLibres= anclajesLibres + 1;
			}
			else{}
		}
		return anclajesLibres; 
	}
	
	//METODO consultarAnclajes
	public void consultarAnclajes(){
		int posicion = 0;
		for (Bicicleta anclajes: this.anclajes);
			if (anclajes[posicion] == null){
				System.out.println("La posicion está " + (posicion + 1) + " disponible");
				}
			else {
				System.out.println ("Bicicleta numero: " + anclajes[posicion].getId());
			posicion++;
			}
	}
	//METODO anclarBicicleta
	public void anclarBicicleta(Bicicleta bicicleta){
		for(int anclaje = 0; anclaje < getAnclajes().length; anclaje++){
			if(getAnclajes()[anclaje]== null){
				getAnclajes()[anclaje]=bicicleta;
				mostrarAnclaje(bicicleta, anclaje);
				break;
			}
			else{}
		}
	}
	
	//METODO mostrarAnclaje
	public void mostrarAnclaje(Bicicleta bicicleta,int numeroAnclaje){
		System.out.println("bicicleta: "+bicicleta.getId()+" anclada en anclaje "+numeroAnclaje);
	}
	
	//METODO leerTarjetaUsuario
	public boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario){
		return tarjetaUsuario.getActivada();
	}
	
	//METODO retirarBicicleta
	public void retirarBicicleta(TarjetaUsuario tarjetaUsuario){
		if(leerTarjetaUsuario(tarjetaUsuario)){
			int anclajeLibre = generarAnclajeLibre();
			mostrarBicicleta(getAnclajes()[anclajeLibre], anclajeLibre);
			getAnclajes()[anclajeLibre]=null;
		}
	}
	
	//METODO mostrarBicicleta
	public void mostrarBicicleta(Bicicleta bicicleta,int anclaje){
		int numeroAnclaje=anclaje+1;
		System.out.println("bicicleta retirada: "+bicicleta.getId()+" del anclaje "+numeroAnclaje);
	}
	
	//METODO generarAnclaje
	public int generarAnclaje(){
		int random = ThreadLocalRandom.current().nextInt(0,getNumeroAnclajes());
		return random;
	}
	public int generarAnclajeLibre(){
		int anclaje=generarAnclaje();
		while(getAnclajes()[anclaje]== null)
			anclaje=generarAnclaje();
		return anclaje;
	}
	
}

