package practicaFusion;

public class Mascota {
	private String nombre;
	private String altura;

	public Mascota(String nombre) {
		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void MandarMensaje() {
		System.out.println("Soy Javier y te voy a contar algo o no y mido 1.90");
	}

}