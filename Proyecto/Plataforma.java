import java.io.*;
import java.util.*;

public class Plataforma {
	private String nombre;
	private Stack <Contenedor> carga;

	public Plataforma (String nombre){
		setNombre(nombre);
		carga=new Stack <Contenedor> ();
	}
	public Plataforma (String nombre, Stack <Contenedor> carga){
		setNombre(nombre);
		setCarga(carga);
	}

	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public void setCarga (Stack <Contenedor> carga){
		this.carga=carga;
	}

	public Contenedor peekCarga (){
		return carga.peek();
	}
	public void popCarga (){
		carga.pop();
	}
	public void pushCarga (Contenedor container){
		carga.push(container);
	}
}