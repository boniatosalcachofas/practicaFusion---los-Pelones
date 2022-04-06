package practicaFusion;

public class Mascota {
	private String nombre;
	private String sexo;

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
		System.out.println("Soy " + this.nombre + " y te voy a contar algo o no y soy de sexo " + this.sexo)
		;
	}

}