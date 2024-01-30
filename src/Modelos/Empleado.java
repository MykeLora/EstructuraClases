package Modelos;

public class Empleado  extends MiembroComunidad{
    
	private int sueldo;
	private String departamento;
	private String supervisor;
	
	
	
	public Empleado() {
	
	}

	public Empleado(int id, String nombre, String correoElectronico, String direccion,
			int sueldo,String departamento, String supervisor) {
		
		super(id, nombre, correoElectronico, direccion);
		this.sueldo = sueldo;
		this.departamento = departamento;
		this.supervisor = supervisor;
	}



	public int getSueldo() {
		return sueldo;
	}



	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}



	public String getDepartamento() {
		return departamento;
	}



	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}



	public String getSupervisor() {
		return supervisor;
	}



	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}



	@Override
	public void mostrarInformacion() {
		
	     System.out.println("ID: " + getId());
	     System.out.println("Nombre: " + getNombre());
	     System.out.println("Correo Electrónico: " + getCorreoElectronico());
	     System.out.println("Dirección: " + getDireccion());
	     System.out.println("Sueldo: " + sueldo);
	     System.out.println("departamento: " + departamento);
	     System.out.println("Le supervisa: " + supervisor);	
		 
	}

}
