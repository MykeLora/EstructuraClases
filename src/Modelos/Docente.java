package Modelos;

public abstract class Docente extends Empleado {
	
	private String maestria;
	private String experiencia;
	private String conocimientos;
	

	
	
	
	public Docente() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Docente(int id, String nombre, String correoElectronico, String direccion, int sueldo, String departamento,
			String supervisor,String maestria,String experiencia,String conocimientos) {
		super(id, nombre, correoElectronico, direccion, sueldo, departamento, supervisor);
		this.maestria = maestria;
		this.conocimientos = conocimientos;
		this.experiencia = experiencia;
	}


	public String getMaestria() {
		return maestria;
	}


	public void setMaestria(String maestria) {
		this.maestria = maestria;
	}


	public String getExperiencia() {
		return experiencia;
	}




	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}




	public String getConocimientos() {
		return conocimientos;
	}




	public void setConocimientos(String conocimientos) {
		this.conocimientos = conocimientos;
	}




	public abstract void mostrarInformacion();

}
