package tarjetaUsuario;

public class TarjetaUsuario {
	public String id = null;
	public boolean activada = false;

	public TarjetaUsuario(String id, boolean activada){
		this.id = id;
		this.activada = activada;
	}
	
	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}
	
	public boolean getActivada(){
		return this.activada;
	}
}

