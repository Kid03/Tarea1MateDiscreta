
public class DescargaRecursiva {
	private Grua caso;
	private int flag;
	private Integer tamanio;
	//Constructores
	public DescargaRecursiva (Grua caso) {
		setCaso(caso);
		Plataforma aux = caso.getPlataforma(0);
		tamanio=aux.size();
		flag=aux.size();
		flag=flag<<31;
		flag=flag>>31;
	}
	//Getters y Setters
	public Grua getCaso() {
		return caso;
	}
	public void setCaso(Grua caso) {
		this.caso = caso;
	}
	//Metodos propios
	public String Hanoi() {
		//movimiento -1*flag;
		
	}
}
