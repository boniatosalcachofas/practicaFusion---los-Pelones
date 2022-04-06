package practicaFusion;

public class Gato extends Mascota {

	String colorPelo;

	public Gato(String nombre, String colorPelo) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public void MandarMensaje() {
		System.out.println("Soy " + this.getNombre() + " y dice meow");
	}

}