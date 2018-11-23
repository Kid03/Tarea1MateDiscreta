import java.util.*;

public class Plataforma {
	private String nombre;
	private ArrayList<Contenedor> carga;
	//Constructores
	public Plataforma (String nombre){
		setNombre(nombre);
		carga=new ArrayList <Contenedor> ();
	}
	public Plataforma (String nombre,ArrayList<Contenedor> carga){
		setNombre(nombre);
		setCarga(carga);
	}
	//Getters y Setters
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public void setCarga (ArrayList <Contenedor> carga){
		this.carga=carga;
	}
	//Metodos propios
	//PeekCarga retorna el contenedor que está más arriba.
	public Contenedor peekCarga (){
		if (carga.size()==0) return null;
		return carga.get(carga.size()-1);
	}
	//popCarga saca el contenedor de más arriba.
	public void popCarga (){
		carga.remove(carga.size()-1);
	}
	//Añade un contendor en el tope de la carga.
	public void pushCarga (Contenedor container){
		carga.add(container);
	}
	//Retorna el largo de la carga.
	public int size () {
		return carga.size();
	}

}