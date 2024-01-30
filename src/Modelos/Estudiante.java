package Modelos;

public class Estudiante extends MiembroComunidad {
	
	private String carrera;
	private String nivelEstudio;


	public Estudiante(int id, String nombre, String correoElectronico,
			String direccion,String carrera,String nivelEstudio) {
		super(id, nombre, correoElectronico, direccion);
		this.carrera = carrera;
		this.nivelEstudio = nivelEstudio;
	}


	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getNivelEstudio() {
		return nivelEstudio;
	}

	public void setNivelEstudio(String nivelEstudio) {
		this.nivelEstudio = nivelEstudio;
	}


	@Override
	public void mostrarInformacion() {
		// TODO Auto-generated method stub
	    System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Correo Electrónico: " + getCorreoElectronico());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Carrera: " + carrera);
        System.out.println("Nivel de Estudio: " + nivelEstudio);
		
	}

	
	
	

}
