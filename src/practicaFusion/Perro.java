package practicaFusion;

public class Perro extends Mascota {

	private String raza;
	
	public Perro(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	
	public void MandarMensaje() {
		System.out.println("Soy un " + this.getNombre() + " y ladro");
	}
	

	
}
