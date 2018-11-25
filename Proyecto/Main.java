
public class Main {
	public static void main (String args []) {
		//Grua del embarcadero
		Grua TPS = new Grua ("Grua Hangar 1 TPS");
		//Plataformas a las que la grua tiene acceso
		TPS.getPlataformas().add(new Plataforma ("Embarcacion"));
		TPS.getPlataformas().add(new Plataforma ("Auxiliar"));
		TPS.getPlataformas().add(new Plataforma ("Final"));
		// Carga inicial
		System.out.println(TPS.getPlataforma(0).getNombre());
		for (int i=4;i==0;i--) {
			TPS.getPlataforma(0).pushCarga(new Contenedor ("Hola",i));
			System.out.println(TPS.getPlataforma(0).peekCarga().getMasa());
			System.out.println("Hola");
		}
		System.out.println(TPS.getPlataforma(0).size());
		
		DescargaRecursiva Descarga = new DescargaRecursiva (TPS);
		System.out.println();
		System.out.println(Descarga.hanoi());
	}
}
