package practicaFusion;

public class Pez extends Mascota{
	
	private String color;
	private int numAletas;
	private double precioVenta;
	
	
	//Constructores
	
	public Pez(String nombre, String color, int numAletas, double precioVenta) {
		super(nombre);
		this.color = color;
		this.numAletas = numAletas;
		this.precioVenta = precioVenta;
	}
	
	
	

}
