public class Contenedor {

	private String prosedencia;
	private Integer masa;
	//Constructores
	public Contenedor (Integer masa){
		setMasa(masa);
	}
	public Contenedor (String prosedencia, Integer masa){
		setProsedencia (prosedencia);
		setMasa (masa);
	}
	//Getters y Setters
	public String getProsedencia(){
		return prosedencia;
	}
	public void setProsedencia(String prosedencia){
		this.prosedencia=prosedencia;
	}
	public Integer getMasa(){
		return masa;
	}
	private void setMasa(Integer masa){
		this.masa=masa;
	}
}
