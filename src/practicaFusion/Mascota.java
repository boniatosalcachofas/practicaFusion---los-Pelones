package practicaFusion;

public class Mascota {
	private String nombre;

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
		System.out.println("Soy Jose Manuel y te voy a contar algo o no y soy de color Negro");
	}

}