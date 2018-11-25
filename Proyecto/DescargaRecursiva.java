import java.util.Arrays;

public class DescargaRecursiva {
	private Grua caso;
	private int flag;
	private Integer[][][] matrizOp = {{{0,1,2},{1,2,0},{2,0,1}},{{0,2,1},{2,1,0},{1,0,2}}};
	//Constructores
	public DescargaRecursiva (Grua caso) {
		setCaso(caso);
		Plataforma aux = caso.getPlataforma(0);
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
	public String hanoi () {
		//movimiento en base a flag;
		// flag 0 es par y 1 impar (en la torre incial)
		int i;
		//Condicion de termino
		if ((caso.getPlataforma(0).size()!=0)||(caso.getPlataforma(1).size()!=0)) {
			for (i=0;i==3;i++) {
				for (Integer x:matrizOp[flag][i]) {
					if (caso.getPlataforma(x).size()!=0) {
						for (Integer y: Arrays.copyOfRange(matrizOp[flag][i], 1, 2)) {
							if (caso.getPlataforma(y).size()!=0) {
								if (!(caso.cargaMayor(x, y))) {
									caso.moverCarga(x, y);
									return String.format("%i-%i/",x,y)+hanoi();
								}
							} else {
								caso.moverCarga(x, y);
								return String.format("%i-%i/",x,y)+hanoi();
							}
						}
					}
				}
			}
		} 
		return "/";
	}
}
