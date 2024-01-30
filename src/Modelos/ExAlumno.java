package Modelos;

public class ExAlumno extends MiembroComunidad {
	
	private String Excarrera;
	private String ExMatricula;
	
	
	public ExAlumno() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ExAlumno(int id, String nombre, String correoElectronico, String direccion,
			String Excarrera,String ExMatricula) {
		super(id, nombre, correoElectronico, direccion);
		this.Excarrera = Excarrera;
		this.ExMatricula = ExMatricula;
	}


	public String getExcarrera() {
		return Excarrera;
	}


	public void setExcarrera(String excarrera) {
		Excarrera = excarrera;
	}


	public String getExMatricula() {
		return ExMatricula;
	}


	public void setExMatricula(String exMatricula) {
		ExMatricula = exMatricula;
	}


	@Override
	public void mostrarInformacion() {
		 System.out.println("ID: " + getId());
	     System.out.println("Nombre: " + getNombre());
	     System.out.println("Correo Electrónico: " + getCorreoElectronico());
	     System.out.println("Dirección: " + getDireccion());
	     System.out.println("Ex-Carrera: " + Excarrera);
	     System.out.println("Ex-Matricula: " + ExMatricula);
			
		
	}

}
