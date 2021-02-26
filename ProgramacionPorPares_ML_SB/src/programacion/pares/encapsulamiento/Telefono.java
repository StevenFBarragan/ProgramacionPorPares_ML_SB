package programacion.pares.encapsulamiento;

public class Telefono {
	
	private String marca; 
	private int capacidad;
	
	public String getMarca() {
		return marca;
	}
	  
	public void setMarca(String marca) {
	    this.marca = marca;
	}
	  
	public int getCapacidad() {
	    return capacidad;
	}
	  
	public void setCapacidad(int capacidad) {
	    this.capacidad = capacidad;
	}
	 
	public Telefono(String marca, int capacidad) {
		super();
	    this.marca = marca;
	    this.capacidad = capacidad;
	}
	  
}

