package programacion.pares.abstraccion;

public class Comercial extends Empleado {
  
  private double comision;
	
	public Comercial(String nombre, int edad, double salario) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	@Override
	public boolean plus() {
		throw new UnsupportedOperationException("Not supported yet.");
		
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
  
}
