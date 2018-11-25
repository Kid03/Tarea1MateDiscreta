import java.util.*;

public class Grua {
	private String nombre;
	private ArrayList <Plataforma> plataformas;
	//Constructores
	public Grua (String nombre, ArrayList <Plataforma> plataformas){
		setNombre(nombre);
		setPlataformas(plataformas);
	}
	public Grua (String nombre){
		setNombre(nombre);
		setPlataformas(new ArrayList <Plataforma> ());
	}
	//Getters y Setters
	public void setNombre (String nombre){
		this.nombre=nombre;
	}
	public String getNombre (){
		return nombre;
	}
	public void setPlataformas (ArrayList <Plataforma> plataformas){
		this.plataformas=plataformas;
	}
	public ArrayList <Plataforma> getPlataformas (){
		return plataformas;
	}
	public Plataforma getPlataforma (Integer posicion) {
		return plataformas.get(posicion);
	}
	//Metodos Propios
	
	public void moverCarga (Integer pInicial,Integer pFinal){
		plataformas.get(pFinal).pushCarga(plataformas.get(pInicial).peekCarga());
		plataformas.get(pInicial).popCarga();
	}
	public boolean cargaMayor (Integer mayor, Integer menor) {
		if (plataformas.get(mayor).peekCarga().getMasa() >= plataformas.get(menor).peekCarga().getMasa()) {
			return true;
		}
		return false;
	}
}
